package com.asu.msse.sjcampb2.smarterdrivers.ui.inventory;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.asu.msse.sjcampb2.smarterdrivers.R;
import com.google.android.material.tabs.TabLayout;

public class InventoryFragment extends Fragment {

    String[][] assetDeets = {
            {"0001", "FSE501", "1ZVHT88S875285992", "10/10/2020", "01/07/2025", "06/10/2021", "jConnor"},
            {"0002", "FSE502", "WAUBFAFL2BN024186", "03/21/2021", "03/01/2024", "12/10/2020", "jVoorhees"},
            {"0003", "FSE503", "JHMZE2H57AS054050", "04/05/2021", "11/17/2022", "1/21/2022", "fKrueger"},
    };

    private InventoryViewModel inventoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inventoryViewModel =
                new ViewModelProvider(this).get(InventoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_inv, container, false);
        inventoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}