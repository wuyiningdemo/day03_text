package com.bwie.wuyining_lianxi01.model;

import com.bwie.wuyining_lianxi01.bean.NewsBean;
import com.bwie.wuyining_lianxi01.http.RetrofitUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 武医宁 on 2018/5/11.
 */

public class MainModel  {
    private IPresenter iPresenter;
    public MainModel(IPresenter iPresenter){
        this.iPresenter=iPresenter;
    }
    public void getNews(String key,int num){
        RetrofitUtils.getService().doGet(key, String.valueOf(num))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NewsBean newsBean) {

                        iPresenter.onSuccess(newsBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
