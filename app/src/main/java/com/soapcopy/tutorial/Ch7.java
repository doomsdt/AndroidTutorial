package com.soapcopy.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Ch7 extends AppCompatActivity implements FunctionActivity {

    static int touched = 0;

    FrameLayout flTouch;
    TextView tvTouched;
    Button btClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch7);

        flTouch = (FrameLayout)findViewById(R.id.ch7_fl);
        tvTouched = (TextView)findViewById(R.id.ch7_tv_touched);
        btClose = (Button)findViewById(R.id.ch7_bt_close);

        String s = getResources().getString(R.string.ch7_touched) + touched;
        tvTouched.setText(s);

        flTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touched++;

                String s = getResources().getString(R.string.ch7_touched) + touched;
                tvTouched.setText(s);
            }
        });

        btClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }
}
