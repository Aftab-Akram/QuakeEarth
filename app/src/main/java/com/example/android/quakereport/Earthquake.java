package com.example.android.quakereport;

/**
 * Created by user on 7/31/2016.
 */
public class Earthquake {
    double magnitude;
    private String url;
    String location;
    Long date;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
    }



    public Earthquake(double mag, String loc, Long dat,String mUrl)

    {
        magnitude=mag;
        location=loc;
        date=dat;
        this.url=mUrl;
    }

}
