
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for GenericStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GenericStorageSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}StorageSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = GenericStorageSystem.class)
public class GenericStorageSystem
    extends StorageSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String location;

    @XmlElement
    protected Boolean jsonExport;
    
    @XmlElement 
    protected String jsonExportLocation;

    /**
     * Default no-arg constructor
     */
    public GenericStorageSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public GenericStorageSystem(final UUID id, final String name, final String description, final String location, final Boolean jsonExport, final String jsonExportLocation)
    {
        super(id, name, description);
        this.location = location;
        this.jsonExport = jsonExport;
        this.jsonExportLocation = jsonExportLocation;
    }

    public GenericStorageSystem(GenericStorageSystem ss)
    {
        super(ss);
        this.location = ss.location;
        this.jsonExport = ss.jsonExport;
        this.jsonExportLocation = ss.jsonExportLocation;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocation(String value)
    {
        this.location = value;
    }

    public Boolean getJsonExport() {
        return jsonExport;
    }

    public void setJsonExport(Boolean jsonExport) {
        this.jsonExport = jsonExport;
    }

    public String getJsonExportLocation() {
        return jsonExportLocation;
    }

    public void setJsonExportLocation(String jsonExportLocation) {
        this.jsonExportLocation = jsonExportLocation;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        GenericStorageSystem that = (GenericStorageSystem) o;
        return Objects.equals(getLocation(), that.getLocation()) &&
            Objects.equals(getJsonExport(), that.getJsonExport()) &&
            Objects.equals(getJsonExportLocation(), that.getJsonExportLocation());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(super.hashCode(), getLocation(), getJsonExport(), getJsonExportLocation());
    }

    @Override
    public String toString()
    {
        return "GenericStorageSystem{" + "id=" + id + ", name=" + name + ", description=" + description + 
            ", location=" + location + ", jsonExport=" + jsonExport + ", jsonExportLocation=" + jsonExportLocation + '}';
    }
}
