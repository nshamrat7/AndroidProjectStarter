package com.example.androidprojectstarter;

import android.content.Context;
import android.widget.Toast;

public class Alert {

    public static void showShortToast(Context context,String message){

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
