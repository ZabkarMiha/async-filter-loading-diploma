package com.example.krazowebcomponentslit.models;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.json.bind.annotation.JsonbProperty;
import java.io.Serializable;


@Named
@SessionScoped
public class Filter implements Serializable {
    @JsonbProperty("text")
    private String text;
    @JsonbProperty("value")
    private String value;
    @JsonbProperty("id")
    private String id;
    @JsonbProperty("frequency")
    private int frequency;

    public Filter(String text, String value, String id, int frequency) {
        this.text = text;
        this.value = value;
        this.id = id;
        this.frequency = frequency;
    }

    public Filter() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}