// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.cli.internal.extension.model;

/**
 * Extensions to load.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class CoreExtensions
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field extensions.
     */
    private java.util.List<CoreExtension> extensions;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addExtension.
     * 
     * @param coreExtension a coreExtension object.
     */
    public void addExtension( CoreExtension coreExtension )
    {
        getExtensions().add( coreExtension );
    } //-- void addExtension( CoreExtension )

    /**
     * Method getExtensions.
     * 
     * @return List
     */
    public java.util.List<CoreExtension> getExtensions()
    {
        if ( this.extensions == null )
        {
            this.extensions = new java.util.ArrayList<CoreExtension>();
        }

        return this.extensions;
    } //-- java.util.List<CoreExtension> getExtensions()

    /**
     * Get the modelEncoding field.
     * 
     * @return String
     */
    public String getModelEncoding()
    {
        return this.modelEncoding;
    } //-- String getModelEncoding()

    /**
     * Method removeExtension.
     * 
     * @param coreExtension a coreExtension object.
     */
    public void removeExtension( CoreExtension coreExtension )
    {
        getExtensions().remove( coreExtension );
    } //-- void removeExtension( CoreExtension )

    /**
     * Set a set of build extensions to use from this project.
     * 
     * @param extensions a extensions object.
     */
    public void setExtensions( java.util.List<CoreExtension> extensions )
    {
        this.extensions = extensions;
    } //-- void setExtensions( java.util.List )

    /**
     * Set the modelEncoding field.
     * 
     * @param modelEncoding a modelEncoding object.
     */
    public void setModelEncoding( String modelEncoding )
    {
        this.modelEncoding = modelEncoding;
    } //-- void setModelEncoding( String )

}
