package com.example.myApp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "otherdata")
public class ExModel {

    @Id
    private UUID exId;
    private String exCity;
    public ExModel() {
        this.exId = UUID.randomUUID();
    }
    //PARAMETERIZED CONSTRUCTOR
    public ExModel(UUID exId, String exCity) {
        this.exId = exId;
        this.exCity = exCity;
    }

    //DEFAULT CONSTRUCTOR


    //GETTERS AND SETTERS
    public UUID getExId() {
        return exId;
    }
    public void setExId(UUID exId) {
        this.exId = exId;
    }
    public String getExCity() {
        return exCity;
    }
    public void setExCity(String exCity) {
        this.exCity = exCity;
    }

    @Override
    public String toString() {
        return "ExModel{" +
                "exId='" + exId + '\'' +
                ", exCity='" + exCity + '\'' +
                '}';
    }

}
