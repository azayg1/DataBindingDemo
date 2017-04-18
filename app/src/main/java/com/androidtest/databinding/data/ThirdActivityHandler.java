package com.androidtest.databinding.data;

import android.view.View;
import android.widget.Button;

public class ThirdActivityHandler {

    public void onClickButton(View view) {
        if(view instanceof Button){
            int times = Integer.parseInt(view.getTag().toString());
            times += 1;
            ((Button) view).setText("Clicked " + times + " times");
            view.setTag(times);
        }
    }

}