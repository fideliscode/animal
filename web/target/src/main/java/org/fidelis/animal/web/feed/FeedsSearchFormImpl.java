// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\FormImpl.java.vsl)
package org.fidelis.animal.web.feed;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import javax.faces.model.SelectItem;
import org.apache.commons.beanutils.ConvertUtils;

/**
 * TODO: Model Documentation for org.fidelis.animal.web.feed.Search
 */
public class FeedsSearchFormImpl
    implements Serializable, SearchForm
{
    /**
     * Default constructor
     */
    public FeedsSearchFormImpl()
    {
    }

    // Action manage-feeds-search formFields
    private Collection feeds;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.feeds
     *
     * @return feeds TODO: Model Documentation for org.fidelis.animal.web.feed.feeds
     */
    public Collection getFeeds()
    {
        return this.feeds;
    }

    /**
     * Keeps track of whether or not the value of feeds has
     * be populated at least once.
     */
    private boolean feedsSet = false;

    /**
     * Indicates whether or not the value for feeds has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isFeedsSet()
    {
        return this.feedsSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.feeds
     *
     * @param feedsIn TODO: Model Documentation for org.fidelis.animal.web.feed.feeds
     */
    public void setFeeds(Collection feedsIn)
    {
        this.feeds = feedsIn;
        this.feedsSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> feedsBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getFeedsBackingList()
    {
        return feedsBackingList;
    }

    /**
     * @param feedsBackingListIn
     */
    public void setFeedsBackingList(Collection<SelectItem> feedsBackingListIn)
    {
        this.feedsBackingList = feedsBackingListIn;
    }
    

    private Long limit;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.limit
     *
     * @return limit TODO: Model Documentation for org.fidelis.animal.web.feed.limit
     */
    public Long getLimit()
    {
        return this.limit;
    }

    /**
     * Keeps track of whether or not the value of limit has
     * be populated at least once.
     */
    private boolean limitSet = false;

    /**
     * Indicates whether or not the value for limit has been set at least
     * once.
     *
     * @return true/false
     */
    public boolean isLimitSet()
    {
        return this.limitSet;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.limit
     *
     * @param limitIn TODO: Model Documentation for org.fidelis.animal.web.feed.limit
     */
    public void setLimit(Long limitIn)
    {
        this.limit = limitIn;
        this.limitSet = true;
    }

    /**
     * Stores the label/value pairs.
     */
    private Collection<SelectItem> limitBackingList;


    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getLimitBackingList()
    {
        return limitBackingList;
    }

    /**
     * @param limitBackingListIn
     */
    public void setLimitBackingList(Collection<SelectItem> limitBackingListIn)
    {
        this.limitBackingList = limitBackingListIn;
    }
    

    private String type;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.type
     *
     * @return type TODO: Model Documentation for org.fidelis.animal.web.feed.type
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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.type
     *
     * @param typeIn TODO: Model Documentation for org.fidelis.animal.web.feed.type
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
    

    private String name;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.name
     *
     * @return name TODO: Model Documentation for org.fidelis.animal.web.feed.name
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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.name
     *
     * @param nameIn TODO: Model Documentation for org.fidelis.animal.web.feed.name
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
    

    private String code;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.code
     *
     * @return code TODO: Model Documentation for org.fidelis.animal.web.feed.code
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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.code
     *
     * @param codeIn TODO: Model Documentation for org.fidelis.animal.web.feed.code
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
    

    private Long id;

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.id
     *
     * @return id TODO: Model Documentation for org.fidelis.animal.web.feed.id
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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.id
     *
     * @param idIn TODO: Model Documentation for org.fidelis.animal.web.feed.id
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
    


    /*
     * Append this form's fields and values to a Map
     *
     * @param dest the destination Map
     */  
    public Map<String,Object> copyTo(Map<String,Object> dest)
    {
        if(this.feedsSet)
        {
            dest.put("feeds",this.feeds);
        }
        if(this.limitSet)
        {
            dest.put("limit",this.limit);
        }
        if(this.typeSet)
        {
            dest.put("type",this.type);
        }
        if(this.nameSet)
        {
            dest.put("name",this.name);
        }
        if(this.codeSet)
        {
            dest.put("code",this.code);
        }
        if(this.idSet)
        {
            dest.put("id",this.id);
        }
        return dest;
    }

    /*
     * Fills this form using values of a Map
     *
     * @param source the source Map
     */     
     public FeedsSearchFormImpl copyFrom(Map<String,Object> source)
    {
        if(source.containsKey("feeds"))
        {
            this.setFeeds((Collection)source.get("feeds"));
        }
        if(source.containsKey("limit"))
        {
            this.setLimit((Long)ConvertUtils.convert(source.get("limit"),Long.class));
        }
        if(source.containsKey("type"))
        {
            this.setType((String)ConvertUtils.convert(source.get("type"),String.class));
        }
        if(source.containsKey("name"))
        {
            this.setName((String)ConvertUtils.convert(source.get("name"),String.class));
        }
        if(source.containsKey("code"))
        {
            this.setCode((String)ConvertUtils.convert(source.get("code"),String.class));
        }
        if(source.containsKey("id"))
        {
            this.setId((Long)ConvertUtils.convert(source.get("id"),Long.class));
        }
        return this;
    }

    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -7686887938933934057L;
}