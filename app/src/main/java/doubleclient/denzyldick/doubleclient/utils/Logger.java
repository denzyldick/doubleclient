package doubleclient.denzyldick.doubleclient.utils;

import android.util.Log;

/**
 * Created by denzyl on 11/12/15.
 */
public class Logger {
    static String application = "Double";
    public static void log(String message,Throwable throwable)
    {
        Log.i("Double",message,throwable);
    }

    public static void log(String message)
    {
        Log.i("Double",message);
    }

}
