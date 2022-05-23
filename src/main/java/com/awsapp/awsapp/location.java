package com.awsapp.awsapp;

public class location {

    private String locationName;
    private String locationAddress;
    private double lat, lang;

    public location(String locationName, String locationAddress, double lat, double lang) {
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.lat = lat;
        this.lang = lang;
    }

    public double getLang() {
        return lang;
    }

    public void setLang(double lang) {
        this.lang = lang;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    @Override
    public String toString() {
        return "location{" +
                "locationName='" + locationName + '\'' +
                ", locationAddress='" + locationAddress + '\'' +
                ", lat=" + lat +
                ", lang=" + lang +
                '}';
    }
}


