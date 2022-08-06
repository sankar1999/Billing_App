package com.billing.app.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "User")
@Table
public class User {

    @Id
    @SequenceGenerator(name="user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name="id", updatable = false)
    private Long ID;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "email_id", nullable = false, columnDefinition = "TEXT")
    private String emailID;

    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String password;

    @Column(name = "gender", nullable = false, columnDefinition = "TEXT")
    private String Gender;

    @Column(name = "dob", nullable = false, columnDefinition = "DATE")
    private LocalDate DOB;

    @Column(name = "terms_flag", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean termsFlag;

    @Column(name = "mobile_no", nullable = false, columnDefinition = "INTEGER")
    private Integer mobileNo;

    @Column(name = "nationality", nullable = false, columnDefinition = "TEXT")
    private String nationality;

    public User() {
    }

    public User(String firstName, String lastName, String emailID, String password, String gender, LocalDate DOB, Boolean termsFlag, Integer mobileNo, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.password = password;
        Gender = gender;
        this.DOB = DOB;
        this.termsFlag = termsFlag;
        this.mobileNo = mobileNo;
        this.nationality = nationality;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Boolean getTermsFlag() {
        return termsFlag;
    }

    public void setTermsFlag(Boolean termsFlag) {
        this.termsFlag = termsFlag;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailID='" + emailID + '\'' +
                ", password='" + password + '\'' +
                ", Gender='" + Gender + '\'' +
                ", DOB=" + DOB +
                ", termsFlag=" + termsFlag +
                ", mobileNo=" + mobileNo +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
