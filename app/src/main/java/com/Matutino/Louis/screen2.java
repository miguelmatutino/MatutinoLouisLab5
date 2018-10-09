package com.Matutino.Louis;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d("4itf", "onStart success");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d("4itf", "onResume success");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d("4itf", "onPause");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d("4itf", "onStop");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("4itf", "onDestroy");
    }


    public void screen1 (View V){
        Intent i = new Intent(this, MainActivity.class);
    }

    public void showMap (View V){
        Intent i = null, chooser = null;
        if (V.getId() == R.id.button5) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:4.307822, 73.416326"));
            chooser = Intent.createChooser(i, "Select a map application");
            startActivity(chooser);
        }

    }


}
