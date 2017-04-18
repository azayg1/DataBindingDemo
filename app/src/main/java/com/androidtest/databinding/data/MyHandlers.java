package com.androidtest.databinding.data;

import android.view.View;
import android.widget.Button;

public class MyHandlers {
    public void onClickFriend(View view) {
        int times = Integer.parseInt(view.getTag().toString());
        times += 1;
        ((Button) view).setText("Clicked " + times + " times");
        view.setTag(times);
    }
}