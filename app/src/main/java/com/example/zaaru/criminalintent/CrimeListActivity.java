package com.example.zaaru.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by User on 2017-02-09.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
