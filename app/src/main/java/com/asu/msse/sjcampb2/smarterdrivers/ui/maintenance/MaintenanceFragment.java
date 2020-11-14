package com.asu.msse.sjcampb2.smarterdrivers.ui.maintenance;

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

public class MaintenanceFragment extends Fragment {

    private MaintenanceViewModel maintenanceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        maintenanceViewModel =
                new ViewModelProvider(this).get(MaintenanceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_maints, container, false);
        maintenanceViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}