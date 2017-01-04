package com.baurine.databindingdemo.model;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

public class FontFamily {

    private Map<String, Typeface> fontCache = new HashMap<>();

    public static FontFamily getInstance() {
        return Singleton.instance;
    }

    public Typeface getFont(String fontName, Context cxt) {
        if (fontCache.get(fontName) != null) {
            return fontCache.get(fontName);
        }

        Typeface typeface = Typeface.createFromAsset(cxt.getAssets(),
                "fonts/" + fontName + ".ttf");
        if (typeface != null) {
            fontCache.put(fontName, typeface);
        }
        return typeface;
    }

    private static class Singleton {
        private static FontFamily instance = new FontFamily();
    }
}
