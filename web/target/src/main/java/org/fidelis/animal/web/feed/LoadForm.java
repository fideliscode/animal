// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\Form.java.vsl) DO NOT EDIT!
package org.fidelis.animal.web.feed;

import java.util.Collection;
import javax.faces.model.SelectItem;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>load</code> method, which is located on the
 * <code>org.fidelis.animal.web.feed.FeedController</code> controller.
 *
 * TODO: Model Documentation for org.fidelis.animal.web.feed.FeedController.load
 *
 * @see org.fidelis.animal.web.feed.FeedController#load(LoadForm)
 */
public interface LoadForm
{
    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.name
     * @return name
     */
    public String getName();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.name
     * @param name
     */
    public void setName(String name);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.type
     * @return type
     */
    public String getType();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.type
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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.description
     * @return description
     */
    public String getDescription();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.description
     * @param description
     */
    public void setDescription(String description);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.intakeWeight
     * @return intakeWeight
     */
    public String getIntakeWeight();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.intakeWeight
     * @param intakeWeight
     */
    public void setIntakeWeight(String intakeWeight);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.intakeRate
     * @return intakeRate
     */
    public String getIntakeRate();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.intakeRate
     * @param intakeRate
     */
    public void setIntakeRate(String intakeRate);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.code
     * @return code
     */
    public String getCode();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.code
     * @param code
     */
    public void setCode(String code);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.id
     * @return id
     */
    public Long getId();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.id
     * @param id
     */
    public void setId(Long id);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.recordType
     * @return recordType
     */
    public String getRecordType();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.recordType
     * @param recordType
     */
    public void setRecordType(String recordType);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.documents
     * @return documents
     */
    public Collection getDocuments();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.documents
     * @param documents
     */
    public void setDocuments(Collection documents);

}