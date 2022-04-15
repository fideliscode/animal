/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fidelis.animal.web.response.object;

/**
 *
 * @author user
 */
public class FeedData {

    String id, code, name, intakeWeight, intakeRate, description;

    public FeedData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntakeWeight() {
        return intakeWeight;
    }

    public void setIntakeWeight(String intakeWeight) {
        this.intakeWeight = intakeWeight;
    }

    public String getIntakeRate() {
        return intakeRate;
    }

    public void setIntakeRate(String intakeRate) {
        this.intakeRate = intakeRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
