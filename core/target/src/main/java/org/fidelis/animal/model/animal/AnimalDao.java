// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringDao.vsl in andromda-spring-cartridge on 04/03/2022 18:05:29+0300. Do not modify by hand!.
//
package org.fidelis.animal.model.animal;

import java.util.Collection;
import java.util.Date;
import org.andromda.spring.PaginationResult;
import org.fidelis.animal.Search;

/**
 * TODO: Model Documentation for Animal
 * @see Animal
 */
public interface AnimalDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public static final int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link Animal}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param results the query results.
     */
    public void toEntities(final Collection<?> results);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link AnimalVO}.
     */
    public static final int TRANSFORM_ANIMALVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toAnimalVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toAnimalVO(
        Animal source,
        AnimalVO target);

    /**
     * Converts this DAO's entity to an object of type {@link AnimalVO}.
     * @param entity
     * @return AnimalVO
     */
    public AnimalVO toAnimalVO(Animal entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link AnimalVO}.
     * @param entities
     * @return Collection<AnimalVO>
     */
    public Collection<AnimalVO> toAnimalVOCollection(Collection<Animal> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link AnimalVO}.
     * @param entities
     * @return AnimalVO[]
     */
    public AnimalVO[] toAnimalVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link AnimalVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void animalVOToEntity(
        AnimalVO source,
        Animal target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link AnimalVO} to this DAO's entity.
     * @param animalVO
     * @return Animal
     */
    public Animal animalVOToEntity(AnimalVO animalVO);

    /**
     * Converts a Collection of instances of type {@link AnimalVO} to this
     * DAO's entity.
     * @param instances
     */
    public void animalVOToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of Animal from the persistent store.
     * @param id
     * @return Animal
     */
    public Animal get(Long id);

    /**
     * <p>
     * Does the same thing as {@link #get(Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform flag to determine transformation type.
     * @param id the identifier of the entity to get.
     * @return either the entity or the object transformed from the entity.
     */
    public Object get(int transform, Long id);

    /**
     * Loads an instance of Animal from the persistent store.
     * @param id
     * @return Animal
     */
    public Animal load(Long id);

    /**
     * <p>
     * Does the same thing as {@link #load(Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform flag to determine transformation type.
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, Long id);

    /**
     * Loads all entities of type {@link Animal}.
     *
     * @return the loaded entities.
     */
    public Collection<Animal> loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of Animal and adds it to the persistent store.
     * @param animal
     * @return Animal
     */
    public Animal create(Animal animal);

    /**
     * <p>
     * Does the same thing as {@link #create(Animal)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param animal
     * @return Object
     */
    public Object create(int transform, Animal animal);

    /**
     * Creates a new instance of Animal and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of Animal
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<Animal> create(Collection<Animal> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(Animal)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param entities
     * @return Collection
     */
    public Collection<?> create(int transform, Collection<Animal> entities);

    /**
     * <p>
     * Creates a new <code>Animal</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param type TODO: Model Documentation for Animal.type
     * @param dateOfBirth TODO: Model Documentation for Animal.dateOfBirth
     * @param breed TODO: Model Documentation for Animal.breed
     * @return Animal
     */
    public Animal create(
        AnimalType type,
        Date dateOfBirth,
        AnimalBreed breed);

    /**
     * <p>
     * Does the same thing as {@link #create(AnimalType, Date, AnimalBreed)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param type TODO: Model Documentation for Animal.type
     * @param dateOfBirth TODO: Model Documentation for Animal.dateOfBirth
     * @param breed TODO: Model Documentation for Animal.breed
     * @return Animal
     */
    public Object create(
        int transform,
        AnimalType type,
        Date dateOfBirth,
        AnimalBreed breed);


    /**
     * Updates the <code>animal</code> instance in the persistent store.
     * @param animal
     */
    public void update(Animal animal);

    /**
     * Create or Update the <code>animal</code> instance in the persistent store.
     * @param animal
     * @return Animal
     */
    public Animal createOrUpdate(Animal animal);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<Animal> entities);

    /**
     * Removes the instance of Animal from the persistent store.
     * @param animal
     */
    public void remove(Animal animal);

    /**
     * Removes the instance of Animal having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(Long id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<Animal> entities);

    /**
     * TODO: Model Documentation for Animal.findByCreteria
     * @param criteria TODO: Model Documentation for Animal.findByCreteria(criteria)
     * @return Collection<Animal>
     */
    public Collection<Animal> findByCreteria(AnimalCriteria criteria);

    /**
     * <p>
     * Does the same thing as {@link #findByCreteria(AnimalCriteria)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param criteria TODO: Model Documentation for Animal.findByCreteria(criteria)
     * @return Collection<?>
     */
    public Collection<?> findByCreteria(final int transform, final AnimalCriteria criteria);

    /**
     * <p>
     * Does the same thing as {@link #findByCreteria(int, String, AnimalCriteria)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     * @param transform
     * @param pageNumber
     * @param pageSize
     * @param criteria TODO: Model Documentation for Animal.findByCreteria(criteria)
     * @return Collection<?>
     */
    public Collection<?> findByCreteria(final int transform, final int pageNumber, final int pageSize, final AnimalCriteria criteria);


    /**
     * Does the same thing as {@link #search(int, Search)} but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param transform the transformation flag.
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link PaginationResult} instance.
     */
    public PaginationResult search(final int transform, final int pageNumber, final int pageSize, final Search search);

    /**
     * Does the same thing as {@link #search(Search)} but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link PaginationResult} instance.
     */
    public PaginationResult search(final int pageNumber, final int pageSize, final Search search);

    /**
     * Does the same thing as {@link #search(Search)} but with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     *
     * @param transform the transformation flag.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public Collection<?> search(final int transform, final Search search);

    /**
     * Performs a search using the parameters specified in the given <code>search</code> object.
     *
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public Collection<Animal> search(final Search search);

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>org.fidelis.animal.model.animal.AnimalDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link Animal} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link AnimalVO} - {@link #TRANSFORM_ANIMALVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link org.fidelis.animal.model.animal.AnimalDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final Animal entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,Animal)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>org.fidelis.animal.model.animal.AnimalDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,Animal)
     */
    public void transformEntities(final int transform, final Collection<?> entities);


    // spring-dao merge-point
}