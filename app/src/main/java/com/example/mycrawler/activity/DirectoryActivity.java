package com.example.mycrawler.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanBookDirectory;
import com.example.mycrawler.util.BiqugeUrl;
import com.example.mycrawler.util.DirectoryAdapter;
import com.example.mycrawler.util.okhttp.BaseCallback;
import com.example.mycrawler.util.okhttp.OkHttpHelper;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Request;
import okhttp3.Response;

public class DirectoryActivity extends AppCompatActivity {

    private BiqugeUrl biqugeUrl;
    private RecyclerView recyclerView;
    private DirectoryAdapter adapter;
    private String bookId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        ButterKnife.bind(this);

        init();
        initData();
    }

    private void init() {
        biqugeUrl = new BiqugeUrl();
        bookId = getIntent().getStringExtra("id");
        biqugeUrl.setId(bookId);
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void initData() {
        OkHttpHelper okHttpHelper = OkHttpHelper.getinstance();
        Log.e("章节目录Url",""+biqugeUrl.getBookChapter());
        okHttpHelper.get(biqugeUrl.getBookChapter(), new BaseCallback<BeanBookDirectory>() {
            @Override
            public void onRequestBefore() {

            }

            @Override
            public void onFailure(Request request, Exception e) {
                Log.e("DirectoryActivity", "onFailure" + e.getMessage());
            }

            @Override
            public void onSuccess(Response response, BeanBookDirectory beanBookDirectory) {
                if (beanBookDirectory.getStatus() == 1) {
                    Log.e("DirectoryActivity", "onSuccess" + beanBookDirectory.getData().getList().get(0).getList().get(0).getName());
                    initRecyclerView(beanBookDirectory.getData().getList());
                }
            }

            @Override
            public void onError(Response response, int errorCode, Exception e) {
                Log.e("DirectoryActivity", "onError" + e.getMessage());
            }
        });
    }

    private void initRecyclerView(List<BeanBookDirectory.DataBean.ListBeanX> list) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));
        adapter = new DirectoryAdapter(this, R.layout.item_book_directory, list);
        adapter.setOnItemClickListner(new DirectoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if (adapter.idList.get(position) != 0) {
                    Log.e("章节", "" + adapter.idList.get(position));
                    Intent intent = new Intent(DirectoryActivity.this, ReadActivity.class);
                    intent.putExtra("chapterId",adapter.idList.get(position));
                    intent.putExtra("bookId",bookId);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }

    @OnClick({R.id.liLay_back, R.id.liLay_sort})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.liLay_back:
                finish();
                break;
            case R.id.liLay_sort:
                break;
        }
    }
}
