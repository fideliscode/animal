// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::org.fidelis.animal::model::feed::FeedService
 * STEREOTYPE:  Service
 */
package org.fidelis.animal.model.feed;

import java.util.Collection;

/**
 * @see org.fidelis.animal.model.feed.FeedService
 */
public class FeedServiceImpl
        extends FeedServiceBase {

    /**
     * @see org.fidelis.animal.model.feed.FeedService#search(String, String,
     * String, Long)
     */
    @Override
    protected Collection handleSearch(String type, String code, String name, Long limit)
            throws Exception {
        if (limit == null) {
            limit = 20L;
        }
        FeedCriteria crt = new FeedCriteria();
        crt.setType(type);
        crt.setCode(code);
        crt.setName(name);

        crt.setMaximumResultSize(limit.intValue());
        return getFeedDao().findByCreteria(FeedDao.TRANSFORM_FEEDVO, crt);
    }

    /**
     * @see org.fidelis.animal.model.feed.FeedService#loadAll()
     */
    @Override
    protected Collection handleLoadAll()
            throws Exception {
        return getFeedDao().loadAll(FeedDao.TRANSFORM_FEEDVO);
    }

    /**
     * @see org.fidelis.animal.model.feed.FeedService#load(Long)
     */
    @Override
    protected FeedVO handleLoad(Long id)
            throws Exception {
        return (FeedVO) getFeedDao().load(FeedDao.TRANSFORM_FEEDVO, id);
    }

    /**
     * @see org.fidelis.animal.model.feed.FeedService#add(String, String,
     * String, String, String, String)
     */
    @Override
    protected Long handleAdd(String type, String code, String name,
            String description, String intakeWeight, String intakeRate)
            throws Exception {
        Feed feed = Feed.Factory.newInstance();
        feed.setName(name);
        feed.setCode(code);
        feed.setType(FeedType.fromString(type.toUpperCase().replace(" ", "_")));
        feed.setIntakeRate(intakeRate);
        feed.setIntakeWeight(intakeWeight);
        feed.setDescription(description);
        getFeedDao().create(feed);
        return feed.getId();
    }

    /**
     * @see org.fidelis.animal.model.feed.FeedService#update(Long, String,
     * String, String, String, String, String)
     */
    @Override
    protected void handleUpdate(Long id, String intakeRate,
            String intakeWeight, String description, String name,
            String code, String type)
            throws Exception {
        Feed feed = getFeedDao().load(id);
        feed.setName(name);
        feed.setCode(code);
        feed.setType(FeedType.fromString(type.toUpperCase().replace(" ", "_")));
        feed.setIntakeRate(intakeRate);
        feed.setIntakeWeight(intakeWeight);
        feed.setDescription(description);
        getFeedDao().update(feed);
    }

}
