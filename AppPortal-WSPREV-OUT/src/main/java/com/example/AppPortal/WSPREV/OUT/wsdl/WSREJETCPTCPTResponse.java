//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.08 à 11:52:48 AM WAT 
//


package com.example.AppPortal.WSPREV.OUT.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WSREJETCPTCPTResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSREJETCPTCPTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://temenos.com/prelevement}Status" minOccurs="0"/&gt;
 *         &lt;element name="REJETCPTCPTType" type="{http://temenos.com/prelevement}REJETCPTCPTType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSREJETCPTCPTResponse", propOrder = {
    "status",
    "rejetcptcptType"
})
public class WSREJETCPTCPTResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "REJETCPTCPTType")
    protected List<REJETCPTCPTType> rejetcptcptType;

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
     * Gets the value of the rejetcptcptType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejetcptcptType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREJETCPTCPTType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REJETCPTCPTType }
     * 
     * 
     */
    public List<REJETCPTCPTType> getREJETCPTCPTType() {
        if (rejetcptcptType == null) {
            rejetcptcptType = new ArrayList<REJETCPTCPTType>();
        }
        return this.rejetcptcptType;
    }

}
