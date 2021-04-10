package com.example.uneedwallet.ui.income;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.uneedwallet.R;

public class IncomeFragment extends Fragment {

    private IncomeViewModel incomeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        incomeViewModel =
                new ViewModelProvider(this).get(IncomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_expenses, container, false);
        return root;
    }
}