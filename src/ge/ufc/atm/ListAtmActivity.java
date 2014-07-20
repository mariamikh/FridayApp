package ge.ufc.atm;

import ge.ufc.atm.adaptor.AtmArrayAdapter;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

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
		// String selectedValue = (String) getListAdapter().getItem(position);
		// Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

		Intent intent = new Intent(this, DisplayMapActivity.class);
		startActivity(intent);

	}

}