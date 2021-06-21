package com.example.wenjuing.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wenjuing.R;

public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {

    private Context mContext;

    public StaggeredGridAdapter(Context context) {
        this.mContext = context;
    }
    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 传入一个View视图
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_pu_item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, final int position) {
        // 为item添加图片
        if (position == 1) {
            holder.imageView.setImageResource(R.drawable.item1);
        } else if (position == 2) {
            holder.imageView.setImageResource(R.drawable.item2);
        } else if (position == 3) {
            holder.imageView.setImageResource(R.drawable.item3);
        } else if (position == 4) {
            holder.imageView.setImageResource(R.drawable.item4);
        } else if (position == 5) {
            holder.imageView.setImageResource(R.drawable.item5);
        } else if (position == 6) {
            holder.imageView.setImageResource(R.drawable.item6);
        } else if (position == 7) {
            holder.imageView.setImageResource(R.drawable.item7);
        } else if (position == 8) {
            holder.imageView.setImageResource(R.drawable.item8);
        } else if (position == 9) {
            holder.imageView.setImageResource(R.drawable.item9);
        } else if (position == 10) {
            holder.imageView.setImageResource(R.drawable.item10);
        } else if (position == 11) {
            holder.imageView.setImageResource(R.drawable.item11);
        } else if (position == 12) {
            holder.imageView.setImageResource(R.drawable.item12);
        } else if (position == 13) {
            holder.imageView.setImageResource(R.drawable.item13);
        } else if (position == 14) {
            holder.imageView.setImageResource(R.drawable.item14);
        } else if (position == 15) {
            holder.imageView.setImageResource(R.drawable.item15);
        } else if (position == 16) {
            holder.imageView.setImageResource(R.drawable.item16);
        } else if (position == 17) {
            holder.imageView.setImageResource(R.drawable.item17);
        } else if (position == 18) {
            holder.imageView.setImageResource(R.drawable.item18);
        } else if (position == 19) {
            holder.imageView.setImageResource(R.drawable.item19);
        } else if (position == 20) {
            holder.imageView.setImageResource(R.drawable.item20);
        }
        // 设置点击事件
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "第" + position + "位小可爱~", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        // 返回值为列表长度
        return 20;
    }

    static class LinearViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;

        public LinearViewHolder(View itemView) {
            super((itemView));
            // 获取item
            imageView = (ImageView) itemView.findViewById(R.id.iv);
        }
    }
}
