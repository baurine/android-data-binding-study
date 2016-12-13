package com.baurine.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.adapter.FeatureAdapter;
import com.baurine.databindingdemo.databinding.ActivityFeatureListBinding;

public class FeatureListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFeatureListBinding dataBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_feature_list);

        RecyclerView recyclerView = dataBinding.recyclerview;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new FeatureAdapter());
    }
}
