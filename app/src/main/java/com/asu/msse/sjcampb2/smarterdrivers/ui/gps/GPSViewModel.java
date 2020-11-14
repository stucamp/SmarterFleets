package com.asu.msse.sjcampb2.smarterdrivers.ui.gps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GPSViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GPSViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is GPS fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}