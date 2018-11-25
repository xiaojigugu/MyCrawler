package com.example.mycrawler.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanBookContent;
import com.example.mycrawler.util.BiqugeUrl;
import com.example.mycrawler.util.BookContentAdapter;
import com.example.mycrawler.util.okhttp.BaseCallback;
import com.example.mycrawler.util.okhttp.OkHttpHelper;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Request;
import okhttp3.Response;

public class ReadActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.tv_count)
    TextView tvCount;
    @BindView(R.id.reLay)
    RelativeLayout reLay;
    private BiqugeUrl biqugeUrl;
    private Handler handler;
    private int pageHeight;
    private int pageSum;
    private int scrollY = 0;
    private OkHttpHelper okHttpHelper;
    private int firstEnterId, bottomId, topId;//初始进入阅读页面的章节ID，可以加载的上一章节ID，可以加载的下一章节ID
    private BookContentAdapter adapter;
    private List<String> titleList;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        ButterKnife.bind(this);
        init();
        initData();
    }

    private void init() {
        handler = new Handler();
        biqugeUrl = new BiqugeUrl();
        titleList = new ArrayList<>();
        okHttpHelper = OkHttpHelper.getinstance();
        firstEnterId = getIntent().getIntExtra("chapterId", 0);
        biqugeUrl.chapterId = "" + firstEnterId;
        biqugeUrl.setId(getIntent().getStringExtra("bookId"));
    }

    private void initData() {
        okHttpHelper.get(biqugeUrl.getBookContent(), new BaseCallback<BeanBookContent>() {
            @Override
            public void onRequestBefore() {

            }

            @Override
            public void onFailure(Request request, Exception e) {
                Log.e("ReadActivity", "onFailure" + e.getMessage());
            }

            @Override
            public void onSuccess(Response response, BeanBookContent beanBookContent) {
                Log.e("ReadActivity", "onSuccess" + beanBookContent.getInfo());
                if (beanBookContent.getStatus() == 1) {
                    topId = beanBookContent.getData().getPid();
                    bottomId = beanBookContent.getData().getNid();
                    titleList.add(beanBookContent.getData().getCname());
                    tvTitle.setText(beanBookContent.getData().getCname());
                    adapter = new BookContentAdapter(ReadActivity.this, R.layout.item_book_content, beanBookContent.getData().getContent());
                    recyclerView.setLayoutManager(new LinearLayoutManager(ReadActivity.this, LinearLayoutManager.VERTICAL, false));
                    recyclerView.setAdapter(adapter);
                    recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                            super.onScrolled(recyclerView, dx, dy);
                            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                                layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                            }
                            scrollY += dy;
                            Log.e("recyclerView", "onScroll:" + "dy=" + scrollY + " pageHeight=" + pageHeight);
                            if (pageHeight != 0) {
                                Log.e("设置页数", " ");
//                                pageSum = recyclerView.getChildAt(layoutManager.findLastVisibleItemPosition()).getHeight() / pageHeight;
                                tvCount.setText((scrollY / pageHeight + 1) + "/" + pageSum);
                            }
                            tvTime.setText(getLocalTime());
                            if (!recyclerView.canScrollVertically(1)) {
                                Log.e("滑动判断", "已滑动到底部");
                                if (bottomId != -1) {
                                    biqugeUrl.chapterId = "" + bottomId;
                                    loadNextChapter();
                                }
                            }
                            if (!recyclerView.canScrollVertically(-1)) {
                                Log.e("滑动判断", "已滑动到顶部");
                                if (topId != -1) {
                                    biqugeUrl.chapterId = "" + topId;
                                    loadLastChapter();
                                }
                            }
                        }
                    });
                    handler.post(new Runnable() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void run() {
                            int margin = reLay.getPaddingTop();
                            int titleHeight = tvTitle.getHeight();
                            int displayHeight = getResources().getDisplayMetrics().heightPixels;
                            pageHeight = (displayHeight - 2 * (margin + titleHeight + margin));
                            Log.e("总高度", "" + recyclerView.getChildAt(0).getHeight());
                            pageSum = recyclerView.getChildAt(0).getHeight() / pageHeight;
                            tvCount.setText("1/" + pageSum);
                            tvTime.setText(getLocalTime());
                        }
                    });
                }
            }

            @Override
            public void onError(Response response, int errorCode, Exception e) {
                Log.e("ReadActivity", "onError" + response.toString());
            }
        });
    }

    /**
     * 加载上一章节内容
     */
    private void loadLastChapter() {
        okHttpHelper.get(biqugeUrl.getBookContent(), new BaseCallback<BeanBookContent>() {
            @Override
            public void onRequestBefore() {

            }

            @Override
            public void onFailure(Request request, Exception e) {

            }

            @Override
            public void onSuccess(Response response, BeanBookContent beanBookContent) {
                if (beanBookContent.getStatus() == 1) {
                    titleList.add(0, beanBookContent.getData().getCname());
                    topId = beanBookContent.getData().getPid();
                    adapter.insertData(beanBookContent.getData().getContent());
                }
            }

            @Override
            public void onError(Response response, int errorCode, Exception e) {

            }
        });
    }

    /**
     * 加载下一章节内容
     */
    private void loadNextChapter() {
        okHttpHelper.get(biqugeUrl.getBookContent(), new BaseCallback<BeanBookContent>() {
            @Override
            public void onRequestBefore() {

            }

            @Override
            public void onFailure(Request request, Exception e) {

            }

            @Override
            public void onSuccess(Response response, BeanBookContent beanBookContent) {
                if (beanBookContent.getStatus() == 1) {
                    titleList.add(beanBookContent.getData().getCname());
                    bottomId = beanBookContent.getData().getPid();
                    adapter.addData(beanBookContent.getData().getContent());
                }
            }

            @Override
            public void onError(Response response, int errorCode, Exception e) {

            }
        });
    }

    public String getLocalTime() {
        DateFormat dateFormat = DateFormat.getTimeInstance();
        String time = dateFormat.format(new Date());
        time = time.substring(0, time.length() - 3);
        return time;
    }
}
