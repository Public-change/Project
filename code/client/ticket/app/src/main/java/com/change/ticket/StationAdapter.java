package com.change.ticket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2015/1/26.
 */
public class StationAdapter extends ArrayAdapter<Station> {

    private int resourceId;

    public StationAdapter(Context context, int textViewResourceId, List<Station> objects) {
        super(context, textViewResourceId, objects);
        this.resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Station station = getItem(position);
        View view;
        StationViewHolder stationViewHolder;

        if (convertView == null)
        {
            stationViewHolder = new StationViewHolder();
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);

            stationViewHolder.stationName = (TextView) view.findViewById(R.id.station_name);
            stationViewHolder.stationTel = (TextView) view.findViewById(R.id.station_tel);
            stationViewHolder.stationDistance = (TextView) view.findViewById(R.id.station_distance);
            stationViewHolder.callStation = (ImageView) view.findViewById(R.id.call_station);
            view.setTag(stationViewHolder);
        }
        else
        {
            view = convertView;
            stationViewHolder = (StationViewHolder) view.getTag();
        }

        stationViewHolder.stationName.setText(station.getStationName());
        stationViewHolder.stationTel.setText(station.getStationTel());
        stationViewHolder.stationDistance.setText(station.getStationDistance() + "km");
        stationViewHolder.callStation.setImageResource(station.getStationImageID());

        return view;
    }

    class StationViewHolder
    {
        TextView stationName;
        TextView stationTel;
        TextView stationDistance;
        ImageView callStation;
    }
}
