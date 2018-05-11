package com.bwie.wuyining_lianxi01.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bwie.wuyining_lianxi01.R;
import com.bwie.wuyining_lianxi01.bean.NewsBean;
import com.bwie.wuyining_lianxi01.predenter.IMain;
import com.bwie.wuyining_lianxi01.predenter.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IMain {

    @BindView(R.id.recy_view)
    RecyclerView recyView;
    private MainPresenter mainPersenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();

    }
    public  void  initView(){
        mainPersenter = new MainPresenter(this);
        String key="37f05f29619575ff840462b6f559baa9";
        int num=10;
        mainPersenter.getNews(key,num);
    }


    @Override
    public void onSuccess(NewsBean newsBean) {
        MyAdapter myAdapter=new MyAdapter(MainActivity.this,newsBean);
        recyView.setAdapter(myAdapter);
        recyView.setLayoutManager(new LinearLayoutManager(this));
    }
}