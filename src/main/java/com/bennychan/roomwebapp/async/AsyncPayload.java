package com.bennychan.roomwebapp.async;

public class AsyncPayload {
    private long Id;
    private String model;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
