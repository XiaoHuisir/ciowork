package com.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.myproject.base.BaseActivity;
import com.myproject.interfaces.IPresenter;
import com.myproject.presenter.home.HomePresenter;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    public void showError(String err) {

    }
}
