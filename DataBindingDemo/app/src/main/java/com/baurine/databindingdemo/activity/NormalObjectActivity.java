package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityNormalObjectBinding;
import com.baurine.databindingdemo.model.User;

public class NormalObjectActivity extends BaseActivity {

    private ActivityNormalObjectBinding binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_normal_object);
        user = new User("Baurine", "Sparkle", 16);
        binding.setUser(user);
    }

    public void onUpdateData(View view) {
        // 更新普通的数据对象并不会引起 UI 的同步更新
        user.incAge();
        Toast.makeText(this, "now age is " + user.getAge(), Toast.LENGTH_SHORT).show();
    }

    public void onUpdateUI(View view) {
        // 可以手动重新绑定触发 UI 更新
        binding.setUser(user);
    }
}
