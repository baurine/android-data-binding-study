package com.baurine.databindingdemo.model;

import android.databinding.ObservableField;

/**
 * Created by baurine on 12/13/16.
 */

public class ObservableFieldUser {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();

    public ObservableFieldUser(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public void incAge() {
        this.age.set(this.age.get() + 1);
    }
}
