package com.baurine.multitypeviewholder.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.baurine.multitypeviewholder.R;
import com.baurine.multitypeviewholder.adapter.MultiTypeAdapter;
import com.baurine.multitypeviewholder.databinding.ActivityMainBinding;
import com.baurine.multitypeviewholder.item.ImageItem;
import com.baurine.multitypeviewholder.item.TextItem;

public class MainActivity extends AppCompatActivity {

    private MultiTypeAdapter adapter = new MultiTypeAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        RecyclerView recyclerView = binding.recyclerview;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_text:
                adapter.addItem(new TextItem(adapter));
                break;
            case R.id.btn_add_image:
                adapter.addItem(new ImageItem());
                break;
            default:
                break;
        }
    }
}
