// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.usability.plugin;

/**
 * A plugin parameter expression supported by Maven.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Expression
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The syntax of the expression.
     */
    private String syntax;

    /**
     * The description of what this expression references, and what
     * it's generally used for.
     */
    private String description;

    /**
     * The place and syntax used to change the value of this
     * expression.
     */
    private String configuration;

    /**
     * Field cliOptions.
     */
    private java.util.Properties cliOptions;

    /**
     * Field apiMethods.
     */
    private java.util.Properties apiMethods;

    /**
     * A preferred alternative to this expression, in the case
     * where it's deprecated.
     */
    private String deprecation;

    /**
     * A preferred alternative to this expression, in the case
     * where it's banned from use.
     */
    private String ban;

    /**
     * Whether the value of this expression can be changed.
     */
    private boolean editable = true;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addApiMethod.
     * 
     * @param key a key object.
     * @param value a value object.
     */
    public void addApiMethod( String key, String value )
    {
        getApiMethods().put( key, value );
    } //-- void addApiMethod( String, String )

    /**
     * Method addCliOption.
     * 
     * @param key a key object.
     * @param value a value object.
     */
    public void addCliOption( String key, String value )
    {
        getCliOptions().put( key, value );
    } //-- void addCliOption( String, String )

    /**
     * Method getApiMethods.
     * 
     * @return Properties
     */
    public java.util.Properties getApiMethods()
    {
        if ( this.apiMethods == null )
        {
            this.apiMethods = new java.util.Properties();
        }

        return this.apiMethods;
    } //-- java.util.Properties getApiMethods()

    /**
     * Get a preferred alternative to this expression, in the case
     * where it's banned from use.
     * 
     * @return String
     */
    public String getBan()
    {
        return this.ban;
    } //-- String getBan()

    /**
     * Method getCliOptions.
     * 
     * @return Properties
     */
    public java.util.Properties getCliOptions()
    {
        if ( this.cliOptions == null )
        {
            this.cliOptions = new java.util.Properties();
        }

        return this.cliOptions;
    } //-- java.util.Properties getCliOptions()

    /**
     * Get the place and syntax used to change the value of this
     * expression.
     * 
     * @return String
     */
    public String getConfiguration()
    {
        return this.configuration;
    } //-- String getConfiguration()

    /**
     * Get a preferred alternative to this expression, in the case
     * where it's deprecated.
     * 
     * @return String
     */
    public String getDeprecation()
    {
        return this.deprecation;
    } //-- String getDeprecation()

    /**
     * Get the description of what this expression references, and
     * what it's generally used for.
     * 
     * @return String
     */
    public String getDescription()
    {
        return this.description;
    } //-- String getDescription()

    /**
     * Get the syntax of the expression.
     * 
     * @return String
     */
    public String getSyntax()
    {
        return this.syntax;
    } //-- String getSyntax()

    /**
     * Get whether the value of this expression can be changed.
     * 
     * @return boolean
     */
    public boolean isEditable()
    {
        return this.editable;
    } //-- boolean isEditable()

    /**
     * Set the programmatic methods used to change the value of
     * this expression.
     * 
     * @param apiMethods a apiMethods object.
     */
    public void setApiMethods( java.util.Properties apiMethods )
    {
        this.apiMethods = apiMethods;
    } //-- void setApiMethods( java.util.Properties )

    /**
     * Set a preferred alternative to this expression, in the case
     * where it's banned from use.
     * 
     * @param ban a ban object.
     */
    public void setBan( String ban )
    {
        this.ban = ban;
    } //-- void setBan( String )

    /**
     * Set the command-line switches used to change the value of
     * this expression.
     * 
     * @param cliOptions a cliOptions object.
     */
    public void setCliOptions( java.util.Properties cliOptions )
    {
        this.cliOptions = cliOptions;
    } //-- void setCliOptions( java.util.Properties )

    /**
     * Set the place and syntax used to change the value of this
     * expression.
     * 
     * @param configuration a configuration object.
     */
    public void setConfiguration( String configuration )
    {
        this.configuration = configuration;
    } //-- void setConfiguration( String )

    /**
     * Set a preferred alternative to this expression, in the case
     * where it's deprecated.
     * 
     * @param deprecation a deprecation object.
     */
    public void setDeprecation( String deprecation )
    {
        this.deprecation = deprecation;
    } //-- void setDeprecation( String )

    /**
     * Set the description of what this expression references, and
     * what it's generally used for.
     * 
     * @param description a description object.
     */
    public void setDescription( String description )
    {
        this.description = description;
    } //-- void setDescription( String )

    /**
     * Set whether the value of this expression can be changed.
     * 
     * @param editable a editable object.
     */
    public void setEditable( boolean editable )
    {
        this.editable = editable;
    } //-- void setEditable( boolean )

    /**
     * Set the syntax of the expression.
     * 
     * @param syntax a syntax object.
     */
    public void setSyntax( String syntax )
    {
        this.syntax = syntax;
    } //-- void setSyntax( String )

}