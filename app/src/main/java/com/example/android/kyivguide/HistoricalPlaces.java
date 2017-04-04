package com.example.android.kyivguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create an array list of Place items
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.kostel, "Kostel", "Kostel"));
        places.add(new Place(R.drawable.maidanezalezhnosti, "Independence Square", "The Central Square of Ukraine"));
        places.add(new Place(R.drawable.zolotievorota, "Golden Gates", "The Entry to the Old City of Kyiv"));
//        places.add(new Place(R.drawable.mihaylovskaya, "St.Michael Church", "St.Michael"));
//        places.add(new Place(R.drawable.motherland, "The Motherland Statue", "The Motherland Statue"));

        // Create a {@link PlaceAdapter}, whose data source is a list of {@link Place}s
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
