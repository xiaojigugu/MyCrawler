package com.example.mycrawler.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mycrawler.R;
import com.example.mycrawler.activity.BookActivity;
import com.example.mycrawler.data.BeanRanking;
import com.example.mycrawler.util.BiqugeUrl;
import com.example.mycrawler.util.RankingAdapter;
import com.example.mycrawler.util.okhttp.BaseCallback;
import com.example.mycrawler.util.okhttp.OkHttpHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import okhttp3.Request;
import okhttp3.Response;

public class RankingFragment extends Fragment {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    Unbinder unbinder;
    @BindView(R.id.tv_man)
    TextView tvMan;
    @BindView(R.id.tv_lady)
    TextView tvLady;
    @BindView(R.id.tv_hot)
    TextView tvHot;
    @BindView(R.id.tv_commend)
    TextView tvCommend;
    @BindView(R.id.tv_over)
    TextView tvOver;
    @BindView(R.id.tv_collect)
    TextView tvCollect;
    @BindView(R.id.tv_new)
    TextView tvNew;
    @BindView(R.id.tv_ranking)
    TextView tvRanking;
    @BindView(R.id.tv_week)
    TextView tvWeek;
    @BindView(R.id.tv_month)
    TextView tvMonth;
    @BindView(R.id.tv_total)
    TextView tvTotal;
    @BindView(R.id.scrollView)
    NestedScrollView scrollView;
    @BindView(R.id.progressBar)
    ContentLoadingProgressBar progressBar;
    private BiqugeUrl biqugeUrl;
    private String url;
    private RankingAdapter adapter;
    private TextView[] textViews1;
    private TextView[] textViews2;
    private TextView[] textViews3;
    private Intent intent;
    private int index = 1;
    private Boolean isLoading = false;
    private OkHttpHelper okHttpHelper;
    private MyHandler myHandler;
    private int endCode = 0;
    private List<BeanRanking.DataBean.BookListBean> bookList;
    private LinearLayoutManager layoutManager;
    private View view;

    public RankingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_ranking, container, false);
        }
        unbinder = ButterKnife.bind(this, view);
        init();
        initData(url, "onCreateView");//默认为 男生-最热
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    private void init() {
        textViews1 = new TextView[]{tvMan, tvLady};
        textViews2 = new TextView[]{tvHot, tvNew, tvCommend, tvCollect, tvOver, tvRanking};
        textViews3 = new TextView[]{tvTotal, tvMonth, tvWeek};
        tvTitle.setText("排行榜");
        biqugeUrl = new BiqugeUrl();
        url = biqugeUrl.rankingWeek;
        intent = new Intent(getContext(), BookActivity.class);
        layoutManager = new LinearLayoutManager(getContext());
    }

    private void initRecyclerView(final BeanRanking beanRanking) {
        if (adapter == null) {
            progressBar.setVisibility(View.GONE);
            initAdapter(beanRanking);
        } else {
            if (index > 2) {
                adapter.addData(beanRanking);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
                progressBar.setVisibility(View.GONE);
            } else {
                adapter.changeData(beanRanking);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
                progressBar.setVisibility(View.GONE);
                scrollView.scrollTo(0, 0);
            }
        }
    }

    private void initAdapter(BeanRanking beanRanking) {
        adapter = new RankingAdapter(getContext(), beanRanking, R.layout.item_book_list);
        adapter.setOnItemClickListener(new RankingAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, BeanRanking.DataBean.BookListBean bookListBean) {
                Log.e("点击了", " " + position + " booId=" + bookList.get(position).getId());
                intent.putExtra("id", "" + bookList.get(position).getId());
                startActivity(intent);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    View lastChildView = recyclerView.getLayoutManager().getChildAt(recyclerView.getLayoutManager().getChildCount() - 1);
                    int lastChildBottom = lastChildView.getBottom();
                    int recyclerBottom = recyclerView.getBottom() - recyclerView.getPaddingBottom();

                    int lastPosition = recyclerView.getLayoutManager().getPosition(lastChildView);

                    if (lastChildBottom == recyclerBottom && lastPosition == recyclerView.getLayoutManager().getItemCount() - 1) {
                        if (!isLoading) {
                            if (endCode >= 0) {
                                initData(biqugeUrl.getRanking(), "OnScrollListener");
                            }
                        }
                    }
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }

    @OnClick({R.id.tv_man, R.id.tv_lady
            , R.id.tv_hot, R.id.tv_commend, R.id.tv_collect, R.id.tv_over, R.id.tv_new, R.id.tv_ranking
            , R.id.tv_week, R.id.tv_month, R.id.tv_total})
    public void onViewClicked(View view) {
        biqugeUrl.index = String.valueOf(index = 1);
        bookList.clear();
        switch (view.getId()) {
            case R.id.tv_man:
                setSelectionBack(1, tvMan);
                biqugeUrl.sex = "man";
                url = biqugeUrl.getRanking();
                initData(url, "man");
                break;
            case R.id.tv_lady:
                setSelectionBack(1, tvLady);
                Log.e("onViewClicked", "lady");
                biqugeUrl.sex = "lady";
                url = biqugeUrl.getRanking();
                initData(url, "lady");
                break;
            case R.id.tv_hot:
                setSelectionBack(2, tvHot);
                biqugeUrl.type = "hot";
                initData(url, "hot");
                break;
            case R.id.tv_commend:
                setSelectionBack(2, tvCommend);
                biqugeUrl.type = "commend";
                url = biqugeUrl.getRanking();
                initData(url, "commend");
                break;
            case R.id.tv_collect:
                setSelectionBack(2, tvCollect);
                biqugeUrl.type = "collect";
                url = biqugeUrl.getRanking();
                initData(url, "collect");
                break;
            case R.id.tv_over:
                setSelectionBack(2, tvOver);
                biqugeUrl.type = "over";
                url = biqugeUrl.getRanking();
                initData(url, "over");
                break;
            case R.id.tv_new:
                setSelectionBack(2, tvNew);
                biqugeUrl.type = "new";
                url = biqugeUrl.getRanking();
                initData(url, "new");
                break;
            case R.id.tv_ranking:
                setSelectionBack(2, tvRanking);
                biqugeUrl.type = "vote";
                url = biqugeUrl.getRanking();
                initData(url, "ranking");
                break;
            case R.id.tv_week:
                setSelectionBack(3, tvWeek);
                biqugeUrl.rankingType = "week";
                url = biqugeUrl.getRanking();
                initData(url, "week");
                break;
            case R.id.tv_month:
                setSelectionBack(3, tvMonth);
                biqugeUrl.rankingType = "month";
                url = biqugeUrl.getRanking();
                initData(url, "month");
                break;
            case R.id.tv_total:
                setSelectionBack(3, tvTotal);
                biqugeUrl.rankingType = "total";
                url = biqugeUrl.getRanking();
                initData(url, "total");
                break;
        }
    }

    public void setSelectionBack(int row, TextView textView) {
        if (row == 1) {
            for (TextView aTextViews1 : textViews1) {
                aTextViews1.setBackgroundResource(R.color.background);
            }

        } else if (row == 2) {
            for (TextView aTextViews2 : textViews2) {
                aTextViews2.setBackgroundResource(R.color.background);
            }

        } else if (row == 3) {
            for (TextView aTextViews3 : textViews3) {
                aTextViews3.setBackgroundResource(R.color.background);
            }
        }
        textView.setBackgroundResource(R.drawable.shape_ranking_selection);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private void initData(final String Url, String flag) {
        Log.e("RankingFragment", "url=" + Url + " flag=" + flag);
        if (okHttpHelper == null) {
            okHttpHelper = OkHttpHelper.getinstance();
        }
        okHttpHelper.get(Url, new BaseCallback<BeanRanking>() {
            @Override
            public void onRequestBefore() {
                isLoading = true;
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFailure(Request request, Exception e) {
                isLoading = false;
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onSuccess(Response response, BeanRanking beanRanking) {
                isLoading = false;
                if (beanRanking.getData().isHasNext()) {
                    biqugeUrl.index = String.valueOf(++index);
                } else {
                    endCode = -1;
                }
                if (beanRanking.getStatus() == 1) {
                    Log.e("onSuccess", "Status==1");
                    if (bookList == null) {
                        bookList = new ArrayList<>();
                        bookList.addAll(beanRanking.getData().getBookList());
                    } else {
                        bookList.addAll(beanRanking.getData().getBookList());
                    }
                    Message message = new Message();
                    message.what = 1;
                    message.obj = beanRanking;
                    if (myHandler == null) {
                        myHandler = new MyHandler();
                    }
                    myHandler.sendMessage(message);
                } else {
                    Toast.makeText(getContext(), "数据更新失败...", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(Response response, int errorCode, Exception e) {
                progressBar.setVisibility(View.GONE);
                isLoading = false;
                Log.e("onError", "" + errorCode);
                if (e != null) {
                    Log.e("onError", "" + e.getMessage());
                }
            }
        });
    }

    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                BeanRanking beanRanking = (BeanRanking) msg.obj;
                initRecyclerView(beanRanking);
            }
        }
    }
}
