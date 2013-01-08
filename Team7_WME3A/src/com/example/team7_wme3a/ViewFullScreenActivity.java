package com.example.team7_wme3a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
 
public class ViewFullScreenActivity extends Activity {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_fullscreen);
 
        // get intent data
        Intent i = getIntent();
 
        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
 
        ImageView imageView = (ImageView) findViewById(R.id.fullscreen_image);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }
 
}