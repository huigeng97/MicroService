package com.example.demo.helloworld;

public class HelloWorldBean {
    @Override
    public String toString() {
        return String.format("HelloWorldBean{" +
                "message='" + message + '\'' +
                '}');
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }


}
