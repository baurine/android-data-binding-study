package com.baurine.databindingdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.baurine.databindingdemo.R;
import com.baurine.databindingdemo.model.User;

public class Card extends LinearLayout {
    private final TextView tvFirstname;
    private final TextView tvLastname;
    private final TextView tvAge;

    public Card(Context context) {
        this(context, null);
    }

    public Card(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Card(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        inflate(context, R.layout.view_card, this);
        setOrientation(VERTICAL);

        tvFirstname = (TextView) findViewById(R.id.tv_firstname);
        tvLastname = (TextView) findViewById(R.id.tv_lastname);
        tvAge = (TextView) findViewById(R.id.tv_age);
    }

    public void setObject(User user) {
        tvFirstname.setText(user.getFirstName());
        tvLastname.setText(user.getLastName());
        tvAge.setText(String.valueOf(user.getAge()));
    }

}
