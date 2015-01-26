package com.change.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/23.
 */
public class StationInfo {

    public enum UpdateStatu
    {
        UPDATE_STATU_NOTSTART,
        UPDATE_STATU_UPDATEING,
        UPDATE_STATU_FINISH,
    };

    UpdateStatu updateStatu;
    int numberOfStation;
    List<String> stationList;


    public StationInfo()
    {
        updateStatu = UpdateStatu.UPDATE_STATU_NOTSTART;
    }

    public boolean updateStationList()
    {
        return false;
    }

    public List<String> getStationList()
    {
        List<String> stationList;
        stationList = new ArrayList<>();

        return stationList;
    }

    public int getNumberOfStation()
    {
        return numberOfStation;
    }

    public void sortStation(List<String> stationList)
    {

    }


}
