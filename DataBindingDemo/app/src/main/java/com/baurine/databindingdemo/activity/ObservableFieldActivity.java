package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityObservableFieldBinding;
import com.baurine.databindingdemo.model.ObservableFieldUser;

public class ObservableFieldActivity extends BaseActivity {

    private ObservableFieldUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableFieldBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_observable_field);
        user = new ObservableFieldUser("Sparkle", 16);
        binding.setUser(user);
    }

    public void onClick(View view) {
        // 更新 ObservableField 将同步更新 UI
        user.setName("Baurine");
        user.incAge();
    }
}
