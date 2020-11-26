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

public class Science_1F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_1f);
        textview=findViewById(R.id.textView6);
        moving_101();
        moving_103();
        moving_104();
        moving_105();
        moving_107();
        moving_108();
        moving_109();
        moving_110();
        moving_152();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 101호에서 최단거리 이동
    private void moving_101() {
        final Button b = (Button) findViewById(R.id.s_101);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_103() {
        final Button b = (Button) findViewById(R.id.s_103);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_104() {
        final Button b = (Button) findViewById(R.id.s_104);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_105() {
        final Button b = (Button) findViewById(R.id.s_105);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_107() {
        final Button b = (Button) findViewById(R.id.s_107);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_108() {
        final Button b = (Button) findViewById(R.id.s_108);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_109() {
        final Button b = (Button) findViewById(R.id.s_109);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_110() {
        final Button b = (Button) findViewById(R.id.s_110);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    private void moving_152() {
        final Button b = (Button) findViewById(R.id.s_152);
        final ImageView iv = (ImageView) findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView2.setVisibility(View.VISIBLE);
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
                        imageView2.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

}