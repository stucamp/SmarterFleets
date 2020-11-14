package com.asu.msse.sjcampb2.smarterdrivers.ui.inventory;

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

public class InventoryFragment extends Fragment {

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