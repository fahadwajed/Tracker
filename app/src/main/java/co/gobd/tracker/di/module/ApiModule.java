package co.gobd.tracker.di.module;

import javax.inject.Named;
import javax.inject.Singleton;

import co.gobd.tracker.utility.Constant;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fahadwajed on 6/22/16.
 */

@Module
public class ApiModule {

    @Provides
    @Singleton
    public OkHttpClient providesOkHttpClient(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpclient = new OkHttpClient.Builder();
        httpclient.addInterceptor(interceptor);

        return httpclient.build();
    }

    @Provides
    @Singleton
    public GsonConverterFactory providesGsonConverterFactory(){
        return GsonConverterFactory.create();
    }

    /*@Provides
    @Singleton
    @Named(Constant.BackendName.TASK_CAT)
    public Retrofit providesRetrofitForTaskCat(OkHttpClient okHttpClient,
                                               GsonConverterFactory factory){

        return new
    }*/
}
