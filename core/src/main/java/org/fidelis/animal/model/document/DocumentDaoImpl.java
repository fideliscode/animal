// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on 04/02/2022 15:34:54+0300.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.fidelis.animal.model.document;

import java.util.Calendar;

/**
 * @see Document
 */
public class DocumentDaoImpl
    extends DocumentDaoBase
{
    /**
     * {@inheritDoc}
     */
    @Override
    public void toDocumentVO(
        Document source,
        DocumentVO target)
    {
        
        // TODO verify behavior of toDocumentVO
        super.toDocumentVO(source, target);
        target.setDocumentType(source.getType().getValue());
        target.setRecordType(source.getRecordType().getValue());
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(source.getDated());
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        target.setMonth(month);
        target.setYear(year);
        target.setUrlImage("/animal-documents/uploads/" +source.getRecordType() + "/" + year + "/" + month +"/"+ source.getGuid());

        
        // WARNING! No conversion for target.type (can't convert source.getType():org.fidelis.animal.model.document.DocumentType to java.lang.String
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentVO toDocumentVO(final Document entity)
    {
        // TODO verify behavior of toDocumentVO
        return super.toDocumentVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Document loadDocumentFromDocumentVO(DocumentVO documentVO)
    {
        // TODO implement loadDocumentFromDocumentVO
        throw new UnsupportedOperationException("org.fidelis.animal.model.document.loadDocumentFromDocumentVO(DocumentVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (documentVO.getId() == null)
        {
            return  Document.Factory.newInstance();
        }
        else
        {
            return this.load(documentVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public Document documentVOToEntity(DocumentVO documentVO)
    {
        // TODO verify behavior of documentVOToEntity
        Document entity = this.loadDocumentFromDocumentVO(documentVO);
        this.documentVOToEntity(documentVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void documentVOToEntity(
        DocumentVO source,
        Document target,
        boolean copyIfNull)
    {
        // TODO verify behavior of documentVOToEntity
        super.documentVOToEntity(source, target, copyIfNull);
        // No conversion for target.type (can't convert source.getType():java.lang.String to org.fidelis.animal.model.document.DocumentType
    }
}