package com.example.danyal.bluetoothhc05;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {
    String address = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //pass the address of connected device(HC05 particular module at a time)
        Intent newint = getIntent();
        address = newint.getStringExtra(DeviceList.EXTRA_ADDRESS);

    }

    public void scrableclick(View view) {

        Intent i = new Intent(homepage.this, scramblingcube3d.class);
        i.putExtra("EXTRA_ADDRESS", address);
        startActivity(i);



    }
}
