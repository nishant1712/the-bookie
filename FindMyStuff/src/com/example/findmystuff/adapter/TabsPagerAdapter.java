package com.example.findmystuff.adapter;

import com.example.findmystuff.StudentFragment;
import com.example.findmystuff.HostelsFragment;
import com.example.findmystuff.FoodFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            return new HostelsFragment();
        case 1:
            return new FoodFragment();
        case 2:
            return new StudentFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}
