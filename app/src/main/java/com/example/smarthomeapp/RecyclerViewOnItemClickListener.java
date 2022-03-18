package com.example.smarthomeapp;

import android.view.View;

public interface RecyclerViewOnItemClickListener {

    void onClick(View v, int p);
    void onClickEdit(View v, int p);
    void onClickDelete(View v, int p);
}
