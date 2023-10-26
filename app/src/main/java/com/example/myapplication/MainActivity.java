package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.adapter.ShopAdapter;
import com.example.myapplication.bean.ShopBean;
import com.example.myapplication.utils.Constans;
import com.example.myapplication.utils.JsonParse;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private ListView lvShopList;
    private ShopAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }



    private void initView() {
        tvTitle = findViewById(R.id.tv_title);
        lvShopList = findViewById(R.id.lv_shop_list);
        List<String> list = new ArrayList<>();
        adapter = new ShopAdapter(this);
        lvShopList.setAdapter(adapter);
    }

    private void initData() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(Constans.WEB_SITE).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {

            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                String json = response.body().string();
                List<ShopBean> list = JsonParse.getInstance().getShopList(json);
                adapter.setData(list);
            }
        });
    }
}