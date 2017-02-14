package com.soapcopy.tutorial;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.soapcopy.tutorial.layout_objects.ButtonToIntent;

public class MainActivity extends AppCompatActivity {

    String name;
    String age;
    String addr;

    Button btSave;
    Button btClose;
//    Button btCh7;
//    Button btS08;
//    Button btS09;
//    Button btS10;
//    Button btS11;
//    Button btS17;

    EditText etName;
    EditText etAge;
    EditText etAddr;

    TextView tvName;
    TextView tvAge;
    TextView tvAddr;

    GridLayout glFunctions;

    Constant constant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSave = (Button)findViewById(R.id.tuto_save);
        btClose = (Button)findViewById(R.id.tuto_close);
//        btCh7 = (Button)findViewById(R.id.tuto_ch7);
//        btS08 = (Button)findViewById(R.id.tuto_study08);
//        btS09 = (Button)findViewById(R.id.tuto_study09);
//        btS10 = (Button)findViewById(R.id.tuto_study10);
//        btS11 = (Button)findViewById(R.id.tuto_study11);
//        btS17 = (Button)findViewById(R.id.tuto_study17);
        etName = (EditText)findViewById(R.id.tuto_et_name);
        etAge = (EditText)findViewById(R.id.tuto_et_age);
        etAddr = (EditText)findViewById(R.id.tuto_et_addr);
        tvName = (TextView)findViewById(R.id.tuto_tv_name);
        tvAge = (TextView)findViewById(R.id.tuto_tv_age);
        tvAddr = (TextView)findViewById(R.id.tuto_tv_addr);

        glFunctions = (GridLayout)findViewById(R.id.main_gl);

        constant = new Constant();
        constant.init();

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = etName.getText().toString();
                age = etAge.getText().toString();
                addr = etAddr.getText().toString();

                tvName.setText(getResources().getString(R.string.tuto_show_name) + " : " + name);
                tvAge.setText(getResources().getString(R.string.tuto_show_age) + " : " + age);
                tvAddr.setText(getResources().getString(R.string.tuto_show_addr) + " : " + addr);

                if(Integer.parseInt(age) > 30)
                    Toast.makeText(getApplicationContext(),R.string.tuto_toast_over30, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),R.string.tuto_toast_under30, Toast.LENGTH_SHORT).show();
            }
        });

        btClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        for(final ButtonToIntent bti : Constant.buttonsToIntent ){

            Button bt = new Button(this);
            bt.setText(bti.getText());
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), bti.getActivity().getClass());
                    startActivity(intent);
                }
            });

            glFunctions.addView(bt);

        }

//        btCh7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Ch7.class);
//                startActivity(intent);
//            }
//        });
//
//        btS08.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Study08.class);
//                startActivity(intent);
//            }
//        });
//
//        btS09.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Study09.class);
//                startActivity(intent);
//            }
//        });
//
//        btS10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Study10.class);
//                startActivity(intent);
//            }
//        });
//
//        btS11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Study11.class);
//                startActivity(intent);
//            }
//        });
//
//        btS17.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Study17.class);
//                startActivity(intent);
//            }
//        });
    }
}
