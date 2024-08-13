// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.3.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.artifact.repository.metadata.io.xpp3;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.text.DateFormat;
import org.apache.maven.artifact.repository.metadata.Metadata;
import org.apache.maven.artifact.repository.metadata.Plugin;
import org.apache.maven.artifact.repository.metadata.Snapshot;
import org.apache.maven.artifact.repository.metadata.SnapshotVersion;
import org.apache.maven.artifact.repository.metadata.Versioning;
import org.codehaus.plexus.util.xml.XmlStreamReader;
import org.codehaus.plexus.util.xml.pull.EntityReplacementMap;
import org.codehaus.plexus.util.xml.pull.MXParser;
import org.codehaus.plexus.util.xml.pull.XmlPullParser;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

/**
 * Class MetadataXpp3Reader.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class MetadataXpp3Reader
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * If set the parser will be loaded with all single characters
     * from the XHTML specification.
     * The entities used:
     * <ul>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent</li>
     * </ul>
     */
    private boolean addDefaultEntities = true;

    /**
     * Field contentTransformer.
     */
    public final ContentTransformer contentTransformer;


      //----------------/
     //- Constructors -/
    //----------------/

    public MetadataXpp3Reader()
    {
        this( new ContentTransformer()
        {
            public String transform( String source, String fieldName )
            {
                return source;
            }
        } );
    } //-- org.apache.maven.artifact.repository.metadata.io.xpp3.MetadataXpp3Reader()

    public MetadataXpp3Reader(ContentTransformer contentTransformer)
    {
        this.contentTransformer = contentTransformer;
    } //-- org.apache.maven.artifact.repository.metadata.io.xpp3.MetadataXpp3Reader(ContentTransformer)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method checkFieldWithDuplicate.
     * 
     * @param parser a parser object.
     * @param parsed a parsed object.
     * @param alias a alias object.
     * @param tagName a tagName object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return boolean
     */
    private boolean checkFieldWithDuplicate( XmlPullParser parser, String tagName, String alias, java.util.Set<String> parsed )
        throws XmlPullParserException
    {
        if ( !( parser.getName().equals( tagName ) || parser.getName().equals( alias ) ) )
        {
            return false;
        }
        if ( !parsed.add( tagName ) )
        {
            throw new XmlPullParserException( "Duplicated tag: '" + tagName + "'", parser, null );
        }
        return true;
    } //-- boolean checkFieldWithDuplicate( XmlPullParser, String, String, java.util.Set )

    /**
     * Method checkUnknownAttribute.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @param tagName a tagName object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @throws IOException IOException if any.
     */
    private void checkUnknownAttribute( XmlPullParser parser, String attribute, String tagName, boolean strict )
        throws XmlPullParserException, IOException
    {
        // strictXmlAttributes = true for model: if strict == true, not only elements are checked but attributes too
        if ( strict )
        {
            throw new XmlPullParserException( "Unknown attribute '" + attribute + "' for tag '" + tagName + "'", parser, null );
        }
    } //-- void checkUnknownAttribute( XmlPullParser, String, String, boolean )

    /**
     * Method checkUnknownElement.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @throws IOException IOException if any.
     */
    private void checkUnknownElement( XmlPullParser parser, boolean strict )
        throws XmlPullParserException, IOException
    {
        if ( strict )
        {
            throw new XmlPullParserException( "Unrecognised tag: '" + parser.getName() + "'", parser, null );
        }

        for ( int unrecognizedTagCount = 1; unrecognizedTagCount > 0; )
        {
            int eventType = parser.next();
            if ( eventType == XmlPullParser.START_TAG )
            {
                unrecognizedTagCount++;
            }
            else if ( eventType == XmlPullParser.END_TAG )
            {
                unrecognizedTagCount--;
            }
        }
    } //-- void checkUnknownElement( XmlPullParser, boolean )

    /**
     * Returns the state of the "add default entities" flag.
     * 
     * @return boolean
     */
    public boolean getAddDefaultEntities()
    {
        return addDefaultEntities;
    } //-- boolean getAddDefaultEntities()

    /**
     * Method getBooleanValue.
     * 
     * @param s a s object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return boolean
     */
    private boolean getBooleanValue( String s, String attribute, XmlPullParser parser )
        throws XmlPullParserException
    {
        return getBooleanValue( s, attribute, parser, null );
    } //-- boolean getBooleanValue( String, String, XmlPullParser )

    /**
     * Method getBooleanValue.
     * 
     * @param s a s object.
     * @param defaultValue a defaultValue object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return boolean
     */
    private boolean getBooleanValue( String s, String attribute, XmlPullParser parser, String defaultValue )
        throws XmlPullParserException
    {
        if ( s != null && s.length() != 0 )
        {
            return Boolean.valueOf( s ).booleanValue();
        }
        if ( defaultValue != null )
        {
            return Boolean.valueOf( defaultValue ).booleanValue();
        }
        return false;
    } //-- boolean getBooleanValue( String, String, XmlPullParser, String )

    /**
     * Method getByteValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return byte
     */
    private byte getByteValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            try
            {
                return Byte.valueOf( s ).byteValue();
            }
            catch ( NumberFormatException nfe )
            {
                if ( strict )
                {
                    throw new XmlPullParserException( "Unable to parse element '" + attribute + "', must be a byte", parser, nfe );
                }
            }
        }
        return 0;
    } //-- byte getByteValue( String, String, XmlPullParser, boolean )

    /**
     * Method getCharacterValue.
     * 
     * @param s a s object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return char
     */
    private char getCharacterValue( String s, String attribute, XmlPullParser parser )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            return s.charAt( 0 );
        }
        return 0;
    } //-- char getCharacterValue( String, String, XmlPullParser )

    /**
     * Method getDateValue.
     * 
     * @param s a s object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Date
     */
    private java.util.Date getDateValue( String s, String attribute, XmlPullParser parser )
        throws XmlPullParserException
    {
        return getDateValue( s, attribute, null, parser );
    } //-- java.util.Date getDateValue( String, String, XmlPullParser )

    /**
     * Method getDateValue.
     * 
     * @param s a s object.
     * @param parser a parser object.
     * @param dateFormat a dateFormat object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Date
     */
    private java.util.Date getDateValue( String s, String attribute, String dateFormat, XmlPullParser parser )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            String effectiveDateFormat = dateFormat;
            if ( dateFormat == null )
            {
                effectiveDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS";
            }
            if ( "long".equals( effectiveDateFormat ) )
            {
                try
                {
                    return new java.util.Date( Long.parseLong( s ) );
                }
                catch ( NumberFormatException e )
                {
                    throw new XmlPullParserException( e.getMessage(), parser, e );
                }
            }
            else
            {
                try
                {
                    DateFormat dateParser = new java.text.SimpleDateFormat( effectiveDateFormat, java.util.Locale.US );
                    return dateParser.parse( s );
                }
                catch ( java.text.ParseException e )
                {
                    throw new XmlPullParserException( e.getMessage(), parser, e );
                }
            }
        }
        return null;
    } //-- java.util.Date getDateValue( String, String, String, XmlPullParser )

    /**
     * Method getDoubleValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return double
     */
    private double getDoubleValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            try
            {
                return Double.valueOf( s ).doubleValue();
            }
            catch ( NumberFormatException nfe )
            {
                if ( strict )
                {
                    throw new XmlPullParserException( "Unable to parse element '" + attribute + "', must be a floating point number", parser, nfe );
                }
            }
        }
        return 0;
    } //-- double getDoubleValue( String, String, XmlPullParser, boolean )

    /**
     * Method getFloatValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return float
     */
    private float getFloatValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            try
            {
                return Float.valueOf( s ).floatValue();
            }
            catch ( NumberFormatException nfe )
            {
                if ( strict )
                {
                    throw new XmlPullParserException( "Unable to parse element '" + attribute + "', must be a floating point number", parser, nfe );
                }
            }
        }
        return 0;
    } //-- float getFloatValue( String, String, XmlPullParser, boolean )

    /**
     * Method getIntegerValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return int
     */
    private int getIntegerValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            try
            {
                return Integer.valueOf( s ).intValue();
            }
            catch ( NumberFormatException nfe )
            {
                if ( strict )
                {
                    throw new XmlPullParserException( "Unable to parse element '" + attribute + "', must be an integer", parser, nfe );
                }
            }
        }
        return 0;
    } //-- int getIntegerValue( String, String, XmlPullParser, boolean )

    /**
     * Method getLongValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return long
     */
    private long getLongValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            try
            {
                return Long.valueOf( s ).longValue();
            }
            catch ( NumberFormatException nfe )
            {
                if ( strict )
                {
                    throw new XmlPullParserException( "Unable to parse element '" + attribute + "', must be a long integer", parser, nfe );
                }
            }
        }
        return 0;
    } //-- long getLongValue( String, String, XmlPullParser, boolean )

    /**
     * Method getRequiredAttributeValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return String
     */
    private String getRequiredAttributeValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s == null )
        {
            if ( strict )
            {
                throw new XmlPullParserException( "Missing required value for attribute '" + attribute + "'", parser, null );
            }
        }
        return s;
    } //-- String getRequiredAttributeValue( String, String, XmlPullParser, boolean )

    /**
     * Method getShortValue.
     * 
     * @param s a s object.
     * @param strict a strict object.
     * @param parser a parser object.
     * @param attribute a attribute object.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return short
     */
    private short getShortValue( String s, String attribute, XmlPullParser parser, boolean strict )
        throws XmlPullParserException
    {
        if ( s != null )
        {
            try
            {
                return Short.valueOf( s ).shortValue();
            }
            catch ( NumberFormatException nfe )
            {
                if ( strict )
                {
                    throw new XmlPullParserException( "Unable to parse element '" + attribute + "', must be a short integer", parser, nfe );
                }
            }
        }
        return 0;
    } //-- short getShortValue( String, String, XmlPullParser, boolean )

    /**
     * Method getTrimmedValue.
     * 
     * @param s a s object.
     * @return String
     */
    private String getTrimmedValue( String s )
    {
        if ( s != null )
        {
            s = s.trim();
        }
        return s;
    } //-- String getTrimmedValue( String )

    /**
     * Method interpolatedTrimmed.
     * 
     * @param value a value object.
     * @param context a context object.
     * @return String
     */
    private String interpolatedTrimmed( String value, String context )
    {
        return getTrimmedValue( contentTransformer.transform( value, context ) );
    } //-- String interpolatedTrimmed( String, String )

    /**
     * Method nextTag.
     * 
     * @param parser a parser object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return int
     */
    private int nextTag( XmlPullParser parser )
        throws IOException, XmlPullParserException
    {
        int eventType = parser.next();
        if ( eventType == XmlPullParser.TEXT )
        {
            eventType = parser.next();
        }
        if ( eventType != XmlPullParser.START_TAG && eventType != XmlPullParser.END_TAG )
        {
            throw new XmlPullParserException( "expected START_TAG or END_TAG not " + XmlPullParser.TYPES[eventType], parser, null );
        }
        return eventType;
    } //-- int nextTag( XmlPullParser )

    /**
     * Method read.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Metadata
     */
    public Metadata read( XmlPullParser parser, boolean strict )
        throws IOException, XmlPullParserException
    {
        Metadata metadata = null;
        int eventType = parser.getEventType();
        boolean parsed = false;
        while ( eventType != XmlPullParser.END_DOCUMENT )
        {
            if ( eventType == XmlPullParser.START_TAG )
            {
                if ( strict && ! "metadata".equals( parser.getName() ) )
                {
                    throw new XmlPullParserException( "Expected root element 'metadata' but found '" + parser.getName() + "'", parser, null );
                }
                else if ( parsed )
                {
                    // fallback, already expected a XmlPullParserException due to invalid XML
                    throw new XmlPullParserException( "Duplicated tag: 'metadata'", parser, null );
                }
                metadata = parseMetadata( parser, strict );
                metadata.setModelEncoding( parser.getInputEncoding() );
                parsed = true;
            }
            eventType = parser.next();
        }
        if ( parsed )
        {
            return metadata;
        }
        throw new XmlPullParserException( "Expected root element 'metadata' but found no element at all: invalid XML document", parser, null );
    } //-- Metadata read( XmlPullParser, boolean )

    /**
     * @see XmlStreamReader
     * 
     * @param reader a reader object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Metadata
     */
    public Metadata read( Reader reader, boolean strict )
        throws IOException, XmlPullParserException
    {
        XmlPullParser parser = addDefaultEntities ? new MXParser(EntityReplacementMap.defaultEntityReplacementMap) : new MXParser( );

        parser.setInput( reader );


        return read( parser, strict );
    } //-- Metadata read( Reader, boolean )

    /**
     * @see XmlStreamReader
     * 
     * @param reader a reader object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Metadata
     */
    public Metadata read( Reader reader )
        throws IOException, XmlPullParserException
    {
        return read( reader, true );
    } //-- Metadata read( Reader )

    /**
     * Method read.
     * 
     * @param in a in object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Metadata
     */
    public Metadata read( InputStream in, boolean strict )
        throws IOException, XmlPullParserException
    {
        return read( new XmlStreamReader( in ), strict );
    } //-- Metadata read( InputStream, boolean )

    /**
     * Method read.
     * 
     * @param in a in object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Metadata
     */
    public Metadata read( InputStream in )
        throws IOException, XmlPullParserException
    {
        return read( new XmlStreamReader( in ) );
    } //-- Metadata read( InputStream )

    /**
     * Method parseMetadata.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Metadata
     */
    private Metadata parseMetadata( XmlPullParser parser, boolean strict )
        throws IOException, XmlPullParserException
    {
        String tagName = parser.getName();
        Metadata metadata = new Metadata();
        for ( int i = parser.getAttributeCount() - 1; i >= 0; i-- )
        {
            String name = parser.getAttributeName( i );
            String value = parser.getAttributeValue( i );

            if ( name.indexOf( ':' ) >= 0 )
            {
                // just ignore attributes with non-default namespace (for example: xmlns:xsi)
            }
            else if ( "xmlns".equals( name ) )
            {
                // ignore xmlns attribute in root class, which is a reserved attribute name
            }
            else if ( "modelVersion".equals( name ) )
            {
                metadata.setModelVersion( interpolatedTrimmed( value, "modelVersion" ) );
            }
            else
            {
                checkUnknownAttribute( parser, name, tagName, strict );
            }
        }
        java.util.Set<String> parsed = new java.util.HashSet<String>();
        while ( ( strict ? parser.nextTag() : nextTag( parser ) ) == XmlPullParser.START_TAG )
        {
            if ( checkFieldWithDuplicate( parser, "groupId", null, parsed ) )
            {
                metadata.setGroupId( interpolatedTrimmed( parser.nextText(), "groupId" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "artifactId", null, parsed ) )
            {
                metadata.setArtifactId( interpolatedTrimmed( parser.nextText(), "artifactId" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "versioning", null, parsed ) )
            {
                metadata.setVersioning( parseVersioning( parser, strict ) );
            }
            else if ( checkFieldWithDuplicate( parser, "version", null, parsed ) )
            {
                metadata.setVersion( interpolatedTrimmed( parser.nextText(), "version" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "plugins", null, parsed ) )
            {
                java.util.List<Plugin> plugins = new java.util.ArrayList<Plugin>();
                while ( parser.nextTag() == XmlPullParser.START_TAG )
                {
                    if ( "plugin".equals( parser.getName() ) )
                    {
                        plugins.add( parsePlugin( parser, strict ) );
                    }
                    else
                    {
                        checkUnknownElement( parser, strict );
                    }
                }
                metadata.setPlugins( plugins );
            }
            else
            {
                checkUnknownElement( parser, strict );
            }
        }
        return metadata;
    } //-- Metadata parseMetadata( XmlPullParser, boolean )

    /**
     * Method parsePlugin.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Plugin
     */
    private Plugin parsePlugin( XmlPullParser parser, boolean strict )
        throws IOException, XmlPullParserException
    {
        String tagName = parser.getName();
        Plugin plugin = new Plugin();
        for ( int i = parser.getAttributeCount() - 1; i >= 0; i-- )
        {
            String name = parser.getAttributeName( i );
            String value = parser.getAttributeValue( i );

            if ( name.indexOf( ':' ) >= 0 )
            {
                // just ignore attributes with non-default namespace (for example: xmlns:xsi)
            }
            else
            {
                checkUnknownAttribute( parser, name, tagName, strict );
            }
        }
        java.util.Set<String> parsed = new java.util.HashSet<String>();
        while ( ( strict ? parser.nextTag() : nextTag( parser ) ) == XmlPullParser.START_TAG )
        {
            if ( checkFieldWithDuplicate( parser, "name", null, parsed ) )
            {
                plugin.setName( interpolatedTrimmed( parser.nextText(), "name" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "prefix", null, parsed ) )
            {
                plugin.setPrefix( interpolatedTrimmed( parser.nextText(), "prefix" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "artifactId", null, parsed ) )
            {
                plugin.setArtifactId( interpolatedTrimmed( parser.nextText(), "artifactId" ) );
            }
            else
            {
                checkUnknownElement( parser, strict );
            }
        }
        return plugin;
    } //-- Plugin parsePlugin( XmlPullParser, boolean )

    /**
     * Method parseSnapshot.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Snapshot
     */
    private Snapshot parseSnapshot( XmlPullParser parser, boolean strict )
        throws IOException, XmlPullParserException
    {
        String tagName = parser.getName();
        Snapshot snapshot = new Snapshot();
        for ( int i = parser.getAttributeCount() - 1; i >= 0; i-- )
        {
            String name = parser.getAttributeName( i );
            String value = parser.getAttributeValue( i );

            if ( name.indexOf( ':' ) >= 0 )
            {
                // just ignore attributes with non-default namespace (for example: xmlns:xsi)
            }
            else
            {
                checkUnknownAttribute( parser, name, tagName, strict );
            }
        }
        java.util.Set<String> parsed = new java.util.HashSet<String>();
        while ( ( strict ? parser.nextTag() : nextTag( parser ) ) == XmlPullParser.START_TAG )
        {
            if ( checkFieldWithDuplicate( parser, "timestamp", null, parsed ) )
            {
                snapshot.setTimestamp( interpolatedTrimmed( parser.nextText(), "timestamp" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "buildNumber", null, parsed ) )
            {
                snapshot.setBuildNumber( getIntegerValue( interpolatedTrimmed( parser.nextText(), "buildNumber" ), "buildNumber", parser, strict ) );
            }
            else if ( checkFieldWithDuplicate( parser, "localCopy", null, parsed ) )
            {
                snapshot.setLocalCopy( getBooleanValue( interpolatedTrimmed( parser.nextText(), "localCopy" ), "localCopy", parser, "false" ) );
            }
            else
            {
                checkUnknownElement( parser, strict );
            }
        }
        return snapshot;
    } //-- Snapshot parseSnapshot( XmlPullParser, boolean )

    /**
     * Method parseSnapshotVersion.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return SnapshotVersion
     */
    private SnapshotVersion parseSnapshotVersion( XmlPullParser parser, boolean strict )
        throws IOException, XmlPullParserException
    {
        String tagName = parser.getName();
        SnapshotVersion snapshotVersion = new SnapshotVersion();
        for ( int i = parser.getAttributeCount() - 1; i >= 0; i-- )
        {
            String name = parser.getAttributeName( i );
            String value = parser.getAttributeValue( i );

            if ( name.indexOf( ':' ) >= 0 )
            {
                // just ignore attributes with non-default namespace (for example: xmlns:xsi)
            }
            else
            {
                checkUnknownAttribute( parser, name, tagName, strict );
            }
        }
        java.util.Set<String> parsed = new java.util.HashSet<String>();
        while ( ( strict ? parser.nextTag() : nextTag( parser ) ) == XmlPullParser.START_TAG )
        {
            if ( checkFieldWithDuplicate( parser, "classifier", null, parsed ) )
            {
                snapshotVersion.setClassifier( interpolatedTrimmed( parser.nextText(), "classifier" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "extension", null, parsed ) )
            {
                snapshotVersion.setExtension( interpolatedTrimmed( parser.nextText(), "extension" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "value", null, parsed ) )
            {
                snapshotVersion.setVersion( interpolatedTrimmed( parser.nextText(), "value" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "updated", null, parsed ) )
            {
                snapshotVersion.setUpdated( interpolatedTrimmed( parser.nextText(), "updated" ) );
            }
            else
            {
                checkUnknownElement( parser, strict );
            }
        }
        return snapshotVersion;
    } //-- SnapshotVersion parseSnapshotVersion( XmlPullParser, boolean )

    /**
     * Method parseVersioning.
     * 
     * @param parser a parser object.
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Versioning
     */
    private Versioning parseVersioning( XmlPullParser parser, boolean strict )
        throws IOException, XmlPullParserException
    {
        String tagName = parser.getName();
        Versioning versioning = new Versioning();
        for ( int i = parser.getAttributeCount() - 1; i >= 0; i-- )
        {
            String name = parser.getAttributeName( i );
            String value = parser.getAttributeValue( i );

            if ( name.indexOf( ':' ) >= 0 )
            {
                // just ignore attributes with non-default namespace (for example: xmlns:xsi)
            }
            else
            {
                checkUnknownAttribute( parser, name, tagName, strict );
            }
        }
        java.util.Set<String> parsed = new java.util.HashSet<String>();
        while ( ( strict ? parser.nextTag() : nextTag( parser ) ) == XmlPullParser.START_TAG )
        {
            if ( checkFieldWithDuplicate( parser, "latest", null, parsed ) )
            {
                versioning.setLatest( interpolatedTrimmed( parser.nextText(), "latest" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "release", null, parsed ) )
            {
                versioning.setRelease( interpolatedTrimmed( parser.nextText(), "release" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "versions", null, parsed ) )
            {
                java.util.List<String> versions = new java.util.ArrayList<String>();
                while ( parser.nextTag() == XmlPullParser.START_TAG )
                {
                    if ( "version".equals( parser.getName() ) )
                    {
                        versions.add( interpolatedTrimmed( parser.nextText(), "versions" ) );
                    }
                    else
                    {
                        checkUnknownElement( parser, strict );
                    }
                }
                versioning.setVersions( versions );
            }
            else if ( checkFieldWithDuplicate( parser, "lastUpdated", null, parsed ) )
            {
                versioning.setLastUpdated( interpolatedTrimmed( parser.nextText(), "lastUpdated" ) );
            }
            else if ( checkFieldWithDuplicate( parser, "snapshot", null, parsed ) )
            {
                versioning.setSnapshot( parseSnapshot( parser, strict ) );
            }
            else if ( checkFieldWithDuplicate( parser, "snapshotVersions", null, parsed ) )
            {
                java.util.List<SnapshotVersion> snapshotVersions = new java.util.ArrayList<SnapshotVersion>();
                while ( parser.nextTag() == XmlPullParser.START_TAG )
                {
                    if ( "snapshotVersion".equals( parser.getName() ) )
                    {
                        snapshotVersions.add( parseSnapshotVersion( parser, strict ) );
                    }
                    else
                    {
                        checkUnknownElement( parser, strict );
                    }
                }
                versioning.setSnapshotVersions( snapshotVersions );
            }
            else
            {
                checkUnknownElement( parser, strict );
            }
        }
        return versioning;
    } //-- Versioning parseVersioning( XmlPullParser, boolean )

    /**
     * Sets the state of the "add default entities" flag.
     * 
     * @param addDefaultEntities a addDefaultEntities object.
     */
    public void setAddDefaultEntities( boolean addDefaultEntities )
    {
        this.addDefaultEntities = addDefaultEntities;
    } //-- void setAddDefaultEntities( boolean )

    public static interface ContentTransformer
{
    /**
     * Interpolate the value read from the xpp3 document
     * @param source The source value
     * @param fieldName A description of the field being interpolated. The implementation may use this to
     *                           log stuff.
     * @return The interpolated value.
     */
    String transform( String source, String fieldName );
}

}
