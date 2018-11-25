package com.example.mycrawler.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanBookDirectory;
import com.example.mycrawler.data.BeanBookInfo;
import com.example.mycrawler.data.BeanChangyanComment;
import com.example.mycrawler.data.BeanChangyanLoad;
import com.example.mycrawler.util.BiqugeUrl;
import com.example.mycrawler.util.CommentAdapter;
import com.example.mycrawler.util.SameKindAdapter;
import com.example.mycrawler.util.WriteMoreAdapter;
import com.example.mycrawler.util.okhttp.BaseCallback;
import com.example.mycrawler.util.okhttp.OkHttpHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Request;
import okhttp3.Response;

public class BookActivity extends AppCompatActivity {

    @BindView(R.id.tv_bookName)
    TextView tvBookName;
    @BindView(R.id.tv_author)
    TextView tvAuthor;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_status)
    TextView tvStatus;
    @BindView(R.id.iv_star1)
    ImageView ivStar1;
    @BindView(R.id.iv_star2)
    ImageView ivStar2;
    @BindView(R.id.iv_star3)
    ImageView ivStar3;
    @BindView(R.id.iv_star4)
    ImageView ivStar4;
    @BindView(R.id.iv_star5)
    ImageView ivStar5;
    @BindView(R.id.tv_score)
    TextView tvScore;
    @BindView(R.id.iv_expandableIcon)
    ImageView ivExpandableIcon;
    @BindView(R.id.tv_briefDes)
    TextView tvBriefDes;
    @BindView(R.id.iv_cover)
    ImageView ivCover;
    @BindView(R.id.tv_latestUpdateTime)
    TextView tvLatestUpdateTime;
    @BindView(R.id.tv_latestChapter)
    TextView tvLatestChapter;
    @BindView(R.id.liLay_briefDes)
    LinearLayout liLayBriefDes;
    @BindView(R.id.recyclerViewComment)
    RecyclerView recyclerViewComment;
    @BindView(R.id.recyclerViewMore)
    RecyclerView recyclerViewMore;
    @BindView(R.id.recyclerViewSame)
    RecyclerView recyclerViewSame;
    @BindView(R.id.tv_authorMore)
    TextView tvAuthorMore;
    @BindView(R.id.scrollView)
    NestedScrollView scrollView;
    private String id;
    private OkHttpHelper okHttpHelper;
    private BiqugeUrl biqugeUrl;
    private Boolean expandable = false;
    private LinearLayout.LayoutParams params;
    private LinearLayout.LayoutParams params1;
    private String changyanLoadUrl;
    private String changyanCommentUrl;
    private SameKindAdapter sameKindAdapter;
    private WriteMoreAdapter writeMoreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BookActivity", "onCreate");
        setContentView(R.layout.activity_book);
        ButterKnife.bind(this);
        init();
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("BookActivity", "onCreate");
    }

    private void init() {
        biqugeUrl = new BiqugeUrl();
        biqugeUrl.setId(id = getIntent().getStringExtra("id"));
        Log.e("BookActivity", "id=" + id);
        okHttpHelper = OkHttpHelper.getinstance();
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) liLayBriefDes.getChildAt(1).getLayoutParams();
            params.topMargin = marginLayoutParams.topMargin;
            params.leftMargin = marginLayoutParams.leftMargin;
            params.rightMargin = marginLayoutParams.rightMargin;
            params.bottomMargin = marginLayoutParams.bottomMargin;
            params1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, tvBriefDes.getHeight());
            params1.topMargin = marginLayoutParams.topMargin;
            params1.leftMargin = marginLayoutParams.leftMargin;
            params1.rightMargin = marginLayoutParams.rightMargin;
            params1.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    private void initData() {
        Log.e("BookActivity", "url=" + biqugeUrl.getBookInfo());
        okHttpHelper.get(biqugeUrl.getBookInfo(), new BaseCallback<BeanBookInfo>() {
            @Override
            public void onRequestBefore() {

            }

            @Override
            public void onFailure(Request request, Exception e) {
                Log.e("onFailure", e.getMessage());
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onSuccess(Response response, BeanBookInfo beanBookInfo) {
                if (beanBookInfo.getStatus() == 1) {
                    initComment(beanBookInfo);
                    Glide.with(BookActivity.this)
                            .load(biqugeUrl.image + beanBookInfo.getData().getImg())
                            .into(ivCover);
                    tvBookName.setText(beanBookInfo.getData().getName());
                    tvAuthor.setText("作者：" + beanBookInfo.getData().getAuthor());
                    tvType.setText("类型：" + beanBookInfo.getData().getCName());
                    tvStatus.setText("状态：" + beanBookInfo.getData().getBookStatus());
                    tvBriefDes.setText(beanBookInfo.getData().getDesc());
                    tvScore.setText("" + beanBookInfo.getData().getBookVote().getScore());
                    tvLatestUpdateTime.setText("" + beanBookInfo.getData().getLastTime());
                    tvLatestChapter.setText("" + beanBookInfo.getData().getLastChapter());
                    setStar(beanBookInfo.getData().getBookVote().getScore());
                    tvAuthorMore.setText(beanBookInfo.getData().getAuthor() + " 还写过");
                    initRecyclerViewMore(beanBookInfo);
                    initRecyclerViewSame(beanBookInfo);
                }
            }

            @Override
            public void onError(Response response, int errorCode, Exception e) {
                Log.e("onError", "" + errorCode);
                if (e != null) {
                    Log.e("onError", "" + e.getMessage());
                }
            }
        });
    }

    private void initRecyclerViewSame(final BeanBookInfo beanBookInfo) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerViewSame.setLayoutManager(linearLayoutManager);
        sameKindAdapter = new SameKindAdapter(this, beanBookInfo, R.layout.item_recyclerview_more);
        sameKindAdapter.setOnItemClickListener(new SameKindAdapter.OnItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                Log.e("同类推荐", "position=" + position + " id=" + beanBookInfo.getData().getSameCategoryBooks().get(position).getId());
                Intent intent = new Intent(BookActivity.this, BookActivity.class);
                intent.putExtra("id", "" + beanBookInfo.getData().getSameCategoryBooks().get(position).getId());
                startActivity(intent);
            }
        });
        recyclerViewSame.setAdapter(sameKindAdapter);
    }

    private void initRecyclerViewMore(final BeanBookInfo beanBookInfo) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerViewMore.setLayoutManager(linearLayoutManager);
        writeMoreAdapter = new WriteMoreAdapter(this, beanBookInfo, R.layout.item_recyclerview_more);
        writeMoreAdapter.setOnItemClickListener(new WriteMoreAdapter.OnItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                Log.e("作者还写过", "position=" + position + " id=" + beanBookInfo.getData().getSameUserBooks().get(position).getId());
                Intent intent = new Intent(BookActivity.this, BookActivity.class);
                intent.putExtra("id", "" + beanBookInfo.getData().getSameUserBooks().get(position).getId());
                startActivity(intent);
            }
        });
        recyclerViewMore.setAdapter(writeMoreAdapter);
    }

    private void initComment(BeanBookInfo bookInfo) {
        changyanLoadUrl = "http://changyan.sohu.com/api/2/topic/load?client_id=cyt9aPs20&depth=0&topic_title=" + bookInfo.getData().getName() + "&style=&page_size=3&topic_source_id=" + id + "&topic_url=%20&sub_size=0&hot_size=1&order_by=";
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                okHttpHelper.get(changyanLoadUrl, new BaseCallback<BeanChangyanLoad>() {
                    @Override
                    public void onRequestBefore() {

                    }

                    @Override
                    public void onFailure(Request request, Exception e) {

                    }

                    @Override
                    public void onSuccess(Response response, BeanChangyanLoad beanChangyanLoad) {
                        getComment(beanChangyanLoad.getTopic_id());
                    }

                    @Override
                    public void onError(Response response, int errorCode, Exception e) {

                    }
                });
            }
        });
        thread.start();
    }

    private void getComment(long topic_id) {
        changyanCommentUrl = "http://changyan.sohu.com/api/2/topic/comments?client_id=cyt9aPs20&depth=0&style=&page_size=3&topic_id=" + topic_id + "&sub_size=0&order_by=&page_no=1";
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                okHttpHelper.get(changyanCommentUrl, new BaseCallback<BeanChangyanComment>() {
                    @Override
                    public void onRequestBefore() {

                    }

                    @Override
                    public void onFailure(Request request, Exception e) {

                    }

                    @Override
                    public void onSuccess(Response response, BeanChangyanComment beanChangyancomment) {
                        initRecyclerViewComment(beanChangyancomment);
                    }

                    @Override
                    public void onError(Response response, int errorCode, Exception e) {

                    }
                });
            }
        });
        thread.start();
    }

    private void initRecyclerViewComment(BeanChangyanComment beanChangyancomment) {
        recyclerViewComment.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewComment.setAdapter(new CommentAdapter(this, beanChangyancomment, R.layout.item_comment_recyclerview));
    }

    private void setStar(double score) {
        List<ImageView> stars = new ArrayList<>();
        stars.add(ivStar1);
        stars.add(ivStar2);
        stars.add(ivStar3);
        stars.add(ivStar4);
        stars.add(ivStar5);
        int count = (int) (score / 2);
        double decimal = score / 2 - count;
        if (decimal != 0 & decimal > 0.5) {
            count++;
        }
        for (int i = 0; i < count; i++) {
            stars.get(i).setImageResource(R.drawable.s_star_all);
        }

    }

    @OnClick({R.id.iv_back, R.id.btn_bookshelf, R.id.iv_expandableIcon, R.id.btn_moreComment,R.id.liLay_bookDirectory})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.btn_bookshelf:
                Intent intent = new Intent(BookActivity.this, MainActivity.class);
                intent.putExtra("whichTab", 0);
                startActivity(intent);
                finish();
                break;
            case R.id.iv_expandableIcon:
                if (!expandable) {
                    tvBriefDes.setLayoutParams(params);
                    tvBriefDes.setMaxLines(10);
                    tvBriefDes.requestLayout();
                    expandable = true;
                } else {
                    tvBriefDes.setLayoutParams(params1);
                    tvBriefDes.setMaxLines(3);
                    tvBriefDes.requestLayout();
                    expandable = false;
                }
                break;
            case R.id.btn_moreComment:
                intent = new Intent(BookActivity.this, WebActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
                break;
            case R.id.liLay_bookDirectory:
                intent = new Intent(BookActivity.this, DirectoryActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
                break;
        }
    }
}
