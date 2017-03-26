package com.example.hshack.explorehappylania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WifiValley extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_valley);
        final Button return_map = (Button) findViewById(R.id.return_map);
        return_map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(WifiValley.this, MapActivity.class);
                startActivity(i);
            }
        });

    }
}
