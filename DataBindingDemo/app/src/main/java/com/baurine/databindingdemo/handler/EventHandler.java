package com.baurine.databindingdemo.handler;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by baurine on 12/13/16.
 */

public class EventHandler {
    public void onMethodPreference(View view) {
        Toast.makeText(view.getContext(), "onMethodPreference clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onListenerBinding(Context cxt, CheckBox cb, String text) {
        boolean checked = cb.isChecked();
        String msg = checked ? "Checkbox checked!" : "Checkbox unchecked!";
        Toast.makeText(cxt, msg + " and text is " + text, Toast.LENGTH_SHORT).show();
    }

    public void onCheckedChanged(View cb, boolean checked) {
        String msg = checked ? "check!" : "cancel check!";
        Toast.makeText(cb.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
