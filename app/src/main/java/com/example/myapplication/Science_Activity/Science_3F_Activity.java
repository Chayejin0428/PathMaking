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

public class Science_3F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_3f);
        textview=findViewById(R.id.textView6);
        moving_301();
        moving_303();
        moving_304();
        moving_305();
        moving_307();
        moving_308();
        moving_309();
        moving_310();
        moving_351();
        moving_352();
        moving_358();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 101호에서 최단거리 이동
    private void moving_301() {
        final Button b = (Button) findViewById(R.id.s_301);
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
    private void moving_303() {
        final Button b = (Button) findViewById(R.id.s_303);
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
    private void moving_304() {
        final Button b = (Button) findViewById(R.id.s_304);
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
    private void moving_305() {
        final Button b = (Button) findViewById(R.id.s_305);
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
    private void moving_307() {
        final Button b = (Button) findViewById(R.id.s_307);
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
    private void moving_308() {
        final Button b = (Button) findViewById(R.id.s_308);
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
    private void moving_309() {
        final Button b = (Button) findViewById(R.id.s_309);
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
    private void moving_310() {
        final Button b = (Button) findViewById(R.id.s_310);
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
    private void moving_351() {
        final Button b = (Button) findViewById(R.id.s_351);
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
    private void moving_352() {
        final Button b = (Button) findViewById(R.id.s_352);
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
    private void moving_358() {
        final Button b = (Button) findViewById(R.id.s_358);
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