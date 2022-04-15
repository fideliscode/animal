package org.fidelis.animal.web.feed.add;

import java.util.Map;

/**
 * Provides the ability to populate any view in the Add Feed
 */
public final class AddFeedViewPopulator
{
    /**
     * Map fields from AddFeedSaveFormImpl form
     * to AddFeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AddFeedSaveFormImpl fromForm, AddFeedSaveFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
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
     * Map fields from AddFeedFormImpl form
     * to AddFeedSaveFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AddFeedFormImpl fromForm, AddFeedSaveFormImpl toForm)
    {
        if(fromForm.isTypeSet())
        {
            toForm.setType(fromForm.getType());
        }
        if(fromForm.getTypeBackingList() != null)
        {
            toForm.setTypeBackingList(fromForm.getTypeBackingList());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isNameSet())
        {
            toForm.setName(fromForm.getName());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isIntakeRateSet())
        {
            toForm.setIntakeRate(fromForm.getIntakeRate());
        }
        if(fromForm.isIntakeWeightSet())
        {
            toForm.setIntakeWeight(fromForm.getIntakeWeight());
        }
        if(fromForm.isCodeSet())
        {
            toForm.setCode(fromForm.getCode());
        }
    }

    /**
     * Populate page variables for view Add Feed
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateAddFeedPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof AddFeedSaveFormImpl)
        {
            final AddFeedSaveFormImpl sourceForm=(AddFeedSaveFormImpl)fromForm;
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
        }
        else if(fromForm instanceof AddFeedFormImpl)
        {
            final AddFeedFormImpl sourceForm=(AddFeedFormImpl)fromForm;
            if(sourceForm.isTypeSet())
            {
                pageVariables.put("type",sourceForm.getType());
            }
        }
    }

    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, AddFeedSaveFormImpl toForm)
    {
        if(fromForm instanceof AddFeedSaveFormImpl)
        {
            populateForm((AddFeedSaveFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AddFeedFormImpl)
        {
            populateForm((AddFeedFormImpl)fromForm,toForm);
        }
    }
    
}