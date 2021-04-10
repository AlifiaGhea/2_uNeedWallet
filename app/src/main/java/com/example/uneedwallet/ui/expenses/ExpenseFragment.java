package com.example.uneedwallet.ui.expenses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.uneedwallet.R;

public class ExpenseFragment extends Fragment {

    private ExpenseViewModel expenseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        expenseViewModel =
                new ViewModelProvider(this).get(ExpenseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_income, container, false);
        return root;
    }
}