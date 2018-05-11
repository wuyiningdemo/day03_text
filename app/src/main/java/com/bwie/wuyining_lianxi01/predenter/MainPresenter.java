package com.bwie.wuyining_lianxi01.predenter;

import com.bwie.wuyining_lianxi01.bean.NewsBean;
import com.bwie.wuyining_lianxi01.model.IPresenter;
import com.bwie.wuyining_lianxi01.model.MainModel;

/**
 * Created by 武医宁 on 2018/5/11.
 */

public class MainPresenter implements IPresenter {

    private MainModel mainModel;
    private  IMain iMain;

    public MainPresenter(IMain iMain) {
        this.iMain=iMain;
        mainModel = new MainModel(this);
    }

    public void getNews(String key, int num) {
        mainModel.getNews( key,  num);
    }

    @Override
    public void onSuccess(NewsBean newsBean) {
        iMain.onSuccess(newsBean);
    }

}