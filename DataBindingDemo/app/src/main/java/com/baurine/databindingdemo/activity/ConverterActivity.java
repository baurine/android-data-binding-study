package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.os.Bundle;
import android.view.View;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityConverterBinding;
import com.baurine.databindingdemo.model.User;

import java.util.ArrayList;
import java.util.List;

public class ConverterActivity extends BaseActivity {

    private ObservableBoolean isError = new ObservableBoolean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityConverterBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_converter);

        List<User> userList = new ArrayList<>();
        userList.add(new User("Google", "Inc.", 17));
        binding.setList(userList);

        isError.set(true);
        binding.setIsError(isError);
    }

    public void onToggle(View view) {
        isError.set(!isError.get());
    }

}
