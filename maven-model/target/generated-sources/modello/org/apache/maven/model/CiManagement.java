// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * 
 *         
 *         The <code>&lt;CiManagement&gt;</code> element contains
 * informations required to the
 *         continuous integration system of the project.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class CiManagement
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             The name of the continuous integration system,
     * e.g. <code>continuum</code>.
     *             
     *           
     */
    private String system;

    /**
     * URL for the continuous integration system used by the
     * project if it has a web
     *             interface.
     */
    private String url;

    /**
     * Field notifiers.
     */
    private java.util.List<Notifier> notifiers;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    /**
     * Field location.
     */
    private InputLocation location;

    /**
     * Field systemLocation.
     */
    private InputLocation systemLocation;

    /**
     * Field urlLocation.
     */
    private InputLocation urlLocation;

    /**
     * Field notifiersLocation.
     */
    private InputLocation notifiersLocation;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addNotifier.
     * 
     * @param notifier a notifier object.
     */
    public void addNotifier( Notifier notifier )
    {
        getNotifiers().add( notifier );
    } //-- void addNotifier( Notifier )

    /**
     * Method clone.
     * 
     * @return CiManagement
     */
    public CiManagement clone()
    {
        try
        {
            CiManagement copy = (CiManagement) super.clone();

            if ( this.notifiers != null )
            {
                copy.notifiers = new java.util.ArrayList<Notifier>();
                for ( Notifier item : this.notifiers )
                {
                    copy.notifiers.add( ( (Notifier) item).clone() );
                }
            }

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
    } //-- CiManagement clone()

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
                case "system" :
                {
                    return systemLocation;
                }
                case "url" :
                {
                    return urlLocation;
                }
                case "notifiers" :
                {
                    return notifiersLocation;
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
     * Method getNotifiers.
     * 
     * @return List
     */
    public java.util.List<Notifier> getNotifiers()
    {
        if ( this.notifiers == null )
        {
            this.notifiers = new java.util.ArrayList<Notifier>();
        }

        return this.notifiers;
    } //-- java.util.List<Notifier> getNotifiers()

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
                case "system" :
                {
                    systemLocation = location;
                    return;
                }
                case "url" :
                {
                    urlLocation = location;
                    return;
                }
                case "notifiers" :
                {
                    notifiersLocation = location;
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
     * Get the name of the continuous integration system, e.g.
     * <code>continuum</code>.
     * 
     * @return String
     */
    public String getSystem()
    {
        return this.system;
    } //-- String getSystem()

    /**
     * Get uRL for the continuous integration system used by the
     * project if it has a web
     *             interface.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Method removeNotifier.
     * 
     * @param notifier a notifier object.
     */
    public void removeNotifier( Notifier notifier )
    {
        getNotifiers().remove( notifier );
    } //-- void removeNotifier( Notifier )

    /**
     * Set configuration for notifying developers/users when a
     * build is unsuccessful,
     *             including user information and notification
     * mode.
     * 
     * @param notifiers a notifiers object.
     */
    public void setNotifiers( java.util.List<Notifier> notifiers )
    {
        this.notifiers = notifiers;
    } //-- void setNotifiers( java.util.List )

    /**
     * Set the name of the continuous integration system, e.g.
     * <code>continuum</code>.
     * 
     * @param system a system object.
     */
    public void setSystem( String system )
    {
        this.system = system;
    } //-- void setSystem( String )

    /**
     * Set uRL for the continuous integration system used by the
     * project if it has a web
     *             interface.
     * 
     * @param url a url object.
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

}
