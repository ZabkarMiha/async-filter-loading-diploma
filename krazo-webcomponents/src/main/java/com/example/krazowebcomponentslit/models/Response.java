package com.example.krazowebcomponentslit.models;


import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Response implements Serializable {
    private String error;
    private Value value;
    private String status;

    public Response(String error, Value value, String status) {
        this.error = error;
        this.value = value;
        this.status = status;
    }

    public Response() {
    }

    public String isError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
