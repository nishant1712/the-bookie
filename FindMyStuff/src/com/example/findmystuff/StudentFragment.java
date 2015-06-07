package com.example.findmystuff;

import com.example.findmystuff.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class StudentFragment extends Fragment{
	TextView bi,fname,roll,email;
	Button register;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_student, container, false);
		register=(Button) rootView.findViewById(R.id.button1);
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent("android.intent.action.PRO"));
			}
		});
		return rootView;
	}
}
