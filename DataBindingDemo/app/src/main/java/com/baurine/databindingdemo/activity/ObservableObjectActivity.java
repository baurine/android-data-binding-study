package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityObservableObjectBinding;
import com.baurine.databindingdemo.model.ObservableUser;

public class ObservableObjectActivity extends BaseActivity {

    private ObservableUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableObjectBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_observable_object);
        user = new ObservableUser("Sparkle", 16);
        binding.setUser(user);
    }

    public void onClick(View view) {
        // 更新 Observable Object 将同步更新 UI
        user.setName("Baurine");
        user.incAge();
    }
}
