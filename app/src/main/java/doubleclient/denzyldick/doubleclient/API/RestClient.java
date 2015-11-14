package doubleclient.denzyldick.doubleclient.API;

import android.util.Log;

import doubleclient.denzyldick.doubleclient.utils.Logger;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by denzyl on 11/12/15.
 */
abstract public class RestClient {

    public static Retrofit getAdapter()
    {
        Retrofit retrofit = null;
        try {
            retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.109:9000")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }catch (Exception e)
        {
            Logger.log("Something went wrong",e);
        }
        return retrofit;
    }
}
