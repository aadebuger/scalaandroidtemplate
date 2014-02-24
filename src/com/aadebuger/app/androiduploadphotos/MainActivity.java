package com.aadebuger.app.androiduploadphotos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import org.smpp.*;
import org.smpp.pdu.*;
import com.aadebuger.service.uploadphoto.*;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		testInit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void testInit()
	{
		System.out.println("testInit1="+ new HOPPUploadInfoRequest());
		
	//	new PhotoSesssion();
		new HOPPUploadInfoRequest();
		 new HOPPUploadInfoRequest();
		 HOPP.newConnection();
	}
}
