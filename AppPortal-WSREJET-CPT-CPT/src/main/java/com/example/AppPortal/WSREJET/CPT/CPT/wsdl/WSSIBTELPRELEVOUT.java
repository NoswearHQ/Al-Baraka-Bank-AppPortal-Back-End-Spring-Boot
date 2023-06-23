//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.08 à 11:27:11 AM WAT 
//


package com.example.AppPortal.WSREJET.CPT.CPT.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WSSIBTELPRELEVOUT complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSSIBTELPRELEVOUT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/prelevement}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="SIBTELPRELEVOUTType" type="{http://temenos.com/prelevement}enquiryInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSIBTELPRELEVOUT", propOrder = {
    "webRequestCommon",
    "sibtelprelevoutType"
})
public class WSSIBTELPRELEVOUT {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "SIBTELPRELEVOUTType")
    protected EnquiryInput sibtelprelevoutType;

    /**
     * Obtient la valeur de la propriété webRequestCommon.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Définit la valeur de la propriété webRequestCommon.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Obtient la valeur de la propriété sibtelprelevoutType.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getSIBTELPRELEVOUTType() {
        return sibtelprelevoutType;
    }

    /**
     * Définit la valeur de la propriété sibtelprelevoutType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setSIBTELPRELEVOUTType(EnquiryInput value) {
        this.sibtelprelevoutType = value;
    }

}
