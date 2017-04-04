package com.example.android.kyivguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView historical_places = (TextView) findViewById(R.id.historical_places);

        //Set onClick Listener
        historical_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historicalPlacesIntent = new Intent(MainActivity.this, HistoricalPlaces.class);
                startActivity(historicalPlacesIntent);
            }
        });
    }
}
