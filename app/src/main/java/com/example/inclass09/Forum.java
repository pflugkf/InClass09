package com.example.inclass09;

/**
 * Assignment #: InClass09
 * File Name: InClass09 Forum.java
 * Full Name: Kristin Pflug
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Forum {

    String title;
    String author;
    String description;
    String timeCreated;
    String userID;
    String forumID;


    public Forum() {
        this.title = "Forum Title";
        this.author = "Forum Author";
        this.description = "Forum description";
        this.timeCreated = new SimpleDateFormat().format(new Date());
        this.userID = "1";
        this.forumID = "0";
    }

    public Forum(String title, String author, String description, String timeCreated, String userID, String forumID) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.timeCreated = timeCreated;
        this.userID = userID;
        this.forumID = forumID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getForumID() {
        return forumID;
    }

    public void setForumID(String forumID) {
        this.forumID = forumID;
    }
}
