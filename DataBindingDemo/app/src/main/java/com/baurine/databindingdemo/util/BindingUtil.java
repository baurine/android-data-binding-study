package com.baurine.databindingdemo.util;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import static android.content.ContentValues.TAG;

public class BindingUtil {
    // 可以为 android 命名空间编写 adapter
    // 而且这个属性之前可以不存在
    @BindingAdapter("android:paddingVertical")
    public static void setPaddingVertical(View view, int paddingVertical) {
        view.setPadding(view.getPaddingLeft(),
                paddingVertical,
                view.getPaddingRight(),
                paddingVertical);
    }

    // 为自定义命名空间编写 adapter，命名空间可以忽略
    // 无须手动调用此函数
    // 当 xml 中 ImageView 的 imageUrl 和 error 属性同时存在时，会自动调用 loadImage 函数
    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView imgView, String url, Drawable error) {
        Log.d(TAG, "loadImage: -----------");
        Glide.with(imgView.getContext()).load(url).error(error).into(imgView);
    }
}
