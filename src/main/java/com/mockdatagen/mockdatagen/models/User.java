package com.mockdatagen.mockdatagen.models;


public class User {

    private  String name;
    private  String email;
    private String userName;

    public User(){

    }


    public User(String name, String email, String userName) {
        this.name = name;
        this.email = email;
        this.userName = userName;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmails(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


@Override
public String toString() {
    return "User{name='" + name + "', email='" + email + "', username='" + userName + "'}";
}

}
