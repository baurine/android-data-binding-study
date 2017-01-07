package com.baurine.multitypeviewholder.item;

import com.baurine.multitypeviewholder.R;
import com.baurine.multitypeviewholder.adapter.MultiTypeAdapter;

import java.util.Date;

/**
 * Created by baurine on 1/6/17.
 */

public class TextItem implements MultiTypeAdapter.IItemType {
    @Override
    public int getType() {
        return R.layout.item_text;
    }

    ////////////////////////////////////////////////
    // data model part
    private String text;
    private MultiTypeAdapter adapter;

    public TextItem(MultiTypeAdapter adapter) {
        text = (new Date()).toString();
        this.adapter = adapter;
    }

    public String getText() {
        return text;
    }

    ////////////////////////////////////////////////
    // event handle part
    public void updateText() {
        text = (new Date()).toString();
        adapter.notifyDataSetChanged();
    }
}
