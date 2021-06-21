package com.example.wenjuing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.wenjuing.recycleview.PuRecycleViewActivity;
import com.example.wenjuing.webPage.DianYingActivity;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView bt_play, bt_play2;
    private VideoView videoView, videoView2;
    Button btn1, btn2, btn3, btn4, dyw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // 点击按钮1跳转到页面1（逐帧动画）
        btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮2跳转到页面2（瀑布流）
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this, PuRecycleViewActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮3跳转到页面3（视频）
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this, VideoActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮4跳转到页面4（瀑布流）
        btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this, MeActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        // 点击按钮dyw跳转到电影网站
        dyw = (Button) findViewById(R.id.dyw);
        dyw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this, DianYingActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        bt_play = (ImageView) findViewById(R.id.bt_play);
        videoView = (VideoView) findViewById(R.id.video_view);
        bt_play2 = (ImageView) findViewById(R.id.bt_play2);
        videoView2 = (VideoView) findViewById(R.id.video_view2);

        MediaController controller = new MediaController(this);
        MediaController controller2 = new MediaController(this);
        videoView.setMediaController(controller);
        bt_play.setOnClickListener(this);
        videoView2.setMediaController(controller2);
        bt_play2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_play:
                play();
                break;
            case R.id.bt_play2:
                play2();
                break;
        }
    }
    // 播放视频1
    private void play() {
        if (videoView != null && videoView.isPlaying()) {
            bt_play.setImageResource(android.R.drawable.ic_media_play);
            videoView.stopPlayback();
            return;
        }
        videoView.setVideoURI(Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
        videoView.start();
        bt_play.setImageResource(android.R.drawable.ic_media_pause);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                bt_play.setImageResource(android.R.drawable.ic_media_play);
            }
        });
    }
    // 播放视频2
    private void play2() {
        if (videoView2 != null && videoView2.isPlaying()) {
            bt_play2.setImageResource(android.R.drawable.ic_media_play);
            videoView2.stopPlayback();
            return;
        }
        videoView2.setVideoURI(Uri.parse("http://vjs.zencdn.net/v/oceans.mp4"));
        videoView2.start();
        bt_play2.setImageResource(android.R.drawable.ic_media_pause);
        videoView2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                bt_play2.setImageResource(android.R.drawable.ic_media_play);
            }
        });
    }
}