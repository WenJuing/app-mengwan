package com.example.wenjuing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.wenjuing.recycleview.PuRecycleViewActivity;

public class MeActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn_login;
    EditText et_username, et_password;
    ImageView iv_tou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        // 点击按钮1跳转到页面1（逐帧动画）
        btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮2跳转到页面2（瀑布流）
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeActivity.this, PuRecycleViewActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮3跳转到页面3（视频）
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeActivity.this, VideoActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮4跳转到页面4（瀑布流）
        btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeActivity.this, MeActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        // 点击按钮login登录
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                btn_login.setText("没做呀，登个der~");
                iv_tou.setImageResource(R.drawable.tou);
            }
        });

        // 绑定事件，点击输入框头像变动
        iv_tou = (ImageView) findViewById(R.id.iv_tou);

        et_username = (EditText) findViewById(R.id.et_username);
        et_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_tou.setImageResource(R.drawable.tou2);
                btn_login.setText("登 录");
            }
        });
        et_password = (EditText) findViewById(R.id.et_password);
        et_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_tou.setImageResource(R.drawable.tou2);
                btn_login.setText("登 录");
            }
        });
    }
}