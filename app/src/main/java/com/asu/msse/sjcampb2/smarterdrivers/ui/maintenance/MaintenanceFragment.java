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
import com.google.android.material.tabs.TabLayout;

public class MaintenanceFragment extends Fragment {

    private MaintenanceViewModel maintenanceViewModel;
    String[] assetDeets = {
            "Asset 1 - General Service Due!!!",
            "Asset 2 - Insurance Payment Upcoming.",
            "Asset 3 - Repair Complete, Return to Service",
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        maintenanceViewModel =
                new ViewModelProvider(this).get(MaintenanceViewModel.class);

        View root = inflater.inflate(R.layout.fragment_maints, container, false);

        TabLayout tabl = root.findViewById(R.id.maintTabLayout);
        TextView output = root.findViewById(R.id.textView10);
        output.setText(assetDeets[0]);

        tabl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        output.setText(assetDeets[0]);
                        break;
                    case 1:
                        output.setText(assetDeets[1]);
                        break;
                    case 2:
                        output.setText(assetDeets[2]);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        maintenanceViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        return root;
    }
}