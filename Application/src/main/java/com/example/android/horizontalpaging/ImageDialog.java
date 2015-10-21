package com.example.android.horizontalpaging;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by urgu on 10/21/15.
 */
public class ImageDialog extends Activity {

    private ImageView mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_dialog_layout);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int pos = extras.getInt("ImageID");

        switch(pos){
            case 0: mDialog = (ImageView)findViewById(R.id.image0);
                    mDialog.setVisibility(View.VISIBLE);
                    break;
            case 1: mDialog = (ImageView)findViewById(R.id.image1);
                    mDialog.setVisibility(View.VISIBLE);
                    break;
            case 2: mDialog = (ImageView)findViewById(R.id.image2);
                    mDialog.setVisibility(View.VISIBLE);
                    break;
            case 3: mDialog = (ImageView)findViewById(R.id.image3);
                    mDialog.setVisibility(View.VISIBLE);
                    break;
        }

        mDialog.setClickable(true);

        //finish the activity (dismiss the image dialog) if the user clicks
        //anywhere on the image
        mDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}