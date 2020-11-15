package com.asu.msse.sjcampb2.smarterdrivers.ui.forecast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ForecastViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ForecastViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alerts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}