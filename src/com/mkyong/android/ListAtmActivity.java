package com.mkyong.android;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.mkyong.android.adaptor.AtmArrayAdapter;

public class ListAtmActivity extends ListActivity {

	static final String[] ATM_list = new String[] { "Android", "iOS",
			"WindowsMobile", "Blackberry" };

	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new AtmArrayAdapter(this, ATM_list));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		// get selected items
		String selectedValue = (String) getListAdapter().getItem(position);
		Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

	}

}