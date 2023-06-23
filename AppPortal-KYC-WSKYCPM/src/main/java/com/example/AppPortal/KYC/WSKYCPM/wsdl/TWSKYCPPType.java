//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 09:33:40 AM WAT 
//


package com.example.AppPortal.KYC.WSKYCPM.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TWSKYCPPType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TWSKYCPPType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERONORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTWSKYCPPDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTWSKYCPPDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SALARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROFESSIONLIBERALCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CINCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PASSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATDEMANDEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATFISCCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMPLOYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMPADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CELIBATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DIVORCECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VEUFCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CONJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROFCONJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMBREENFANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REVENUSANNUELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUENOMLOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUENOMETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROPRIETAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIONALITYCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TWSKYCPPType", propOrder = {
    "zeronorecords",
    "gtwskycppDetailType"
})
public class TWSKYCPPType {

    @XmlElement(name = "ZERONORECORDS")
    protected String zeronorecords;
    @XmlElement(name = "gTWSKYCPPDetailType")
    protected TWSKYCPPType.GTWSKYCPPDetailType gtwskycppDetailType;

    /**
     * Obtient la valeur de la propriété zeronorecords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERONORECORDS() {
        return zeronorecords;
    }

    /**
     * Définit la valeur de la propriété zeronorecords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERONORECORDS(String value) {
        this.zeronorecords = value;
    }

    /**
     * Obtient la valeur de la propriété gtwskycppDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TWSKYCPPType.GTWSKYCPPDetailType }
     *     
     */
    public TWSKYCPPType.GTWSKYCPPDetailType getGTWSKYCPPDetailType() {
        return gtwskycppDetailType;
    }

    /**
     * Définit la valeur de la propriété gtwskycppDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TWSKYCPPType.GTWSKYCPPDetailType }
     *     
     */
    public void setGTWSKYCPPDetailType(TWSKYCPPType.GTWSKYCPPDetailType value) {
        this.gtwskycppDetailType = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="mTWSKYCPPDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SALARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROFESSIONLIBERALCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CINCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PASSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATDEMANDEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATFISCCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMPLOYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMPADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CELIBATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DIVORCECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VEUFCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CONJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROFCONJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMBREENFANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REVENUSANNUELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUENOMLOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUENOMETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROPRIETAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIONALITYCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mtwskycppDetailType"
    })
    public static class GTWSKYCPPDetailType {

        @XmlElement(name = "mTWSKYCPPDetailType")
        protected List<TWSKYCPPType.GTWSKYCPPDetailType.MTWSKYCPPDetailType> mtwskycppDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtwskycppDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtwskycppDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTWSKYCPPDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSKYCPPType.GTWSKYCPPDetailType.MTWSKYCPPDetailType }
         * 
         * 
         */
        public List<TWSKYCPPType.GTWSKYCPPDetailType.MTWSKYCPPDetailType> getMTWSKYCPPDetailType() {
            if (mtwskycppDetailType == null) {
                mtwskycppDetailType = new ArrayList<TWSKYCPPType.GTWSKYCPPDetailType.MTWSKYCPPDetailType>();
            }
            return this.mtwskycppDetailType;
        }

        /**
         * Obtient la valeur de la propriété g.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Définit la valeur de la propriété g.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SALARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROFESSIONLIBERALCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CINCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PASSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATDEMANDEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATFISCCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMPLOYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMPADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CELIBATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DIVORCECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VEUFCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CONJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROFCONJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMBREENFANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REVENUSANNUELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUENOMLOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUENOMETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LOCATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROPRIETAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIONALITYCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "selFldID",
            "datetoday",
            "agence",
            "cusid",
            "daterelation",
            "salariecheck",
            "professionliberalcheck",
            "prof",
            "cincheck",
            "passcheck",
            "cscheck",
            "numidt",
            "datdemandeidt",
            "matfisccheck",
            "matfisc",
            "adresse",
            "employeur",
            "empadresse",
            "mariecheck",
            "celibatairecheck",
            "divorcecheck",
            "veufcheck",
            "conjoint",
            "profconj",
            "nombreenfants",
            "revenusannuels",
            "annualbonus",
            "resident",
            "nom",
            "prenom",
            "banquecheck",
            "banquenomlocale",
            "banquenometrangere",
            "locatairecheck",
            "proprietairecheck",
            "pepcheck",
            "pepmandat",
            "riskclass",
            "nationalitycheck"
        })
        public static class MTWSKYCPPDetailType {

            protected String selFldID;
            @XmlElement(name = "DATETODAY")
            protected String datetoday;
            @XmlElement(name = "AGENCE")
            protected String agence;
            @XmlElement(name = "CUSID")
            protected String cusid;
            @XmlElement(name = "DATERELATION")
            protected String daterelation;
            @XmlElement(name = "SALARIECHECK")
            protected String salariecheck;
            @XmlElement(name = "PROFESSIONLIBERALCHECK")
            protected String professionliberalcheck;
            @XmlElement(name = "PROF")
            protected String prof;
            @XmlElement(name = "CINCHECK")
            protected String cincheck;
            @XmlElement(name = "PASSCHECK")
            protected String passcheck;
            @XmlElement(name = "CSCHECK")
            protected String cscheck;
            @XmlElement(name = "NUMIDT")
            protected String numidt;
            @XmlElement(name = "DATDEMANDEIDT")
            protected String datdemandeidt;
            @XmlElement(name = "MATFISCCHECK")
            protected String matfisccheck;
            @XmlElement(name = "MATFISC")
            protected String matfisc;
            @XmlElement(name = "ADRESSE")
            protected String adresse;
            @XmlElement(name = "EMPLOYEUR")
            protected String employeur;
            @XmlElement(name = "EMPADRESSE")
            protected String empadresse;
            @XmlElement(name = "MARIECHECK")
            protected String mariecheck;
            @XmlElement(name = "CELIBATAIRECHECK")
            protected String celibatairecheck;
            @XmlElement(name = "DIVORCECHECK")
            protected String divorcecheck;
            @XmlElement(name = "VEUFCHECK")
            protected String veufcheck;
            @XmlElement(name = "CONJOINT")
            protected String conjoint;
            @XmlElement(name = "PROFCONJ")
            protected String profconj;
            @XmlElement(name = "NOMBREENFANTS")
            protected String nombreenfants;
            @XmlElement(name = "REVENUSANNUELS")
            protected String revenusannuels;
            @XmlElement(name = "ANNUALBONUS")
            protected String annualbonus;
            @XmlElement(name = "RESIDENT")
            protected String resident;
            @XmlElement(name = "NOM")
            protected String nom;
            @XmlElement(name = "PRENOM")
            protected String prenom;
            @XmlElement(name = "BANQUECHECK")
            protected String banquecheck;
            @XmlElement(name = "BANQUENOMLOCALE")
            protected String banquenomlocale;
            @XmlElement(name = "BANQUENOMETRANGERE")
            protected String banquenometrangere;
            @XmlElement(name = "LOCATAIRECHECK")
            protected String locatairecheck;
            @XmlElement(name = "PROPRIETAIRECHECK")
            protected String proprietairecheck;
            @XmlElement(name = "PEPCHECK")
            protected String pepcheck;
            @XmlElement(name = "PEPMANDAT")
            protected String pepmandat;
            @XmlElement(name = "RISKCLASS")
            protected String riskclass;
            @XmlElement(name = "NATIONALITYCHECK")
            protected String nationalitycheck;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété selFldID.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldID() {
                return selFldID;
            }

            /**
             * Définit la valeur de la propriété selFldID.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldID(String value) {
                this.selFldID = value;
            }

            /**
             * Obtient la valeur de la propriété datetoday.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATETODAY() {
                return datetoday;
            }

            /**
             * Définit la valeur de la propriété datetoday.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATETODAY(String value) {
                this.datetoday = value;
            }

            /**
             * Obtient la valeur de la propriété agence.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAGENCE() {
                return agence;
            }

            /**
             * Définit la valeur de la propriété agence.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAGENCE(String value) {
                this.agence = value;
            }

            /**
             * Obtient la valeur de la propriété cusid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSID() {
                return cusid;
            }

            /**
             * Définit la valeur de la propriété cusid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSID(String value) {
                this.cusid = value;
            }

            /**
             * Obtient la valeur de la propriété daterelation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATERELATION() {
                return daterelation;
            }

            /**
             * Définit la valeur de la propriété daterelation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATERELATION(String value) {
                this.daterelation = value;
            }

            /**
             * Obtient la valeur de la propriété salariecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSALARIECHECK() {
                return salariecheck;
            }

            /**
             * Définit la valeur de la propriété salariecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSALARIECHECK(String value) {
                this.salariecheck = value;
            }

            /**
             * Obtient la valeur de la propriété professionliberalcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROFESSIONLIBERALCHECK() {
                return professionliberalcheck;
            }

            /**
             * Définit la valeur de la propriété professionliberalcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROFESSIONLIBERALCHECK(String value) {
                this.professionliberalcheck = value;
            }

            /**
             * Obtient la valeur de la propriété prof.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROF() {
                return prof;
            }

            /**
             * Définit la valeur de la propriété prof.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROF(String value) {
                this.prof = value;
            }

            /**
             * Obtient la valeur de la propriété cincheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCINCHECK() {
                return cincheck;
            }

            /**
             * Définit la valeur de la propriété cincheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCINCHECK(String value) {
                this.cincheck = value;
            }

            /**
             * Obtient la valeur de la propriété passcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPASSCHECK() {
                return passcheck;
            }

            /**
             * Définit la valeur de la propriété passcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPASSCHECK(String value) {
                this.passcheck = value;
            }

            /**
             * Obtient la valeur de la propriété cscheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSCHECK() {
                return cscheck;
            }

            /**
             * Définit la valeur de la propriété cscheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSCHECK(String value) {
                this.cscheck = value;
            }

            /**
             * Obtient la valeur de la propriété numidt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT() {
                return numidt;
            }

            /**
             * Définit la valeur de la propriété numidt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT(String value) {
                this.numidt = value;
            }

            /**
             * Obtient la valeur de la propriété datdemandeidt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATDEMANDEIDT() {
                return datdemandeidt;
            }

            /**
             * Définit la valeur de la propriété datdemandeidt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATDEMANDEIDT(String value) {
                this.datdemandeidt = value;
            }

            /**
             * Obtient la valeur de la propriété matfisccheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMATFISCCHECK() {
                return matfisccheck;
            }

            /**
             * Définit la valeur de la propriété matfisccheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMATFISCCHECK(String value) {
                this.matfisccheck = value;
            }

            /**
             * Obtient la valeur de la propriété matfisc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMATFISC() {
                return matfisc;
            }

            /**
             * Définit la valeur de la propriété matfisc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMATFISC(String value) {
                this.matfisc = value;
            }

            /**
             * Obtient la valeur de la propriété adresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE(String value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété employeur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPLOYEUR() {
                return employeur;
            }

            /**
             * Définit la valeur de la propriété employeur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPLOYEUR(String value) {
                this.employeur = value;
            }

            /**
             * Obtient la valeur de la propriété empadresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPADRESSE() {
                return empadresse;
            }

            /**
             * Définit la valeur de la propriété empadresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPADRESSE(String value) {
                this.empadresse = value;
            }

            /**
             * Obtient la valeur de la propriété mariecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMARIECHECK() {
                return mariecheck;
            }

            /**
             * Définit la valeur de la propriété mariecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMARIECHECK(String value) {
                this.mariecheck = value;
            }

            /**
             * Obtient la valeur de la propriété celibatairecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCELIBATAIRECHECK() {
                return celibatairecheck;
            }

            /**
             * Définit la valeur de la propriété celibatairecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCELIBATAIRECHECK(String value) {
                this.celibatairecheck = value;
            }

            /**
             * Obtient la valeur de la propriété divorcecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIVORCECHECK() {
                return divorcecheck;
            }

            /**
             * Définit la valeur de la propriété divorcecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIVORCECHECK(String value) {
                this.divorcecheck = value;
            }

            /**
             * Obtient la valeur de la propriété veufcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVEUFCHECK() {
                return veufcheck;
            }

            /**
             * Définit la valeur de la propriété veufcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVEUFCHECK(String value) {
                this.veufcheck = value;
            }

            /**
             * Obtient la valeur de la propriété conjoint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONJOINT() {
                return conjoint;
            }

            /**
             * Définit la valeur de la propriété conjoint.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONJOINT(String value) {
                this.conjoint = value;
            }

            /**
             * Obtient la valeur de la propriété profconj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROFCONJ() {
                return profconj;
            }

            /**
             * Définit la valeur de la propriété profconj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROFCONJ(String value) {
                this.profconj = value;
            }

            /**
             * Obtient la valeur de la propriété nombreenfants.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMBREENFANTS() {
                return nombreenfants;
            }

            /**
             * Définit la valeur de la propriété nombreenfants.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMBREENFANTS(String value) {
                this.nombreenfants = value;
            }

            /**
             * Obtient la valeur de la propriété revenusannuels.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVENUSANNUELS() {
                return revenusannuels;
            }

            /**
             * Définit la valeur de la propriété revenusannuels.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVENUSANNUELS(String value) {
                this.revenusannuels = value;
            }

            /**
             * Obtient la valeur de la propriété annualbonus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getANNUALBONUS() {
                return annualbonus;
            }

            /**
             * Définit la valeur de la propriété annualbonus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setANNUALBONUS(String value) {
                this.annualbonus = value;
            }

            /**
             * Obtient la valeur de la propriété resident.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENT() {
                return resident;
            }

            /**
             * Définit la valeur de la propriété resident.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENT(String value) {
                this.resident = value;
            }

            /**
             * Obtient la valeur de la propriété nom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM() {
                return nom;
            }

            /**
             * Définit la valeur de la propriété nom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM(String value) {
                this.nom = value;
            }

            /**
             * Obtient la valeur de la propriété prenom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRENOM() {
                return prenom;
            }

            /**
             * Définit la valeur de la propriété prenom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRENOM(String value) {
                this.prenom = value;
            }

            /**
             * Obtient la valeur de la propriété banquecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUECHECK() {
                return banquecheck;
            }

            /**
             * Définit la valeur de la propriété banquecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUECHECK(String value) {
                this.banquecheck = value;
            }

            /**
             * Obtient la valeur de la propriété banquenomlocale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUENOMLOCALE() {
                return banquenomlocale;
            }

            /**
             * Définit la valeur de la propriété banquenomlocale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUENOMLOCALE(String value) {
                this.banquenomlocale = value;
            }

            /**
             * Obtient la valeur de la propriété banquenometrangere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUENOMETRANGERE() {
                return banquenometrangere;
            }

            /**
             * Définit la valeur de la propriété banquenometrangere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUENOMETRANGERE(String value) {
                this.banquenometrangere = value;
            }

            /**
             * Obtient la valeur de la propriété locatairecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATAIRECHECK() {
                return locatairecheck;
            }

            /**
             * Définit la valeur de la propriété locatairecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATAIRECHECK(String value) {
                this.locatairecheck = value;
            }

            /**
             * Obtient la valeur de la propriété proprietairecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROPRIETAIRECHECK() {
                return proprietairecheck;
            }

            /**
             * Définit la valeur de la propriété proprietairecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROPRIETAIRECHECK(String value) {
                this.proprietairecheck = value;
            }

            /**
             * Obtient la valeur de la propriété pepcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPEPCHECK() {
                return pepcheck;
            }

            /**
             * Définit la valeur de la propriété pepcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPEPCHECK(String value) {
                this.pepcheck = value;
            }

            /**
             * Obtient la valeur de la propriété pepmandat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPEPMANDAT() {
                return pepmandat;
            }

            /**
             * Définit la valeur de la propriété pepmandat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPEPMANDAT(String value) {
                this.pepmandat = value;
            }

            /**
             * Obtient la valeur de la propriété riskclass.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRISKCLASS() {
                return riskclass;
            }

            /**
             * Définit la valeur de la propriété riskclass.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRISKCLASS(String value) {
                this.riskclass = value;
            }

            /**
             * Obtient la valeur de la propriété nationalitycheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONALITYCHECK() {
                return nationalitycheck;
            }

            /**
             * Définit la valeur de la propriété nationalitycheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONALITYCHECK(String value) {
                this.nationalitycheck = value;
            }

            /**
             * Obtient la valeur de la propriété m.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Définit la valeur de la propriété m.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
