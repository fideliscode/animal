package org.fidelis.animal.web.animal.add;

import java.util.Map;

/**
 * Provides the ability to populate any view in the Add Animal
 */
public final class AddAnimalViewPopulator
{
    /**
     * Map fields from AddAnimalSaveFormImpl form
     * to AddAnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AddAnimalSaveFormImpl fromForm, AddAnimalSaveFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isDateOfBirthSet())
        {
            toForm.setDateOfBirth(fromForm.getDateOfBirth());
        }
        if(fromForm.isNumberOfAnimalsSet())
        {
            toForm.setNumberOfAnimals(fromForm.getNumberOfAnimals());
        }
        if(fromForm.isBreedSet())
        {
            toForm.setBreed(fromForm.getBreed());
        }
        if(fromForm.getBreedBackingList() != null)
        {
            toForm.setBreedBackingList(fromForm.getBreedBackingList());
        }
    }

    /**
     * Map fields from AddAnimalFormImpl form
     * to AddAnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AddAnimalFormImpl fromForm, AddAnimalSaveFormImpl toForm)
    {
        if(fromForm.isDateOfBirthSet())
        {
            toForm.setDateOfBirth(fromForm.getDateOfBirth());
        }
        if(fromForm.isNumberOfAnimalsSet())
        {
            toForm.setNumberOfAnimals(fromForm.getNumberOfAnimals());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isBreedSet())
        {
            toForm.setBreed(fromForm.getBreed());
        }
        if(fromForm.getBreedBackingList() != null)
        {
            toForm.setBreedBackingList(fromForm.getBreedBackingList());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Populate page variables for view Add Animal
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateAddAnimalPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof AddAnimalSaveFormImpl)
        {
            final AddAnimalSaveFormImpl sourceForm=(AddAnimalSaveFormImpl)fromForm;
            if(sourceForm.isDateOfBirthSet())
            {
                pageVariables.put("dateOfBirth",sourceForm.getDateOfBirth());
            }
            if(sourceForm.isNumberOfAnimalsSet())
            {
                pageVariables.put("numberOfAnimals",sourceForm.getNumberOfAnimals());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
        }
        else if(fromForm instanceof AddAnimalFormImpl)
        {
            final AddAnimalFormImpl sourceForm=(AddAnimalFormImpl)fromForm;
            if(sourceForm.isDateOfBirthSet())
            {
                pageVariables.put("dateOfBirth",sourceForm.getDateOfBirth());
            }
            if(sourceForm.isNumberOfAnimalsSet())
            {
                pageVariables.put("numberOfAnimals",sourceForm.getNumberOfAnimals());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
        }
    }

    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, AddAnimalSaveFormImpl toForm)
    {
        if(fromForm instanceof AddAnimalSaveFormImpl)
        {
            populateForm((AddAnimalSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AddAnimalFormImpl)
        {
            populateForm((AddAnimalFormImpl)fromForm,toForm);
        }
    }
    
}