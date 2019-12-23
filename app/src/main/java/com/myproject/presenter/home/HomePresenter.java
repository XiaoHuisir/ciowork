package com.myproject.presenter.home;

import com.myproject.base.BasePresenter;
import com.myproject.base.BaseView;
import com.myproject.component.CommonSubscriber;
import com.myproject.interfaces.home.HomeConstract;
import com.myproject.interfaces.home.HomeConstract.Presenter;
import com.myproject.model.HttpManager;
import com.myproject.utils.RxUtils;

import java.util.List;

public class HomePresenter extends BasePresenter<HomeConstract.View> implements Presenter {
    @Override
    public void getHomeData() {
        addSubscribe(HttpManager.getMyApi().getIndexData()
        .compose(RxUtils.<String>rxScheduler())
        .subscribeWith(new CommonSubscriber<String>(view) {
            @Override
            public void onNext(String response) {
                //view.getHomeData(list);
            }
        }));
    }
}
