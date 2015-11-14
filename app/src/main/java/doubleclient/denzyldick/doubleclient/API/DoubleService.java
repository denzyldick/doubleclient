package doubleclient.denzyldick.doubleclient.API;

import doubleclient.denzyldick.doubleclient.model.AccessToken;
import doubleclient.denzyldick.doubleclient.model.Credential;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by denzyl on 11/11/15.
 */
public interface DoubleService {
    @POST("/login")
    Call<AccessToken> login(@Body Credential credential);
}
