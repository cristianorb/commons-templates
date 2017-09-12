
package com.glookast.commons.templates;

import java.io.Serializable;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvidNexusStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidNexusStorageSystem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://templates.commons.glookast.com}AvidStorageSystem">
 *       &lt;sequence>
 *         &lt;element name="systemDirector" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workspace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidNexusStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "systemDirector",
    "workspace"
})
public class AvidNexusStorageSystem
    extends AvidStorageSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String systemDirector;
    @XmlElement(required = true)
    protected String workspace;

    /**
     * Default no-arg constructor
     *
     */
    public AvidNexusStorageSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public AvidNexusStorageSystem(final UUID id, final String name, final String description, final String systemDirector, final String workspace) {
        super(id, name, description);
        this.systemDirector = systemDirector;
        this.workspace = workspace;
    }

    public AvidNexusStorageSystem(AvidNexusStorageSystem ss)
    {
        super(ss);
        this.systemDirector = ss.systemDirector;
        this.workspace = ss.workspace;
    }

    /**
     * Gets the value of the systemDirector property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSystemDirector() {
        return systemDirector;
    }

    /**
     * Sets the value of the systemDirector property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSystemDirector(String value) {
        this.systemDirector = value;
    }

    /**
     * Gets the value of the workspace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWorkspace() {
        return workspace;
    }

    /**
     * Sets the value of the workspace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWorkspace(String value) {
        this.workspace = value;
    }

}
