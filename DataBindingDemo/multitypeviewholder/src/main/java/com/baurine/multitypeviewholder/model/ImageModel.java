package com.baurine.multitypeviewholder.model;

import com.baurine.multitypeviewholder.R;

import java.util.Random;

/**
 * Created by baurine on 1/6/17.
 */

public class ImageModel implements MultiTypeBaseModel {
    @Override
    public int getType() {
        return R.layout.item_image;
    }

    private final String url;

    public ImageModel() {
        url = "https://unsplash.it/100/100?random&r=" + new Random().nextInt();
    }

    public String getUrl() {
        return url;
    }
}
