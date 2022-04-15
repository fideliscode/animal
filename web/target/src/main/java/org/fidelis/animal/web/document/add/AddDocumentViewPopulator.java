package org.fidelis.animal.web.document.add;

import java.util.Map;

/**
 * Provides the ability to populate any view in the Add Document
 */
public final class AddDocumentViewPopulator
{
    /**
     * Map fields from AddDocumentUploadFormImpl form
     * to AddDocumentUploadFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AddDocumentUploadFormImpl fromForm, AddDocumentUploadFormImpl toForm)
    {
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isDocumentTypeSet())
        {
            toForm.setDocumentType(fromForm.getDocumentType());
        }
        if(fromForm.getDocumentTypeBackingList() != null)
        {
            toForm.setDocumentTypeBackingList(fromForm.getDocumentTypeBackingList());
        }
        if(fromForm.isReferenceSet())
        {
            toForm.setReference(fromForm.getReference());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isDocumentSet())
        {
            toForm.setDocument(fromForm.getDocument());
        }
    }

    /**
     * Map fields from AddDocumentFormImpl form
     * to AddDocumentUploadFormImpl form
     *
     * @param fromForm origin form
     * @param toForm destiny form
     */
    public static void populateForm(AddDocumentFormImpl fromForm, AddDocumentUploadFormImpl toForm)
    {
        if(fromForm.isRecordTypeSet())
        {
            toForm.setRecordType(fromForm.getRecordType());
        }
        if(fromForm.isReferenceSet())
        {
            toForm.setReference(fromForm.getReference());
        }
        if(fromForm.isIdSet())
        {
            toForm.setId(fromForm.getId());
        }
        if(fromForm.isDocumentTypeSet())
        {
            toForm.setDocumentType(fromForm.getDocumentType());
        }
        if(fromForm.getDocumentTypeBackingList() != null)
        {
            toForm.setDocumentTypeBackingList(fromForm.getDocumentTypeBackingList());
        }
        if(fromForm.isDescriptionSet())
        {
            toForm.setDescription(fromForm.getDescription());
        }
        if(fromForm.isDocumentSet())
        {
            toForm.setDocument(fromForm.getDocument());
        }
    }

    /**
     * Populate page variables for view Add Document
     *
     * @param fromForm origin form
     * @param pageVariables the page variables
     */
    public static void populateAddDocumentPageVariables(Object fromForm, Map<String,Object> pageVariables)
    {
        if(fromForm instanceof AddDocumentUploadFormImpl)
        {
            final AddDocumentUploadFormImpl sourceForm=(AddDocumentUploadFormImpl)fromForm;
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
            if(sourceForm.isReferenceSet())
            {
                pageVariables.put("reference",sourceForm.getReference());
            }
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isDocumentTypeSet())
            {
                pageVariables.put("documentType",sourceForm.getDocumentType());
            }
        }
        else if(fromForm instanceof AddDocumentFormImpl)
        {
            final AddDocumentFormImpl sourceForm=(AddDocumentFormImpl)fromForm;
            if(sourceForm.isRecordTypeSet())
            {
                pageVariables.put("recordType",sourceForm.getRecordType());
            }
            if(sourceForm.isReferenceSet())
            {
                pageVariables.put("reference",sourceForm.getReference());
            }
            if(sourceForm.isIdSet())
            {
                pageVariables.put("id",sourceForm.getId());
            }
            if(sourceForm.isDocumentTypeSet())
            {
                pageVariables.put("documentType",sourceForm.getDocumentType());
            }
        }
    }

    /**
     * Populates the view using the appropriate view populator.
     *
     * @param fromForm the origin form
     * @param toForm the destiny form
     */
    public static void populateForm(Object fromForm, AddDocumentUploadFormImpl toForm)
    {
        if(fromForm instanceof AddDocumentUploadFormImpl)
        {
            populateForm((AddDocumentUploadFormImpl)fromForm,toForm);
        }
        else if(fromForm instanceof AddDocumentFormImpl)
        {
            populateForm((AddDocumentFormImpl)fromForm,toForm);
        }
    }
    
}