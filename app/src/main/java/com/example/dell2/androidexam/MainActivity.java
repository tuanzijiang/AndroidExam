package com.example.dell2.androidexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.dell2.androidexam.R;

import collector.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private LinearLayout test1;
    private LinearLayout test2;
    private LinearLayout test3;
    private LinearLayout test4;
    private LinearLayout test5;
    private LinearLayout test6;
    private LinearLayout test7;
    private LinearLayout test8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        test1=(LinearLayout)findViewById(R.id.test1);
        test2=(LinearLayout)findViewById(R.id.test2);
        test3=(LinearLayout)findViewById(R.id.test3);
        test4=(LinearLayout)findViewById(R.id.test4);
        test5=(LinearLayout)findViewById(R.id.test5);
        test6=(LinearLayout)findViewById(R.id.test6);
        test7=(LinearLayout)findViewById(R.id.test7);
        test8=(LinearLayout)findViewById(R.id.test8);
        test1.setOnClickListener(this);
        test2.setOnClickListener(this);
        test3.setOnClickListener(this);
        test4.setOnClickListener(this);
        test5.setOnClickListener(this);
        test6.setOnClickListener(this);
        test7.setOnClickListener(this);
        test8.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.test1:
                Toast.makeText(MainActivity.this,"test1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test2:
                Toast.makeText(MainActivity.this,"test2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test3:
                Toast.makeText(MainActivity.this,"test3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test4:
                Toast.makeText(MainActivity.this,"test4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test5:
                Toast.makeText(MainActivity.this,"test5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test6:
                Toast.makeText(MainActivity.this,"test6",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test7:
                Toast.makeText(MainActivity.this,"test7",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test8:
                Toast.makeText(MainActivity.this,"test8",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
