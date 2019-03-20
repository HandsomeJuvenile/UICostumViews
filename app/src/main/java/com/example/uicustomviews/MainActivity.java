package com.example.uicustomviews;


import android.widget.Toast;

import com.example.uicustomviews.impl.ActionBarClickListener;

public class MainActivity extends BaseActivity  implements ActionBarClickListener {

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        setMyActionBar("掌控变化",R.mipmap.ic_back,"",R.mipmap.ic_more,"",this);
    }

    @Override
    public void onLeftClick() {
        finish();
    }

    @Override
    public void onRightClick() {
        Toast.makeText(this, "确定", Toast.LENGTH_SHORT).show();
    }
}
