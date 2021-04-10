package com.example.uneedwallet.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uneedwallet.R;

import java.util.ArrayList;

public class KeuanganAdapter extends RecyclerView.Adapter<KeuanganAdapter.KeuanganHolder>
{
    ArrayList<Keuangan> keuangans;
    public KeuanganAdapter(ArrayList<Keuangan> keuangans) {
        this.keuangans = keuangans;

    }

    @NonNull
    @Override
    public KeuanganHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_keuangan,parent,false);
        KeuanganHolder keuanganHolder = new KeuanganHolder(view);
        return keuanganHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KeuanganHolder holder, int position) {
        Keuangan keuangan = this.keuangans.get(position);
        holder.amount.setText(keuangan.getAmount());
        holder.title.setText(keuangan.getTitle());

    }

    @Override
    public int getItemCount() {
        return keuangans.size();
    }

    public class KeuanganHolder extends RecyclerView.ViewHolder{
        TextView title,amount;

        public KeuanganHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            amount = itemView.findViewById(R.id.harga);
        }
    }
}
