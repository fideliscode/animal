// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::org.fidelis.animal::model::document::DocumentService
 * STEREOTYPE:  Service
 */
package org.fidelis.animal.model.document;

import java.util.Collection;
import java.util.Date;
import org.fidelis.animal.model.setting.RecordType;

/**
 * @see org.fidelis.animal.model.document.DocumentService
 */
public class DocumentServiceImpl
        extends DocumentServiceBase {

    /**
     * @see org.fidelis.animal.model.document.DocumentService#search(String,
     * Date, String, Long)
     */
    @Override
    protected Collection handleSearch(String type, Date dated, String name, Long limit)
            throws Exception {
        // TODO implement protected  Collection handleSearch(String type, Date dated, String name, Long limit)
        throw new UnsupportedOperationException("org.fidelis.animal.model.document.DocumentService.handleSearch(String type, Date dated, String name, Long limit) Not implemented!");
    }

    /**
     * @see org.fidelis.animal.model.document.DocumentService#loadAll()
     */
    @Override
    protected Collection handleLoadAll()
            throws Exception {
        // TODO implement protected  Collection handleLoadAll()
        return getDocumentDao().loadAll(DocumentDao.TRANSFORM_DOCUMENTVO);
    }

    /**
     * @see org.fidelis.animal.model.document.DocumentService#load(Long)
     */
    @Override
    protected DocumentVO handleLoad(Long id)
            throws Exception {
        // TODO implement protected  DocumentVO handleLoad(Long id)
        return (DocumentVO) getDocumentDao().load(DocumentDao.TRANSFORM_DOCUMENTVO, id);
    }

    /**
     * @see org.fidelis.animal.model.document.DocumentService#add(String, Date,
     * Long, String, String, String, String)
     */
    @Override
    protected Long handleAdd(String type, Date dated,
            Long reference, String name,
            String description, String extension, String guid, String recordType)
            throws Exception {
        Document document = Document.Factory.newInstance(DocumentType.fromString(type.toUpperCase().replace(" ", "_")),
                dated, name,
                extension, description, reference, guid,
                RecordType.fromString(recordType.toUpperCase().replace(" ", "_")));
        getDocumentDao().create(document);
        return document.getId();
    }

    /**
     * @see
     * org.fidelis.animal.model.document.DocumentService#loadByRecordType(String)
     */
    @Override
    protected Collection handleLoadByRecordType(String type)
            throws Exception {
        return getDocumentDao().findByRecordType(DocumentDao.TRANSFORM_DOCUMENTVO, type);
    }

    /**
     * @see
     * org.fidelis.animal.model.document.DocumentService#loadByTypeAndReference(String,
     * Long)
     */
    @Override
    protected Collection handleLoadByTypeAndReference(String type, Long reference)
            throws Exception {
        // TODO implement protected  DocumentVO handleLoadByTypeAndReference(String type, Long reference)
        return getDocumentDao().findByTypeAndReference(DocumentDao.TRANSFORM_DOCUMENTVO, type, reference);
    }

    /**
     * @see
     * org.fidelis.animal.model.document.DocumentService#loadByTypeAndReferenceAndRecordType(String,
     * Long, String)
     */
    @Override
    protected Collection handleLoadByTypeAndReferenceAndRecordType(String type, Long reference, String recordType)
            throws Exception {
        // TODO implement protected  DocumentVO handleLoadByTypeAndReferenceAndRecordType(String type, Long reference, String recordType)
        return getDocumentDao().findByTypeAndReferenceAndRecordType(DocumentDao.TRANSFORM_DOCUMENTVO, type, reference, recordType);
    }

    /**
     * @see
     * org.fidelis.animal.model.document.DocumentService#loadByRecordTypeAndReference(String,
     * Long)
     */
    @Override
    protected Collection handleLoadByRecordTypeAndReference(String recordType, Long reference)
            throws Exception {
        // TODO implement protected  DocumentVO handleLoadByRecordTypeAndReference(String recordType, Long reference)
        return getDocumentDao().findByRecordTypeReference(DocumentDao.TRANSFORM_DOCUMENTVO, recordType, reference);
    }

}
