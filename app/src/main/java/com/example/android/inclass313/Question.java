package com.example.android.inclass313;

public class Question {
    public int location;
    public int question;
    public int photoId;
    public boolean isTrue;

    public int getLocation() {
        return location;
    }

    public int getQuestion() {
        return question;
    }

    public int getPhotoId() {
        return photoId;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public Question(int location, int question, int photoId, boolean isTrue) {
        this.location = location;
        this.question = question;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }
}