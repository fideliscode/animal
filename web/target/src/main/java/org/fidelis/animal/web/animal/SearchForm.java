// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\Form.java.vsl) DO NOT EDIT!
package org.fidelis.animal.web.animal;

import java.util.Collection;
import java.util.Date;
import javax.faces.model.SelectItem;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>search</code> method, which is located on the
 * <code>org.fidelis.animal.web.animal.AnimalController</code> controller.
 *
 * TODO: Model Documentation for org.fidelis.animal.web.animal.AnimalController.search
 *
 * @see org.fidelis.animal.web.animal.AnimalController#search(SearchForm)
 */
public interface SearchForm
{
    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.type
     * @return type
     */
    public String getType();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.type
     * @param type
     */
    public void setType(String type);

    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getTypeBackingList();

    /**
     * @param typeBackingListIn
     */
    public void setTypeBackingList(Collection<SelectItem> typeBackingListIn);
    

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.startDate
     * @return startDate
     */
    public Date getStartDate();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.startDate
     * @param startDate
     */
    public void setStartDate(Date startDate);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.endDate
     * @return endDate
     */
    public Date getEndDate();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.endDate
     * @param endDate
     */
    public void setEndDate(Date endDate);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.limit
     * @return limit
     */
    public Long getLimit();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.limit
     * @param limit
     */
    public void setLimit(Long limit);

    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getLimitBackingList();

    /**
     * @param limitBackingListIn
     */
    public void setLimitBackingList(Collection<SelectItem> limitBackingListIn);
    

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.breed
     * @return breed
     */
    public String getBreed();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.breed
     * @param breed
     */
    public void setBreed(String breed);

    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getBreedBackingList();

    /**
     * @param breedBackingListIn
     */
    public void setBreedBackingList(Collection<SelectItem> breedBackingListIn);
    

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.animals
     * @return animals
     */
    public Collection getAnimals();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.animals
     * @param animals
     */
    public void setAnimals(Collection animals);

}