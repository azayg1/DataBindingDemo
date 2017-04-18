package com.androidtest.databinding.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.androidtest.databinding.BR;


/**
 * Created by User on 4/17/2017.
 * User
 */

public class User extends BaseObservable {

    private  String firstName;
    private  String lastName;
    private  int age;
    private  boolean isAdult;
    @Bindable
    public boolean isAdult() {
        return isAdult;
    }


    public User(String firstName, String lastName, int age, boolean isAdult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isAdult = isAdult;
    }
    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {

        return this.lastName;
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAdult(boolean adult) {
        this.isAdult = adult;
        notifyPropertyChanged(BR.user);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.user);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.user);
    }
}
