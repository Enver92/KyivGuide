package com.example.android.kyivguide;

/**
 * Created by User on 03.04.2017.
 */

/**
 * {@link Place} represents a place that the user may be interested in visiting.
 * It contains resource IDs for the place image, name, and description.
 */
public class Place {
    private int mPlaceImageResource = NO_IMAGE_PROVIDED;
    private String mPlaceName;
    private String mPlaceDescription;
    private static final int NO_IMAGE_PROVIDED = -1;

    //  The Place Constructor
    public Place(int placeImage, String placeName, String placeDescription) {
        mPlaceImageResource = placeImage;
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
    }

    //  The Place Image Getter Method
    public int getPlaceImage() {
        return mPlaceImageResource;
    }

    //  The Place Image Setter Method
    public void setPlaceImage(int placeImage) {
        mPlaceImageResource = placeImage;
    }

    //  The Place Name Getter Method
    public String getPlaceName() {
        return mPlaceName;
    }

    //  The Place Name Setter Method
    public void setPlaceName(String placeName) {
        mPlaceName = placeName;
    }

    //  The Place Description Getter Method
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    //  The Place Description Setter Method
    public void setPlaceDescription(String placeDescription) {
        mPlaceDescription = placeDescription;
    }

    //  Check whether the Place item has an Image
    public boolean hasImage() {
        return mPlaceImageResource != NO_IMAGE_PROVIDED;
    }
}
