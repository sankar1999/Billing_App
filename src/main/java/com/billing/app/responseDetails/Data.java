package com.billing.app.responseDetails;

public class Data {

    private String Token;

    public Data() {
    }

    public Data(String token) {
        Token = token;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Token='" + Token + '\'' +
                '}';
    }
}
