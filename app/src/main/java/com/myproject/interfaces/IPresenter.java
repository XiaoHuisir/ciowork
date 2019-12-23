package com.myproject.interfaces;

public interface IPresenter<V extends IBaseView> {

    void attachView(V view);

    void detachView();

}
