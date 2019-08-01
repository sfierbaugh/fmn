package com.fmn.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
//import android.gms.vision.Frame;
//import android.gms.vision.barcode.Barcode;
//import android.gms.vision.barcode.BarcodeDetector;
//import com.fmn.android.R;

public class FmnBackupActivity extends Activity {

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
        setContentView(R.layout.fmn_backup_activity_layout);
        Log.d("FmnBackupActivity", "onCreate");        
    }

    // TakePhoto button
    Button fmnButtonTakePhoto = (Button) findViewById(R.id.fmn_button_takephoto);
    fmnButtonTakePhoto.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
            //Toast.makeText(getApplicationContext(), R.string.fmn_button_takephoto, Toast.LENGTH_LONG).show();
            // TODO

            // Get the TextView for status
            TextView txtView = (TextView) findViewById(R.id.txtContent);
            
            // Get the image
            ImageView myImageView = (ImageView) findViewById(R.id.fmn_imageview);
            Bitmap myBitmap = BitmapFactory.decodeResource(
                                    getApplicationContext().getResources(), 
                                    R.drawable.bb74793e6b39106b);
            myImageView.setImageBitmap(myBitmap);
            
            // Setup the barcode detector
            BarcodeDetector detector = 
                new BarcodeDetector.Builder(getApplicationContext())
                                    .setBarcodeFormats(Barcode.DATA_MATRIX | Barcode.QR_CODE)
                                    .build();
            if(!detector.isOperational()){
               txtView.setText("Could not set up the detector!");
               return;
            }
            
            // Detect the barcode(s)
            Frame frame = new Frame.Builder().setBitmap(myBitmap).build();
            SparseArray<Barcode> barcodes = detector.detect(frame);

            // Do something with the barcode(s)
            Barcode thisCode = barcodes.valueAt(0);
            txtView.setText(thisCode.rawValue);

        }
    });

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}