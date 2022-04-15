// license-header java merge-point
//
/**
 * @author Generated by Service.vsl in andromda-java-cartridge on 04/03/2022 18:05:32+0300 Do not modify by hand!
 *
 * TEMPLATE:     Service.vsl in andromda-java-cartridge.
 * MODEL CLASS:  AndroMDAModel::org.fidelis.animal::model::animal::AnimalService
 * STEREOTYPE:   Service
 */
package org.fidelis.animal.model.animal;

import java.util.Collection;
import java.util.Date;

/**
 * TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService
 */
public interface AnimalService
{
    /**
     * TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.search
     * @param type TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.search(type)
     * @param startDate TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.search(startDate)
     * @param endDate TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.search(endDate)
     * @param breed TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.search(breed)
     * @param limit TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.search(limit)
     * @return Collection
     */
    public Collection search(String type, Date startDate, Date endDate, String breed, Long limit);

    /**
     * TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.loadAll
     * @return Collection
     */
    public Collection loadAll();

    /**
     * TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.load
     * @param id TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.load(id)
     * @return AnimalVO
     */
    public AnimalVO load(Long id);

    /**
     * TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.add
     * @param type TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.add(type)
     * @param dateOfBirth TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.add(dateOfBirth)
     * @param feed TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.add(feed)
     * @param breed TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.add(breed)
     * @return Long
     */
    public Long add(String type, Date dateOfBirth, Long feed, String breed);

    /**
     * TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.update
     * @param id TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.update(id)
     * @param dateOfBirth TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.update(dateOfBirth)
     * @param type TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.update(type)
     * @param feed TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.update(feed)
     * @param breed TODO: Model Documentation for org.fidelis.animal.model.animal.AnimalService.update(breed)
     */
    public void update(Long id, Date dateOfBirth, String type, Long feed, String breed);

}