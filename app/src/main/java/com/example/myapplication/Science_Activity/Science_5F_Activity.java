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

import com.example.myapplication.R;
import com.suke.widget.SwitchButton;


public class Science_5F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_5f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1A = (FrameLayout)findViewById(R.id.fl1A);
        Science_5F_Activity.FL1AView fl1Aview= new Science_5F_Activity.FL1AView(fl1A.getContext());
        fl1A.addView(fl1Aview);
        fl1A.setVisibility(View.GONE);

        final FrameLayout fl1B = (FrameLayout)findViewById(R.id.fl1B);
        Science_5F_Activity.FL1BView fl1Bview= new Science_5F_Activity.FL1BView(fl1B.getContext());
        fl1B.addView(fl1Bview);
        fl1B.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        Science_5F_Activity.FL2View fl2view= new Science_5F_Activity.FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        Science_5F_Activity.FL3View fl3view= new Science_5F_Activity.FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        Science_5F_Activity.FL4View fl4view= new Science_5F_Activity.FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        Science_5F_Activity.FL5View fl5view= new Science_5F_Activity.FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6A = (FrameLayout)findViewById(R.id.fl6A);
        Science_5F_Activity.FL6AView fl6Aview= new Science_5F_Activity.FL6AView(fl6A.getContext());
        fl6A.addView(fl6Aview);
        fl6A.setVisibility(View.GONE);

        final FrameLayout fl6B = (FrameLayout)findViewById(R.id.fl6B);
        Science_5F_Activity.FL6BView fl6Bview= new Science_5F_Activity.FL6BView(fl6B.getContext());
        fl6B.addView(fl6Bview);
        fl6B.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        Science_5F_Activity.FL7View fl7view= new Science_5F_Activity.FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8A = (FrameLayout)findViewById(R.id.fl8A);
        Science_5F_Activity.FL8AView fl8Aview= new Science_5F_Activity.FL8AView(fl8A.getContext());
        fl8A.addView(fl8Aview);
        fl8A.setVisibility(View.GONE);

        final FrameLayout fl8B = (FrameLayout)findViewById(R.id.fl8B);
        Science_5F_Activity.FL8BView fl8Bview= new Science_5F_Activity.FL8BView(fl8B.getContext());
        fl8B.addView(fl8Bview);
        fl8B.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        Science_5F_Activity.FL9View fl9view= new Science_5F_Activity.FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        Science_5F_Activity.FL10View fl10view= new Science_5F_Activity.FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        Science_5F_Activity.FL11View fl11view= new Science_5F_Activity.FL11View(fl11.getContext());
        fl11.addView(fl11view);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        Science_5F_Activity.FL12View fl12view= new Science_5F_Activity.FL12View(fl12.getContext());
        fl12.addView(fl12view);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        Science_5F_Activity.FL13View fl13view= new Science_5F_Activity.FL13View(fl13.getContext());
        fl13.addView(fl13view);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14A = (FrameLayout)findViewById(R.id.fl14A);
        Science_5F_Activity.FL14AView fl14Aview= new Science_5F_Activity.FL14AView(fl14A.getContext());
        fl14A.addView(fl14Aview);
        fl14A.setVisibility(View.GONE);

        final FrameLayout fl14B = (FrameLayout)findViewById(R.id.fl14B);
        Science_5F_Activity.FL14BView fl14Bview= new Science_5F_Activity.FL14BView(fl14B.getContext());
        fl14B.addView(fl14Bview);
        fl14B.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        Science_5F_Activity.FL15View fl15view= new Science_5F_Activity.FL15View(fl15.getContext());
        fl15.addView(fl15view);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl51 = (FrameLayout)findViewById(R.id.fl51);
        Science_5F_Activity.FL51View fl51view= new Science_5F_Activity.FL51View(fl51.getContext());
        fl51.addView(fl51view);
        fl51.setVisibility(View.GONE);

        final FrameLayout fl52 = (FrameLayout)findViewById(R.id.fl52);
        Science_5F_Activity.FL52View fl52view= new Science_5F_Activity.FL52View(fl52.getContext());
        fl52.addView(fl52view);
        fl52.setVisibility(View.GONE);

        final FrameLayout fl53 = (FrameLayout)findViewById(R.id.fl53);
        Science_5F_Activity.FL53View fl53view= new Science_5F_Activity.FL53View(fl53.getContext());
        fl53.addView(fl53view);
        fl53.setVisibility(View.GONE);

        final FrameLayout fl54 = (FrameLayout)findViewById(R.id.fl54);
        Science_5F_Activity.FL54View fl54view= new Science_5F_Activity.FL54View(fl54.getContext());
        fl54.addView(fl54view);
        fl54.setVisibility(View.GONE);

        final FrameLayout fl55 = (FrameLayout)findViewById(R.id.fl55);
        Science_5F_Activity.FL55View fl55view= new Science_5F_Activity.FL55View(fl55.getContext());
        fl55.addView(fl55view);
        fl55.setVisibility(View.GONE);

        final FrameLayout fl56 = (FrameLayout)findViewById(R.id.fl56);
        Science_5F_Activity.FL56View fl56view= new Science_5F_Activity.FL56View(fl56.getContext());
        fl56.addView(fl56view);
        fl56.setVisibility(View.GONE);

        final FrameLayout fl57 = (FrameLayout)findViewById(R.id.fl57);
        Science_5F_Activity.FL57View fl57view= new Science_5F_Activity.FL57View(fl57.getContext());
        fl57.addView(fl57view);
        fl57.setVisibility(View.GONE);

        final FrameLayout fl58 = (FrameLayout)findViewById(R.id.fl58);
        Science_5F_Activity.FL58View fl58view= new Science_5F_Activity.FL58View(fl58.getContext());
        fl58.addView(fl58view);
        fl58.setVisibility(View.GONE);

        final FrameLayout fl59 = (FrameLayout)findViewById(R.id.fl59);
        Science_5F_Activity.FL59View fl59view= new Science_5F_Activity.FL59View(fl59.getContext());
        fl59.addView(fl59view);
        fl59.setVisibility(View.GONE);

        final FrameLayout fl60 = (FrameLayout)findViewById(R.id.fl60);
        Science_5F_Activity.FL60View fl60view= new Science_5F_Activity.FL60View(fl60.getContext());
        fl60.addView(fl60view);
        fl60.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        Science_5F_Activity.finalView finalview= new Science_5F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Science_5F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    fl1A.setVisibility(View.INVISIBLE);
                    fl1B.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6A.setVisibility(View.INVISIBLE);
                    fl6B.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);
                    fl8A.setVisibility(View.INVISIBLE);
                    fl8B.setVisibility(View.INVISIBLE);
                    fl9.setVisibility(View.INVISIBLE);
                    fl10.setVisibility(View.INVISIBLE);
                    fl11.setVisibility(View.INVISIBLE);
                    fl12.setVisibility(View.INVISIBLE);
                    fl13.setVisibility(View.INVISIBLE);
                    fl14A.setVisibility(View.INVISIBLE);
                    fl14B.setVisibility(View.INVISIBLE);
                    fl15.setVisibility(View.INVISIBLE);
                    fl51.setVisibility(View.INVISIBLE);
                    fl52.setVisibility(View.INVISIBLE);
                    fl53.setVisibility(View.INVISIBLE);
                    fl54.setVisibility(View.INVISIBLE);
                    fl55.setVisibility(View.INVISIBLE);
                    fl56.setVisibility(View.INVISIBLE);
                    fl57.setVisibility(View.INVISIBLE);
                    fl58.setVisibility(View.INVISIBLE);
                    fl59.setVisibility(View.INVISIBLE);
                    fl60.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Science_5F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();

                    fl1A.setVisibility(View.INVISIBLE);
                    fl1B.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6A.setVisibility(View.INVISIBLE);
                    fl6B.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);
                    fl8A.setVisibility(View.INVISIBLE);
                    fl8B.setVisibility(View.INVISIBLE);
                    fl9.setVisibility(View.INVISIBLE);
                    fl10.setVisibility(View.INVISIBLE);
                    fl11.setVisibility(View.INVISIBLE);
                    fl12.setVisibility(View.INVISIBLE);
                    fl13.setVisibility(View.INVISIBLE);
                    fl14A.setVisibility(View.INVISIBLE);
                    fl14B.setVisibility(View.INVISIBLE);
                    fl15.setVisibility(View.INVISIBLE);
                    fl51.setVisibility(View.INVISIBLE);
                    fl52.setVisibility(View.INVISIBLE);
                    fl53.setVisibility(View.INVISIBLE);
                    fl54.setVisibility(View.INVISIBLE);
                    fl55.setVisibility(View.INVISIBLE);
                    fl56.setVisibility(View.INVISIBLE);
                    fl57.setVisibility(View.INVISIBLE);
                    fl58.setVisibility(View.INVISIBLE);
                    fl59.setVisibility(View.INVISIBLE);
                    fl60.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if(prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }

        moving_501A();
        moving_501B();
        moving_502();
        moving_503();
        moving_504();
        moving_505();
        moving_506A();
        moving_506B();
        moving_507();
        moving_508A();
        moving_508B();
        moving_509();
        moving_510();
        moving_511();
        moving_512();
        moving_513();
        moving_514A();
        moving_514B();
        moving_515();
        moving_551();
        moving_552();
        moving_553();
        moving_554();
        moving_555();
        moving_556();
        moving_557();
        moving_558();
        moving_559();
        moving_560();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public class FL1AView extends View {
        public FL1AView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(530, 590);
            path.lineTo(530, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL1BView extends View {
        public FL1BView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(530, 590);
            path.lineTo(530, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

            canvas.drawPath(path, MyPaint);
        }
    }


    public class FL2View extends View {
        public FL2View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(430, 590);
            path.lineTo(430, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL3View extends View {
        public FL3View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(330, 590);
            path.lineTo(330, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL4View extends View {
        public FL4View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(180, 750);
            path.lineTo(230, 750);
            path.lineTo(230, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(770, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL5View extends View {
        public FL5View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(180, 650);
            path.lineTo(230, 650);
            path.lineTo(230, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(770, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL6AView extends View {
        public FL6AView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(180, 560);
            path.lineTo(200, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL6BView extends View {
        public FL6BView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(180, 560);
            path.lineTo(200, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL7View extends View {
        public FL7View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(200, 540);
            path.lineTo(200, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL8AView extends View {
        public FL8AView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(300, 540);
            path.lineTo(300, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL8BView extends View {
        public FL8BView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(300, 540);
            path.lineTo(300, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL9View extends View {
        public FL9View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(400, 540);
            path.lineTo(400, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL10View extends View {
        public FL10View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(500, 540);
            path.lineTo(500, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL11View extends View {
        public FL11View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(600, 540);
            path.lineTo(600, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL12View extends View {
        public FL12View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(700, 540);
            path.lineTo(700, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL13View extends View {
        public FL13View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(800, 540);
            path.lineTo(800, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL14AView extends View {
        public FL14AView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(900, 540);
            path.lineTo(900, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL14BView extends View {
        public FL14BView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(900, 540);
            path.lineTo(900, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL15View extends View {
        public FL15View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1030, 540);
            path.lineTo(1030, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL51View extends View {
        public FL51View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1130, 540);
            path.lineTo(1130, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL52View extends View {
        public FL52View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1230, 540);
            path.lineTo(1230, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL53View extends View {
        public FL53View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1330, 540);
            path.lineTo(1330, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 620);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL54View extends View {
        public FL54View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1430, 540);
            path.lineTo(1430, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 620);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL55View extends View {
        public FL55View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1580, 540);
            path.lineTo(1580, 560);
            path.lineTo(1350, 560);
            path.lineTo(1350, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL56View extends View {
        public FL56View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1680, 540);
            path.lineTo(1680, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 610);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL57View extends View {
        public FL57View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1780, 540);
            path.lineTo(1780, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL58View extends View {
        public FL58View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1760, 590);
            path.lineTo(1760, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL59View extends View {
        public FL59View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1630, 610);
            path.lineTo(1630, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL60View extends View {
        public FL60View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1560, 590);
            path.lineTo(1560, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(250, 800);
            path.lineTo(250, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);

            path.lineTo(750, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);

            path.lineTo(1370, 560);
            path.lineTo(1800, 560);
            canvas.drawPath(path, MyPaint);
        }
    }

    // 501A호에서 최단거리 이동
    private void moving_501A() {
        final Button b = (Button) findViewById(R.id.s_501A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 580,580,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.VISIBLE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //501B호에서 최단거리 이동
    private void moving_501B() {
        final Button b = (Button) findViewById(R.id.s_501B);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 480,480,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.VISIBLE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    //502호에서 최단거리 이동
    private void moving_502() {
        final Button b = (Button) findViewById(R.id.s_502);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 380,380,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.VISIBLE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 503호에서 최단거리 이동
    private void moving_503() {
        final Button b = (Button) findViewById(R.id.s_503);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 230,250,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 700,700,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.VISIBLE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 504호에서 최단거리 이동
    private void moving_504() {
        final Button b = (Button) findViewById(R.id.s_504);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 230,250,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600,600,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.VISIBLE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 505호에서 최단거리 이동
    private void moving_505() {
        final Button b = (Button) findViewById(R.id.s_505);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 230,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.VISIBLE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 506A호에서 최단거리 이동
    private void moving_506A() {
        final Button b = (Button) findViewById(R.id.s_506A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 250,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.VISIBLE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 506B호에서 최단거리 이동
    private void moving_506B() {
        final Button b = (Button) findViewById(R.id.s_506B);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 350,350,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.VISIBLE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 507호에서 최단거리 이동
    private void moving_507() {
        final Button b = (Button) findViewById(R.id.s_507);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 450,450,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.VISIBLE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 508A호에서 최단거리 이동
    private void moving_508A() {
        final Button b = (Button) findViewById(R.id.s_508A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 550,550,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.VISIBLE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 508B호에서 최단거리 이동
    private void moving_508B() {
        final Button b = (Button) findViewById(R.id.s_508B);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 650,650,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.VISIBLE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 509호에서 최단거리 이동
    private void moving_509() {
        final Button b = (Button) findViewById(R.id.s_509);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 750,750,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.VISIBLE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 510호에서 최단거리 이동
    private void moving_510() {
        final Button b = (Button) findViewById(R.id.s_510);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 850,850,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.VISIBLE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 511호에서 최단거리 이동
    private void moving_511() {
        final Button b = (Button) findViewById(R.id.s_511);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 950,950,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.VISIBLE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 512호에서 최단거리 이동
    private void moving_512() {
        final Button b = (Button) findViewById(R.id.s_512);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,1080,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.VISIBLE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 513호에서 최단거리 이동
    private void moving_513() {
        final Button b = (Button) findViewById(R.id.s_513);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1180,1180,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.VISIBLE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 514A호에서 최단거리 이동
    private void moving_514A() {
        final Button b = (Button) findViewById(R.id.s_514A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1280,1280,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.VISIBLE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 514B호에서 최단거리 이동
    private void moving_514B() {
        final Button b = (Button) findViewById(R.id.s_514B);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1380,1380,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.VISIBLE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 515호에서 최단거리 이동
    private void moving_515() {
        final Button b = (Button) findViewById(R.id.s_515);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1480,1480,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.VISIBLE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 551호에서 최단거리 이동
    private void moving_551() {
        final Button b = (Button) findViewById(R.id.s_551);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1580,1580,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.VISIBLE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 552호에서 최단거리 이동
    private void moving_552() {
        final Button b = (Button) findViewById(R.id.s_552);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1680,1680,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.VISIBLE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 553호에서 최단거리 이동
    private void moving_553() {
        final Button b = (Button) findViewById(R.id.s_553);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1780,1780,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.VISIBLE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 554호에서 최단거리 이동
    private void moving_554() {
        final Button b = (Button) findViewById(R.id.s_554);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1780,1780,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.VISIBLE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 555호에서 최단거리 이동
    private void moving_555() {
        final Button b = (Button) findViewById(R.id.s_555);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1680,1680,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.VISIBLE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 556호에서 최단거리 이동
    private void moving_556()   {
        final Button b = (Button) findViewById(R.id.s_556);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1580,1580,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.VISIBLE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 557호에서 최단거리 이동
    private void moving_557() {
        final Button b = (Button) findViewById(R.id.s_557);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1420,1300,1300,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 755,755,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.VISIBLE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 558호에서 최단거리 이동
    private void moving_558() {
        final Button b = (Button) findViewById(R.id.s_558);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,1080,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.VISIBLE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 559호에서 최단거리 이동
    private void moving_559() {
        final Button b = (Button) findViewById(R.id.s_559);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,1080,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.VISIBLE);
                fl60.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 560호에서 최단거리 이동
    private void moving_560() {
        final Button b = (Button) findViewById(R.id.s_560);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1A = (FrameLayout) findViewById(R.id.fl1A);
        final FrameLayout fl1B = (FrameLayout) findViewById(R.id.fl1B);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6B = (FrameLayout) findViewById(R.id.fl6B);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8A = (FrameLayout) findViewById(R.id.fl8A);
        final FrameLayout fl8B = (FrameLayout) findViewById(R.id.fl8B);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14A = (FrameLayout) findViewById(R.id.fl14A);
        final FrameLayout fl14B = (FrameLayout) findViewById(R.id.fl14B);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout fl51 = (FrameLayout) findViewById(R.id.fl51);
        final FrameLayout fl52 = (FrameLayout) findViewById(R.id.fl52);
        final FrameLayout fl53 = (FrameLayout) findViewById(R.id.fl53);
        final FrameLayout fl54 = (FrameLayout) findViewById(R.id.fl54);
        final FrameLayout fl55 = (FrameLayout) findViewById(R.id.fl55);
        final FrameLayout fl56 = (FrameLayout) findViewById(R.id.fl56);
        final FrameLayout fl57 = (FrameLayout) findViewById(R.id.fl57);
        final FrameLayout fl58 = (FrameLayout) findViewById(R.id.fl58);
        final FrameLayout fl59 = (FrameLayout) findViewById(R.id.fl59);
        final FrameLayout fl60 = (FrameLayout) findViewById(R.id.fl60);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,1080,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1A.setVisibility(View.GONE);
                fl1B.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6B.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8A.setVisibility(View.GONE);
                fl8B.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14A.setVisibility(View.GONE);
                fl14B.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl51.setVisibility(View.GONE);
                fl52.setVisibility(View.GONE);
                fl53.setVisibility(View.GONE);
                fl54.setVisibility(View.GONE);
                fl55.setVisibility(View.GONE);
                fl56.setVisibility(View.GONE);
                fl57.setVisibility(View.GONE);
                fl58.setVisibility(View.GONE);
                fl59.setVisibility(View.GONE);
                fl60.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);


            }
        });
    }

}