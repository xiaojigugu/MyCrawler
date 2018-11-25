package com.example.mycrawler.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycrawler.R;
import com.example.mycrawler.data.BeanBookDirectory;

import java.util.ArrayList;
import java.util.List;

public class DirectoryAdapter extends RecyclerView.Adapter<DirectoryAdapter.ViewHolder> {
    private Context context;
    private int resId;
    private List<String> nameList;
    public List<Integer> idList;

    public DirectoryAdapter(Context context, int resId, List<BeanBookDirectory.DataBean.ListBeanX> list) {
        this.context = context;
        this.resId = resId;
        nameList = new ArrayList<>();
        idList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {

            nameList.add(list.get(i).getName());
            idList.add(0);
            for (int j = 0; j < list.get(i).getList().size() - 1; j++) {
                nameList.add(list.get(i).getList().get(j).getName());
                idList.add(list.get(i).getList().get(j).getId());
            }
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(resId, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(nameList.get(viewHolder.getAdapterPosition()));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(viewHolder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
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
