package com.example.mycrawler.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanRanking;

import java.util.List;

public class RankingAdapter extends RecyclerView.Adapter<RankingAdapter.MyViewHolder> {

    private Context context;
    private BeanRanking beanRanking;
    private int redId;
    private BiqugeUrl url;
    private List<BeanRanking.DataBean.BookListBean> bookList;

    public RankingAdapter(Context context, BeanRanking beanRanking, int resId) {
        Log.e("RankingAdapter", "构造方法");
        this.context = context;
        this.beanRanking = beanRanking;
        this.redId = resId;
        url = new BiqugeUrl();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(redId, null);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        if (myViewHolder.getAdapterPosition() == 0) {
            myViewHolder.firstToThree.setWhich(0, 50);
        }
        else if (myViewHolder.getAdapterPosition() == 1) {
            myViewHolder.firstToThree.setWhich(1, 50);
        }
        else if (myViewHolder.getAdapterPosition() == 2) {
            myViewHolder.firstToThree.setWhich(2, 50);
        }
        bookList = beanRanking.getData().getBookList();
        String imgName = bookList.get(myViewHolder.getAdapterPosition()).getImg();
        Glide.with(context).load(url.image + imgName).into(myViewHolder.iv_cover);
        myViewHolder.tv_bookName.setText(bookList.get(myViewHolder.getAdapterPosition()).getName());
        myViewHolder.tv_typeAndAuthor.setText(bookList.get(myViewHolder.getAdapterPosition()).getCName() + "|" + bookList.get(myViewHolder.getAdapterPosition()).getAuthor());
        myViewHolder.tv_synopsis.setText(bookList.get(myViewHolder.getAdapterPosition()).getDesc());
        myViewHolder.tv_ranking.setText(bookList.get(myViewHolder.getAdapterPosition()).getScore() + "分");
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(myViewHolder.itemView, myViewHolder.getAdapterPosition(), bookList.get(myViewHolder.getAdapterPosition()));
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return beanRanking.getData().getBookList().size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private FirstToThree firstToThree;
        private ImageView iv_cover;
        private TextView tv_bookName, tv_typeAndAuthor, tv_synopsis, tv_ranking;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            firstToThree = itemView.findViewById(R.id.iv_firstToThree);
            iv_cover = itemView.findViewById(R.id.iv_cover);
            tv_bookName = itemView.findViewById(R.id.tv_bookName);
            tv_typeAndAuthor = itemView.findViewById(R.id.tv_typeAndAuthor);
            tv_synopsis = itemView.findViewById(R.id.tv_synopsis);
            tv_ranking = itemView.findViewById(R.id.tv_ranking);
        }
    }

    public void changeData(BeanRanking beanRanking) {
        Log.e("RankingAdapter", "changeData");
        bookList.clear();
        this.beanRanking = beanRanking;
        notifyDataSetChanged();
    }

    public void addData(BeanRanking beanRanking) {
        Log.e("RankingAdapter", "addData");
        bookList.addAll(beanRanking.getData().getBookList());
        notifyDataSetChanged();
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onitemClickListener) {
        this.onItemClickListener = onitemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position, BeanRanking.DataBean.BookListBean bookListBean);
    }
}
