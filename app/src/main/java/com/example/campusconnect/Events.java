package com.example.campusconnect;

import java.util.Date;

public class Events {
    private int eventId;
    private String eventName;
    private Date date;

    public Events(int eventId, String eventName, Date date) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
    }
}
