// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand! hibernate4=true hibernateVersion=4.3.6.Final
// Generated by hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge on 04/03/2022 18:05:30+0300. Do not modify by hand!.
//
package org.fidelis.animal.model.feed;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.andromda.spring.PaginationResult;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fidelis.animal.CriteriaSearch;
import org.fidelis.animal.CriteriaSearchParameter;
import org.fidelis.animal.PrincipalStore;
import org.fidelis.animal.PropertySearch;
import org.fidelis.animal.Search;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>Feed</code>.
 * </p>
 *
 * @see Feed
 */
@Repository
public abstract class FeedDaoBase
    implements FeedDao
{
    /**
     * For backwards compatibility with HibernateDao method
     * @deprecated Use LogFactory.getLog on each subclass, for the correct class name
     * Apache commons logging logger used by all subclasses
     */
    @Deprecated
    protected Log logger = LogFactory.getLog(FeedDaoBase.class);

    @Resource
    private SessionFactory sessionFactory;
    /**
     * @param sessionFactoryIn
     */
    public void setSessionFactory(SessionFactory sessionFactoryIn) {
        this.sessionFactory = sessionFactoryIn;
    }
    /**
     * @return SessionFactory
     */
    protected SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }
    /**
     * @return currentSession
     */
    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    /**
     * For backwards compatibility with HibernateDao method
     * @deprecated Use this.sessionFactory.getCurrentSession() instead
     * @param ignore boolean - always create new session if needed
     * @return currentSession
     */
    @Deprecated
    protected Session getSession(boolean ignore) {
        return this.getSession();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(final int transform, final Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Feed.get - 'id' can not be null");
        }
        final Object entity = this.sessionFactory.getCurrentSession().get(FeedImpl.class, id);
        return transformEntity(transform, (Feed)entity);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Feed get(Long id)
    {
        return (Feed)this.get(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object load(final int transform, final Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Feed.load - 'id' can not be null");
        }
        final Object entity = this.sessionFactory.getCurrentSession().get(FeedImpl.class, id);
        return transformEntity(transform, (Feed)entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feed load(Long id)
    {
        return (Feed)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Feed> loadAll()
    {
        return (Collection<Feed>) this.loadAll(FeedDao.TRANSFORM_NONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(FeedDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
        final Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(FeedImpl.class);
        if (pageNumber > 0 && pageSize > 0)
        {
            criteria.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
            criteria.setMaxResults(pageSize);
        }
        final Collection<?> results = criteria.list();
        this.transformEntities(transform, results);
        return results;
    }

    /**
     * firstResult = (pageNumber - 1) * pageSize
     * @param pageNumber
     * @param pageSize
     * @return firstResult
     */
    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * prePersist event - This method is called before creating the entity
     * @param feed Feed
     */
    protected void _prePersist(final Feed feed)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postPersist event - This method is called after creating the entity
     * @param feed Feed
     */
    protected void _postPersist(final Feed feed)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preUpdate event - This method is called before updating the entity
     * @param feed Feed
     */
    protected void _preUpdate(final Feed feed)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postUpdate event - This method is called after updating the entity
     * @param feed Feed
     */
    protected void _postUpdate(final Feed feed)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * preRemove event - This method is called before deleting the entity
     * @param feed Feed
     */
    protected void _preRemove(final Feed feed)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * postRemove event - This method is called after deleting the entity
     * @param feed Feed
     */
    protected void _postRemove(final Feed feed)
    {
        // Abstract method - your implementation goes in the descendant
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feed create(Feed feed)
    {
        return (Feed)this.create(FeedDao.TRANSFORM_NONE, feed);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, final Feed feed)
    {
        if (feed == null)
        {
            throw new IllegalArgumentException(
                "Feed.create - 'feed' can not be null");
        }

        //prePersist event
        _prePersist(feed);

        this.sessionFactory.getCurrentSession().save(feed);

        //postPersist event
        _postPersist(feed);

        return this.transformEntity(transform, feed);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Feed> create(final Collection<Feed> entities)
    {
        return (Collection<Feed>) create(FeedDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> create(final int transform, final Collection<Feed> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Feed.create - 'entities' can not be null");
        }
        Collection<Object> transformed = new ArrayList<Object>();
        for (Feed entity : entities)
        {
            transformed.add(create(transform, entity));
        }
        return transformed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feed create(
        FeedType type,
        String name,
        String code,
        String intakeWeight,
        String intakeRate,
        String description)
    {
        return (Feed)this.create(FeedDao.TRANSFORM_NONE, type, name, code, intakeWeight, intakeRate, description);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(
        final int transform,
        FeedType type,
        String name,
        String code,
        String intakeWeight,
        String intakeRate,
        String description)
    {
        Feed entity = new FeedImpl();
        entity.setType(type);
        entity.setName(name);
        entity.setCode(code);
        entity.setIntakeWeight(intakeWeight);
        entity.setIntakeRate(intakeRate);
        entity.setDescription(description);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(Feed feed)
    {
        if (feed == null)
        {
            throw new IllegalArgumentException(
                "Feed.update - 'feed' can not be null");
        }

        //preUpdate event
        _preUpdate(feed);

        this.sessionFactory.getCurrentSession().update(feed);

        //postUpdate event
        _postUpdate(feed);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Collection<Feed> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Feed.update - 'entities' can not be null");
        }
        for (Feed entity : entities)
        {
            update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Feed feed)
    {
        if (feed == null)
        {
            throw new IllegalArgumentException(
                "Feed.remove - 'feed' can not be null");
        }
        //preRemove event
        _preRemove(feed);

        this.sessionFactory.getCurrentSession().delete(feed);

        //postRemove event
        _postRemove(feed);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Feed.remove - 'id' can not be null");
        }
        Feed entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Collection<Feed> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Feed.remove - 'entities' can not be null");
        }
        for (Feed entity : entities)
        {
            //preRemove event
            _preRemove(entity);

            this.sessionFactory.getCurrentSession().delete(entity);

            //postRemove event
            _postRemove(entity);
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<Feed> findByCreteria(FeedCriteria criteria)
    {
        return (Collection<Feed>)this.findByCreteria(FeedDao.TRANSFORM_NONE, criteria);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> findByCreteria(final int transform, final FeedCriteria criteria)
    {
        return this.findByCreteria(transform, -1, -1, criteria);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public Collection<?> findByCreteria(final int transform, final int pageNumber, final int pageSize, final FeedCriteria criteria)
    {
            CriteriaSearch criteriaSearch = new CriteriaSearch(this.getSession(false), FeedImpl.class);
            criteriaSearch.getConfiguration().setFirstResult(criteria.getFirstResult());
            criteriaSearch.getConfiguration().setFetchSize(criteria.getFetchSize());
            criteriaSearch.getConfiguration().setMaximumResultSize(criteria.getMaximumResultSize());
            if (pageNumber > 0 && pageSize > 0)
            {
                criteriaSearch.getConfiguration().setFirstResult(new Integer(calculateFirstResult(pageNumber, pageSize)));
                criteriaSearch.getConfiguration().setMaximumResultSize(new Integer(pageSize));
            }
            CriteriaSearchParameter parameter1 =
                new CriteriaSearchParameter(
                    criteria.getType(),
                    "type", CriteriaSearchParameter.INSENSITIVE_LIKE_COMPARATOR, MatchMode.ANYWHERE);
            criteriaSearch.addParameter(parameter1);
            CriteriaSearchParameter parameter2 =
                new CriteriaSearchParameter(
                    criteria.getCode(),
                    "code", CriteriaSearchParameter.INSENSITIVE_LIKE_COMPARATOR, MatchMode.ANYWHERE);
            criteriaSearch.addParameter(parameter2);
            CriteriaSearchParameter parameter3 =
                new CriteriaSearchParameter(
                    criteria.getName(),
                    "name", CriteriaSearchParameter.INSENSITIVE_LIKE_COMPARATOR, MatchMode.ANYWHERE);
            criteriaSearch.addParameter(parameter3);
            List results = criteriaSearch.executeAsList();
            transformEntities(transform, results);
            return results;
    }

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>FeedDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link Feed} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link FeedVO} - {@link #TRANSFORM_FEEDVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link FeedDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see FeedDao#transformEntity(int, Feed)
     */
    @Override
    public Object transformEntity(final int transform, final Feed entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_FEEDVO :
                    target = toFeedVO(entity);
                    break;
                case FeedDao.TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void transformEntities(final int transform, final Collection<?> entities)
    {
        switch (transform)
        {
            case TRANSFORM_FEEDVO :
                CollectionUtils.transform(entities, this.FEEDVO_TRANSFORMER);
                break;
            case FeedDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see FeedDao#toEntities(Collection)
     */
    @Override
    public void toEntities(final Collection<?> results)
    {
        if (results != null)
        {
            CollectionUtils.transform(results, this.ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link Feed}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer ENTITYTRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toEntity(rows);
                }
                else if (input instanceof Feed)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return Feed
     */
    protected Feed toEntity(Object[] row)
    {
        Feed target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof Feed)
                {
                    target = (Feed)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public final Collection<FeedVO> toFeedVOCollection(Collection<Feed> entities)
    {
        if (entities == null)
        {
            return null;
        }
        @SuppressWarnings("rawtypes")
        Collection result = new ArrayList(entities);
        CollectionUtils.transform(result, this.FEEDVO_TRANSFORMER);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public final FeedVO[] toFeedVOArray(Collection<?> entities)
    {
        FeedVO[] result = null;
        if (entities != null)
        {
        @SuppressWarnings("rawtypes")
            final Collection collection = new ArrayList(entities);
            this.toFeedVOCollection(collection);
            result = (FeedVO[]) collection.toArray(new FeedVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link FeedDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toFeedVO(this.toEntity(row))
     * @see FeedDao#toFeedVO(Feed)
     */
    protected FeedVO toFeedVO(Object[] row)
    {
        return this.toFeedVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link FeedVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer FEEDVO_TRANSFORMER =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Feed)
                {
                    final Feed entity = (Feed)input;
                    result = toFeedVO(entity);
                }
                else if (input instanceof Object[])
                {
                    final Object[] rows = (Object[])input;
                    result = toFeedVO(rows);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public final void feedVOToEntityCollection(Collection<?> instances)
    {
        if (instances != null)
        {
            for (final Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof FeedVO))
                {
                    iterator.remove();
                }
            }
            CollectionUtils.transform(instances, this.FeedVOToEntityTransformer);
        }
    }

    private final Transformer FeedVOToEntityTransformer =
        new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return feedVOToEntity((FeedVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toFeedVO(
        Feed source,
        FeedVO target)
    {
        target.setId(source.getId());
        // No conversion for target.type (can't convert source.getType():FeedType to String)
        target.setName(source.getName());
        target.setCode(source.getCode());
        target.setIntakeWeight(source.getIntakeWeight());
        target.setIntakeRate(source.getIntakeRate());
        target.setDescription(source.getDescription());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedVO toFeedVO(final Feed entity)
    {
        FeedVO target = null;
        if (entity != null)
        {
            target =  new FeedVO();
            this.toFeedVO(entity, target);
        }
        return target;
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
        // No conversion for target.type (can't convert source.getType():String to FeedType)
        if (copyIfNull || source.getName() != null)
        {
            target.setName(source.getName());
        }
        if (copyIfNull || source.getCode() != null)
        {
            target.setCode(source.getCode());
        }
        if (copyIfNull || source.getIntakeWeight() != null)
        {
            target.setIntakeWeight(source.getIntakeWeight());
        }
        if (copyIfNull || source.getIntakeRate() != null)
        {
            target.setIntakeRate(source.getIntakeRate());
        }
        if (copyIfNull || source.getDescription() != null)
        {
            target.setDescription(source.getDescription());
        }
    }

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
     * {@inheritDoc}
     */
    @Override
    public PaginationResult search(final int transform, final int pageNumber, final int pageSize, final Search search)
    {
        search.setPageNumber(pageNumber);
        search.setPageSize(pageSize);
        final PropertySearch propertySearch = new PropertySearch(
            this.sessionFactory.getCurrentSession(), FeedImpl.class, search);
        final List<?> results = propertySearch.executeAsList();
        this.transformEntities(transform, results);
        return new PaginationResult(results.toArray(new Object[results.size()]), propertySearch.getTotalCount());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaginationResult search(final int pageNumber, final int pageSize, final Search search)
    {
        return this.search(FeedDao.TRANSFORM_NONE, pageNumber, pageSize, search);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> search(final int transform, final Search search)
    {
        final PropertySearch propertySearch = new PropertySearch(
            this.sessionFactory.getCurrentSession(), FeedImpl.class, search);
        final Collection<?> results = propertySearch.executeAsList();
        this.transformEntities(transform, results);
        return results;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public Collection<Feed> search(final Search search)
    {
        return (Collection<Feed>) this.search(FeedDao.TRANSFORM_NONE, search);
    }

    /**
     * Executes and returns the given Hibernate queryObject as a {@link PaginationResult} instance.
     * @param queryObject
     * @param transform
     * @param pageNumber
     * @param pageSize
     * @return PaginationResult
     */
    @SuppressWarnings({ "unchecked" })
    protected PaginationResult getPaginationResult(
        final Query queryObject,
        final int transform, int pageNumber, int pageSize)
    {
        final ScrollableResults scrollableResults = queryObject.scroll();
        scrollableResults.last();
        int totalCount = scrollableResults.getRowNumber();
        totalCount = totalCount >= 0 ? totalCount + 1 : 0;
        if (pageNumber > 0 && pageSize > 0)
        {
            queryObject.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
            queryObject.setMaxResults(pageSize);
        }
        // Unchecked transformation because Set object is reused, cannot be strongly typed.
        @SuppressWarnings("rawtypes")
        Collection results = new ArrayList(queryObject.list());
        transformEntities(transform, results);
        return new PaginationResult(results.toArray(new Object[results.size()]), totalCount);
    }


    /**
     * Create or Update the <code>feed</code> instance in the persistent store.
     * @param feed
     */
    @Override
    public Feed createOrUpdate(Feed feed)
    {
        if(feed.getId() == null)
        {
            return (Feed)this.create(TRANSFORM_NONE,feed);
        }
        this.update(feed);
        return feed;
    }

    // spring-hibernate-dao-base merge-point
}