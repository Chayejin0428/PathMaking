package com.example.myapplication.Science_Activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Baek_Activity.Baek_4F_Activity;
import com.example.myapplication.R;
import com.suke.widget.SwitchButton;

public class Science_2F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_2f);
        textview=findViewById(R.id.textView6);

        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        Science_2F_Activity.F1View f1view= new Science_2F_Activity.F1View(f1.getContext());
        f1.addView(f1view);
        f1.setVisibility(View.GONE);

        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        Science_2F_Activity.F2View f2view= new Science_2F_Activity.F2View(f2.getContext());
        f2.addView(f2view);
        f2.setVisibility(View.GONE);

        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        Science_2F_Activity.F3View f3view= new Science_2F_Activity.F3View(f3.getContext());
        f3.addView(f3view);
        f3.setVisibility(View.GONE);

        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        Science_2F_Activity.F4View f4view= new Science_2F_Activity.F4View(f4.getContext());
        f4.addView(f4view);
        f4.setVisibility(View.GONE);

        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        Science_2F_Activity.F5View f5view= new Science_2F_Activity.F5View(f5.getContext());
        f5.addView(f5view);
        f5.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        Science_2F_Activity.finalView finalview= new Science_2F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Science_2F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    f1.setVisibility(View.INVISIBLE);
                    f2.setVisibility(View.INVISIBLE);
                    f3.setVisibility(View.INVISIBLE);
                    f4.setVisibility(View.INVISIBLE);
                    f5.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Science_2F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();

                    f1.setVisibility(View.INVISIBLE);
                    f2.setVisibility(View.INVISIBLE);
                    f3.setVisibility(View.INVISIBLE);
                    f4.setVisibility(View.INVISIBLE);
                    f5.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if(prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }
        moving_201();
        moving_203();
        moving_204();
        moving_205();
        moving_207();
        moving_208();
        moving_209();
        moving_210();
        moving_251();
        moving_252();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    //경로
    public class F1View extends View {
        public F1View(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25,25},0));
            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#5DCD88"));
            Path path = new Path();
            path.moveTo(1150,355);
            path.lineTo(850,355);
            path.lineTo(850,300);

            canvas.drawPath(path, MyPaint);
        }
    }
    public class F2View extends View {
        public F2View(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25,25},0));
            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#5DCD88"));
            Path path = new Path();
            path.moveTo(1200,355);
            path.lineTo(1500,355);
            path.lineTo(1500,300);

            canvas.drawPath(path, MyPaint);
        }
    }
    public class F3View extends View {
        public F3View(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25,25},0));
            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#5DCD88"));
            Path path = new Path();
            path.moveTo(650,340);
            path.lineTo(850,340);
            path.lineTo(850,300);

            canvas.drawPath(path, MyPaint);
        }
    }
    public class F4View extends View {
        public F4View(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25,25},0));
            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#5DCD88"));
            Path path = new Path();
            path.moveTo(500,340);
            path.lineTo(170,340);

            canvas.drawPath(path, MyPaint);
        }
    }
    public class F5View extends View {
        public F5View(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25,25},0));
            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#5DCD88"));
            Path path = new Path();
            path.moveTo(1500,600);
            path.lineTo(1500,300);

            canvas.drawPath(path, MyPaint);
        }
    }
    public class finalView extends View {
        public finalView(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25,25},0));
            MyPaint.setStrokeWidth(5f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#5DCD88"));

            Path path = new Path();
            path.moveTo(170,340);
            path.lineTo(910,340);
            path.lineTo(910,355);
            path.lineTo(1500,355);
            path.lineTo(1500,655);

            path.moveTo(850,340);
            path.lineTo(850,300);

            canvas.drawPath(path, MyPaint);
        }
    }

    //비상구안내
    private void moving_201() {
        final Button b = (Button) findViewById(R.id.s_201);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1100, 800, 800); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300, 250); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                animation1.setRepeatCount(ValueAnimator.REVERSE); // 두번 반복
                animation3.setRepeatCount(ValueAnimator.REVERSE);

                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    private void moving_203() {
        final Button b = (Button) findViewById(R.id.s_203);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350, 1450, 1450); //x 좌표
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300, 250); //y 좌표
                animation3.setDuration(1300);
                animation3.start();

                f1.setVisibility(View.GONE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    private void moving_204() {
        final Button b = (Button) findViewById(R.id.s_204);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1200, 1450, 1450); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300, 250); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);

                f1.setVisibility(View.GONE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    private void moving_205() {
        final Button b = (Button) findViewById(R.id.s_205);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1000, 800, 800); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300, 250); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    private void moving_207() {
        final Button b = (Button) findViewById(R.id.s_207);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 600, 800, 800); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300, 250); //y 좌표
                animation3.setDuration(1800);
                animation3.start();


                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    private void moving_208() {
        final Button b = (Button) findViewById(R.id.s_208);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 450, 120); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300); //y 좌표
                animation3.setDuration(1500);
                animation3.start();

                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.VISIBLE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    private void moving_209() {
        final Button b = (Button) findViewById(R.id.s_209);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400, 120); //x 좌표
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300); //y 좌표
                animation3.setDuration(1300);
                animation3.start();

                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.VISIBLE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    private void moving_210() {
        final Button b = (Button) findViewById(R.id.s_210);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 600, 800, 800); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 300, 250); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    private void moving_251() {
        final Button b = (Button) findViewById(R.id.s_251);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1450, 1450); //x 좌표
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 250); //y 좌표
                animation3.setDuration(1300);
                animation3.start();

                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    private void moving_252() {
        final Button b = (Button) findViewById(R.id.s_252);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout f1 = (FrameLayout)findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout)findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout)findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout)findViewById(R.id.f4);
        final FrameLayout f5 = (FrameLayout)findViewById(R.id.f5);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1450, 1450); //x 좌표
                animation1.setDuration(1200);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 400, 250); //y 좌표
                animation3.setDuration(1200);
                animation3.start();

                f1.setVisibility(View.GONE);
                f2.setVisibility(View.GONE);
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);
            }
        });
    }

}