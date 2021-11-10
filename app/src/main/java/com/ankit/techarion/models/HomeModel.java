package com.ankit.techarion.models;

public class HomeModel {

    private String username1, username2, userImg1, usrImg2;
    private String mainText;
    private String likeCount;
    private String description;
    private String cardColor;
    private String likeImg1, likeImg2, likeImg3;

    public HomeModel() {
    }

    public HomeModel(String username1, String username2, String userImg1, String usrImg2, String mainText, String likeCount, String description, String cardColor, String likeImg1, String likeImg2, String likeImg3) {
        this.username1 = username1;
        this.username2 = username2;
        this.userImg1 = userImg1;
        this.usrImg2 = usrImg2;
        this.mainText = mainText;
        this.likeCount = likeCount;
        this.description = description;
        this.cardColor = cardColor;
        this.likeImg1 = likeImg1;
        this.likeImg2 = likeImg2;
        this.likeImg3 = likeImg3;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getUserImg1() {
        return userImg1;
    }

    public void setUserImg1(String userImg1) {
        this.userImg1 = userImg1;
    }

    public String getUsrImg2() {
        return usrImg2;
    }

    public void setUsrImg2(String usrImg2) {
        this.usrImg2 = usrImg2;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getLikeImg1() {
        return likeImg1;
    }

    public void setLikeImg1(String likeImg1) {
        this.likeImg1 = likeImg1;
    }

    public String getLikeImg2() {
        return likeImg2;
    }

    public void setLikeImg2(String likeImg2) {
        this.likeImg2 = likeImg2;
    }

    public String getLikeImg3() {
        return likeImg3;
    }

    public void setLikeImg3(String likeImg3) {
        this.likeImg3 = likeImg3;
    }
}

