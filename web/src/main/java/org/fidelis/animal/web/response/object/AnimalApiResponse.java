/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fidelis.animal.web.response.object;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author user
 */
public class AnimalApiResponse {

    String status;
    Integer totalResults;

    public AnimalApiResponse() {
    }
    Collection<AnimalData> animals = new ArrayList();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Collection<AnimalData> getAnimals() {
        return animals;
    }

    public void setAnimals(Collection<AnimalData> animals) {
        this.animals = animals;
    }

}
