package com.bwie.wuyining_lianxi01.http;



import com.bwie.wuyining_lianxi01.bean.NewsBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiService {
 @GET("wxnew/")
 Observable<NewsBean> doGet(@Query("key") String key, @Query("num") String num);
}
