package com.macmie.devops.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="user")
public class User {

    @DynamoDBHashKey(attributeName = "user_id")
    private Integer userID;

    @DynamoDBAttribute(attributeName = "user_name")
    private String userName;

    @DynamoDBAttribute(attributeName = "user_email")
    private String userEmail;

    @DynamoDBAttribute(attributeName = "user_password")
    private String userPassword;

    @DynamoDBAttribute(attributeName = "content_id")
    private Integer userContentId;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserContentId() {
        return userContentId;
    }

    public void setUserContentId(Integer userContentId) {
        this.userContentId = userContentId;
    }

    public User(Integer userID, String userName, String userEmail, String userPassword, Integer userContentId) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userContentId = userContentId;
    }
}

