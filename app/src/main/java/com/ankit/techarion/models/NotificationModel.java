package com.ankit.techarion.models;

public class NotificationModel {

    private String notificationText;
    private String userImg;

    public NotificationModel(String notificationText, String userImg) {
        this.notificationText = notificationText;
        this.userImg = userImg;
    }

    public NotificationModel() {
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }
}
