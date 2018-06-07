package com.lenovo.dingjq1.loadedlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lenovo.dingjq1.loadedlistview.R;
import com.lenovo.dingjq1.loadedlistview.entity.ApkEntity;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by dingjq1 on 2018/6/7.
 */

public class MyAdapter extends BaseAdapter {
    List<ApkEntity> apk_list;
    ApkEntity apkEntity;
    LayoutInflater inflater;
    ViewHolder viewHolder;

    public MyAdapter(Context context, List<ApkEntity> apk_list) {
        this.apk_list = apk_list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return apk_list.size();
    }

    @Override
    public Object getItem(int position) {
        return apk_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        apkEntity = apk_list.get(position);


        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_layout,null);
            viewHolder.name_tv = convertView.findViewById(R.id.item_apkname);
            viewHolder.info_tv = convertView.findViewById(R.id.item_apkinfo);
            viewHolder.des_tv = convertView.findViewById(R.id.item_apkdes);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();

        }
        viewHolder.name_tv.setText(apkEntity.getName());
        viewHolder.info_tv.setText(apkEntity.getInfo());
        viewHolder.des_tv.setText(apkEntity.getDes());

        return convertView;
    }


    static class ViewHolder{

        TextView name_tv;
        TextView des_tv;
        TextView info_tv;

    }
}
