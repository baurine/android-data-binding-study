package com.baurine.databindingdemo.handler;

import android.content.Context;

import com.baurine.databindingdemo.R;

/**
 * Created by baurine on 12/13/16.
 */

public class ContextHandler {
    public String loadString(Context cxt) {
        return "String from context, app_name: " + cxt.getString(R.string.app_name);
    }
}
