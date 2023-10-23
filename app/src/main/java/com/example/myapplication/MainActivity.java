package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private ListView lvShopList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tv_title);
        lvShopList = findViewById(R.id.lv_shop_list);
        List<String> list = new ArrayList<>();
        for (int i=0; i<10;i++) {
            list.add(i+"-"+i);
        }
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.simple_list_item1, android.R.id.text1, list.toArray());
        lvShopList.setAdapter(adapter);
    }
}