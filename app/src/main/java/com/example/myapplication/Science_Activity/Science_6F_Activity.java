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

public class Science_6F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_6f);
        textview=findViewById(R.id.textView6);
        moving_601();
        moving_603();
        moving_604();
        moving_605();
        moving_607();
        moving_608();
        moving_609();
        moving_610();
        moving_651();
        moving_652();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    private void moving_601() {
        final Button b = (Button) findViewById(R.id.s_601);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1400, 1200, 1200); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 280, 280, 250); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_603() {
        final Button b = (Button) findViewById(R.id.s_603);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  710, 470); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400,400); //y 좌표
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
    private void moving_604() {
        final Button b = (Button) findViewById(R.id.s_604);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  950,930, 930); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  280, 280,180); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();
                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_605() {
        final Button b = (Button) findViewById(R.id.s_605);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  950,930, 930); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  280, 280,180); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_607() {
        final Button button = (Button) findViewById(R.id.s_607);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1100, 1500);
                        animation1.setDuration(2100);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  830,830);
                        animation3.setDuration(2100);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_608() {
        final Button button = (Button) findViewById(R.id.s_608);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1100, 1500);
                        animation1.setDuration(2100);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  830,830);
                        animation3.setDuration(2100);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_609() {
        final Button button = (Button) findViewById(R.id.s_609);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1190,1190,1220);
                        animation1.setDuration(1900);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  510,460,460);
                        animation3.setDuration(1900);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_610() {
        final Button button = (Button) findViewById(R.id.s_610);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1380,1380,1500);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  760,830,830);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_651() {
        final Button button = (Button) findViewById(R.id.s_651);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350,1500);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  830,830);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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
    private void moving_652() {
        final Button button = (Button) findViewById(R.id.s_652);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1450,1500);
                        animation1.setDuration(1000);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  830,830);
                        animation3.setDuration(1000);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);//반복
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