package com.codenvy.template.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
//import android.support;
//import android.support.design;
//import android.support.design.widget;
//import android.support.design.widget.Snackbar;

public class HelloAndroidActivity extends Activity {

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
        setContentView(R.layout.activity_main);
        
        Button fmnButtonBackup = (Button) findViewById(R.id.fmn_button_backup);
        fmnButtonBackup.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //Snackbar.make(v, R.string.app_name, Snackbar.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG).show();
                // TODO
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.codenvy.template.android.R.menu.main, menu);
        return true;
    }
    
    /*
    @Override
    public void onClickButtonBackup(View v) {
        
    }
    */
   /*
    Button fmn_button_backup = (Button) findViewById(R.id.fmn_button_backup);
    fmn_button_backup.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
        }
    }
    */


}

