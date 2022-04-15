// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\Form.java.vsl) DO NOT EDIT!
package org.fidelis.animal.web.animal.add;

import java.util.Collection;
import java.util.Date;
import javax.faces.model.SelectItem;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>loadOptions</code> method, which is located on the
 * <code>org.fidelis.animal.web.animal.add.AddAnimalController</code> controller.
 *
 * TODO: Model Documentation for org.fidelis.animal.web.animal.add.AddAnimalController.loadOptions
 *
 * @see org.fidelis.animal.web.animal.add.AddAnimalController#loadOptions(LoadOptionsForm)
 */
public interface LoadOptionsForm
{
    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.dateOfBirth
     * @return dateOfBirth
     */
    public Date getDateOfBirth();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.dateOfBirth
     * @param dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.numberOfAnimals
     * @return numberOfAnimals
     */
    public Long getNumberOfAnimals();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.numberOfAnimals
     * @param numberOfAnimals
     */
    public void setNumberOfAnimals(Long numberOfAnimals);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.type
     * @return type
     */
    public String getType();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.type
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
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.breed
     * @return breed
     */
    public String getBreed();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.add.breed
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
    

}