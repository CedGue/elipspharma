//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.11.08 at 10:05:49 AM CET
//

package fr.pharma.eclipse.domain.model.sigrec;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for ServicesType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date-arrivee" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="date-depart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="consolidation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="coordonnees" type="{http://sigrec.ClinicalTrialApplication.xsd}ContactDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicesType", propOrder =
{"id", "libelle", "dateArrivee", "dateDepart", "consolidation", "coordonnees" })
public class ServicesType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String libelle;
    @XmlElement(name = "date-arrivee", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateArrivee;
    @XmlElement(name = "date-depart", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDepart;
    protected String consolidation;
    @XmlElement(required = true)
    protected ContactDetailsType coordonnees;

    /**
     * Gets the value of the id property.
     * @return possible object is {@link String }
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * @param value allowed object is {@link String }
     */
    public void setId(final String value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the libelle property.
     * @return possible object is {@link String }
     */
    public String getLibelle()
    {
        return this.libelle;
    }

    /**
     * Sets the value of the libelle property.
     * @param value allowed object is {@link String }
     */
    public void setLibelle(final String value)
    {
        this.libelle = value;
    }

    /**
     * Gets the value of the dateArrivee property.
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDateArrivee()
    {
        return this.dateArrivee;
    }

    /**
     * Sets the value of the dateArrivee property.
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setDateArrivee(final XMLGregorianCalendar value)
    {
        this.dateArrivee = value;
    }

    /**
     * Gets the value of the dateDepart property.
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDateDepart()
    {
        return this.dateDepart;
    }

    /**
     * Sets the value of the dateDepart property.
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setDateDepart(final XMLGregorianCalendar value)
    {
        this.dateDepart = value;
    }

    /**
     * Gets the value of the consolidation property.
     * @return possible object is {@link String }
     */
    public String getConsolidation()
    {
        return this.consolidation;
    }

    /**
     * Sets the value of the consolidation property.
     * @param value allowed object is {@link String }
     */
    public void setConsolidation(final String value)
    {
        this.consolidation = value;
    }

    /**
     * Gets the value of the coordonnees property.
     * @return possible object is {@link ContactDetailsType }
     */
    public ContactDetailsType getCoordonnees()
    {
        return this.coordonnees;
    }

    /**
     * Sets the value of the coordonnees property.
     * @param value allowed object is {@link ContactDetailsType }
     */
    public void setCoordonnees(final ContactDetailsType value)
    {
        this.coordonnees = value;
    }

}