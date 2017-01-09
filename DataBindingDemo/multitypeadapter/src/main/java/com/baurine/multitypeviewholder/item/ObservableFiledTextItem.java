package com.baurine.multitypeviewholder.item;

import android.databinding.ObservableField;

import com.baurine.multitypeviewholder.R;
import com.baurine.multitypeviewholder.adapter.MultiTypeAdapter;

import java.util.Date;

/**
 * Created by baurine on 1/6/17.
 */

public class ObservableFiledTextItem implements MultiTypeAdapter.IItemType {
    @Override
    public int getType() {
        return R.layout.item_observable_filed_text;
    }

    ////////////////////////////////////////////////
    // data model part
    public ObservableField<String> text = new ObservableField<>();

    public ObservableFiledTextItem() {
        updateText();
    }

    ////////////////////////////////////////////////
    // event handle part
    public void updateText() {
        text.set("ObservableField: " + (new Date()).toString());
    }
}
