package com.lenovo.dingjq1.loadedlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.lenovo.dingjq1.loadedlistview.adapter.MyAdapter;
import com.lenovo.dingjq1.loadedlistview.entity.ApkEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<ApkEntity> apk_list = new ArrayList<ApkEntity>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        getData();

        adapter = new MyAdapter(this, apk_list);
        listView.setAdapter(adapter);



    }

    /**
     *
     */
    private void getData(){
        for (int i = 0; i < 10; i++) {
            ApkEntity apkEntity = new ApkEntity();
            apkEntity.setName("测试item "+i);
            apkEntity.setDes("这是一个神奇的应用");
            apkEntity.setInfo("50w 用户");
            apk_list.add(apkEntity);
        }
    }




}
