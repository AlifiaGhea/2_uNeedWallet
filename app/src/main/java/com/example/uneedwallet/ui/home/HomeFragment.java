package com.example.uneedwallet.ui.home;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uneedwallet.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    KeuanganAdapter keuanganAdapter;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final ArrayList<Keuangan> keuangans = new ArrayList<>();
        keuangans.add(new Keuangan("11 April 2021","Jual HP", "750.000,-"));
        keuangans.add(new Keuangan("14 April 2021","Beli sepatu", "-500.000,-"));

        recyclerView = root.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        keuanganAdapter = new KeuanganAdapter(keuangans);
        recyclerView.setAdapter(keuanganAdapter);

        return root;
    }
}