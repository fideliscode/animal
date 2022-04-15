// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\FormImpl.java.vsl)
package org.fidelis.animal.web.feed.add;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import javax.faces.model.SelectItem;
import org.apache.commons.beanutils.ConvertUtils;

/**
 * TODO: Model Documentation for org.fidelis.animal.web.feed.add.loadOptions
 */
public class AddFeedFormImpl
    implements Serializable, LoadOptionsForm
{
    /**
     * Default constructor
     */
    public AddFeedFormImpl()
    {
    }

    // Action add-feed-load-options formFields
    private String type;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.type
     *
     * @return type TODO: Model Documentation for org.fidelis.animal.web.feed.add.type
     */
    public String getType()
    {
        return this.type;
    }

    /**
     * Keeps track of whether or not the value of type has
     * be populated at least once.
     */
    private boolean typeSet = false;

    /**
     * Indicates whether or not the value for type has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isTypeSet()
    {
        return this.typeSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.type
     *
     * @param typeIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.type
     */
    public void setType(String typeIn)
    {
        this.type = typeIn;
        this.typeSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> typeBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getTypeBackingList()
    {
        return typeBackingList;
    }

    /**
     * @param typeBackingListIn
     */
    public void setTypeBackingList(Collection<SelectItem> typeBackingListIn)
    {
        this.typeBackingList = typeBackingListIn;
    }
    

    private Long id;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.id
     *
     * @return id TODO: Model Documentation for org.fidelis.animal.web.feed.add.id
     */
    public Long getId()
    {
        return this.id;
    }

    /**
     * Keeps track of whether or not the value of id has
     * be populated at least once.
     */
    private boolean idSet = false;

    /**
     * Indicates whether or not the value for id has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isIdSet()
    {
        return this.idSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.id
     *
     * @param idIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.id
     */
    public void setId(Long idIn)
    {
        this.id = idIn;
        this.idSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> idBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getIdBackingList()
    {
        return idBackingList;
    }

    /**
     * @param idBackingListIn
     */
    public void setIdBackingList(Collection<SelectItem> idBackingListIn)
    {
        this.idBackingList = idBackingListIn;
    }
    

    private String name;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.name
     *
     * @return name TODO: Model Documentation for org.fidelis.animal.web.feed.add.name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Keeps track of whether or not the value of name has
     * be populated at least once.
     */
    private boolean nameSet = false;

    /**
     * Indicates whether or not the value for name has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isNameSet()
    {
        return this.nameSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.name
     *
     * @param nameIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.name
     */
    public void setName(String nameIn)
    {
        this.name = nameIn;
        this.nameSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> nameBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getNameBackingList()
    {
        return nameBackingList;
    }

    /**
     * @param nameBackingListIn
     */
    public void setNameBackingList(Collection<SelectItem> nameBackingListIn)
    {
        this.nameBackingList = nameBackingListIn;
    }
    

    private String description;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.description
     *
     * @return description TODO: Model Documentation for org.fidelis.animal.web.feed.add.description
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * Keeps track of whether or not the value of description has
     * be populated at least once.
     */
    private boolean descriptionSet = false;

    /**
     * Indicates whether or not the value for description has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isDescriptionSet()
    {
        return this.descriptionSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.description
     *
     * @param descriptionIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.description
     */
    public void setDescription(String descriptionIn)
    {
        this.description = descriptionIn;
        this.descriptionSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> descriptionBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getDescriptionBackingList()
    {
        return descriptionBackingList;
    }

    /**
     * @param descriptionBackingListIn
     */
    public void setDescriptionBackingList(Collection<SelectItem> descriptionBackingListIn)
    {
        this.descriptionBackingList = descriptionBackingListIn;
    }
    

    private String intakeRate;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeRate
     *
     * @return intakeRate TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeRate
     */
    public String getIntakeRate()
    {
        return this.intakeRate;
    }

    /**
     * Keeps track of whether or not the value of intakeRate has
     * be populated at least once.
     */
    private boolean intakeRateSet = false;

    /**
     * Indicates whether or not the value for intakeRate has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isIntakeRateSet()
    {
        return this.intakeRateSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeRate
     *
     * @param intakeRateIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeRate
     */
    public void setIntakeRate(String intakeRateIn)
    {
        this.intakeRate = intakeRateIn;
        this.intakeRateSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> intakeRateBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getIntakeRateBackingList()
    {
        return intakeRateBackingList;
    }

    /**
     * @param intakeRateBackingListIn
     */
    public void setIntakeRateBackingList(Collection<SelectItem> intakeRateBackingListIn)
    {
        this.intakeRateBackingList = intakeRateBackingListIn;
    }
    

    private String intakeWeight;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeWeight
     *
     * @return intakeWeight TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeWeight
     */
    public String getIntakeWeight()
    {
        return this.intakeWeight;
    }

    /**
     * Keeps track of whether or not the value of intakeWeight has
     * be populated at least once.
     */
    private boolean intakeWeightSet = false;

    /**
     * Indicates whether or not the value for intakeWeight has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isIntakeWeightSet()
    {
        return this.intakeWeightSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeWeight
     *
     * @param intakeWeightIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.intakeWeight
     */
    public void setIntakeWeight(String intakeWeightIn)
    {
        this.intakeWeight = intakeWeightIn;
        this.intakeWeightSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> intakeWeightBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getIntakeWeightBackingList()
    {
        return intakeWeightBackingList;
    }

    /**
     * @param intakeWeightBackingListIn
     */
    public void setIntakeWeightBackingList(Collection<SelectItem> intakeWeightBackingListIn)
    {
        this.intakeWeightBackingList = intakeWeightBackingListIn;
    }
    

    private String code;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.code
     *
     * @return code TODO: Model Documentation for org.fidelis.animal.web.feed.add.code
     */
    public String getCode()
    {
        return this.code;
    }

    /**
     * Keeps track of whether or not the value of code has
     * be populated at least once.
     */
    private boolean codeSet = false;

    /**
     * Indicates whether or not the value for code has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isCodeSet()
    {
        return this.codeSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.add.code
     *
     * @param codeIn TODO: Model Documentation for org.fidelis.animal.web.feed.add.code
     */
    public void setCode(String codeIn)
    {
        this.code = codeIn;
        this.codeSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> codeBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getCodeBackingList()
    {
        return codeBackingList;
    }

    /**
     * @param codeBackingListIn
     */
    public void setCodeBackingList(Collection<SelectItem> codeBackingListIn)
    {
        this.codeBackingList = codeBackingListIn;
    }
    


    /*
     * Append this form's fields and values to a Map
     *
     * @param dest the destination Map
     */  
    public Map<String,Object> copyTo(Map<String,Object> dest)
    {
        if(this.typeSet)
        {
            dest.put("type",this.type);
        }
        if(this.idSet)
        {
            dest.put("id",this.id);
        }
        if(this.nameSet)
        {
            dest.put("name",this.name);
        }
        if(this.descriptionSet)
        {
            dest.put("description",this.description);
        }
        if(this.intakeRateSet)
        {
            dest.put("intakeRate",this.intakeRate);
        }
        if(this.intakeWeightSet)
        {
            dest.put("intakeWeight",this.intakeWeight);
        }
        if(this.codeSet)
        {
            dest.put("code",this.code);
        }
        return dest;
    }

    /*
     * Fills this form using values of a Map
     *
     * @param source the source Map
     */     
     public AddFeedFormImpl copyFrom(Map<String,Object> source)
    {
        if(source.containsKey("type"))
        {
            this.setType((String)ConvertUtils.convert(source.get("type"),String.class));
        }
        if(source.containsKey("id"))
        {
            this.setId((Long)ConvertUtils.convert(source.get("id"),Long.class));
        }
        if(source.containsKey("name"))
        {
            this.setName((String)ConvertUtils.convert(source.get("name"),String.class));
        }
        if(source.containsKey("description"))
        {
            this.setDescription((String)ConvertUtils.convert(source.get("description"),String.class));
        }
        if(source.containsKey("intakeRate"))
        {
            this.setIntakeRate((String)ConvertUtils.convert(source.get("intakeRate"),String.class));
        }
        if(source.containsKey("intakeWeight"))
        {
            this.setIntakeWeight((String)ConvertUtils.convert(source.get("intakeWeight"),String.class));
        }
        if(source.containsKey("code"))
        {
            this.setCode((String)ConvertUtils.convert(source.get("code"),String.class));
        }
        return this;
    }

    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -7088193981550316455L;
}