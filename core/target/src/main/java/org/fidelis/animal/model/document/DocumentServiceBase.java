// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringServiceBase.vsl in andromda-spring-cartridge on 04/03/2022 18:05:31+0300. Do not modify by hand!.
//
/**
 * TEMPLATE:    SpringServiceBase.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::org.fidelis.animal::model::document::DocumentService
 * STEREOTYPE:  Service
 */
package org.fidelis.animal.model.document;

import java.security.Principal;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import org.fidelis.animal.BeanLocator;
import org.fidelis.animal.PrincipalStore;
import org.springframework.context.MessageSource;

/**
 * <p>
 * Spring Service base class for <code>DocumentService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see DocumentService
 */
public abstract class DocumentServiceBase
    implements DocumentService
{
    private DocumentDao documentDao;

    /**
     * Sets the reference to <code>document</code>'s DAO.
     * @param documentDaoIn
     */
    public void setDocumentDao(DocumentDao documentDaoIn)
    {
        this.documentDao = documentDaoIn;
    }

    /**
     * Gets the reference to <code>document</code>'s DAO.
     * @return documentDao
     */
    protected DocumentDao getDocumentDao()
    {
        return this.documentDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection search(final String type, final Date dated, final String name, final Long limit)
    {
        try
        {
            return this.handleSearch(type, dated, name, limit);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.search(String type, Date dated, String name, Long limit)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #search(String, Date, String, Long)}
     * @param type String TODO: Model Documentation for DocumentService.search(type)
     * @param dated Date TODO: Model Documentation for DocumentService.search(dated)
     * @param name String TODO: Model Documentation for DocumentService.search(name)
     * @param limit Long TODO: Model Documentation for DocumentService.search(limit)
     * @return Collection
     * @throws Exception
     */
    protected abstract Collection handleSearch(String type, Date dated, String name, Long limit)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection loadAll()
    {
        try
        {
            return this.handleLoadAll();
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.loadAll()' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #loadAll()}
     * @return Collection
     * @throws Exception
     */
    protected abstract Collection handleLoadAll()
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentVO load(final Long id)
    {
        try
        {
            return this.handleLoad(id);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.load(Long id)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #load(Long)}
     * @param id Long TODO: Model Documentation for DocumentService.load(id)
     * @return DocumentVO
     * @throws Exception
     */
    protected abstract DocumentVO handleLoad(Long id)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Long add(final String type, final Date dated, final Long reference, final String name, final String description, final String extension, final String guid, final String recordType)
    {
        if (type == null || type.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.add(String type, Date dated, Long reference, String name, String description, String extension, String guid, String recordType) - 'type' can not be null or empty");
        }
        if (recordType == null || recordType.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.add(String type, Date dated, Long reference, String name, String description, String extension, String guid, String recordType) - 'recordType' can not be null or empty");
        }
        try
        {
            return this.handleAdd(type, dated, reference, name, description, extension, guid, recordType);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.add(String type, Date dated, Long reference, String name, String description, String extension, String guid, String recordType)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #add(String, Date, Long, String, String, String, String, String)}
     * @param type String TODO: Model Documentation for DocumentService.add(type)
     * @param dated Date TODO: Model Documentation for DocumentService.add(dated)
     * @param reference Long TODO: Model Documentation for DocumentService.add(reference)
     * @param name String TODO: Model Documentation for DocumentService.add(name)
     * @param description String TODO: Model Documentation for DocumentService.add(description)
     * @param extension String TODO: Model Documentation for DocumentService.add(extension)
     * @param guid String TODO: Model Documentation for DocumentService.add(guid)
     * @param recordType String TODO: Model Documentation for DocumentService.add(recordType)
     * @return Long
     * @throws Exception
     */
    protected abstract Long handleAdd(String type, Date dated, Long reference, String name, String description, String extension, String guid, String recordType)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection loadByRecordType(final String type)
    {
        if (type == null || type.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.loadByRecordType(String type) - 'type' can not be null or empty");
        }
        try
        {
            return this.handleLoadByRecordType(type);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.loadByRecordType(String type)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #loadByRecordType(String)}
     * @param type String TODO: Model Documentation for
DocumentService.loadByRecordType(type)
     * @return Collection
     * @throws Exception
     */
    protected abstract Collection handleLoadByRecordType(String type)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection loadByTypeAndReference(final String type, final Long reference)
    {
        if (type == null || type.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.loadByTypeAndReference(String type, Long reference) - 'type' can not be null or empty");
        }
        try
        {
            return this.handleLoadByTypeAndReference(type, reference);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.loadByTypeAndReference(String type, Long reference)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #loadByTypeAndReference(String, Long)}
     * @param type String TODO: Model Documentation for
DocumentService.loadByTypeAndReference(type)
     * @param reference Long TODO: Model Documentation for
DocumentService.loadByTypeAndReference(reference)
     * @return Collection
     * @throws Exception
     */
    protected abstract Collection handleLoadByTypeAndReference(String type, Long reference)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection loadByTypeAndReferenceAndRecordType(final String type, final Long reference, final String recordType)
    {
        if (type == null || type.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.loadByTypeAndReferenceAndRecordType(String type, Long reference, String recordType) - 'type' can not be null or empty");
        }
        if (recordType == null || recordType.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.loadByTypeAndReferenceAndRecordType(String type, Long reference, String recordType) - 'recordType' can not be null or empty");
        }
        try
        {
            return this.handleLoadByTypeAndReferenceAndRecordType(type, reference, recordType);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.loadByTypeAndReferenceAndRecordType(String type, Long reference, String recordType)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #loadByTypeAndReferenceAndRecordType(String, Long, String)}
     * @param type String TODO: Model Documentation for
DocumentService.loadByTypeAndReferenceAndRecordType(type)
     * @param reference Long TODO: Model Documentation for
DocumentService.loadByTypeAndReferenceAndRecordType(reference)
     * @param recordType String TODO: Model Documentation for
DocumentService.loadByTypeAndReferenceAndRecordType(recordType)
     * @return Collection
     * @throws Exception
     */
    protected abstract Collection handleLoadByTypeAndReferenceAndRecordType(String type, Long reference, String recordType)
        throws Exception;

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection loadByRecordTypeAndReference(final String recordType, final Long reference)
    {
        if (recordType == null || recordType.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.fidelis.animal.model.document.DocumentService.loadByRecordTypeAndReference(String recordType, Long reference) - 'recordType' can not be null or empty");
        }
        try
        {
            return this.handleLoadByRecordTypeAndReference(recordType, reference);
        }
        catch (Throwable th)
        {
            throw new DocumentServiceException(
                "Error performing 'DocumentService.loadByRecordTypeAndReference(String recordType, Long reference)' --> " + th,
                th);
        }
    }

    /**
     * Performs the core logic for {@link #loadByRecordTypeAndReference(String, Long)}
     * @param recordType String TODO: Model Documentation for
DocumentService.loadByRecordTypeAndReference(recordType)
     * @param reference Long TODO: Model Documentation for
DocumentService.loadByRecordTypeAndReference(reference)
     * @return Collection
     * @throws Exception
     */
    protected abstract Collection handleLoadByRecordTypeAndReference(String recordType, Long reference)
        throws Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected Principal getPrincipal()
    {
        return PrincipalStore.get();
    }

    /**
     * Gets the message source available to this service.
     * @return MessageSource
     */
    protected MessageSource getMessages()
    {
        return (MessageSource)
            BeanLocator.instance().getBean("messageSource");
    }

    /**
     * Gets the message having the given <code>key</code> in the underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @return String
     */
    protected String getMessage(final String key)
    {
        return this.getMessages().getMessage(key, null, null);
    }

    /**
     * Gets the message having the given <code>key</code> and <code>arguments</code> in the
     * underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @return String
     */
    protected String getMessage(final String key, final Object[] arguments)
    {
        return this.getMessages().getMessage(key, arguments, null);
    }

    /**
     * Gets the message having the given <code>key</code> using the given <code>arguments</code>
     * for the given <code>locale</code>.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @param locale the locale of the messages to retrieve.
     * @return String
     */
    protected String getMessage(
        final String key, final Object[] arguments,
        final Locale locale)
    {
        return this.getMessages().getMessage(key, arguments, locale);
    }


// spring-service-base merge-point
}