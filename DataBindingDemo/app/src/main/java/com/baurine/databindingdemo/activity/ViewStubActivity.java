package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.databinding.ActivityViewStubBinding;
import com.baurine.databindingdemo.databinding.IncludeUserBinding;
import com.baurine.databindingdemo.model.User;

public class ViewStubActivity extends BaseActivity {

    private ActivityViewStubBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);
        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                IncludeUserBinding userBinding =
                        DataBindingUtil.bind(inflated);
                userBinding.setUser(new User("Google", "Inc.", 17));
            }
        });
    }

    public void onClick(View view) {
        // binding.viewStub in fact is ViewStubProxy
        if (!binding.viewStub.isInflated()) {
            binding.viewStub.getViewStub().inflate();
        }
    }
}
