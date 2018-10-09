package com.Matutino.Louis;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


        public void screen2 (View V){
            Intent i = new Intent(this, screen2.class);
        }

        public void showMap (View V){
            Intent i = null, chooser = null;
            if (V.getId() ==R.id.button5) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:4.008091,72.949755"));
                chooser = Intent.createChooser(i, "select a mappy boi");
                startActivity(chooser);
            }

        }
    }