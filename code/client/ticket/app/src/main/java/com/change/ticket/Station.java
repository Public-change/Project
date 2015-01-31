package com.change.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/23.
 */
public class Station {


    private String stationName;
    private String stationTel;
    private float stationDistance;
    private String staionAddress;
    private int stationImageID;

    public String getStationName() {
        return stationName;
    }

    public String getStationTel() {
        return stationTel;
    }

    public float getStationDistance() {
        return stationDistance;
    }

    public String getStaionAddress() {
        return staionAddress;
    }

    public int getStationImageID() {
        return stationImageID;
    }

    public Station() {
        this.stationName = null;
        this.stationTel = null;
        this.stationDistance = Float.MAX_VALUE;
        this.staionAddress = null;
        this.stationImageID = Integer.MAX_VALUE;
    }

    public Station(String stationName, String stationTel, float stationDistance, String staionAddress, int stationImageID) {
        this.stationName = stationName;
        this.stationTel = stationTel;
        this.stationDistance = stationDistance;
        this.staionAddress = staionAddress;
        this.stationImageID = stationImageID;
    }
}
