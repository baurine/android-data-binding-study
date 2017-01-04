package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityAttributeSettersBinding;
import com.baurine.databindingdemo.model.User;

public class AttributeSettersActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityAttributeSettersBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_attribute_setters);
        binding.setUser(new User("Google", "Inc.", 17));
    }

}
