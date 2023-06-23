//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.09 à 08:19:54 AM WAT 
//


package com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WSCNPSIBTELCOMPDETAILSResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSCNPSIBTELCOMPDETAILSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://temenos.com/WSCNP3}Status" minOccurs="0"/&gt;
 *         &lt;element name="SCOMPDETAILSType" type="{http://temenos.com/WSCNP3}SCOMPDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCNPSIBTELCOMPDETAILSResponse", propOrder = {
    "status",
    "scompdetailsType"
})
public class WSCNPSIBTELCOMPDETAILSResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "SCOMPDETAILSType")
    protected List<SCOMPDETAILSType> scompdetailsType;

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
     * Gets the value of the scompdetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scompdetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSCOMPDETAILSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCOMPDETAILSType }
     * 
     * 
     */
    public List<SCOMPDETAILSType> getSCOMPDETAILSType() {
        if (scompdetailsType == null) {
            scompdetailsType = new ArrayList<SCOMPDETAILSType>();
        }
        return this.scompdetailsType;
    }

}
