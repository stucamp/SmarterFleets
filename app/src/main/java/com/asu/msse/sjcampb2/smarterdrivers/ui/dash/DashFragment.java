package com.asu.msse.sjcampb2.smarterdrivers.ui.dash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.asu.msse.sjcampb2.smarterdrivers.R;
import com.asu.msse.sjcampb2.smarterdrivers.ui.budget.BudgetFragment;
import com.asu.msse.sjcampb2.smarterdrivers.ui.parts.PartsFragment;

public class DashFragment extends Fragment {

    private DashViewModel dashViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashViewModel =
                new ViewModelProvider(this).get(DashViewModel.class);

        View root = inflater.inflate(R.layout.fragment_dash, container, false);

        ImageView budget = root.findViewById(R.id.imageView7);
        ImageView partsRec = root.findViewById(R.id.imageView9);

        budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newCase = new BudgetFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_dash, newCase); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
            }
        });

        partsRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newCase = new PartsFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_dash, newCase); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
            }
        });


        dashViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }

}