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
import javax.xml.bind.annotation.XmlType;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for amendment-typeType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="amendment-typeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="prolongation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre-de-sujets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nouveau-centre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info-consentement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other-details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amendment-typeType", propOrder =
{

})
public class AmendmentTypeType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    protected String prolongation;
    @XmlElement(name = "nombre-de-sujets")
    protected String nombreDeSujets;
    @XmlElement(name = "nouveau-centre")
    protected String nouveauCentre;
    protected String protocole;
    @XmlElement(name = "info-consentement")
    protected String infoConsentement;
    protected String autre;
    @XmlElement(name = "other-details")
    protected String otherDetails;

    /**
     * Gets the value of the prolongation property.
     * @return possible object is {@link String }
     */
    public String getProlongation()
    {
        return this.prolongation;
    }

    /**
     * Sets the value of the prolongation property.
     * @param value allowed object is {@link String }
     */
    public void setProlongation(final String value)
    {
        this.prolongation = value;
    }

    /**
     * Gets the value of the nombreDeSujets property.
     * @return possible object is {@link String }
     */
    public String getNombreDeSujets()
    {
        return this.nombreDeSujets;
    }

    /**
     * Sets the value of the nombreDeSujets property.
     * @param value allowed object is {@link String }
     */
    public void setNombreDeSujets(final String value)
    {
        this.nombreDeSujets = value;
    }

    /**
     * Gets the value of the nouveauCentre property.
     * @return possible object is {@link String }
     */
    public String getNouveauCentre()
    {
        return this.nouveauCentre;
    }

    /**
     * Sets the value of the nouveauCentre property.
     * @param value allowed object is {@link String }
     */
    public void setNouveauCentre(final String value)
    {
        this.nouveauCentre = value;
    }

    /**
     * Gets the value of the protocole property.
     * @return possible object is {@link String }
     */
    public String getProtocole()
    {
        return this.protocole;
    }

    /**
     * Sets the value of the protocole property.
     * @param value allowed object is {@link String }
     */
    public void setProtocole(final String value)
    {
        this.protocole = value;
    }

    /**
     * Gets the value of the infoConsentement property.
     * @return possible object is {@link String }
     */
    public String getInfoConsentement()
    {
        return this.infoConsentement;
    }

    /**
     * Sets the value of the infoConsentement property.
     * @param value allowed object is {@link String }
     */
    public void setInfoConsentement(final String value)
    {
        this.infoConsentement = value;
    }

    /**
     * Gets the value of the autre property.
     * @return possible object is {@link String }
     */
    public String getAutre()
    {
        return this.autre;
    }

    /**
     * Sets the value of the autre property.
     * @param value allowed object is {@link String }
     */
    public void setAutre(final String value)
    {
        this.autre = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * @return possible object is {@link String }
     */
    public String getOtherDetails()
    {
        return this.otherDetails;
    }

    /**
     * Sets the value of the otherDetails property.
     * @param value allowed object is {@link String }
     */
    public void setOtherDetails(final String value)
    {
        this.otherDetails = value;
    }

}
