package com.example.myApp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;
import java.util.UUID;

@Document(collection = "testCollection1")
public class Demo {

    @Id
    private UUID demoId;
    private UUID exid;
    private String demoName;
    private String demoRoll;
   // private List<ExModel> exList;

    public Demo() {
            this.demoId = UUID.randomUUID();
    }

    public Demo(UUID demoId, UUID exid, String demoName, String demoRoll) {
        this.demoId = demoId;
        this.exid = exid;
        this.demoName = demoName;
        this.demoRoll = demoRoll;
    }

    public UUID getDemoId() {
        return demoId;
    }

    public void setDemoId(UUID demoId) {
        this.demoId = demoId;
    }

    public UUID getExid() {
        return exid;
    }

    public void setExid(UUID exid) {
        this.exid = exid;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoRoll() {
        return demoRoll;
    }

    public void setDemoRoll(String demoRoll) {
        this.demoRoll = demoRoll;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "demoId=" + demoId +
                ", exid=" + exid +
                ", demoName='" + demoName + '\'' +
                ", demoRoll='" + demoRoll + '\'' +
                '}';
    }
}
