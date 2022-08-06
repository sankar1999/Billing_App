package com.billing.app.responseDetails;

public class Errors {

    private Integer ErrorName;
    private String ErrorMessage;

    public Errors() {
    }

    public Errors(Integer errorName, String errorMessage) {
        ErrorName = errorName;
        ErrorMessage = errorMessage;
    }

    public Integer getErrorName() {
        return ErrorName;
    }

    public void setErrorName(Integer errorName) {
        ErrorName = errorName;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Errors{" +
                "ErrorName=" + ErrorName +
                ", ErrorMessage='" + ErrorMessage + '\'' +
                '}';
    }
}
