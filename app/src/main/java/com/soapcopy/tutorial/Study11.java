package com.soapcopy.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.soapcopy.tutorial.objects.GirlGroupSinger;
import com.soapcopy.tutorial.objects.Singer;

import java.util.ArrayList;

public class Study11 extends AppCompatActivity implements FunctionActivity {

    EditText etName;
    EditText etAge;

    Button btAddSinger;
    Button btAddGirl;
    Button btGetRecent;

    TextView tvTotal;

    ArrayList<Singer> singers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study11);

        etName = (EditText)findViewById(R.id.s11_et_name);
        etAge = (EditText)findViewById(R.id.s11_et_age);

        btAddSinger = (Button)findViewById(R.id.s11_bt_addSinger);
        btAddGirl = (Button)findViewById(R.id.s11_bt_addGirl);
        btGetRecent = (Button)findViewById(R.id.s11_bt_recent);

        tvTotal = (TextView)findViewById(R.id.s11_tv_total);

        singers = new ArrayList<>();

        btAddSinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Singer s = new Singer(etName.getText().toString(), Integer.parseInt(etAge.getText().toString()));
                singers.add(s);

                String str = "추가된 가수의 총 수 : " + Singer.getTotal() + "명";
                tvTotal.setText(str);
            }
        });

        btAddGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GirlGroupSinger s = new GirlGroupSinger(etName.getText().toString(), Integer.parseInt(etAge.getText().toString()));
                singers.add(s);

                String str = "추가된 가수의 총 수 : " + Singer.getTotal() + "명";
                tvTotal.setText(str);
            }
        });

        btGetRecent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Singer recent = Singer.getRecent();
                String str;

                if(recent != null)
                    str = "최근 추가된 가수 : " + recent.getName();
                else
                    str = "가수 목록 비어있음";
                tvTotal.setText(str);
            }
        });
    }
}
