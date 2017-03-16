package com.vroneinc.vrone;

public class GPSCoord {
    public Double latitude;
    public Double longitude;

    public GPSCoord() {

    }

    public GPSCoord(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "lat: " + latitude.toString() + ", long: " + longitude.toString() + "\n";
    }
}