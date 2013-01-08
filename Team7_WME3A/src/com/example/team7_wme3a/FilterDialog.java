package com.example.team7_wme3a;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FilterDialog extends Dialog implements android.view.View.OnClickListener {
	private MainActivity main;
	
	public FilterDialog(MainActivity main) {
		super(main);
		this.main = main;
	}
	
	protected void onStart() {
		super.onStart();
		setContentView(R.layout.dialog_filter);
		getWindow().setFlags(4, 4);
		setTitle("Filter");
		Button ok = (Button) findViewById(R.id.ok);
		ok.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		String filter = getText(R.id.filterText);
	}
	
	private String getText(int id) {
		EditText widget = (EditText) this.findViewById(id);
		return widget.getText().toString();
	}
}