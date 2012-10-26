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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import fr.pharma.eclipse.domain.model.sigrec.common.BeanSigrec;
import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for IntervenantType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervenantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="titre" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nom" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prenom" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="civilite" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="num-adeli" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="fonctions" type="{http://sigrec.ClinicalTrialApplication.xsd}fonctionsType" minOccurs="0"/>
 *         &lt;element name="service" type="{http://sigrec.ClinicalTrialApplication.xsd}ServicesType"/>
 *       &lt;/all>
 *       &lt;attribute name="intervenant-id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervenantType", propOrder =
{

})
@XmlSeeAlso(
{fr.pharma.eclipse.domain.model.sigrec.IntervenantsType.Intervenant.class })
public class IntervenantType
    extends BeanSigrec
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    protected String id;
    protected String titre;
    protected String nom;
    protected String prenom;
    protected String civilite;
    @XmlElement(name = "num-adeli")
    protected String numAdeli;
    protected String consolidation;
    protected FonctionsType fonctions;
    @XmlElement(required = true)
    protected ServicesType service;
    @XmlAttribute(name = "intervenant-id")
    protected Integer intervenantId;

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
     * Gets the value of the titre property.
     * @return possible object is {@link String }
     */
    public String getTitre()
    {
        return this.titre;
    }

    /**
     * Sets the value of the titre property.
     * @param value allowed object is {@link String }
     */
    public void setTitre(final String value)
    {
        this.titre = value;
    }

    /**
     * Gets the value of the nom property.
     * @return possible object is {@link String }
     */
    public String getNom()
    {
        return this.nom;
    }

    /**
     * Sets the value of the nom property.
     * @param value allowed object is {@link String }
     */
    public void setNom(final String value)
    {
        this.nom = value;
    }

    /**
     * Gets the value of the prenom property.
     * @return possible object is {@link String }
     */
    public String getPrenom()
    {
        return this.prenom;
    }

    /**
     * Sets the value of the prenom property.
     * @param value allowed object is {@link String }
     */
    public void setPrenom(final String value)
    {
        this.prenom = value;
    }

    /**
     * Gets the value of the civilite property.
     * @return possible object is {@link String }
     */
    public String getCivilite()
    {
        return this.civilite;
    }

    /**
     * Sets the value of the civilite property.
     * @param value allowed object is {@link String }
     */
    public void setCivilite(final String value)
    {
        this.civilite = value;
    }

    /**
     * Gets the value of the numAdeli property.
     * @return possible object is {@link String }
     */
    public String getNumAdeli()
    {
        return this.numAdeli;
    }

    /**
     * Sets the value of the numAdeli property.
     * @param value allowed object is {@link String }
     */
    public void setNumAdeli(final String value)
    {
        this.numAdeli = value;
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
     * Gets the value of the fonctions property.
     * @return possible object is {@link FonctionsType }
     */
    public FonctionsType getFonctions()
    {
        return this.fonctions;
    }

    /**
     * Sets the value of the fonctions property.
     * @param value allowed object is {@link FonctionsType }
     */
    public void setFonctions(final FonctionsType value)
    {
        this.fonctions = value;
    }

    /**
     * Gets the value of the service property.
     * @return possible object is {@link ServicesType }
     */
    public ServicesType getService()
    {
        return this.service;
    }

    /**
     * Sets the value of the service property.
     * @param value allowed object is {@link ServicesType }
     */
    public void setService(final ServicesType value)
    {
        this.service = value;
    }

    /**
     * Gets the value of the intervenantId property.
     * @return possible object is {@link Integer }
     */
    public Integer getIntervenantId()
    {
        return this.intervenantId;
    }

    /**
     * Sets the value of the intervenantId property.
     * @param value allowed object is {@link Integer }
     */
    public void setIntervenantId(final Integer value)
    {
        this.intervenantId = value;
    }

}
