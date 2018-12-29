package com.example.mycrawler.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.mycrawler.R;

import java.util.ArrayList;
import java.util.List;

public class BookContentAdapter extends RecyclerView.Adapter<BookContentAdapter.ViewHolder> {
    private Context context;
    private int resId;
    private String content;
    private List<String> list;

    public BookContentAdapter(Context context, int resId,String content) {
        this.context = context;
        this.resId = resId;
        this.content=content;
        list=new ArrayList<>();
        list.add(content);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(resId, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(list.get(viewHolder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addData(String content){
        list.add(content);
        notifyDataSetChanged();
    }
    public void insertData(String content){
        list.add(0,content);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListner(OnItemClickListener onItemClickListner) {
        this.onItemClickListener = onItemClickListner;
    }
}
