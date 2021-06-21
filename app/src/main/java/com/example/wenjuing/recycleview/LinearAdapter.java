package com.example.wenjuing.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wenjuing.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    private Context mContext;

    public LinearAdapter(Context context) {
        this.mContext = context;
    }
    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 传入一个View视图
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, final int position) {
        // 为item添加文本
        holder.textView.setText("Hello World!");
        // 设置点击事件
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "click..." + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        // 返回值为列表长度
        return 30;
    }

    static class LinearViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public LinearViewHolder(View itemView) {
            super((itemView));
            // 获取item
            textView = (TextView) itemView.findViewById(R.id.item_title);
        }
    }
}
