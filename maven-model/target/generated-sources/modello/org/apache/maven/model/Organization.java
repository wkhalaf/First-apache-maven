// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Specifies the organization that produces this project.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Organization
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The full name of the organization.
     */
    private String name;

    /**
     * The URL to the organization's home page.
     */
    private String url;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    /**
     * Field location.
     */
    private InputLocation location;

    /**
     * Field nameLocation.
     */
    private InputLocation nameLocation;

    /**
     * Field urlLocation.
     */
    private InputLocation urlLocation;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return Organization
     */
    public Organization clone()
    {
        try
        {
            Organization copy = (Organization) super.clone();

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
    } //-- Organization clone()

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
                case "name" :
                {
                    return nameLocation;
                }
                case "url" :
                {
                    return urlLocation;
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
     * Get the full name of the organization.
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
     * Get the URL to the organization's home page.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Set the full name of the organization.
     * 
     * @param name a name object.
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the URL to the organization's home page.
     * 
     * @param url a url object.
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    
            
    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return "Organization {name=" + name + ", url=" + url + "}";
    }
            
          
}
