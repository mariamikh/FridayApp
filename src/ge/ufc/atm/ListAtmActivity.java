package ge.ufc.atm;

import ge.ufc.atm.adaptor.AtmArrayAdapter;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ListAtmActivity extends ListActivity {



	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ATM atm_tbc = new ATM(Bank.TBC, 10.1f, 15.5f, "tsintsadzis 19...", 40.0f);
		ATM atm_vtb = new ATM(Bank.VTB, 10.1f, 15.5f, "saburtalos 39...", 36.0f);
		ATM atm_hbg = new ATM(Bank.HBG, 10.1f, 15.5f, "dolidzis 19...", 15.0f);
		ATM atm_CNS = new ATM(Bank.CNS, 10.1f, 15.5f, "vaja pshavelas 19...", 5.0f);

		ATM[] ATM_list = new ATM[] { atm_tbc, atm_vtb, atm_hbg, atm_CNS };

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