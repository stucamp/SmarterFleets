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

        TabLayout tabl = root.findViewById(R.id.tabLayout);

        TextView assetTag = root.findViewById(R.id.textView21);
        TextView licensePlate = root.findViewById(R.id.textView22);
        TextView vin = root.findViewById(R.id.textView23);
        TextView insurance = root.findViewById(R.id.textView24);
        TextView warranty = root.findViewById(R.id.textView25);
        TextView nextService = root.findViewById(R.id.textView26);
        TextView driverID = root.findViewById(R.id.textView27);

        assetTag.setText(assetDeets[0][0]);
        licensePlate.setText(assetDeets[0][1]);
        vin.setText(assetDeets[0][2]);
        insurance.setText(assetDeets[0][3]);
        warranty.setText(assetDeets[0][4]);
        nextService.setText(assetDeets[0][5]);
        driverID.setText(assetDeets[0][6]);

        tabl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch(tab.getPosition()) {
                    case 0:
                        assetTag.setText(assetDeets[0][0]);
                        licensePlate.setText(assetDeets[0][1]);
                        vin.setText(assetDeets[0][2]);
                        insurance.setText(assetDeets[0][3]);
                        warranty.setText(assetDeets[0][4]);
                        nextService.setText(assetDeets[0][5]);
                        driverID.setText(assetDeets[0][6]);
                        break;
                    case 1:
                        assetTag.setText(assetDeets[1][0]);
                        licensePlate.setText(assetDeets[1][1]);
                        vin.setText(assetDeets[1][2]);
                        insurance.setText(assetDeets[1][3]);
                        warranty.setText(assetDeets[1][4]);
                        nextService.setText(assetDeets[1][5]);
                        driverID.setText(assetDeets[1][6]);
                        break;
                    case 2:
                        assetTag.setText(assetDeets[2][0]);
                        licensePlate.setText(assetDeets[2][1]);
                        vin.setText(assetDeets[2][2]);
                        insurance.setText(assetDeets[2][3]);
                        warranty.setText(assetDeets[2][4]);
                        nextService.setText(assetDeets[2][5]);
                        driverID.setText(assetDeets[2][6]);
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

        inventoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}