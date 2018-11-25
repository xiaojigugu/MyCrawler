package com.example.mycrawler.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanChangyanComment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyViewHolder> {
    private Context context;
    private BeanChangyanComment comment;
    private int resId;

    public CommentAdapter(Context context, BeanChangyanComment comment, int resId) {
        this.context = context;
        this.comment = comment;
        this.resId = resId;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(resId, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Glide.with(context).load(
                comment.getComments()
                        .get(myViewHolder.getAdapterPosition())
                        .getPassport().getImg_url())
                .into(myViewHolder.iv_portrait);
        myViewHolder.tv_name.setText(comment.getComments()
                .get(myViewHolder.getAdapterPosition())
                .getPassport().getNickname());
        myViewHolder.tv_time.setText(stampToDate(comment.getComments()
                .get(myViewHolder.getAdapterPosition()).getCreate_time()));
        myViewHolder.tv_content.setText(comment.getComments()
                .get(myViewHolder.getAdapterPosition()).getContent());
    }

    private String stampToDate(long s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(s);
        res = simpleDateFormat.format(date);
        return res;
    }


    @Override
    public int getItemCount() {
        return comment.getComments().size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_portrait;
        private TextView tv_name, tv_time, tv_content;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_portrait = itemView.findViewById(R.id.iv_portrait);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_time = itemView.findViewById(R.id.tv_time);
            tv_content = itemView.findViewById(R.id.tv_content);
        }
    }
}
