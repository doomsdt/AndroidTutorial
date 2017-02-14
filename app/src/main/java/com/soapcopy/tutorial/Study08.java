package com.soapcopy.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Study08 extends AppCompatActivity implements FunctionActivity {

    ArrayList<Button> buttons;
    TextView tvRow;
    TextView tvCol;
    Button btClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study08);

        tvRow = (TextView)findViewById(R.id.s08_tv_row);
        tvCol = (TextView)findViewById(R.id.s08_tv_col);

        buttons = new ArrayList<>();
        for(int i=0;i<12;i++){
            Button b = (Button)findViewById(getResources().getIdentifier("study08_bt"+(i+1),"id",getPackageName()));
            buttons.add(b);

            final int idx = i;

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String sRow = "행 인덱스 : " + ((idx/3) + 1);
                    String sCol = "열 인덱스 : " + ((idx%3) + 1);
                    tvRow.setText(sRow);
                    tvCol.setText(sCol);
                }
            });
        }
    }
}
