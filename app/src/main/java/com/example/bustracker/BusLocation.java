package com.example.bustracker;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;
import com.google.firebase.firestore.auth.User;

import java.util.Date;

public class BusLocation {
    private User user;
    private GeoPoint geo_point;
    private @ServerTimestamp
    Date timestamp;

    public BusLocation(User user, GeoPoint geo_point, Date timestamp) {
        this.user = user;
        this.geo_point = geo_point;
        this.timestamp = timestamp;
    }

    public BusLocation() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GeoPoint getGeo_point() {
        return geo_point;
    }

    public void setGeo_point(GeoPoint geo_point) {
        this.geo_point = geo_point;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "BusLocation{" +
                "user=" + user +
                ", geo_point=" + geo_point +
                ", timestamp=" + timestamp +
                '}';
    }

}
