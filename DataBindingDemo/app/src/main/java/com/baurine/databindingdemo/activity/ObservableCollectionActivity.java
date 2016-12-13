package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityObservableCollectionBinding;

public class ObservableCollectionActivity extends BaseActivity {

    private ObservableArrayMap<String, String> userMap;
    private ObservableArrayList<String> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableCollectionBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_observable_collection);

        userMap = new ObservableArrayMap<>();
        userMap.put("firstName", "Sparkle");
        userMap.put("lastName", "Baurine");
        userMap.put("age", "30");
        binding.setUserMap(userMap);

        userList = new ObservableArrayList<>();
        userList.add(userMap.valueAt(0));
        userList.add(userMap.valueAt(1));
        userList.add(userMap.valueAt(2));
        binding.setUserList(userList);
    }

    public void onClick(View view) {
        // 更新 Observable Collection 将同步更新 UI
        userMap.put("firstName", "Google");
        userMap.put("lastName", "Inc.");
        userMap.put("age", "17");

        userList.set(0, userMap.valueAt(0));
        userList.set(1, userMap.valueAt(1));
        userList.set(2, userMap.valueAt(2));
    }
}
