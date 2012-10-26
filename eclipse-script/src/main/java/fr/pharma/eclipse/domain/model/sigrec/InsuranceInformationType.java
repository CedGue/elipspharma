//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.11.08 at 10:05:49 AM CET
//

package fr.pharma.eclipse.domain.model.sigrec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for Insurance-informationType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurance-informationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Insurance" type="{http://sigrec.ClinicalTrialApplication.xsd}InsuranceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurance-informationType", propOrder =
{"insurance" })
public class InsuranceInformationType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Insurance")
    protected List<InsuranceType> insurance;

    /**
     * Gets the value of the insurance property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the insurance property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInsurance().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link InsuranceType }
     */
    public List<InsuranceType> getInsurance()
    {
        if (this.insurance == null)
        {
            this.insurance = new ArrayList<InsuranceType>();
        }
        return this.insurance;
    }

}
