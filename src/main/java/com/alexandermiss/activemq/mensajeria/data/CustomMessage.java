package com.alexandermiss.activemq.mensajeria.data;

import java.io.*;

public class CustomMessage implements Serializable {

    private Long Id;
    private String description;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{'id': "+ getId() + "'description': " + getDescription() + "}";
    }
}
