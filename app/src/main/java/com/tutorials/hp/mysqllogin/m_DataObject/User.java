package com.tutorials.hp.mysqllogin.m_DataObject;

/**
 * Created by Oclemy on 6/9/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class User {

    String usernameOrEmail,password;

    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
