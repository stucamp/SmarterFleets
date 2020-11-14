package com.asu.msse.sjcampb2.smarterdrivers.ui.dash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.asu.msse.sjcampb2.smarterdrivers.R;

public class DashFragment extends Fragment {

    private DashViewModel dashViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashViewModel =
                new ViewModelProvider(this).get(DashViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dash, container, false);
        dashViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}