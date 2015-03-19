package com.overcart.qcaccessory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page1_QRscan extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    setContentView(R.layout.page1_qrscan);
	}

	public void onClick_skip (View view){
		Intent intent = new Intent(getApplicationContext(),Page2_q.class);
    	startActivity(intent);
	}
}
