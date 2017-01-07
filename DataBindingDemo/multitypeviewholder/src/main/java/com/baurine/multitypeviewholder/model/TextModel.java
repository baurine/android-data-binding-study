package com.baurine.multitypeviewholder.model;

import com.baurine.multitypeviewholder.R;

import java.util.Date;

/**
 * Created by baurine on 1/6/17.
 */

public class TextModel implements MultiTypeBaseModel {
    @Override
    public int getType() {
        return R.layout.item_text;
    }

    private final String text;

    public TextModel() {
        text = (new Date()).toString();
    }

    public String getText() {
        return text;
    }
}
