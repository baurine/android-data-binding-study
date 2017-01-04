package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityAttributeSettersBinding;
import com.baurine.databindingdemo.model.User;

import java.util.Random;

public class AttributeSettersActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityAttributeSettersBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_attribute_setters);
        binding.setUser(new User("Google", "Inc.", 17));
        binding.setUrl("https://unsplash.it/200/300/?random&r=" + new Random().nextInt());
        binding.setPaddingVertical(100);
    }

}
