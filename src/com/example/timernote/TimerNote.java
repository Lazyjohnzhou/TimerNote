package com.example.timernote;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TimerNote extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timer_note);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timer_note, menu);
		return true;
	}

}
