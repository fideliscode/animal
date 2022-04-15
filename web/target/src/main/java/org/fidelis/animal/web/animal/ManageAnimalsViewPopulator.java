package org.fidelis.animal.web.animal;

import java.util.Map;

/**
 * Provides the ability to populate any view in the Manage Animals
 */
public final class ManageAnimalsViewPopulator
{
    /**
     * Map fields from AnimalsSearchFormImpl form
     * to AnimalsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsSearchFormImpl fromForm, AnimalsSearchFormImpl toForm)
    {
        if(fromForm.isAnimalsSet())
        {
            toForm.setAnimals(fromForm.getAnimals());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isStartDateSet())
        {
            toForm.setStartDate(fromForm.getStartDate());
        }
        if(fromForm.isEndDateSet())
        {
            toForm.setEndDate(fromForm.getEndDate());
        }
        if(fromForm.isLimitSet())
        {
            toForm.setLimit(fromForm.getLimit());
        }
        if(fromForm.getLimitBackingList() != null)
        {
            toForm.setLimitBackingList(fromForm.getLimitBackingList());
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
     * Map fields from AnimalsDetailsFormImpl form
     * to AnimalsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsDetailsFormImpl fromForm, AnimalsSearchFormImpl toForm)
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
     * Map fields from AnimalSaveFormImpl form
     * to AnimalsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalSaveFormImpl fromForm, AnimalsSearchFormImpl toForm)
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
     * Map fields from AnimalAttachFormImpl form
     * to AnimalsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalAttachFormImpl fromForm, AnimalsSearchFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from ManageAnimalsFormImpl form
     * to AnimalsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageAnimalsFormImpl fromForm, AnimalsSearchFormImpl toForm)
    {
        if(fromForm.isAnimalsSet())
        {
            toForm.setAnimals(fromForm.getAnimals());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isStartDateSet())
        {
            toForm.setStartDate(fromForm.getStartDate());
        }
        if(fromForm.isEndDateSet())
        {
            toForm.setEndDate(fromForm.getEndDate());
        }
        if(fromForm.isLimitSet())
        {
            toForm.setLimit(fromForm.getLimit());
        }
        if(fromForm.getLimitBackingList() != null)
        {
            toForm.setLimitBackingList(fromForm.getLimitBackingList());
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
     * Map fields from AnimalsSearchFormImpl form
     * to AnimalsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsSearchFormImpl fromForm, AnimalsDetailsFormImpl toForm)
    {
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
     * Map fields from AnimalsDetailsFormImpl form
     * to AnimalsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsDetailsFormImpl fromForm, AnimalsDetailsFormImpl toForm)
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
        if(fromForm.isBreedSet())
        {
            toForm.setBreed(fromForm.getBreed());
        }
        if(fromForm.getBreedBackingList() != null)
        {
            toForm.setBreedBackingList(fromForm.getBreedBackingList());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentsSet())
        {
            toForm.setDocuments(fromForm.getDocuments());
        }
    }

    /**
     * Map fields from AnimalSaveFormImpl form
     * to AnimalsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalSaveFormImpl fromForm, AnimalsDetailsFormImpl toForm)
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
        if(fromForm.isBreedSet())
        {
            toForm.setBreed(fromForm.getBreed());
        }
        if(fromForm.getBreedBackingList() != null)
        {
            toForm.setBreedBackingList(fromForm.getBreedBackingList());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentsSet())
        {
            toForm.setDocuments(fromForm.getDocuments());
        }
    }

    /**
     * Map fields from AnimalAttachFormImpl form
     * to AnimalsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalAttachFormImpl fromForm, AnimalsDetailsFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
    }

    /**
     * Map fields from ManageAnimalsFormImpl form
     * to AnimalsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageAnimalsFormImpl fromForm, AnimalsDetailsFormImpl toForm)
    {
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
        if(fromForm.isDateOfBirthSet())
        {
            toForm.setDateOfBirth(fromForm.getDateOfBirth());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentsSet())
        {
            toForm.setDocuments(fromForm.getDocuments());
        }
    }

    /**
     * Populate page variables for view Animals
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateAnimalsPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof AnimalsSearchFormImpl)
        {
            final AnimalsSearchFormImpl sourceForm=(AnimalsSearchFormImpl)fromForm;
            if(sourceForm.isAnimalsSet())
            {
                pageVariables.put("animals",sourceForm.getAnimals());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isStartDateSet())
            {
                pageVariables.put("startDate",sourceForm.getStartDate());
            }
            if(sourceForm.isEndDateSet())
            {
                pageVariables.put("endDate",sourceForm.getEndDate());
            }
            if(sourceForm.isLimitSet())
            {
                pageVariables.put("limit",sourceForm.getLimit());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
        }
        else if(fromForm instanceof AnimalsDetailsFormImpl)
        {
            final AnimalsDetailsFormImpl sourceForm=(AnimalsDetailsFormImpl)fromForm;
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
        }
        else if(fromForm instanceof AnimalSaveFormImpl)
        {
            final AnimalSaveFormImpl sourceForm=(AnimalSaveFormImpl)fromForm;
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
        }
        else if(fromForm instanceof ManageAnimalsFormImpl)
        {
            final ManageAnimalsFormImpl sourceForm=(ManageAnimalsFormImpl)fromForm;
            if(sourceForm.isAnimalsSet())
            {
                pageVariables.put("animals",sourceForm.getAnimals());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isStartDateSet())
            {
                pageVariables.put("startDate",sourceForm.getStartDate());
            }
            if(sourceForm.isEndDateSet())
            {
                pageVariables.put("endDate",sourceForm.getEndDate());
            }
            if(sourceForm.isLimitSet())
            {
                pageVariables.put("limit",sourceForm.getLimit());
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
    public static void populateForm(Object fromForm, AnimalsSearchFormImpl toForm)
    {
        if(fromForm instanceof AnimalsSearchFormImpl)
        {
            populateForm((AnimalsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalsDetailsFormImpl)
        {
            populateForm((AnimalsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalSaveFormImpl)
        {
            populateForm((AnimalSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalAttachFormImpl)
        {
            populateForm((AnimalAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageAnimalsFormImpl)
        {
            populateForm((ManageAnimalsFormImpl)fromForm,toForm);
        }
    }
    
    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, AnimalsDetailsFormImpl toForm)
    {
        if(fromForm instanceof AnimalsSearchFormImpl)
        {
            populateForm((AnimalsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalsDetailsFormImpl)
        {
            populateForm((AnimalsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalSaveFormImpl)
        {
            populateForm((AnimalSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalAttachFormImpl)
        {
            populateForm((AnimalAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageAnimalsFormImpl)
        {
            populateForm((ManageAnimalsFormImpl)fromForm,toForm);
        }
    }
    
    /**
     * Map fields from AnimalsSearchFormImpl form
     * to AnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsSearchFormImpl fromForm, AnimalSaveFormImpl toForm)
    {
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
     * Map fields from AnimalsDetailsFormImpl form
     * to AnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsDetailsFormImpl fromForm, AnimalSaveFormImpl toForm)
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
        if(fromForm.isBreedSet())
        {
            toForm.setBreed(fromForm.getBreed());
        }
        if(fromForm.getBreedBackingList() != null)
        {
            toForm.setBreedBackingList(fromForm.getBreedBackingList());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentsSet())
        {
            toForm.setDocuments(fromForm.getDocuments());
        }
    }

    /**
     * Map fields from AnimalSaveFormImpl form
     * to AnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalSaveFormImpl fromForm, AnimalSaveFormImpl toForm)
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
        if(fromForm.isBreedSet())
        {
            toForm.setBreed(fromForm.getBreed());
        }
        if(fromForm.getBreedBackingList() != null)
        {
            toForm.setBreedBackingList(fromForm.getBreedBackingList());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentsSet())
        {
            toForm.setDocuments(fromForm.getDocuments());
        }
    }

    /**
     * Map fields from AnimalAttachFormImpl form
     * to AnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalAttachFormImpl fromForm, AnimalSaveFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
    }

    /**
     * Map fields from ManageAnimalsFormImpl form
     * to AnimalSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageAnimalsFormImpl fromForm, AnimalSaveFormImpl toForm)
    {
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
        if(fromForm.isDateOfBirthSet())
        {
            toForm.setDateOfBirth(fromForm.getDateOfBirth());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentsSet())
        {
            toForm.setDocuments(fromForm.getDocuments());
        }
    }

    /**
     * Map fields from AnimalsSearchFormImpl form
     * to AnimalAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsSearchFormImpl fromForm, AnimalAttachFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from AnimalsDetailsFormImpl form
     * to AnimalAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalsDetailsFormImpl fromForm, AnimalAttachFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
    }

    /**
     * Map fields from AnimalSaveFormImpl form
     * to AnimalAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalSaveFormImpl fromForm, AnimalAttachFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
    }

    /**
     * Map fields from AnimalAttachFormImpl form
     * to AnimalAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AnimalAttachFormImpl fromForm, AnimalAttachFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
    }

    /**
     * Map fields from ManageAnimalsFormImpl form
     * to AnimalAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageAnimalsFormImpl fromForm, AnimalAttachFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
    }

    /**
     * Populate page variables for view Animal
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateAnimalPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof AnimalsSearchFormImpl)
        {
            final AnimalsSearchFormImpl sourceForm=(AnimalsSearchFormImpl)fromForm;
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
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
        else if(fromForm instanceof AnimalsDetailsFormImpl)
        {
            final AnimalsDetailsFormImpl sourceForm=(AnimalsDetailsFormImpl)fromForm;
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isDateOfBirthSet())
            {
                pageVariables.put("dateOfBirth",sourceForm.getDateOfBirth());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
            if(sourceForm.isDocumentsSet())
            {
                pageVariables.put("documents",sourceForm.getDocuments());
            }
        }
        else if(fromForm instanceof AnimalSaveFormImpl)
        {
            final AnimalSaveFormImpl sourceForm=(AnimalSaveFormImpl)fromForm;
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isDateOfBirthSet())
            {
                pageVariables.put("dateOfBirth",sourceForm.getDateOfBirth());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
            if(sourceForm.isDocumentsSet())
            {
                pageVariables.put("documents",sourceForm.getDocuments());
            }
        }
        else if(fromForm instanceof AnimalAttachFormImpl)
        {
            final AnimalAttachFormImpl sourceForm=(AnimalAttachFormImpl)fromForm;
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
        }
        else if(fromForm instanceof ManageAnimalsFormImpl)
        {
            final ManageAnimalsFormImpl sourceForm=(ManageAnimalsFormImpl)fromForm;
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isDateOfBirthSet())
            {
                pageVariables.put("dateOfBirth",sourceForm.getDateOfBirth());
            }
            if(sourceForm.isBreedSet())
            {
                pageVariables.put("breed",sourceForm.getBreed());
            }
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
            if(sourceForm.isDocumentsSet())
            {
                pageVariables.put("documents",sourceForm.getDocuments());
            }
        }
    }

    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, AnimalSaveFormImpl toForm)
    {
        if(fromForm instanceof AnimalsSearchFormImpl)
        {
            populateForm((AnimalsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalsDetailsFormImpl)
        {
            populateForm((AnimalsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalSaveFormImpl)
        {
            populateForm((AnimalSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalAttachFormImpl)
        {
            populateForm((AnimalAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageAnimalsFormImpl)
        {
            populateForm((ManageAnimalsFormImpl)fromForm,toForm);
        }
    }
    
    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, AnimalAttachFormImpl toForm)
    {
        if(fromForm instanceof AnimalsSearchFormImpl)
        {
            populateForm((AnimalsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalsDetailsFormImpl)
        {
            populateForm((AnimalsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalSaveFormImpl)
        {
            populateForm((AnimalSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AnimalAttachFormImpl)
        {
            populateForm((AnimalAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageAnimalsFormImpl)
        {
            populateForm((ManageAnimalsFormImpl)fromForm,toForm);
        }
    }
    
}