package com.example.campusconnect;

import java.util.Date;

public class Notification {
    private int notificationId;
    private String content;
    private Date date;

    public Notification(int notificationId, String content, Date date) {
        this.notificationId = notificationId;
        this.content = content;
        this.date = date;
    }
}
