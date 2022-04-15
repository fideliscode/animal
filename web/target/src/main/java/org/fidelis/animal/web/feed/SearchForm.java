// license-header java merge-point
// Generated by andromda-jsf cartridge (forms\Form.java.vsl) DO NOT EDIT!
package org.fidelis.animal.web.feed;

import java.util.Collection;
import javax.faces.model.SelectItem;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>search</code> method, which is located on the
 * <code>org.fidelis.animal.web.feed.FeedController</code> controller.
 *
 * TODO: Model Documentation for org.fidelis.animal.web.feed.FeedController.search
 *
 * @see org.fidelis.animal.web.feed.FeedController#search(SearchForm)
 */
public interface SearchForm
{
    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.feeds
     * @return feeds
     */
    public Collection getFeeds();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.feeds
     * @param feeds
     */
    public void setFeeds(Collection feeds);

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.limit
     * @return limit
     */
    public Long getLimit();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.limit
     * @param limit
     */
    public void setLimit(Long limit);

    /**
     * @return backingList Collection<SelectItem>
     */
    public Collection<SelectItem> getLimitBackingList();

    /**
     * @param limitBackingListIn
     */
    public void setLimitBackingList(Collection<SelectItem> limitBackingListIn);
    

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
     * TODO: Model Documentation for org.fidelis.animal.web.feed.code
     * @return code
     */
    public String getCode();

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.feed.code
     * @param code
     */
    public void setCode(String code);

}