package com.example.findmystuff;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
public class DrawerFragment extends Fragment{
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
 
        // Retrieving the currently selected item number
        int position = getArguments().getInt("position");
 
        // List of rivers
        String[] drawer = getResources().getStringArray(R.array.navdrawer);
 
        // Creating view correspoding to the fragment
        View v = inflater.inflate(R.layout.fragment_layout, container, false);
 
        // Getting reference to the TextView of the Fragment
        TextView tv = (TextView) v.findViewById(R.id.tv_content);
 
        // Setting currently selected river name in the TextView
        tv.setText(drawer[position]);
 
        // Updating the action bar title
        getActivity().getActionBar().setTitle(drawer[position]);
 
        return v;
    }
}