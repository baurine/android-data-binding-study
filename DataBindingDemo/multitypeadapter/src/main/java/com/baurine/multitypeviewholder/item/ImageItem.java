package com.baurine.multitypeviewholder.item;

import android.content.Context;
import android.widget.Toast;

import com.baurine.multitypeviewholder.R;
import com.baurine.multitypeviewholder.adapter.MultiTypeAdapter;

import java.util.Random;

/**
 * Created by baurine on 1/6/17.
 */

public class ImageItem implements MultiTypeAdapter.IItemType {
    @Override
    public int getType() {
        return R.layout.item_image;
    }

    ///////////////////////////////////////
    // item is not just include data model
    // but also can handle event,
    // it should be a wrapper for data model and event handler

    ///////////////////////////////////////
    // data model part
    private final String url;

    public ImageItem() {
        url = "https://unsplash.it/100/100?random&r=" + new Random().nextInt();
    }

    public String getUrl() {
        return url;
    }

    ///////////////////////////////////////
    // event handle part
    // here just a simple example to handle event
    // you can contain a more complicated event handler here
    public void onClick(Context cxt) {
        Toast.makeText(cxt, url, Toast.LENGTH_SHORT).show();
    }
}
