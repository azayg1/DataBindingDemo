package com.androidtest.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidtest.databinding.data.User;
import com.androidtest.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user=new User("fname","lname",123,false);
        activityMainBinding.setUser(user);

        activityMainBinding.update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.fName.setText("Hello");
                user.setAdult(true);
                activityMainBinding.setUser(user);
            }
        });
    }
}
