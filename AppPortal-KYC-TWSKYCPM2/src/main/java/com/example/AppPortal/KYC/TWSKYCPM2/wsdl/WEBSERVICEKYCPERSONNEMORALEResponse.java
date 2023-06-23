//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:58:20 AM WAT 
//


package com.example.AppPortal.KYC.TWSKYCPM2.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WEBSERVICEKYCPERSONNEMORALEResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WEBSERVICEKYCPERSONNEMORALEResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://temenos.com/TWSKYCPM2}Status" minOccurs="0"/&gt;
 *         &lt;element name="TWSKYCPM2Type" type="{http://temenos.com/TWSKYCPM2}TWSKYCPM2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WEBSERVICEKYCPERSONNEMORALEResponse", propOrder = {
    "status",
    "twskycpm2Type"
})
public class WEBSERVICEKYCPERSONNEMORALEResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "TWSKYCPM2Type")
    protected List<TWSKYCPM2Type> twskycpm2Type;

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
     * Gets the value of the twskycpm2Type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twskycpm2Type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTWSKYCPM2Type().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TWSKYCPM2Type }
     * 
     * 
     */
    public List<TWSKYCPM2Type> getTWSKYCPM2Type() {
        if (twskycpm2Type == null) {
            twskycpm2Type = new ArrayList<TWSKYCPM2Type>();
        }
        return this.twskycpm2Type;
    }

}
