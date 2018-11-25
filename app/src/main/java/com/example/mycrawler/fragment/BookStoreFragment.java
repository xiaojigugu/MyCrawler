package com.example.mycrawler.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mycrawler.R;


public class BookStoreFragment extends Fragment {


    public BookStoreFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_book_store, container, false);
       initView(view);
        return view;
    }

    private void initView(View view) {

    }

}
