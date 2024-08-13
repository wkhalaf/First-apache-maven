// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * A repository contains the information needed for establishing
 * connections with
 *         remote repository.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class RepositoryBase
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             A unique identifier for a repository. This is
     * used to match the repository
     *             to configuration in the
     * <code>settings.xml</code> file, for example. Furthermore,
     * the identifier is
     *             used during POM inheritance and profile
     * injection to detect repositories that should be merged.
     *             
     *           
     */
    private String id;

    /**
     * Human readable name of the repository.
     */
    private String name;

    /**
     * 
     *             
     *             The url of the repository, in the form
     * <code>protocol://hostname/path</code>.
     *             
     *           
     */
    private String url;

    /**
     * 
     *             
     *             The type of layout this repository uses for
     * locating and storing artifacts -
     *             can be <code>legacy</code> or
     * <code>default</code>.
     *             
     *           
     */
    private String layout = "default";

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    /**
     * Field location.
     */
    private InputLocation location;

    /**
     * Field idLocation.
     */
    private InputLocation idLocation;

    /**
     * Field nameLocation.
     */
    private InputLocation nameLocation;

    /**
     * Field urlLocation.
     */
    private InputLocation urlLocation;

    /**
     * Field layoutLocation.
     */
    private InputLocation layoutLocation;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return RepositoryBase
     */
    public RepositoryBase clone()
    {
        try
        {
            RepositoryBase copy = (RepositoryBase) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- RepositoryBase clone()

    /**
     * Method equals.
     * 
     * @param other a other object.
     * @return boolean
     */
    public boolean equals( Object other )
    {
        if ( this == other )
        {
            return true;
        }

        if ( !( other instanceof RepositoryBase ) )
        {
            return false;
        }

        RepositoryBase that = (RepositoryBase) other;
        boolean result = true;

        result = result && ( getId() == null ? that.getId() == null : getId().equals( that.getId() ) );

        return result;
    } //-- boolean equals( Object )

    /**
     * Get a unique identifier for a repository. This is used to
     * match the repository
     *             to configuration in the
     * <code>settings.xml</code> file, for example. Furthermore,
     * the identifier is
     *             used during POM inheritance and profile
     * injection to detect repositories that should be merged.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Get the type of layout this repository uses for locating and
     * storing artifacts -
     *             can be <code>legacy</code> or
     * <code>default</code>.
     * 
     * @return String
     */
    public String getLayout()
    {
        return this.layout;
    } //-- String getLayout()

    /**
     * 
     * 
     * @param key a key object.
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        if ( key instanceof String )
        {
            switch ( ( String ) key )
            {
                case "" :
                {
                    return this.location;
                }
                case "id" :
                {
                    return idLocation;
                }
                case "name" :
                {
                    return nameLocation;
                }
                case "url" :
                {
                    return urlLocation;
                }
                case "layout" :
                {
                    return layoutLocation;
                }
                default :
                {
                    return getOtherLocation( key );
                }
                }
            }
            else
            {
                return getOtherLocation( key );
            }
    } //-- InputLocation getLocation( Object )

    /**
     * Get human readable name of the repository.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * 
     * 
     * @param key a key object.
     * @param location a location object.
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( key instanceof String )
        {
            switch ( ( String ) key )
            {
                case "" :
                {
                    this.location = location;
                    return;
                }
                case "id" :
                {
                    idLocation = location;
                    return;
                }
                case "name" :
                {
                    nameLocation = location;
                    return;
                }
                case "url" :
                {
                    urlLocation = location;
                    return;
                }
                case "layout" :
                {
                    layoutLocation = location;
                    return;
                }
                default :
                {
                    setOtherLocation( key, location );
                    return;
                }
            }
        }
        else
        {
            setOtherLocation( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * 
     * 
     * @param key a key object.
     * @param location a location object.
     */
    public void setOtherLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setOtherLocation( Object, InputLocation )

    /**
     * 
     * 
     * @param key a key object.
     * @return InputLocation
     */
    private InputLocation getOtherLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getOtherLocation( Object )

    /**
     * Get the url of the repository, in the form
     * <code>protocol://hostname/path</code>.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Method hashCode.
     * 
     * @return int
     */
    public int hashCode()
    {
        int result = 17;

        result = 37 * result + ( id != null ? id.hashCode() : 0 );

        return result;
    } //-- int hashCode()

    /**
     * Set a unique identifier for a repository. This is used to
     * match the repository
     *             to configuration in the
     * <code>settings.xml</code> file, for example. Furthermore,
     * the identifier is
     *             used during POM inheritance and profile
     * injection to detect repositories that should be merged.
     * 
     * @param id a id object.
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set the type of layout this repository uses for locating and
     * storing artifacts -
     *             can be <code>legacy</code> or
     * <code>default</code>.
     * 
     * @param layout a layout object.
     */
    public void setLayout( String layout )
    {
        this.layout = layout;
    } //-- void setLayout( String )

    /**
     * Set human readable name of the repository.
     * 
     * @param name a name object.
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the url of the repository, in the form
     * <code>protocol://hostname/path</code>.
     * 
     * @param url a url object.
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    /**
     * Method toString.
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        StringBuilder buf = new StringBuilder( 128 );

        buf.append( "id = '" );
        buf.append( getId() );
        buf.append( "'" );

        return buf.toString();
    } //-- java.lang.String toString()

}