package com.soapcopy.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.soapcopy.tutorial.objects.Singer;

public class Study10 extends AppCompatActivity implements FunctionActivity {


    Singer s1;
    Singer s2;

    ImageView iv1;
    ImageView iv2;

    EditText etName;
    EditText etAge;

    RadioButton rb1;
    RadioButton rb2;

    Button btSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study10);

        s1 = new Singer("아이유", 25);
        s2 = new Singer("크리스탈", 24);

        iv1 = (ImageView)findViewById(R.id.s09_iv1);
        iv2 = (ImageView)findViewById(R.id.s09_iv2);

        etName = (EditText)findViewById(R.id.s09_et_name);
        etAge = (EditText)findViewById(R.id.s09_et_age);

        rb1 = (RadioButton)findViewById(R.id.s09_rb1);
        rb2 = (RadioButton)findViewById(R.id.s09_rb2);

        btSet = (Button)findViewById(R.id.s09_bt_setInfo);

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

        btSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb1.isChecked()) {
                    setInfo(s1, etName.getText().toString(), etAge.getText().toString());
                    Util.toast(Study10.this, "입력한 값이 첫번째 Singer 객체에 설정되었습니다.");
                }
                else {
                    setInfo(s2, etName.getText().toString(), etAge.getText().toString());
                    Util.toast(Study10.this, "입력한 값이 두번째 Singer 객체에 설정되었습니다.");
                }
            }
        });
    }

    private void printInfo(Singer s){
        String str = "가수의 이름 : " + s.getName() + ", 가수의 나이 : " + s.getAge();
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

    private void setInfo(Singer s, String name, String age){
        s.setName(name);
        s.setAge(Integer.parseInt(age));
    }
}
