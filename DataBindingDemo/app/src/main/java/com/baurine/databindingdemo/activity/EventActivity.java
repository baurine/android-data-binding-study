package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityEventBinding;
import com.baurine.databindingdemo.handler.EventHandler;

public class EventActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_event);
        binding.setText("a test checkbox");
        binding.setHandler(new EventHandler());
    }
}
