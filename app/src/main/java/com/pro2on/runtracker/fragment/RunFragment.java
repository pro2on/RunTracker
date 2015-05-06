package com.pro2on.runtracker.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pro2on.runtracker.R;

/**
 *  Created by pro2on on 06.05.15.
 */
public class RunFragment extends Fragment {


    private Toolbar mToolBar;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_run, container, false);

        mToolBar = (Toolbar) view.findViewById(R.id.my_awesome_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolBar);
        mToolBar.setNavigationIcon(R.mipmap.ic_maps_directions_walk);



        return view;
    }
}
