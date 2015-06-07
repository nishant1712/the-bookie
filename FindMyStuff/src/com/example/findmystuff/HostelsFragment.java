package com.example.findmystuff;

import java.util.Random;

import com.example.findmystuff.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class HostelsFragment extends Fragment {
	ImageView pg1,pg2,pg3,pg4,h1,h2,h3;
	Random rnd;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_hostels, container, false);
		Animation animation = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.to_middle);
		int i=0;
		/*while(i<=1000000000)
		{

			rnd = new Random();
			int num = rnd.nextInt(7 - 1 + 1) + 1;

			switch (num) {
			case 1:

				pg1=(ImageView) rootView.findViewById(R.id.imageView1);
				pg1.startAnimation(animation);
				Thread thread = new Thread(){
					public void run(){
						try{
							sleep(200);
							pg1.setImageResource(R.id.imageView1);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread.start();
				
				break;
			case 2:
				pg2=(ImageView) rootView.findViewById(R.id.imageView2);
				pg2.startAnimation(animation);
				Thread thread2 = new Thread(){
					public void run(){
						try{
							sleep(200);
							pg2.setImageResource(R.id.imageView2);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread2.start();
				break;
			case 3:
				pg3=(ImageView) rootView.findViewById(R.id.imageView3);
				pg3.startAnimation(animation);
				Thread thread3 = new Thread(){
					public void run(){
						try{
							sleep(200);
							pg3.setImageResource(R.id.imageView3);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread3.start();
				break;
			case 4:
				pg4=(ImageView) rootView.findViewById(R.id.imageView4);
				pg4.startAnimation(animation);
				Thread thread4 = new Thread(){
					public void run(){
						try{
							sleep(200);
							pg4.setImageResource(R.id.imageView4);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread4.start();
				break;
			case 5:
				h1=(ImageView) rootView.findViewById(R.id.imageView5);
				h1.startAnimation(animation);
				Thread thread5 = new Thread(){
					public void run(){
						try{
							sleep(200);
							h1.setImageResource(R.id.imageView5);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread5.start();
				break;
			case 6:
				h2=(ImageView) rootView.findViewById(R.id.imageView6);
				h2.startAnimation(animation);
				Thread thread6 = new Thread(){
					public void run(){
						try{
							sleep(200);
							h2.setImageResource(R.id.imageView6);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread6.start();
				break;
			case 7:
				h3=(ImageView) rootView.findViewById(R.id.imageView7);
				h3.startAnimation(animation);
				Thread thread7 = new Thread(){
					public void run(){
						try{
							sleep(200);
							h3.setImageResource(R.id.imageView7);
						}catch(InterruptedException e){
							e.printStackTrace();					
						}
					}
				};
				thread7.start();
				break;
			default:
				break;
			}
			i++;
		}*/
		return rootView;
	}
}
