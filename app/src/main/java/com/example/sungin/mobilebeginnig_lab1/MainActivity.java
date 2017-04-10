package com.example.sungin.mobilebeginnig_lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("실습예제 1-1");
        init();


    }
    public void init(){
        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("나이 계산"));
        tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("온도 변환"));
        tabHost.addTab(tabHost.newTabSpec("C").setContent(R.id.tab3).setIndicator("직사각형 넓이 계산"));

    }

    public void onClick(View v){

    }

}
