package com.example.uneedwallet.ui.home;

import android.os.Parcel;
import android.os.Parcelable;

public class Keuangan implements Parcelable {
    String tanggal;
    String title;
    String amount;

    public Keuangan(String tanggal, String title, String amount) {
        this.tanggal = tanggal;
        this.title = title;
        this.amount = amount;
    }

    protected Keuangan(Parcel in) {
        tanggal = in.readString();
        title = in.readString();
        amount = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tanggal);
        dest.writeString(title);
        dest.writeString(amount);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Keuangan> CREATOR = new Creator<Keuangan>() {
        @Override
        public Keuangan createFromParcel(Parcel in) {
            return new Keuangan(in);
        }

        @Override
        public Keuangan[] newArray(int size) {
            return new Keuangan[size];
        }
    };

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }




}
