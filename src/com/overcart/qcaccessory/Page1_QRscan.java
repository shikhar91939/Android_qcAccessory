package com.overcart.qcaccessory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Page1_QRscan extends Activity {

	TextView formatTxt;
	TextView contentTxt;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    setContentView(R.layout.page1_qrscan);
	    
	    formatTxt = (TextView) findViewById(R.id.formatTxt);
		contentTxt = (TextView) findViewById(R.id.contentTxt);
	}

	public void onClick_skip (View view){
		Intent intent = new Intent(getApplicationContext(),Page2_q.class);
    	startActivity(intent);
	}
	public void scan(View view){
		IntentIntegrator scanIntegrator = new IntentIntegrator(this);
		scanIntegrator.initiateScan();
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
    	//retrieve scan result
    	IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    	if (scanningResult != null) {
    		//we have a result
    		String scanContent = scanningResult.getContents();
    		String scanFormat = scanningResult.getFormatName();
    		formatTxt.setText("FORMAT: " + scanFormat);
    		contentTxt.setText("CONTENT: " + scanContent);
    	}else{
    		    Toast toast = Toast.makeText(getApplicationContext(), 
    		            "No scan data received!", Toast.LENGTH_SHORT);
    		        toast.show();
    	}
    }
	
}
