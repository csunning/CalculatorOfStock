package com.example.gpcal;

import com.example.gpcal.R;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChoiceDoActivity extends Activity implements OnClickListener {

	private Button bpercent, bCover, bIntroduce, bTransactionCost;

	private final static String tag = "ChoiceDoActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choice_do);

		bpercent = (Button) findViewById(R.id.percent);
		bCover = (Button) findViewById(R.id.cover);
		bIntroduce = (Button) findViewById(R.id.introduce);
		bTransactionCost = (Button) findViewById(R.id.transaction_cost);

		bpercent.setOnClickListener(this);
		bCover.setOnClickListener(this);
		bIntroduce.setOnClickListener(this);
		bTransactionCost.setOnClickListener(this);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		int currentVersion = android.os.Build.VERSION.SDK_INT;
		if (currentVersion > android.os.Build.VERSION_CODES.ECLAIR_MR1) {
			Intent startMain = new Intent(Intent.ACTION_MAIN);
			startMain.addCategory(Intent.CATEGORY_HOME);
			startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(startMain);
			System.exit(0);
		} else {// android2.1
			ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
			am.restartPackage(getPackageName());
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.i(tag, "onclick");
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.percent:
			intent.setClass(ChoiceDoActivity.this, CalPercentActivity.class);
			ChoiceDoActivity.this.startActivity(intent);
			break;
		case R.id.cover:
			intent.setClass(ChoiceDoActivity.this, CalCoverActivity.class);
			ChoiceDoActivity.this.startActivity(intent);
			break;
		case R.id.introduce:
			intent.setClass(ChoiceDoActivity.this, IntroduceActivity.class);
			ChoiceDoActivity.this.startActivity(intent);
			break;
		case R.id.transaction_cost:
			// ×Ô¶¨Òåtoast
			break;
		default:
			break;
		}
	}

}
