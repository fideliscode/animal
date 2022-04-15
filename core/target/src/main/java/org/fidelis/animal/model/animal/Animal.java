// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by hibernate/HibernateEntity.vsl in andromda-hibernate-cartridge on 04/03/2022 18:05:31+0300.
//
package org.fidelis.animal.model.animal;

import java.io.Serializable;
import java.util.Date;
import org.fidelis.animal.model.feed.Feed;

/**
 * TODO: Model Documentation for Animal
 */
// HibernateEntity.vsl annotations merge-point
public class Animal
    implements Serializable, Comparable<Animal>
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -2344174941251007009L;

    // Generate 4 attributes
    private AnimalType type;

    /**
     * TODO: Model Documentation for Animal.type
     * @return this.type AnimalType
     */
    public AnimalType getType()
    {
        return this.type;
    }

    /**
     * TODO: Model Documentation for Animal.type
     * @param typeIn AnimalType
     */
    public void setType(AnimalType typeIn)
    {
        this.type = typeIn;
    }

    private Date dateOfBirth;

    /**
     * TODO: Model Documentation for Animal.dateOfBirth
     * @return this.dateOfBirth Date
     */
    public Date getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    /**
     * TODO: Model Documentation for Animal.dateOfBirth
     * @param dateOfBirthIn Date
     */
    public void setDateOfBirth(Date dateOfBirthIn)
    {
        this.dateOfBirth = dateOfBirthIn;
    }

    private AnimalBreed breed;

    /**
     * TODO: Model Documentation for Animal.breed
     * @return this.breed AnimalBreed
     */
    public AnimalBreed getBreed()
    {
        return this.breed;
    }

    /**
     * TODO: Model Documentation for Animal.breed
     * @param breedIn AnimalBreed
     */
    public void setBreed(AnimalBreed breedIn)
    {
        this.breed = breedIn;
    }

    private Long id;

    /**
     * TODO: Model Documentation for Animal.id
     * @return this.id Long
     */
    public Long getId()
    {
        return this.id;
    }

    /**
     * TODO: Model Documentation for Animal.id
     * @param idIn Long
     */
    public void setId(Long idIn)
    {
        this.id = idIn;
    }

    // Generate 1 associations
    private Feed feed;

    /**
     * TODO: Model Documentation for Feed
     * @return this.feed Feed
     */
    public Feed getFeed()
    {
        return this.feed;
    }

    /**
     * TODO: Model Documentation for Feed
     * @param feedIn Feed
     */
    public void setFeed(Feed feedIn)
    {
        this.feed = feedIn;
    }

    /**
     * Returns <code>true</code> if the argument is an Animal instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Animal))
        {
            return false;
        }
        final Animal that = (Animal)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    @Override
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (this.id == null ? 0 : this.id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link Animal}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link Animal}.
         * @return new AnimalImpl()
         */
        public static Animal newInstance()
        {
            return new AnimalImpl();
        }

        /**
         * Constructs a new instance of {@link Animal}, taking all required and/or
         * read-only properties as arguments, except for identifiers.
         * @param type AnimalType
         * @param dateOfBirth Date
         * @return newInstance
         */
        public static Animal newInstance(AnimalType type, Date dateOfBirth)
        {
            final Animal entity = new AnimalImpl();
            entity.setType(type);
            entity.setDateOfBirth(dateOfBirth);
            return entity;
        }

        /**
         * Constructs a new instance of {@link Animal}, taking all possible properties
         * (except the identifier(s))as arguments.
         * @param type AnimalType
         * @param dateOfBirth Date
         * @param breed AnimalBreed
         * @param feed Feed
         * @return newInstance Animal
         */
        public static Animal newInstance(AnimalType type, Date dateOfBirth, AnimalBreed breed, Feed feed)
        {
            final Animal entity = new AnimalImpl();
            entity.setType(type);
            entity.setDateOfBirth(dateOfBirth);
            entity.setBreed(breed);
            entity.setFeed(feed);
            return entity;
        }
    }

    /**
     * @param other
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(Animal other)
    {
        int cmp = 0;
        if (this.getId() != null)
        {
            cmp = this.getId().compareTo(other.getId());
        }
        else
        {
            if (this.getType() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getType().compareTo(other.getType()));
            }
            if (this.getDateOfBirth() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getDateOfBirth().compareTo(other.getDateOfBirth()));
            }
            if (this.getBreed() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getBreed().compareTo(other.getBreed()));
            }
        }
        return cmp;
    }

    /**
     * Returns a String representation of the object
     * @return String Textual representation of the object displaying name/value pairs for all attributes
     * @see Object#toString
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal(");
        sb.append(" type=").append(getType());
        sb.append(" dateOfBirth=").append(getDateOfBirth());
        sb.append(" breed=").append(getBreed());
        sb.append(" id=").append(getId());
        sb.append(")");
        return sb.toString();
    }
// HibernateEntity.vsl merge-point
}