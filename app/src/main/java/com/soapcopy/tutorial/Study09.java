package com.soapcopy.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.soapcopy.tutorial.objects.Singer;

public class Study09 extends AppCompatActivity implements FunctionActivity {

    Singer s1;
    Singer s2;

    ImageView iv1;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study09);

        s1 = new Singer("아이유", 25);
        s2 = new Singer("크리스탈", 24);

        iv1 = (ImageView)findViewById(R.id.s09_iv1);
        iv2 = (ImageView)findViewById(R.id.s09_iv2);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printInfo(s1);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printInfo(s2);
            }
        });
    }

    private void printInfo(Singer s){
        String str = "가수의 이름 : " + s.getName() + ", 가수의 나이 : " + s.getAge();
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
