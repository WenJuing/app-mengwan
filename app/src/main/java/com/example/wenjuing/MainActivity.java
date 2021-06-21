package com.example.wenjuing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.wenjuing.recycleview.PuRecycleViewActivity;

import com.example.wenjuing.webPage.BaiDuActivity;
import com.example.wenjuing.webPage.BiliActivity;
import com.example.wenjuing.webPage.ZhihuActivity;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button btn_start;
    private AnimationDrawable animation;
    Button btn1, btn2, btn3, btn4, btnBaiDu, btnBili, btnZhiHu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 点击按钮1跳转到页面1（逐帧动画）
        btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮2跳转到页面2（瀑布流）
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PuRecycleViewActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮3跳转到页面3（视频）
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮4跳转到页面4（瀑布流）
        btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MeActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });


        // 点击按钮baiDu跳转到百度网
        btnBaiDu = (Button) findViewById(R.id.baiDu);
        btnBaiDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BaiDuActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮bili跳转到B站
        btnBili = (Button) findViewById(R.id.bili);
        btnBili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BiliActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮zhiHu跳转到zhihu
        btnZhiHu = (Button) findViewById(R.id.zhiHu);
        btnZhiHu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ZhihuActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 逐帧动画效果
        ImageView iv_flower = (ImageView) findViewById(R.id.iv_flower);
        btn_start = (Button) findViewById(R.id.btn_play);
        btn_start.setOnClickListener(this);
        // 获取AnimationDrawable对象
        animation = (AnimationDrawable) iv_flower.getBackground();
    }
    public void onClick(View v) {
        // 判断动画是否在播放
        if (!animation.isRunning()) {
            // 动画没有在播放状态，则播放
            animation.start();
            btn_start.setBackgroundResource(android.R.drawable.ic_media_pause);
        } else {
            // 动画在播放状态，则停止
            animation.stop();
            btn_start.setBackgroundResource(android.R.drawable.ic_media_play);
        }
    }
}