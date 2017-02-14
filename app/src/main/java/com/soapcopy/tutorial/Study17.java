package com.soapcopy.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Study17 extends AppCompatActivity implements FunctionActivity {

    EditText etName;
    EditText etAge;

    LinearLayout llEvalList;
    ArrayList<EditText> evalList;

    Button btSave;
    Button btClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study17);

        etName = (EditText)findViewById(R.id.s17_et_name);
        etAge = (EditText)findViewById(R.id.s17_et_age);

        llEvalList = (LinearLayout)findViewById(R.id.s17_ll_evalList);
        evalList = new ArrayList<>();

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        for(int i=0;i<5;i++){
            EditText et = new EditText(this);
            et.setLayoutParams(params);

            llEvalList.addView(et);
            evalList.add(et);
        }

        btSave = (Button)findViewById(R.id.s17_bt_save);
        btClose = (Button)findViewById(R.id.s17_bt_close);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Util.toast(Study17.this, "학생 프로필 저장됨 : " + etName.getText().toString() + ", " + etAge.getText().toString());
            }
        });

    }


}
