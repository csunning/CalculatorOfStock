package com.example.gpcal;

import java.util.Timer;
import java.util.TimerTask;

import com.example.gpcal.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * final Intent intent = new Intent();
		 * 
		 * Timer timer = new Timer(); TimerTask task = new TimerTask() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * intent.setClass(MainActivity.this,ChoiceDoActivity.class);
		 * MainActivity.this.startActivity(intent); } };
		 * 
		 * timer.schedule(task, 2*1000);
		 */

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, ChoiceDoActivity.class);
				MainActivity.this.startActivity(intent);
			}
		}, 1000);
	}

	
}
