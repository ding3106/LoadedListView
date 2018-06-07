package com.lenovo.dingjq1.loadedlistview.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.lenovo.dingjq1.loadedlistview.R;

/**
 * Created by dingjq1 on 2018/6/7.
 */

public class LoadListView extends ListView implements {

    View footer;
    LayoutInflater inflater;


    public LoadListView(Context context) {
        super(context);
        initView(context);
    }

    public LoadListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LoadListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LoadListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void initView(Context context){
        inflater = LayoutInflater.from(context);
        footer = inflater.inflate(R.layout.footer_layout, null);

        footer.findViewById(R.id.load_layout).setVisibility(View.GONE);
        this.addFooterView(footer);

    }


}
