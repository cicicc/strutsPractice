package com.afeng.domain;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * CREATE TABLE `user` (
     *   `uid` varchar(32) NOT NULL,
     *   `username` varchar(20) DEFAULT NULL,
     *   `password` varchar(20) DEFAULT NULL,
     *   `name` varchar(20) DEFAULT NULL,
     *   PRIMARY KEY (`uid`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     */
    private String uid;
    private String username;
    private String password;
    private String name;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
