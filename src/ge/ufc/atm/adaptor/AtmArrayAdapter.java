package ge.ufc.atm.adaptor;

import ge.ufc.atm.ATM;
import ge.ufc.atm.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AtmArrayAdapter extends ArrayAdapter<ATM> {
	private final Context context;
	private final ATM[] values;

	public AtmArrayAdapter(Context context, ATM[] values) {
		super(context, R.layout.list_atm, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.list_atm, parent, false);
		TextView txAtmAddress = (TextView) rowView.findViewById(R.id.lb_address);
		TextView txBankName = (TextView) rowView
				.findViewById(R.id.lb_bank_name);
		TextView txDistance = (TextView) rowView.findViewById(R.id.lb_distance);

		System.out.println(values[position]);

		txAtmAddress.setText(values[position].getAddress());
		txBankName.setText(values[position].getBank().getBank());
		txDistance.setText(String.valueOf(values[position].getDistance()));

		return rowView;
	}
}