// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on 03/13/2022 00:39:18+0300.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.fidelis.animal.model.feed;

/**
 * @see Feed
 */
public class FeedDaoImpl
    extends FeedDaoBase
{
    /**
     * {@inheritDoc}
     */
    @Override
    public void toFeedVO(
        Feed source,
        FeedVO target)
    {
        // TODO verify behavior of toFeedVO
        super.toFeedVO(source, target);
        target.setType(source.getType().getValue());
        // WARNING! No conversion for target.type (can't convert source.getType():org.fidelis.animal.model.feed.FeedType to java.lang.String
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedVO toFeedVO(final Feed entity)
    {
        // TODO verify behavior of toFeedVO
        return super.toFeedVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Feed loadFeedFromFeedVO(FeedVO feedVO)
    {
        // TODO implement loadFeedFromFeedVO
        throw new UnsupportedOperationException("org.fidelis.animal.model.feed.loadFeedFromFeedVO(FeedVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (feedVO.getId() == null)
        {
            return  Feed.Factory.newInstance();
        }
        else
        {
            return this.load(feedVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public Feed feedVOToEntity(FeedVO feedVO)
    {
        // TODO verify behavior of feedVOToEntity
        Feed entity = this.loadFeedFromFeedVO(feedVO);
        this.feedVOToEntity(feedVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void feedVOToEntity(
        FeedVO source,
        Feed target,
        boolean copyIfNull)
    {
        // TODO verify behavior of feedVOToEntity
        super.feedVOToEntity(source, target, copyIfNull);
        // No conversion for target.type (can't convert source.getType():java.lang.String to org.fidelis.animal.model.feed.FeedType
    }
}