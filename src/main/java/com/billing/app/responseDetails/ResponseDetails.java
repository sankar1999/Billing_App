package com.billing.app.responseDetails;

public class ResponseDetails {

    private Integer StatusCode;
    private String StatusMessage;
    private Errors errors;
    private Data data;

    public ResponseDetails() {
    }

    public ResponseDetails(Integer statusCode, String statusMessage) {
        StatusCode = statusCode;
        StatusMessage = statusMessage;
    }

    public ResponseDetails(Integer statusCode, String statusMessage, Errors errors, Data data) {
        StatusCode = statusCode;
        StatusMessage = statusMessage;
        this.errors = errors;
        this.data = data;
    }

    public ResponseDetails(Integer statusCode, String statusMessage, Data data) {
        StatusCode = statusCode;
        StatusMessage = statusMessage;
        this.data = data;
    }

    public Integer getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(Integer statusCode) {
        StatusCode = statusCode;
    }

    public String getStatusMessage() {
        return StatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        StatusMessage = statusMessage;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDetails{" +
                "StatusCode=" + StatusCode +
                ", StatusMessage='" + StatusMessage + '\'' +
                ", errors=" + errors +
                ", data=" + data +
                '}';
    }
}
