package com.staff.staffapp.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.staff.staffapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsPersonalFragment extends Fragment {


    public ChatsPersonalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats_personal, container, false);
    }

}
