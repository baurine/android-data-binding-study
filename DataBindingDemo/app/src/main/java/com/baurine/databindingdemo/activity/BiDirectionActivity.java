package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityBidirBinding;
import com.baurine.databindingdemo.model.ObservableUser;

public class BiDirectionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBidirBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_bidir);
        binding.setUser(new ObservableUser("Google", 17));
    }

}
