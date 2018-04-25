package com.nandi.sxtool;

/**
 * @author qingsong
 * @date 2018/4/24
 */

public class Gps {

    private double mLatitude;
    private double mLongitude;

    public Gps(double longitude, double mLatitude) {
        setLatitude(mLatitude);
        setLongitude(longitude);
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        this.mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        this.mLongitude = longitude;
    }

    @Override
    public String toString() {
        return mLongitude + "," + mLatitude;
    }
}
