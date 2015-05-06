package com.pro2on.runtracker.activity;

import android.support.v4.app.Fragment;

import com.pro2on.runtracker.fragment.RunFragment;

/**
 *  Created by pro2on on 06.05.15 for RunTracker.
 */
public class RunActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new RunFragment();
    }
}
