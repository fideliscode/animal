// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by hibernate/HibernateSearchProperties.vsl in andromda-spring-cartridge on 04/03/2022 18:05:31+0300. Do not modify by hand!.
//
package org.fidelis.animal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.fidelis.animal.model.animal.AnimalImpl;
import org.fidelis.animal.model.document.DocumentImpl;
import org.fidelis.animal.model.feed.FeedImpl;

/**
 * Stores the embedded values and associations of all entities in the system by type.
 * Is used to determine the appropriate parameter name when an embedded value's property
 * is referenced as the attribute to search by (as opposed to an association).
 *
 * @author Chad Brandon
 */
public class CriteriaSearchProperties
{
    private static final Map<Class<?>,Collection<PropertyType>> embeddedValuesByType = new HashMap<Class<?>,Collection<PropertyType>>();
    private static final Map<Class<?>,Collection<String>> embeddedValueNamesByType = new HashMap<Class<?>,Collection<String>>();
    private static final Map<Class<?>,Collection<PropertyType>> navigableAssociationEndsByType = new HashMap<Class<?>,Collection<PropertyType>>();

    static
    {
        initializeAnimal1();
        initializeFeed2();
        initializeDocument3();
    }

    private static final void initializeAnimal1()
    {
        embeddedValueNamesByType.put(
            AnimalImpl.class,
            null);
        embeddedValuesByType.put(
            AnimalImpl.class,
            null);
        navigableAssociationEndsByType.put(
            AnimalImpl.class,
            Arrays.asList(
                new PropertyType[]
                {
                    new PropertyType("feed", FeedImpl.class)
                }
            )
        );
    }

    private static final void initializeFeed2()
    {
        embeddedValueNamesByType.put(
            FeedImpl.class,
            null);
        embeddedValuesByType.put(
            FeedImpl.class,
            null);
        navigableAssociationEndsByType.put(
            FeedImpl.class,
            Arrays.asList(
                new PropertyType[]
                {
                    new PropertyType("animals", AnimalImpl.class)
                }
            )
        );
    }

    private static final void initializeDocument3()
    {
        embeddedValueNamesByType.put(
            DocumentImpl.class,
            null);
        embeddedValuesByType.put(
            DocumentImpl.class,
            null);
        navigableAssociationEndsByType.put(
            DocumentImpl.class,
            null);
    }

    /**
     * Attempts to get the embedded value list for the given type (or returns null
     * if one doesn't exist).
     *
     * @param type the type of which to retrieve the value.
     * @return the collection of embedded value names.
     */
    public static Collection<String> getEmbeddedValues(final Class<?> type)
    {
        return embeddedValueNamesByType.get(type);
    }

    /**
     * Gets the type of the navigable association end given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class<?> getNavigableAssociationEndType(final Class<?> ownerType, final String name)
    {
        return getPropertyType(navigableAssociationEndsByType, ownerType, name);
    }

    /**
     * Gets the type of the embedded value given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class<?> getEmbeddedValueType(final Class<?> ownerType, final String name)
    {
        return getPropertyType(embeddedValuesByType, ownerType, name);
    }

    /**
     * Gets the type of the embedded value given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param properties Map contains the Collection of properties given the ownerType Class
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class<?> getPropertyType(final Map<Class<?>,Collection<PropertyType>> properties, final Class<?> ownerType, final String name)
    {
        final Collection<PropertyType> ends = properties.get(ownerType);
        final PropertyType type = (PropertyType)CollectionUtils.find(
            ends,
            new Predicate()
            {
                @Override
                public boolean evaluate(final Object object)
                {
                    return ((PropertyType)object).name.equals(name);
                }
            });
        return type != null ? type.type : null;
    }

    /**
     * Gets the type of the property given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class<?> getPropertyType(final Class<?> ownerType, final String name)
    {
        Class<?> type = getNavigableAssociationEndType(ownerType, name);
        if (type == null)
        {
            type = getEmbeddedValueType(ownerType, name);
        }
        if (type == null)
        {
            try
            {
                Method getter;
                try
                {
                    getter=ownerType.getMethod("get"+StringUtils.capitalize(name), (Class[])null);
                } catch (NoSuchMethodException e) {
                    getter=ownerType.getMethod("is"+StringUtils.capitalize(name), (Class[])null);
                }
                type = getter.getReturnType();
            } catch (SecurityException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("No accessible property named '" + name + "', exists on: " + ownerType.getName());
            }
        }
        return type;
    }

    /**
     * A private class storing the name and type.
     */
    protected static final class PropertyType
    {
        /**
         * @param nameIn
         * @param typeIn
         */
        protected PropertyType(final String nameIn, final Class<?> typeIn)
        {
            this.name = nameIn;
            this.type = typeIn;
        }

        /** PropertyType name */
        protected String name;
        /** PropertyType type Class */
        protected Class<?> type;
    }
}