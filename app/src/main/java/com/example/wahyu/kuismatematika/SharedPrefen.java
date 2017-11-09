package com.example.wahyu.kuismatematika;

import android.content.Context;
import android.content.SharedPreferences;


class SharedPrefen {
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    Context context;
    int private_mode = 0;
    private static final String PREF_NAME = "penyimpanannilai";

    public SharedPrefen(Context context) {
        this.context = context;
        sp = context.getSharedPreferences(PREF_NAME, private_mode);
        editor = sp.edit();
    }

    public void setNilaiBenar(int inputUser) {
        editor.putInt("nilBenar", inputUser);
        editor.commit();
    }

    public void setNilaiSalah(int inputUser) {
        editor.putInt("nilSalah", inputUser);
        editor.commit();
    }

    public int getNilaiBenar() {
        return sp.getInt("nilBenar", 0);

    }

    public int getNilaiSalah() {
        return sp.getInt("nilSalah", 0);
    }
}
