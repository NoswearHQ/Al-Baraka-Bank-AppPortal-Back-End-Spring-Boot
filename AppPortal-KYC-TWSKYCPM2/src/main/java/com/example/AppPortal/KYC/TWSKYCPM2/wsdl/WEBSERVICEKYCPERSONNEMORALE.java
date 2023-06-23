//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:58:20 AM WAT 
//


package com.example.AppPortal.KYC.TWSKYCPM2.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WEBSERVICEKYCPERSONNEMORALE complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WEBSERVICEKYCPERSONNEMORALE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/TWSKYCPM2}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="TWSKYCPM2Type" type="{http://temenos.com/TWSKYCPM2}enquiryInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WEBSERVICEKYCPERSONNEMORALE", propOrder = {
    "webRequestCommon",
    "twskycpm2Type"
})
public class WEBSERVICEKYCPERSONNEMORALE {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "TWSKYCPM2Type")
    protected EnquiryInput twskycpm2Type;

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
     * Obtient la valeur de la propriété twskycpm2Type.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getTWSKYCPM2Type() {
        return twskycpm2Type;
    }

    /**
     * Définit la valeur de la propriété twskycpm2Type.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setTWSKYCPM2Type(EnquiryInput value) {
        this.twskycpm2Type = value;
    }

}
