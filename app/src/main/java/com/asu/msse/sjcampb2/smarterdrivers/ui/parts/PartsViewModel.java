package com.asu.msse.sjcampb2.smarterdrivers.ui.parts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PartsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PartsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alerts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}