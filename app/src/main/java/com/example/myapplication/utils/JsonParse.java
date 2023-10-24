package com.example.myapplication.utils;

import com.example.myapplication.bean.ShopBean;

import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonParse {
    private static JsonParse instance;
    private JsonParse() {

    }

    public synchronized static JsonParse getInstance() {
        if (instance == null) {
            instance = new JsonParse();
        }
        return instance;
    }

    public List<ShopBean> getShopList(String json) {

        Type listType = new TypeToken<List<ShopBean>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }
}
