package com.baurine.databindingdemo.handler;

import android.content.Context;
import android.widget.Toast;

import com.baurine.databindingdemo.model.FeatureItem;

/**
 * Created by baurine on 12/13/16.
 */

public class Presenter {
    public void onFeatureClick(Context cxt, FeatureItem item) {
        // Intent intent = new Intent(item.action);
        // cxt.startActivity(intent);
        Toast.makeText(cxt, "Click: " + item.type, Toast.LENGTH_SHORT).show();
    }
}
