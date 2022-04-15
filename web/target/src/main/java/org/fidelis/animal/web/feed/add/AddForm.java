// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\Form.java.vsl) DO NOT EDIT!
package org.fidelis.animal.web.feed.add;

import java.util.Collection;
import javax.faces.model.SelectItem;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>add</code> method, which is located on the
 * <code>org.fidelis.animal.web.feed.add.AddFeedController</code> controller.
 *
 * TODO: Model Documentation for org.fidelis.animal.web.feed.add.AddFeedController.add
 *
 * @see org.fidelis.animal.web.feed.add.AddFeedController#add(AddForm)
 */
public interface AddForm
{
    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.id
     * @return id
     */
    public Long getId();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.id
     * @param id
     */
    public void setId(Long id);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.name
     * @return name
     */
    public String getName();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.name
     * @param name
     */
    public void setName(String name);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.description
     * @return description
     */
    public String getDescription();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.description
     * @param description
     */
    public void setDescription(String description);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeRate
     * @return intakeRate
     */
    public String getIntakeRate();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeRate
     * @param intakeRate
     */
    public void setIntakeRate(String intakeRate);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeWeight
     * @return intakeWeight
     */
    public String getIntakeWeight();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeWeight
     * @param intakeWeight
     */
    public void setIntakeWeight(String intakeWeight);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.type
     * @return type
     */
    public String getType();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.type
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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.code
     * @return code
     */
    public String getCode();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.code
     * @param code
     */
    public void setCode(String code);

}