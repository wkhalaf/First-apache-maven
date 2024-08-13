// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Contains the configuration information of the container like
 * Plugin.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ConfigurationContainer
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             Whether any configuration should be propagated
     * to child POMs. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>. Default value is
     * <code>true</code>.
     *             
     *           
     */
    private String inherited;

    /**
     * 
     *             
     *             <p>The configuration as DOM object.</p>
     *             <p>By default, every element content is trimmed,
     * but starting with Maven 3.1.0, you can add
     *             <code>xml:space="preserve"</code> to elements
     * you want to preserve whitespace.</p>
     *             <p>You can control how child POMs inherit
     * configuration from parent POMs by adding
     * <code>combine.children</code>
     *             or <code>combine.self</code> attributes to the
     * children of the configuration element:</p>
     *             <ul>
     *             <li><code>combine.children</code>: available
     * values are <code>merge</code> (default) and
     * <code>append</code>,</li>
     *             <li><code>combine.self</code>: available values
     * are <code>merge</code> (default) and
     * <code>override</code>.</li>
     *             </ul>
     *             <p>See <a
     * href="https://maven.apache.org/pom.html#Plugins">POM
     * Reference documentation</a> and
     *             <a
     * href="https://codehaus-plexus.github.io/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html">Xpp3DomUtils</a>
     *             for more information.</p>
     *             
     *           
     */
    private Object configuration;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    /**
     * Field location.
     */
    private InputLocation location;

    /**
     * Field inheritedLocation.
     */
    private InputLocation inheritedLocation;

    /**
     * Field configurationLocation.
     */
    private InputLocation configurationLocation;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return ConfigurationContainer
     */
    public ConfigurationContainer clone()
    {
        try
        {
            ConfigurationContainer copy = (ConfigurationContainer) super.clone();

            if ( this.configuration != null )
            {
                copy.configuration = new org.codehaus.plexus.util.xml.Xpp3Dom( (org.codehaus.plexus.util.xml.Xpp3Dom) this.configuration );
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
    } //-- ConfigurationContainer clone()

    /**
     * Get <p>The configuration as DOM object.</p>
     *             <p>By default, every element content is trimmed,
     * but starting with Maven 3.1.0, you can add
     *             <code>xml:space="preserve"</code> to elements
     * you want to preserve whitespace.</p>
     *             <p>You can control how child POMs inherit
     * configuration from parent POMs by adding
     * <code>combine.children</code>
     *             or <code>combine.self</code> attributes to the
     * children of the configuration element:</p>
     *             <ul>
     *             <li><code>combine.children</code>: available
     * values are <code>merge</code> (default) and
     * <code>append</code>,</li>
     *             <li><code>combine.self</code>: available values
     * are <code>merge</code> (default) and
     * <code>override</code>.</li>
     *             </ul>
     *             <p>See <a
     * href="https://maven.apache.org/pom.html#Plugins">POM
     * Reference documentation</a> and
     *             <a
     * href="https://codehaus-plexus.github.io/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html">Xpp3DomUtils</a>
     *             for more information.</p>
     * 
     * @return Object
     */
    public Object getConfiguration()
    {
        return this.configuration;
    } //-- Object getConfiguration()

    /**
     * Get whether any configuration should be propagated to child
     * POMs. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>. Default value is
     * <code>true</code>.
     * 
     * @return String
     */
    public String getInherited()
    {
        return this.inherited;
    } //-- String getInherited()

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
                case "inherited" :
                {
                    return inheritedLocation;
                }
                case "configuration" :
                {
                    return configurationLocation;
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
                case "inherited" :
                {
                    inheritedLocation = location;
                    return;
                }
                case "configuration" :
                {
                    configurationLocation = location;
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
     * Set <p>The configuration as DOM object.</p>
     *             <p>By default, every element content is trimmed,
     * but starting with Maven 3.1.0, you can add
     *             <code>xml:space="preserve"</code> to elements
     * you want to preserve whitespace.</p>
     *             <p>You can control how child POMs inherit
     * configuration from parent POMs by adding
     * <code>combine.children</code>
     *             or <code>combine.self</code> attributes to the
     * children of the configuration element:</p>
     *             <ul>
     *             <li><code>combine.children</code>: available
     * values are <code>merge</code> (default) and
     * <code>append</code>,</li>
     *             <li><code>combine.self</code>: available values
     * are <code>merge</code> (default) and
     * <code>override</code>.</li>
     *             </ul>
     *             <p>See <a
     * href="https://maven.apache.org/pom.html#Plugins">POM
     * Reference documentation</a> and
     *             <a
     * href="https://codehaus-plexus.github.io/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html">Xpp3DomUtils</a>
     *             for more information.</p>
     * 
     * @param configuration a configuration object.
     */
    public void setConfiguration( Object configuration )
    {
        this.configuration = configuration;
    } //-- void setConfiguration( Object )

    /**
     * Set whether any configuration should be propagated to child
     * POMs. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>. Default value is
     * <code>true</code>.
     * 
     * @param inherited a inherited object.
     */
    public void setInherited( String inherited )
    {
        this.inherited = inherited;
    } //-- void setInherited( String )

    
            
    public boolean isInherited()
    {
        return ( inherited != null ) ? Boolean.parseBoolean( inherited ) : true;
    }

    public void setInherited( boolean inherited )
    {
        this.inherited = String.valueOf( inherited );
    }

    private boolean inheritanceApplied = true;

    public void unsetInheritanceApplied()
    {
        this.inheritanceApplied = false;
    }

    public boolean isInheritanceApplied()
    {
        return inheritanceApplied;
    }
            
          
}
