package com.example.wenjuing.webPage;
import com.example.wenjuing.MainActivity;
import com.example.wenjuing.MeActivity;
import com.example.wenjuing.R;
import com.example.wenjuing.VideoActivity;
import com.example.wenjuing.recycleview.PuRecycleViewActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class DianYingActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dian_ying);
        // 点击按钮1跳转到页面1（逐帧动画）
        btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DianYingActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮2跳转到页面2（瀑布流）
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DianYingActivity.this, PuRecycleViewActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮3跳转到页面3（视频）
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DianYingActivity.this, VideoActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮4跳转到页面4（瀑布流）
        btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DianYingActivity.this, MeActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        WebView wb = (WebView) findViewById(R.id.wb_dy);
        wb.loadUrl("http://www.meijuniao.com/");
        //系统默认会通过手机浏览器打开网页，为了能够直接通过WebView显示网页，则必须设置
        wb.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //使用WebView加载显示url
                view.loadUrl(url);
                //返回true
                return true;
            }
        });
    }
}