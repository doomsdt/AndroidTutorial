package com.soapcopy.tutorial;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Dev on 2017-02-13.
 */

public class Util {

    public static void toast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
