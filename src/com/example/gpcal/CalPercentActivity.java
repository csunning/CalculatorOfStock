package com.example.gpcal;

import com.example.gpcal.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalPercentActivity extends Activity {

	public static final String TAG = "CalPercentActivity";
	private EditText mHighestPrice, mLowestPrice;

	private TextView mPercent30, mPercent50, mPercent60;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.percent_page);

		mHighestPrice = (EditText) findViewById(R.id.highest_price);
		mLowestPrice = (EditText) findViewById(R.id.lowest_price);
		
		mPercent30 = (TextView) findViewById(R.id.percent_30);
		mPercent50 = (TextView) findViewById(R.id.percent_50);
		mPercent60 = (TextView) findViewById(R.id.percent_60);
	}

	public void CalPercent(View view) {
		String sHighestPrice = mHighestPrice.getText().toString();
		String sLlowestPrice = mLowestPrice.getText().toString();
		if (!sHighestPrice.isEmpty() && !sLlowestPrice.isEmpty()) {
			float resultof30 = (float) ((Float.valueOf(sHighestPrice) - Float
					.valueOf(sLlowestPrice)) * 0.3 + Float
					.valueOf(sLlowestPrice));
//			System.out.println(String.valueOf(resultof30));
			float resultof50 = (float) ((Float.valueOf(sHighestPrice) - Float
					.valueOf(sLlowestPrice)) * 0.5 + Float
					.valueOf(sLlowestPrice));
			float resultof60 = (float) ((Float.valueOf(sHighestPrice) - Float
					.valueOf(sLlowestPrice)) * 0.6 + Float
					.valueOf(sLlowestPrice));
			mPercent30.setText(String.valueOf(resultof30));
			mPercent50.setText(String.valueOf(resultof50));
			mPercent60.setText(String.valueOf(resultof60));
			//ClearET();
		} else {
			Toast.makeText(getApplicationContext(), "blank is empty", Toast.LENGTH_SHORT).show();
		}
	}

	public void ClearET(View view) {
		mHighestPrice.setText("");
		mLowestPrice.setText("");
		mPercent30.setText("");
		mPercent50.setText("");
		mPercent60.setText("");
	}
}
