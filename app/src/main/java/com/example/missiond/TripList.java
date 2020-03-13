package com.example.missiond;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * Array adapter of trip list
 * set the location name
 * set the destination name
 * @author
 *  Weiting Chi
 * @version
 *  Mar.12 2020
 */

public class TripList extends ArrayAdapter<Trip> {
    private ArrayList<Trip> trips;
    private Context context;

    public TripList(Context context, ArrayList<Trip> trips){
        super(context, 0 , trips);
        this.context= context;
        this.trips = trips;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.trip_content, parent, false);
        }
        Trip trip = trips.get(position);

        TextView locationName = view.findViewById(R.id.location_text);
        TextView destinationName = view.findViewById(R.id.destination_text);

        locationName.setText(trip.getLocationName());
        destinationName.setText(trip.getDestination());

        return view;
    }

}