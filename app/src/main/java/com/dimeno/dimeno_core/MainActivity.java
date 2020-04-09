package com.dimeno.dimeno_core;

import com.dimeno.core.mvp.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void createPresenter() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        showShort("加载成功");
    }

    @Override
    protected void refreshTodo() {

    }
}
