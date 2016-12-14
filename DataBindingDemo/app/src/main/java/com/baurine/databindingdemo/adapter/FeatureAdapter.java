package com.baurine.databindingdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.baurine.databindingdemo.databinding.ItemFeatureBinding;
import com.baurine.databindingdemo.handler.Presenter;
import com.baurine.databindingdemo.model.FeatureItem;

/**
 * Created by baurine on 12/13/16.
 */

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.ItemFeatureViewHolder> {

    private static final String ACTION_PRE = "baurine.databinding.action.";
    private static final String[] TYPES = new String[]{
            "Combine",
            "Event",
            "NormalObject",
            "ObservableObject",
            "ObservableField",
            "ObservableCollection",
            "ViewStub",
    };
    private Presenter presenter = new Presenter();

    @Override
    public ItemFeatureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ItemFeatureViewHolder.create(parent).setHandler(presenter);
    }

    @Override
    public void onBindViewHolder(ItemFeatureViewHolder holder, int position) {
        String type = TYPES[position];
        String action = ACTION_PRE + type.toLowerCase();
        holder.setItem(new FeatureItem(type, action));
    }

    @Override
    public int getItemCount() {
        return TYPES.length;
    }

    static class ItemFeatureViewHolder extends RecyclerView.ViewHolder {
        private ItemFeatureBinding binding;

        static ItemFeatureViewHolder create(ViewGroup parent) {
            // ItemFeatureBinding binding = DataBindingUtil.inflate(
            //         LayoutInflater.from(parent.getContext()),
            //         R.layout.item_feature, parent, false);
            // or
            ItemFeatureBinding binding = ItemFeatureBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false);
            return new ItemFeatureViewHolder(binding);
        }

        ItemFeatureViewHolder(ItemFeatureBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        ItemFeatureViewHolder setHandler(Presenter presenter) {
            binding.setPresenter(presenter);
            return this;
        }

        ItemFeatureViewHolder setItem(FeatureItem item) {
            binding.setFeatureItem(item);
            return this;
        }
    }

}
