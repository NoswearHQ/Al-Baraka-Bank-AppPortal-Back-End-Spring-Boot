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
 * <p>Classe Java pour TWSKYCPPFATCAType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TWSKYCPPFATCAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERONORECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTWSKYCPPFATCADetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTWSKYCPPFATCADetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GREENCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRRESIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ROLETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TWSKYCPPFATCAType", propOrder = {
    "zeronorecord",
    "gtwskycppfatcaDetailType"
})
public class TWSKYCPPFATCAType {

    @XmlElement(name = "ZERONORECORD")
    protected String zeronorecord;
    @XmlElement(name = "gTWSKYCPPFATCADetailType")
    protected TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType gtwskycppfatcaDetailType;

    /**
     * Obtient la valeur de la propriété zeronorecord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERONORECORD() {
        return zeronorecord;
    }

    /**
     * Définit la valeur de la propriété zeronorecord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERONORECORD(String value) {
        this.zeronorecord = value;
    }

    /**
     * Obtient la valeur de la propriété gtwskycppfatcaDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType }
     *     
     */
    public TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType getGTWSKYCPPFATCADetailType() {
        return gtwskycppfatcaDetailType;
    }

    /**
     * Définit la valeur de la propriété gtwskycppfatcaDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType }
     *     
     */
    public void setGTWSKYCPPFATCADetailType(TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType value) {
        this.gtwskycppfatcaDetailType = value;
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
     *         &lt;element name="mTWSKYCPPFATCADetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GREENCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRRESIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ROLETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtwskycppfatcaDetailType"
    })
    public static class GTWSKYCPPFATCADetailType {

        @XmlElement(name = "mTWSKYCPPFATCADetailType")
        protected List<TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType.MTWSKYCPPFATCADetailType> mtwskycppfatcaDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtwskycppfatcaDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtwskycppfatcaDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTWSKYCPPFATCADetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType.MTWSKYCPPFATCADetailType }
         * 
         * 
         */
        public List<TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType.MTWSKYCPPFATCADetailType> getMTWSKYCPPFATCADetailType() {
            if (mtwskycppfatcaDetailType == null) {
                mtwskycppfatcaDetailType = new ArrayList<TWSKYCPPFATCAType.GTWSKYCPPFATCADetailType.MTWSKYCPPFATCADetailType>();
            }
            return this.mtwskycppfatcaDetailType;
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
         *         &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GREENCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRRESIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ROLETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "placeofbirth",
            "greencard",
            "adrresidence",
            "roletype"
        })
        public static class MTWSKYCPPFATCADetailType {

            protected String selFldID;
            @XmlElement(name = "PLACEOFBIRTH")
            protected String placeofbirth;
            @XmlElement(name = "GREENCARD")
            protected String greencard;
            @XmlElement(name = "ADRRESIDENCE")
            protected String adrresidence;
            @XmlElement(name = "ROLETYPE")
            protected String roletype;
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
             * Obtient la valeur de la propriété placeofbirth.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLACEOFBIRTH() {
                return placeofbirth;
            }

            /**
             * Définit la valeur de la propriété placeofbirth.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLACEOFBIRTH(String value) {
                this.placeofbirth = value;
            }

            /**
             * Obtient la valeur de la propriété greencard.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGREENCARD() {
                return greencard;
            }

            /**
             * Définit la valeur de la propriété greencard.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGREENCARD(String value) {
                this.greencard = value;
            }

            /**
             * Obtient la valeur de la propriété adrresidence.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRRESIDENCE() {
                return adrresidence;
            }

            /**
             * Définit la valeur de la propriété adrresidence.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRRESIDENCE(String value) {
                this.adrresidence = value;
            }

            /**
             * Obtient la valeur de la propriété roletype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getROLETYPE() {
                return roletype;
            }

            /**
             * Définit la valeur de la propriété roletype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setROLETYPE(String value) {
                this.roletype = value;
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
