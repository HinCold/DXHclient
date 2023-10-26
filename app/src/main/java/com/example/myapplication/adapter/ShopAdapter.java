package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.bean.ShopBean;

import java.util.ArrayList;
import java.util.List;

public class ShopAdapter  extends BaseAdapter {
    private Context context;
    private List<ShopBean> data = new ArrayList<>();

    public ShopAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<ShopBean> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHold viewHold;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.shop_item, null);
            viewHold = new ViewHold();
            viewHold.tv_id = (TextView)view.findViewById(R.id.tv_prompotion_id);
            viewHold.tv_name =  (TextView)view.findViewById(R.id.tv_name);
            viewHold.tvStartDate = (TextView) view.findViewById(R.id.tv_start_time);
            viewHold.tvEndDate =  (TextView)view.findViewById(R.id.tv_end_time);
            viewHold.tvItemId = (TextView) view.findViewById(R.id.tv_item_id);
            view.setTag(viewHold);
        }else {
            viewHold = (ViewHold) view.getTag();
        }
        ShopBean shopBean = data.get(i);
        viewHold.tv_id.setText(shopBean.getId());
        viewHold.tv_name.setText(shopBean.getName());
        viewHold.tvStartDate.setText(shopBean.getStartDate());
        viewHold.tvEndDate.setText(shopBean.getEndDate());
        viewHold.tvItemId.setText(shopBean.getItemId());
        return view;
    }

    class ViewHold {
        public TextView tv_id, tv_name, tvStartDate, tvEndDate, tvItemId;

    }
}
