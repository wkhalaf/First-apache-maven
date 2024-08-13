// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.usability.plugin;

/**
 * The root of a parameter plugin expression document.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ExpressionDocumentation
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field expressions.
     */
    private java.util.List<Expression> expressions;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addExpression.
     * 
     * @param expression a expression object.
     */
    public void addExpression( Expression expression )
    {
        getExpressions().add( expression );
    } //-- void addExpression( Expression )

    /**
     * Method getExpressions.
     * 
     * @return List
     */
    public java.util.List<Expression> getExpressions()
    {
        if ( this.expressions == null )
        {
            this.expressions = new java.util.ArrayList<Expression>();
        }

        return this.expressions;
    } //-- java.util.List<Expression> getExpressions()

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
     * Method removeExpression.
     * 
     * @param expression a expression object.
     */
    public void removeExpression( Expression expression )
    {
        getExpressions().remove( expression );
    } //-- void removeExpression( Expression )

    /**
     * Set the list of plugin parameter expressions described by
     * this
     *             document.
     * 
     * @param expressions a expressions object.
     */
    public void setExpressions( java.util.List<Expression> expressions )
    {
        this.expressions = expressions;
    } //-- void setExpressions( java.util.List )

    /**
     * Set the modelEncoding field.
     * 
     * @param modelEncoding a modelEncoding object.
     */
    public void setModelEncoding( String modelEncoding )
    {
        this.modelEncoding = modelEncoding;
    } //-- void setModelEncoding( String )

        private java.util.Map expressionsBySyntax;

    public java.util.Map getExpressionsBySyntax()
    {
        if ( expressionsBySyntax == null )
        {
            expressionsBySyntax = new java.util.HashMap();

            java.util.List expressions = getExpressions();

            if ( expressions != null && !expressions.isEmpty() )
            {
                for ( java.util.Iterator it = expressions.iterator(); it.hasNext(); )
                {
                    Expression expr = (Expression) it.next();

                    expressionsBySyntax.put( expr.getSyntax(), expr );
                }
            }
        }

        return expressionsBySyntax;
    }

    public void flushExpressionsBySyntax()
    {
        expressionsBySyntax = null;
    }

}
