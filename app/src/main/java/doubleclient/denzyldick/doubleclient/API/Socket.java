package doubleclient.denzyldick.doubleclient.API;

import android.util.Log;

import com.github.nkzawa.socketio.client.IO;

import java.net.URISyntaxException;

/**
 * Created by denzyl on 11/12/15.
 */
public class Socket {
    private com.github.nkzawa.socketio.client.Socket socket;
    public Socket()
    {
        Log.w("double", "trying to connect");
        try {
            socket = IO.socket("http://192.168.0.103:9000/socket");
        } catch (URISyntaxException e) {
            Log.w("socket_error", e);
        }
        Log.w("double", Boolean.toString(socket.connected()));
    }

    public  com.github.nkzawa.socketio.client.Socket getSocket()
    {
        return this.socket;
    }
}
