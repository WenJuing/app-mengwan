package com.example.wenjuing.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wenjuing.MainActivity;
import com.example.wenjuing.MeActivity;
import com.example.wenjuing.R;
import com.example.wenjuing.VideoActivity;

public class PuRecycleViewActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.wenjuing.R.layout.activity_pu_recycle_view);

        // 点击按钮1跳转到页面1（逐帧动画）
        btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuRecycleViewActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮2跳转到页面2（瀑布流）
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuRecycleViewActivity.this, PuRecycleViewActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮3跳转到页面3（视频）
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuRecycleViewActivity.this, VideoActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮4跳转到页面4（瀑布流）
        btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PuRecycleViewActivity.this, MeActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        RecyclerView mRvPu = (RecyclerView) findViewById(R.id.rv_pu);
        // 设置模式
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        // 添加适配器
        mRvPu.setAdapter(new StaggeredGridAdapter(PuRecycleViewActivity.this));
        // 添加边距
        mRvPu.addItemDecoration(new MyDecoration());
    }
    // 设置Item样式
    class MyDecoration extends RecyclerView.ItemDecoration {
        @Override
        // 设置item间距
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelSize(R.dimen.dividerHeight);
            outRect.set(gap, gap, gap, gap);
        }
    }
}