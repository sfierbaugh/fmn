package com.fmn.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;
//import android.support;
//import android.support.design;
//import android.support.design.widget;
//import android.support.design.widget.Snackbar;

public class FmnMainActivity extends Activity{

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState
     *         If the activity is being re-initialized after
     *         previously being shut down then this Bundle contains the data it most
     *         recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fmn_main_activity_layout);
        Log.d("FmnMainActivity", "onCreate");
     
        // ...................
        // Setup main buttons.
        // ...................
        
        // Backup button
        Button fmnButtonBackup = (Button) findViewById(R.id.fmn_button_backup);
        fmnButtonBackup.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), R.string.fmn_button_backup, Toast.LENGTH_LONG).show();
                // TODO
				// Start NewActivity.class
				Intent myIntent = new Intent(FmnMainActivity.this,
						FmnBackupActivity.class);
				startActivity(myIntent);
            }
        });
        
        // Read button
        Button fmnButtonRead = (Button) findViewById(R.id.fmn_button_read);
        fmnButtonRead.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), R.string.fmn_button_read, Toast.LENGTH_LONG).show();
                // TODO
				// Start NewActivity.class
				Intent myIntent = new Intent(FmnMainActivity.this,
						FmnReadActivity.class);
				startActivity(myIntent);
            }
        });
        
        // Website button
        Button fmnButtonWebsite = (Button) findViewById(R.id.fmn_button_website);
        fmnButtonWebsite.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.fmn_button_website, Toast.LENGTH_LONG).show();
                // TODO
            }
        });
        
        // Buy button
        Button fmnButtonBuy = (Button) findViewById(R.id.fmn_button_buy);
        fmnButtonBuy.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), R.string.fmn_button_buy, Toast.LENGTH_LONG).show();
                // TODO
				// Start NewActivity.class
				Intent myIntent = new Intent(FmnMainActivity.this,
						FmnBuyActivity.class);
				startActivity(myIntent);
            }
        });
        
        // Settings button
        Button fmnButtonSettings = (Button) findViewById(R.id.fmn_button_settings);
        fmnButtonSettings.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.fmn_button_settings, Toast.LENGTH_LONG).show();
                // TODO
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
