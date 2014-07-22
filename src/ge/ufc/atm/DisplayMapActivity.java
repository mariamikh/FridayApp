package ge.ufc.atm;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class DisplayMapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_map);
	}
	
	 public boolean onCreateOptionsMenu(Menu menu) 
	    {
	        // Inflate the menu; this adds items to the action bar if it is present.
	     //   getMenuInflater().inflate(menu.activity_map, menu);
	        return true;
	    }
}