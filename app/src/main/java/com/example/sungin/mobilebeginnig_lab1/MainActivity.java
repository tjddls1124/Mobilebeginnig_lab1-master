package com.example.sungin.mobilebeginnig_lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("실습예제 1-1");
        init();


    }

    public void init() {
        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("나이 계산"));
        tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("온도 변환"));
        tabHost.addTab(tabHost.newTabSpec("C").setContent(R.id.tab3).setIndicator("직사각형 넓이 계산"));

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.b1) {
            int year = Integer.parseInt(e1.getText().toString());
            int age = 2017 - year + 1;
            Toast.makeText(getApplicationContext(), "당신의 나이는" + age + "입니다", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.b2) {
            int age = Integer.parseInt(e2.getText().toString());
            int year = 2017 - age + 1;
            Toast.makeText(getApplicationContext(), "당신이 태어난 해는" + year + "입니다", Toast.LENGTH_SHORT).show();

        }

    }
}
