//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:01:16 AM WAT 
//


package com.example.AppPortal.KYC.WSKYCPMBBG.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WSKYCPMGETACTIONNAIREResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSKYCPMGETACTIONNAIREResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://temenos.com/TWS.KYC}Status" minOccurs="0"/&gt;
 *         &lt;element name="TWSKYCPMGETACTIONNAIREType" type="{http://temenos.com/TWS.KYC}TWSKYCPMGETACTIONNAIREType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSKYCPMGETACTIONNAIREResponse", propOrder = {
    "status",
    "twskycpmgetactionnaireType"
})
public class WSKYCPMGETACTIONNAIREResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "TWSKYCPMGETACTIONNAIREType")
    protected List<TWSKYCPMGETACTIONNAIREType> twskycpmgetactionnaireType;

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the twskycpmgetactionnaireType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twskycpmgetactionnaireType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTWSKYCPMGETACTIONNAIREType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TWSKYCPMGETACTIONNAIREType }
     * 
     * 
     */
    public List<TWSKYCPMGETACTIONNAIREType> getTWSKYCPMGETACTIONNAIREType() {
        if (twskycpmgetactionnaireType == null) {
            twskycpmgetactionnaireType = new ArrayList<TWSKYCPMGETACTIONNAIREType>();
        }
        return this.twskycpmgetactionnaireType;
    }

}
