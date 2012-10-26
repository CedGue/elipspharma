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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for investigator-progressType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigator-progressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="trial-interne-identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date-receipt-protocole" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date-signing-agreement" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="agreement-signatory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actual-start-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="actual-end-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date-place" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date-last-inclusion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="closing-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="planned-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="study-state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigator-progressType", propOrder =
{

})
public class InvestigatorProgressType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "trial-interne-identification")
    protected String trialInterneIdentification;
    @XmlElementRef(name = "date-receipt-protocole", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateReceiptProtocole;
    @XmlElementRef(name = "date-signing-agreement", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateSigningAgreement;
    @XmlElement(name = "agreement-signatory")
    protected InvestigatorProgressType.AgreementSignatory agreementSignatory;
    @XmlElementRef(name = "actual-start-date", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> actualStartDate;
    @XmlElementRef(name = "actual-end-date", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> actualEndDate;
    @XmlElementRef(name = "date-place", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> datePlace;
    @XmlElementRef(name = "date-last-inclusion", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateLastInclusion;
    @XmlElementRef(name = "closing-date", namespace = "http://sigrec.ClinicalTrialApplication.xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> closingDate;
    @XmlElement(name = "planned-number")
    protected String plannedNumber;
    @XmlElement(name = "study-state")
    protected String studyState;

    /**
     * Gets the value of the trialInterneIdentification property.
     * @return possible object is {@link String }
     */
    public String getTrialInterneIdentification()
    {
        return this.trialInterneIdentification;
    }

    /**
     * Sets the value of the trialInterneIdentification property.
     * @param value allowed object is {@link String }
     */
    public void setTrialInterneIdentification(final String value)
    {
        this.trialInterneIdentification = value;
    }

    /**
     * Gets the value of the dateReceiptProtocole property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getDateReceiptProtocole()
    {
        return this.dateReceiptProtocole;
    }

    /**
     * Sets the value of the dateReceiptProtocole property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setDateReceiptProtocole(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.dateReceiptProtocole = (value);
    }

    /**
     * Gets the value of the dateSigningAgreement property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getDateSigningAgreement()
    {
        return this.dateSigningAgreement;
    }

    /**
     * Sets the value of the dateSigningAgreement property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setDateSigningAgreement(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.dateSigningAgreement = (value);
    }

    /**
     * Gets the value of the agreementSignatory property.
     * @return possible object is {@link InvestigatorProgressType.AgreementSignatory }
     */
    public InvestigatorProgressType.AgreementSignatory getAgreementSignatory()
    {
        return this.agreementSignatory;
    }

    /**
     * Sets the value of the agreementSignatory property.
     * @param value allowed object is {@link InvestigatorProgressType.AgreementSignatory }
     */
    public void setAgreementSignatory(final InvestigatorProgressType.AgreementSignatory value)
    {
        this.agreementSignatory = value;
    }

    /**
     * Gets the value of the actualStartDate property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getActualStartDate()
    {
        return this.actualStartDate;
    }

    /**
     * Sets the value of the actualStartDate property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setActualStartDate(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.actualStartDate = (value);
    }

    /**
     * Gets the value of the actualEndDate property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getActualEndDate()
    {
        return this.actualEndDate;
    }

    /**
     * Sets the value of the actualEndDate property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setActualEndDate(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.actualEndDate = (value);
    }

    /**
     * Gets the value of the datePlace property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getDatePlace()
    {
        return this.datePlace;
    }

    /**
     * Sets the value of the datePlace property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setDatePlace(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.datePlace = (value);
    }

    /**
     * Gets the value of the dateLastInclusion property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getDateLastInclusion()
    {
        return this.dateLastInclusion;
    }

    /**
     * Sets the value of the dateLastInclusion property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setDateLastInclusion(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.dateLastInclusion = (value);
    }

    /**
     * Gets the value of the closingDate property.
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getClosingDate()
    {
        return this.closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }
     * {@code >}
     */
    public void setClosingDate(final JAXBElement<XMLGregorianCalendar> value)
    {
        this.closingDate = (value);
    }

    /**
     * Gets the value of the plannedNumber property.
     * @return possible object is {@link String }
     */
    public String getPlannedNumber()
    {
        return this.plannedNumber;
    }

    /**
     * Sets the value of the plannedNumber property.
     * @param value allowed object is {@link String }
     */
    public void setPlannedNumber(final String value)
    {
        this.plannedNumber = value;
    }

    /**
     * Gets the value of the studyState property.
     * @return possible object is {@link String }
     */
    public String getStudyState()
    {
        return this.studyState;
    }

    /**
     * Sets the value of the studyState property.
     * @param value allowed object is {@link String }
     */
    public void setStudyState(final String value)
    {
        this.studyState = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
    {"value" })
    public static class AgreementSignatory
        implements Serializable, SigrecElement
    {

        private final static long serialVersionUID = 100L;
        @XmlValue
        protected String value;
        @XmlAttribute
        protected String id;

        /**
         * Gets the value of the value property.
         * @return possible object is {@link String }
         */
        public String getValue()
        {
            return this.value;
        }

        /**
         * Sets the value of the value property.
         * @param value allowed object is {@link String }
         */
        public void setValue(final String value)
        {
            this.value = value;
        }

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

    }

}