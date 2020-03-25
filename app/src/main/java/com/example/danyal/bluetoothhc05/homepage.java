package com.example.danyal.bluetoothhc05;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class homepage extends AppCompatActivity {
    String address = null;

    Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        mtoolbar=findViewById(R.id.hometoolbar);

        PulsatorLayout pulsator = (PulsatorLayout) findViewById(R.id.pulsator);
        pulsator.start();
        //pass the address of connected device(HC05 particular module at a time)
        Intent newint = getIntent();
        address = newint.getStringExtra(DeviceList.EXTRA_ADDRESS);

        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    public void scrableclick(View view) {

        Intent i = new Intent(homepage.this, scramblingcube3d.class);
        i.putExtra("EXTRA_ADDRESS", address);
        startActivity(i);



    }

    public void autoscrmclick(View view) {

        Intent i = new Intent(homepage.this, AutoScrambling.class);
        i.putExtra("EXTRA_ADDRESS", address);
        startActivity(i);
    }
}
