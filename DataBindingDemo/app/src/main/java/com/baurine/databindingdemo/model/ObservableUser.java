package com.baurine.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.baurine.databindingdemo.BR;

/**
 * Created by baurine on 12/13/16.
 */

public class ObservableUser extends BaseObservable {
    private String name;
    private int age;

    public ObservableUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public void incAge() {
        this.age++;
        notifyPropertyChanged(BR.age);
    }
}
