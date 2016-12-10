package com.pallefire.b34_imagelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    ArrayAdapter<String> a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView) findViewById(R.id.lv);
        String[] str= {"AQIB","SATYA","MANAS","VIPIN","AB OSAMA","HEMANTH","KUNDAN","SOORAJ","Vikas","Ashwini","Hussain","Hemraj","Mayera"};
        a = new ArrayAdapter<String>(this,R.layout.row,R.id.tv1,str);
        lv1.setAdapter(a);
    }
}
