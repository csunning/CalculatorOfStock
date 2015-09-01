package com.example.gpcal;

import com.example.gpcal.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalCoverActivity extends Activity {

	private EditText mNowPrice, mCoverNum, mHoldPrice, mHoldNum;

	private TextView mCalResult;
	
	private String nowPrice, coverNum, holdPrice, holdNum;
	private float calPrice;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cover_page);

		mNowPrice = (EditText) findViewById(R.id.now_price);
		mCoverNum = (EditText) findViewById(R.id.cover_num);
		mHoldPrice = (EditText) findViewById(R.id.hold_price);
		mHoldNum = (EditText) findViewById(R.id.hold_num);

		mCalResult = (TextView) findViewById(R.id.cal_result);
	}

	public void CalCover(View view) {
		nowPrice = mNowPrice.getText().toString();
		coverNum = mCoverNum.getText().toString();
		holdPrice = mHoldPrice.getText().toString();
		holdNum = mHoldNum.getText().toString();
		if (!TextUtils.isEmpty(nowPrice) && !TextUtils.isEmpty(coverNum)
				&& !TextUtils.isEmpty(holdPrice) && !TextUtils.isEmpty(holdNum)) {
			
			calPrice = (Float.valueOf(nowPrice) * Float.valueOf(coverNum) + Float
					.valueOf(holdPrice) * Float.valueOf(holdNum))
					/ (Float.valueOf(coverNum) + Float.valueOf(holdNum));
			mCalResult.setText(String.valueOf(calPrice));
			ClearET();
		} else {
			Toast.makeText(this, "blank is empty", Toast.LENGTH_SHORT).show();
		}
	}
	
	public void ClearET(){
		mNowPrice.setText("");
		mCoverNum.setText("");
		mHoldPrice.setText("");
		mHoldNum.setText("");
	}
}
