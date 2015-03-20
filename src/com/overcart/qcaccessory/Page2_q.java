package com.overcart.qcaccessory;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Page2_q extends Activity {
	
	EditText et_brandName, et_modelId;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    setContentView(R.layout.page2_q);
	    et_brandName = (EditText) findViewById(R.id.et_brandName);
	    et_modelId = (EditText) findViewById(R.id.et_modelId);
	}
	public void onClick_next(View view){
		
		if (et_brandName.length()>0 && et_modelId.length()>0){
			Toast.makeText(getBaseContext(),"form complete", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(getBaseContext(),"form INcomplete", Toast.LENGTH_SHORT).show();
		}
	}
}
