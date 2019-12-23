package com.myproject.interfaces.home;

import com.myproject.interfaces.IBaseView;
import com.myproject.interfaces.IPresenter;

import java.util.List;

public interface HomeConstract {

    interface View extends IBaseView{
        void getHomeData(List<String> list);
    }


    interface Presenter extends IPresenter<View>{
        void getHomeData();
    }
}
