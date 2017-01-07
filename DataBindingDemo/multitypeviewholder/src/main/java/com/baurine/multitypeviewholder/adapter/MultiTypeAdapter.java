package com.baurine.multitypeviewholder.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.baurine.multitypeviewholder.BR;
import com.baurine.multitypeviewholder.model.MultiTypeBaseModel;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeAdapter extends RecyclerView.Adapter<MultiTypeAdapter.DataBoundViewHolder> {

    private List<MultiTypeBaseModel> items = new ArrayList<>();

    @Override
    public DataBoundViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return DataBoundViewHolder.create(parent, viewType);
    }

    @Override
    public void onBindViewHolder(DataBoundViewHolder holder, int position) {
        holder.bindTo(items.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addData(MultiTypeBaseModel item) {
        items.add(0, item);
        notifyDataSetChanged();
    }

    static class DataBoundViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        static DataBoundViewHolder create(ViewGroup parent, int viewType) {
            ViewDataBinding binding =
                    DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), viewType, parent, false);
            return new DataBoundViewHolder(binding);
        }

        DataBoundViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bindTo(Object obj) {
            binding.setVariable(BR.data, obj);
            binding.executePendingBindings();
        }
    }

}
