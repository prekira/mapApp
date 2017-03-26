package com.example.hshack.explorehappylania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        //1 illuminati
        final Button illuminati = (Button) findViewById(R.id.illuminati);
        illuminati.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, Illuminati.class);
                startActivity(i);
            }
        });

        //2 peninsula
        final Button peninsula = (Button) findViewById(R.id.peninsula);
        peninsula.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, Peninsula.class);
                startActivity(i);
            }
        });

        //3 stresscano
        final Button stresscano = (Button) findViewById(R.id.stresscano);
        stresscano.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, Stresscano.class);
                startActivity(i);
            }
        });

        //4 api plateau
        final Button api_plateau = (Button) findViewById(R.id.api_plateau);
        api_plateau.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, ApiPlateau.class);
                startActivity(i);
            }
        });


        //5 wifi valley
        final Button wifi_valley = (Button) findViewById(R.id.wifi_valley);
        wifi_valley.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, WifiValley.class);
                startActivity(i);
            }
        });



        //6 memewood
        final Button memewood = (Button) findViewById(R.id.memewood);
        memewood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, Memewood.class);
                startActivity(i);
            }
        });

        //7 sleep desert
        final Button sleep_desert = (Button) findViewById(R.id.sleep_desert);
        sleep_desert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, SleepDesert.class);
                startActivity(i);
            }
        });

        //8 college is bridge or airport under construction
        final Button college = (Button) findViewById(R.id.college);
        college.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, College.class);
                startActivity(i);
            }
        });

        //9 procrastination park
        final Button procrastination_park = (Button) findViewById(R.id.procrastination_park);
        procrastination_park.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, ProcrastinationPark.class);
                startActivity(i);
            }
        });

//5 wifi valley
        final Button about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MapActivity.this, About.class);
                startActivity(i);
            }
        });













    }
}
