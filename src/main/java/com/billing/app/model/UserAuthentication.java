package com.billing.app.model;

import javax.persistence.*;

@Table
@Entity(name = "user_authentication")
public class UserAuthentication {

    @Id
    @SequenceGenerator(name="user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name="id", updatable = false)
    private Long ID;

    @Column(name = "email_id", nullable = false, columnDefinition = "TEXT")
    private String emailID;

    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String password;

    public UserAuthentication() {
    }

    public UserAuthentication(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAuthentication{" +
                "ID=" + ID +
                ", emailID='" + emailID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
