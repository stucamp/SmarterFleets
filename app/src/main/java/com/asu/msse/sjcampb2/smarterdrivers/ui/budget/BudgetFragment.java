package com.asu.msse.sjcampb2.smarterdrivers.ui.budget;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.asu.msse.sjcampb2.smarterdrivers.R;
import com.asu.msse.sjcampb2.smarterdrivers.ui.dash.DashFragment;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class BudgetFragment extends Fragment {

    private BudgetViewModel budgetViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        budgetViewModel =
                new ViewModelProvider(this).get(BudgetViewModel.class);

        View root = inflater.inflate(R.layout.fragment_budget, container, false);

        TextView tvR, tvPython, tvCPP, tvJava;
        PieChart pieChart;

        tvR = root.findViewById(R.id.tvR);
        tvPython = root.findViewById(R.id.tvPython);
        tvCPP = root.findViewById(R.id.tvCPP);
        tvJava = root.findViewById(R.id.tvJava);
        pieChart = root.findViewById(R.id.piechart);

        tvR.setText(Integer.toString(40));
        tvPython.setText(Integer.toString(30));
        tvCPP.setText(Integer.toString(5));
        tvJava.setText(Integer.toString(25));

        pieChart.addPieSlice(
                new PieModel(
                        "R",
                        Integer.parseInt(tvR.getText().toString()),
                        Color.parseColor("#FFA726")));
        pieChart.addPieSlice(
                new PieModel(
                        "Python",
                        Integer.parseInt(tvPython.getText().toString()),
                        Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(
                new PieModel(
                        "C++",
                        Integer.parseInt(tvCPP.getText().toString()),
                        Color.parseColor("#EF5350")));
        pieChart.addPieSlice(
                new PieModel(
                        "Java",
                        Integer.parseInt(tvJava.getText().toString()),
                        Color.parseColor("#29B6F6")));

        pieChart.startAnimation();

        budgetViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}