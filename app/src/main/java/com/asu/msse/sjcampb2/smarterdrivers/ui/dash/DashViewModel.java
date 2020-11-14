package com.asu.msse.sjcampb2.smarterdrivers.ui.dash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}