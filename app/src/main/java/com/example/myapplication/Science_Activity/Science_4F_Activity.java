package com.example.myapplication.Science_Activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Science_4F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_4f);
        textview=findViewById(R.id.textView6);
        moving_401();
        moving_403();
        moving_404();
        moving_405();
        moving_407();
        moving_408();
        moving_409();
        moving_410();
        moving_451();
        moving_452();
        moving_456();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 101호에서 최단거리 이동
    private void moving_401() {
        final Button b = (Button) findViewById(R.id.s_401);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 800, 1000, 1000); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 500, 350); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE); // 두번 반복
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_403() {
        final Button b = (Button) findViewById(R.id.s_403);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_404() {
        final Button b = (Button) findViewById(R.id.s_404);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_405() {
        final Button b = (Button) findViewById(R.id.s_405);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_407() {
        final Button b = (Button) findViewById(R.id.s_407);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_408() {
        final Button b = (Button) findViewById(R.id.s_408);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_409() {
        final Button b = (Button) findViewById(R.id.s_409);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_410() {
        final Button b = (Button) findViewById(R.id.s_410);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_451() {
        final Button b = (Button) findViewById(R.id.s_451);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_452() {
        final Button b = (Button) findViewById(R.id.s_452);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_456() {
        final Button b = (Button) findViewById(R.id.s_456);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
}