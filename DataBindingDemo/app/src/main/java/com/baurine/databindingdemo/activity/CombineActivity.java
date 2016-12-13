package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityCombineBinding;
import com.baurine.databindingdemo.handler.ContextHandler;
import com.baurine.databindingdemo.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombineActivity extends BaseActivity {

    private ActivityCombineBinding binding;
    private int age = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_combine);
    }

    public void onClick(View view) {
        User user = new User("sparkle", "baurine", age++);
        binding.setUser(user);

        binding.setText("Java Lang");
        binding.setNum(age % 3);

        // 容器类
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user);
        userList.add(user);
        binding.setUserList(userList);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "map1");
        stringMap.put("2", "map2");
        stringMap.put("3", "map3");
        binding.setStringMap(stringMap);

        // context
        binding.setHandler(new ContextHandler());
    }
}
