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
import com.bumptech.glide.request.RequestOptions;
import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanBookInfo;

import java.util.List;

public class SameKindAdapter extends RecyclerView.Adapter<SameKindAdapter.MyViewHolder> {
    private Context context;
    private int resId;
    private BiqugeUrl url;
    private List<BeanBookInfo.DataBean.SameCategoryBooksBean> list;

    public SameKindAdapter(Context context, BeanBookInfo bookInfo, int resId) {
        this.context = context;
        this.list = bookInfo.getData().getSameCategoryBooks();
        this.resId = resId;
        url = new BiqugeUrl();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(resId, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        RequestOptions options = new RequestOptions();
        options.placeholder(R.drawable.default_cover);
        Glide.with(context).applyDefaultRequestOptions(options).load(url.image + list.get(myViewHolder.getAdapterPosition()).getImg()).into(myViewHolder.iv_cover);
        myViewHolder.tv_name.setText(list.get(myViewHolder.getAdapterPosition()).getName());
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener!=null){onItemClickListener.onClick(myViewHolder.itemView,myViewHolder.getAdapterPosition());}
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void clearData(){
        list.clear();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_cover;
        private TextView tv_name, tv_score;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_cover = itemView.findViewById(R.id.iv_cover);
            tv_name = itemView.findViewById(R.id.tv_bookName);
        }
    }

    private OnItemClickListener onItemClickListener;
    public interface OnItemClickListener{
        void onClick(View view,int position);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener=onItemClickListener;
    }
}
