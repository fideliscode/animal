// license-header java merge-point
// Generated by andromda-jsf cartridge (controllers\ControllerImpl.java.vsl)
package org.fidelis.animal.web.feed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import org.fidelis.animal.ServiceLocator;
import org.fidelis.animal.model.feed.FeedVO;
import org.fidelis.animal.model.feed.FeedType;
import org.fidelis.animal.model.setting.RecordType;

/**
 * @see org.fidelis.animal.web.feed.FeedController
 */
public class FeedControllerImpl
        extends FeedController {

    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -624497764303293541L;

    /**
     * @see org.fidelis.animal.web.feed.FeedController#search(Collection feeds,
     * java.lang.String type, java.lang.String name, java.lang.Long limit,
     * java.lang.String code)
     */
    @Override
    public void search(SearchForm form) throws Throwable {
        try {

            final Collection<SelectItem> recordsLimitBackingList = new ArrayList();
            if (form.getLimit() == null) {
                form.setLimit(20L);
            }
            recordsLimitBackingList.add(new SelectItem(20L));
            recordsLimitBackingList.add(new SelectItem(50L));
            recordsLimitBackingList.add(new SelectItem(100L));
            recordsLimitBackingList.add(new SelectItem(500L));
            recordsLimitBackingList.add(new SelectItem(1000L));
            recordsLimitBackingList.add(new SelectItem(5000L));
            recordsLimitBackingList.add(new SelectItem(10000L));
            recordsLimitBackingList.add(new SelectItem(20000L));
            recordsLimitBackingList.add(new SelectItem(50000L));
            recordsLimitBackingList.add(new SelectItem(100000L));
            form.setLimitBackingList(recordsLimitBackingList);

            final Collection typeBackingList = new ArrayList<SelectItem>();
            typeBackingList.addAll(FeedType.literals());
            form.setTypeBackingList(typeBackingList);
            Collection<FeedVO> feeds = new ArrayList();
            feeds.addAll(ServiceLocator.instance().getFeedService().search(form.getType(),
                    form.getCode(), form.getName(), 100L));
            // populating the table with a dummy list
            form.setFeeds(feeds);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @see org.fidelis.animal.web.feed.FeedController#load(java.lang.Long id,
     * java.lang.String type, java.lang.String name, java.lang.String
     * description, java.lang.String intakeWeight, java.lang.String intakeRate,
     * java.lang.String code)
     */
    @Override
    public void load(LoadForm form) throws Throwable {
        try {
            FeedVO feed = ServiceLocator.instance().getFeedService().load(form.getId());
            form.setType(feed.getType());
            final Collection typeBackingList = new ArrayList<SelectItem>();
            typeBackingList.addAll(FeedType.literals());
            form.setTypeBackingList(typeBackingList);
            form.setDescription(feed.getDescription());
            form.setCode(feed.getCode());
             form.setName(feed.getName());
            form.setIntakeWeight(feed.getIntakeWeight());
            form.setIntakeRate(feed.getIntakeRate());
            form.setId(form.getId());
            form.setRecordType(RecordType.ANIMAL.getValue());
            form.setDocuments(ServiceLocator.instance().getDocumentService().loadByRecordTypeAndReference(RecordType.FEED.name(), form.getId()));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @see org.fidelis.animal.web.feed.FeedController#edit(java.lang.String
     * type, java.lang.String name, java.lang.Long id, java.lang.String
     * description, java.lang.String intakeWeight, java.lang.String intakeRate,
     * java.lang.String code)
     */
    @Override
    public void edit(EditForm form) throws Throwable {
        try {
            ServiceLocator.instance().getFeedService()
                    .update(form.getId(), form.getIntakeRate(), form.getIntakeWeight(),
                            form.getDescription(), form.getName(), form.getCode(), form.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @see org.fidelis.animal.web.feed.FeedController#checkId(java.lang.Long
     * id)
     */
    @Override
    public Boolean checkId(CheckIdForm form) throws Throwable {
        try {
            HttpServletRequest req = (HttpServletRequest) FacesContext
                    .getCurrentInstance().getExternalContext().getRequest();
            if (req.getParameter("id") != null) {
                form.setId(Long.parseLong(req.getParameter("id")));
            }
            if (req.getAttribute("id") != null) {
                form.setId((Long) req.getAttribute("id"));
            }
            return form.getId() != null;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}