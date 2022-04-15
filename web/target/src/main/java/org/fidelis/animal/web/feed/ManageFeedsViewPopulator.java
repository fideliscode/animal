package org.fidelis.animal.web.feed;

import java.util.Map;

/**
 * Provides the ability to populate any view in the Manage Feeds
 */
public final class ManageFeedsViewPopulator
{
    /**
     * Map fields from FeedsSearchFormImpl form
     * to FeedsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsSearchFormImpl fromForm, FeedsSearchFormImpl toForm)
    {
        if(fromForm.isFeedsSet())
        {
            toForm.setFeeds(fromForm.getFeeds());
        }
        if(fromForm.isLimitSet())
        {
            toForm.setLimit(fromForm.getLimit());
        }
        if(fromForm.getLimitBackingList() != null)
        {
            toForm.setLimitBackingList(fromForm.getLimitBackingList());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from FeedsDetailsFormImpl form
     * to FeedsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsDetailsFormImpl fromForm, FeedsSearchFormImpl toForm)
    {
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from FeedSaveFormImpl form
     * to FeedsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedSaveFormImpl fromForm, FeedsSearchFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
    }

    /**
     * Map fields from FeedAttachFormImpl form
     * to FeedsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedAttachFormImpl fromForm, FeedsSearchFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from ManageFeedsFormImpl form
     * to FeedsSearchFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageFeedsFormImpl fromForm, FeedsSearchFormImpl toForm)
    {
        if(fromForm.isFeedsSet())
        {
            toForm.setFeeds(fromForm.getFeeds());
        }
        if(fromForm.isLimitSet())
        {
            toForm.setLimit(fromForm.getLimit());
        }
        if(fromForm.getLimitBackingList() != null)
        {
            toForm.setLimitBackingList(fromForm.getLimitBackingList());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from FeedsSearchFormImpl form
     * to FeedsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsSearchFormImpl fromForm, FeedsDetailsFormImpl toForm)
    {
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from FeedsDetailsFormImpl form
     * to FeedsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsDetailsFormImpl fromForm, FeedsDetailsFormImpl toForm)
    {
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
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
     * Map fields from FeedSaveFormImpl form
     * to FeedsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedSaveFormImpl fromForm, FeedsDetailsFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
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
     * Map fields from FeedAttachFormImpl form
     * to FeedsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedAttachFormImpl fromForm, FeedsDetailsFormImpl toForm)
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
     * Map fields from ManageFeedsFormImpl form
     * to FeedsDetailsFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageFeedsFormImpl fromForm, FeedsDetailsFormImpl toForm)
    {
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
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
     * Populate page variables for view Feeds
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateFeedsPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof FeedsSearchFormImpl)
        {
            final FeedsSearchFormImpl sourceForm=(FeedsSearchFormImpl)fromForm;
            if(sourceForm.isFeedsSet())
            {
                pageVariables.put("feeds",sourceForm.getFeeds());
            }
            if(sourceForm.isLimitSet())
            {
                pageVariables.put("limit",sourceForm.getLimit());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
        }
        else if(fromForm instanceof FeedsDetailsFormImpl)
        {
            final FeedsDetailsFormImpl sourceForm=(FeedsDetailsFormImpl)fromForm;
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
        }
        else if(fromForm instanceof FeedSaveFormImpl)
        {
            final FeedSaveFormImpl sourceForm=(FeedSaveFormImpl)fromForm;
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
        }
        else if(fromForm instanceof ManageFeedsFormImpl)
        {
            final ManageFeedsFormImpl sourceForm=(ManageFeedsFormImpl)fromForm;
            if(sourceForm.isFeedsSet())
            {
                pageVariables.put("feeds",sourceForm.getFeeds());
            }
            if(sourceForm.isLimitSet())
            {
                pageVariables.put("limit",sourceForm.getLimit());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
        }
    }

    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, FeedsSearchFormImpl toForm)
    {
        if(fromForm instanceof FeedsSearchFormImpl)
        {
            populateForm((FeedsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedsDetailsFormImpl)
        {
            populateForm((FeedsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedSaveFormImpl)
        {
            populateForm((FeedSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedAttachFormImpl)
        {
            populateForm((FeedAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageFeedsFormImpl)
        {
            populateForm((ManageFeedsFormImpl)fromForm,toForm);
        }
    }
    
    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, FeedsDetailsFormImpl toForm)
    {
        if(fromForm instanceof FeedsSearchFormImpl)
        {
            populateForm((FeedsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedsDetailsFormImpl)
        {
            populateForm((FeedsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedSaveFormImpl)
        {
            populateForm((FeedSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedAttachFormImpl)
        {
            populateForm((FeedAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageFeedsFormImpl)
        {
            populateForm((ManageFeedsFormImpl)fromForm,toForm);
        }
    }
    
    /**
     * Map fields from FeedsSearchFormImpl form
     * to FeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsSearchFormImpl fromForm, FeedSaveFormImpl toForm)
    {
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from FeedsDetailsFormImpl form
     * to FeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsDetailsFormImpl fromForm, FeedSaveFormImpl toForm)
    {
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
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
     * Map fields from FeedSaveFormImpl form
     * to FeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedSaveFormImpl fromForm, FeedSaveFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
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
     * Map fields from FeedAttachFormImpl form
     * to FeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedAttachFormImpl fromForm, FeedSaveFormImpl toForm)
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
     * Map fields from ManageFeedsFormImpl form
     * to FeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageFeedsFormImpl fromForm, FeedSaveFormImpl toForm)
    {
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
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
     * Map fields from FeedsSearchFormImpl form
     * to FeedAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsSearchFormImpl fromForm, FeedAttachFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
    }

    /**
     * Map fields from FeedsDetailsFormImpl form
     * to FeedAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedsDetailsFormImpl fromForm, FeedAttachFormImpl toForm)
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
     * Map fields from FeedSaveFormImpl form
     * to FeedAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedSaveFormImpl fromForm, FeedAttachFormImpl toForm)
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
     * Map fields from FeedAttachFormImpl form
     * to FeedAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(FeedAttachFormImpl fromForm, FeedAttachFormImpl toForm)
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
     * Map fields from ManageFeedsFormImpl form
     * to FeedAttachFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(ManageFeedsFormImpl fromForm, FeedAttachFormImpl toForm)
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
     * Populate page variables for view Feed
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateFeedPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof FeedsSearchFormImpl)
        {
            final FeedsSearchFormImpl sourceForm=(FeedsSearchFormImpl)fromForm;
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
        }
        else if(fromForm instanceof FeedsDetailsFormImpl)
        {
            final FeedsDetailsFormImpl sourceForm=(FeedsDetailsFormImpl)fromForm;
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isDescriptionSet())
            {
                pageVariables.put("description",sourceForm.getDescription());
            }
            if(sourceForm.isIntakeWeightSet())
            {
                pageVariables.put("intakeWeight",sourceForm.getIntakeWeight());
            }
            if(sourceForm.isIntakeRateSet())
            {
                pageVariables.put("intakeRate",sourceForm.getIntakeRate());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
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
        else if(fromForm instanceof FeedSaveFormImpl)
        {
            final FeedSaveFormImpl sourceForm=(FeedSaveFormImpl)fromForm;
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isDescriptionSet())
            {
                pageVariables.put("description",sourceForm.getDescription());
            }
            if(sourceForm.isIntakeWeightSet())
            {
                pageVariables.put("intakeWeight",sourceForm.getIntakeWeight());
            }
            if(sourceForm.isIntakeRateSet())
            {
                pageVariables.put("intakeRate",sourceForm.getIntakeRate());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
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
        else if(fromForm instanceof FeedAttachFormImpl)
        {
            final FeedAttachFormImpl sourceForm=(FeedAttachFormImpl)fromForm;
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
        }
        else if(fromForm instanceof ManageFeedsFormImpl)
        {
            final ManageFeedsFormImpl sourceForm=(ManageFeedsFormImpl)fromForm;
            if(sourceForm.isNameSet())
            {
                pageVariables.put("name",sourceForm.getName());
            }
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
            if(sourceForm.isDescriptionSet())
            {
                pageVariables.put("description",sourceForm.getDescription());
            }
            if(sourceForm.isIntakeWeightSet())
            {
                pageVariables.put("intakeWeight",sourceForm.getIntakeWeight());
            }
            if(sourceForm.isIntakeRateSet())
            {
                pageVariables.put("intakeRate",sourceForm.getIntakeRate());
            }
            if(sourceForm.isCodeSet())
            {
                pageVariables.put("code",sourceForm.getCode());
            }
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
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
    public static void populateForm(Object fromForm, FeedSaveFormImpl toForm)
    {
        if(fromForm instanceof FeedsSearchFormImpl)
        {
            populateForm((FeedsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedsDetailsFormImpl)
        {
            populateForm((FeedsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedSaveFormImpl)
        {
            populateForm((FeedSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedAttachFormImpl)
        {
            populateForm((FeedAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageFeedsFormImpl)
        {
            populateForm((ManageFeedsFormImpl)fromForm,toForm);
        }
    }
    
    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, FeedAttachFormImpl toForm)
    {
        if(fromForm instanceof FeedsSearchFormImpl)
        {
            populateForm((FeedsSearchFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedsDetailsFormImpl)
        {
            populateForm((FeedsDetailsFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedSaveFormImpl)
        {
            populateForm((FeedSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof FeedAttachFormImpl)
        {
            populateForm((FeedAttachFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof ManageFeedsFormImpl)
        {
            populateForm((ManageFeedsFormImpl)fromForm,toForm);
        }
    }
    
}