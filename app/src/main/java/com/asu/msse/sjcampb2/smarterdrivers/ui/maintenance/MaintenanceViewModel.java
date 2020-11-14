package com.asu.msse.sjcampb2.smarterdrivers.ui.maintenance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MaintenanceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MaintenanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is maintenance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}