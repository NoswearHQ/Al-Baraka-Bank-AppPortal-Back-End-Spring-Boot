//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 09:33:40 AM WAT 
//


package com.example.AppPortal.KYC.WSKYCPM.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour enquiryInput complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="enquiryInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enquiryInputCollection" type="{http://temenos.com/TWS.KYC}enquiryInputCollection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryInput", propOrder = {
    "enquiryInputCollection"
})
public class EnquiryInput {

    @XmlElement(nillable = true)
    protected List<EnquiryInputCollection> enquiryInputCollection;

    /**
     * Gets the value of the enquiryInputCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enquiryInputCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnquiryInputCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnquiryInputCollection }
     * 
     * 
     */
    public List<EnquiryInputCollection> getEnquiryInputCollection() {
        if (enquiryInputCollection == null) {
            enquiryInputCollection = new ArrayList<EnquiryInputCollection>();
        }
        return this.enquiryInputCollection;
    }

}
