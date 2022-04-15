// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::org.fidelis.animal::model::animal::AnimalService
 * STEREOTYPE:  Service
 */
package org.fidelis.animal.model.animal;

import java.util.Collection;
import java.util.Date;
import org.fidelis.animal.model.feed.Feed;

/**
 * @see org.fidelis.animal.model.animal.AnimalService
 */
public class AnimalServiceImpl
        extends AnimalServiceBase {

    /**
     * @see org.fidelis.animal.model.animal.AnimalService#search(String, Date,
     * Date, Long)
     */
    @Override
    protected Collection handleSearch(String type, Date startDate, Date endDate,
            String breed, Long limit) throws Exception {

        if (limit == null) {
            limit = 20L;
        }
        AnimalCriteria crt = new AnimalCriteria();
        crt.setBreed(breed);
        crt.setType(type);
        crt.setEndDate(endDate);
        crt.setStartDate(startDate);
        crt.setMaximumResultSize(limit.intValue());
        return getAnimalDao().findByCreteria(AnimalDao.TRANSFORM_ANIMALVO, crt);

    }

    /**
     * @see org.fidelis.animal.model.animal.AnimalService#loadAll()
     */
    @Override
    protected Collection handleLoadAll()
            throws Exception {
        return getAnimalDao().loadAll(AnimalDao.TRANSFORM_ANIMALVO);
    }

    /**
     * @see org.fidelis.animal.model.animal.AnimalService#loadById(Long)
     */
    @Override
    protected AnimalVO handleLoad(Long id)
            throws Exception {
        return (AnimalVO) getAnimalDao().load(AnimalDao.TRANSFORM_ANIMALVO, id);
    }

    @Override
    protected Long handleAdd(String type, Date dateOfBirth, Long feed,
            String breed) throws Exception {
        Animal animal = Animal.Factory.newInstance(AnimalType.fromString(type.toUpperCase().replace(" ", "_")), dateOfBirth);
        animal.setBreed(AnimalBreed.fromString(breed.toUpperCase().replace(" ", "_")));
        if (feed != null) {
            Feed feedEntity = getFeedDao().load(feed);
            animal.setFeed(feedEntity);
        }
        getAnimalDao().create(animal);
        return animal.getId();
    }

    @Override
    protected void handleUpdate(Long id, Date dateOfBirth, String type,
            Long feed, String breed) throws Exception {
        Animal animal = getAnimalDao().load(id);
        animal.setDateOfBirth(dateOfBirth);
         animal.setBreed(AnimalBreed.fromString(breed.toUpperCase().replace(" ", "_")));
       
        if (feed != null) {
            Feed feedEntity = getFeedDao().load(feed);
            animal.setFeed(feedEntity);
        }
        animal.setType(AnimalType.fromString(type.toUpperCase().replace(" ", "_")));
        getAnimalDao().update(animal);
    }

}
