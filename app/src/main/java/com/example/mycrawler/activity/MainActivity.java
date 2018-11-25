package com.example.mycrawler.activity;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mycrawler.R;
import com.example.mycrawler.fragment.BookShelfFragment;
import com.example.mycrawler.fragment.BookStoreFragment;
import com.example.mycrawler.fragment.RankingFragment;

public class MainActivity extends AppCompatActivity {

    private Class[] fragments;
    private int[] images;
    private String[] text;
    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTabData();
        initTabHost();
    }

    private void initTabData() {
        fragments = new Class[]{BookShelfFragment.class, BookStoreFragment.class,RankingFragment.class};
        images = new int[]{R.drawable.selector_tab_bookshelf, R.drawable.selector_tab_bookstore,R.drawable.selector_tab_ranking};
        text = new String[]{"书架", "书城","排行榜"};
    }

    private void initTabHost() {
        tabHost = findViewById(R.id.tabHost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        for (int i = 0; i < fragments.length; i++) {
            View view = getLayoutInflater().inflate(R.layout.item_tab, null);
            ImageView iv_tab = view.findViewById(R.id.iv_tab);
            TextView tv_tab = view.findViewById(R.id.tv_tab);
            iv_tab.setBackgroundResource(images[i]);
            tv_tab.setText(text[i]);
            tabHost.addTab(tabHost.newTabSpec("" + i).setIndicator("").setIndicator(view), fragments[i], null);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (getIntent().getIntExtra("whichTab",-1)==0){
            tabHost.setCurrentTab(0);
        }
    }
}
