package com.myproject.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.myproject.R;
import com.myproject.interfaces.IBaseView;
import com.myproject.interfaces.IPresenter;
import com.myproject.utils.SystemUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IBaseView {


    protected abstract int getLayout();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract P createPresenter();

    @BindView(R.id.layout_tips)
    ConstraintLayout layout_tips;

    //p层
    protected P presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        initView();
        initData();
        presenter = createPresenter();
        if(presenter != null) presenter.attachView(this);
        checkNet();
    }

    /**
     * 检查网络状态
     */
    private void checkNet(){
        if(!SystemUtils.checkNetWork()){
            layout_tips.setVisibility(View.VISIBLE);
        }else{
            layout_tips.setVisibility(View.GONE);
        }
    }
}
