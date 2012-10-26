//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.11.08 at 10:05:49 AM CET
//

package fr.pharma.eclipse.domain.model.sigrec;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for inclusionType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inclusionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="inclusion-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signature-consentement-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="intervenant-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inclus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="node-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inclusionType", propOrder =
{

})
public class InclusionType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "inclusion-id")
    protected String inclusionId;
    @XmlElementRef(name = "signature-consentement-date", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> signatureConsentementDate;
    @XmlElement(name = "intervenant-id")
    protected String intervenantId;
    protected String inclus;
    @XmlAttribute(name = "node-id")
    protected String nodeId;

    /**
     * Gets the value of the inclusionId property.
     * @return possible object is {@link String }
     */
    public String getInclusionId()
    {
        return this.inclusionId;
    }

    /**
     * Sets the value of the inclusionId property.
     * @param value allowed object is {@link String }
     */
    public void setInclusionId(final String value)
    {
        this.inclusionId = value;
    }

    /**
     * Gets the value of the signatureConsentementDate property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getSignatureConsentementDate()
    {
        return this.signatureConsentementDate;
    }

    /**
     * Sets the value of the signatureConsentementDate property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setSignatureConsentementDate(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.signatureConsentementDate = (value);
    }

    /**
     * Gets the value of the intervenantId property.
     * @return possible object is {@link String }
     */
    public String getIntervenantId()
    {
        return this.intervenantId;
    }

    /**
     * Sets the value of the intervenantId property.
     * @param value allowed object is {@link String }
     */
    public void setIntervenantId(final String value)
    {
        this.intervenantId = value;
    }

    /**
     * Gets the value of the inclus property.
     * @return possible object is {@link String }
     */
    public String getInclus()
    {
        return this.inclus;
    }

    /**
     * Sets the value of the inclus property.
     * @param value allowed object is {@link String }
     */
    public void setInclus(final String value)
    {
        this.inclus = value;
    }

    /**
     * Gets the value of the nodeId property.
     * @return possible object is {@link String }
     */
    public String getNodeId()
    {
        return this.nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * @param value allowed object is {@link String }
     */
    public void setNodeId(final String value)
    {
        this.nodeId = value;
    }

}
