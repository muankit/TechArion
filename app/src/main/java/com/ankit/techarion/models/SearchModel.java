package com.ankit.techarion.models;

public class SearchModel {
    private String usrImg;
    private String userName;
    private String mainText;
    private String likeImg1, likeImg2, likeImg3;
    private String likeCount;
    private String commentCount;
    private String cardColor;

    public SearchModel() {
    }

    public SearchModel(String usrImg, String userName, String mainText, String likeImg1, String likeImg2, String likeImg3, String likeCount, String commentCount, String cardColor) {
        this.usrImg = usrImg;
        this.userName = userName;
        this.mainText = mainText;
        this.likeImg1 = likeImg1;
        this.likeImg2 = likeImg2;
        this.likeImg3 = likeImg3;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.cardColor = cardColor;
    }

    public String getUsrImg() {
        return usrImg;
    }

    public void setUsrImg(String usrImg) {
        this.usrImg = usrImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
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

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }
}
