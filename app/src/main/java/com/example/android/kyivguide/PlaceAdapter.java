package com.example.android.kyivguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Enver on 03.04.2017.
 */


/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = (Place) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name.
        TextView place_name = (TextView) listItemView.findViewById(R.id.place_name);
        place_name.setText(currentPlace.getPlaceName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        // Check if an image is provided for this place
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getPlaceImage());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing TextView and ImageView) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}
