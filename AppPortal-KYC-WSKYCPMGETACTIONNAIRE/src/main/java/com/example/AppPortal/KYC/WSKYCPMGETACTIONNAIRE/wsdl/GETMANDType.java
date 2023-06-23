//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:21:47 AM WAT 
//


package com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl;

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
 * <p>Classe Java pour GETMANDType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GETMANDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERONORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gGETMANDDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mGETMANDDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="T11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="T12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="T13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="T14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="T15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="T16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GETMANDType", propOrder = {
    "zeronorecords",
    "ggetmandDetailType"
})
public class GETMANDType {

    @XmlElement(name = "ZERONORECORDS")
    protected String zeronorecords;
    @XmlElement(name = "gGETMANDDetailType")
    protected GETMANDType.GGETMANDDetailType ggetmandDetailType;

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
     * Obtient la valeur de la propriété ggetmandDetailType.
     * 
     * @return
     *     possible object is
     *     {@link GETMANDType.GGETMANDDetailType }
     *     
     */
    public GETMANDType.GGETMANDDetailType getGGETMANDDetailType() {
        return ggetmandDetailType;
    }

    /**
     * Définit la valeur de la propriété ggetmandDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link GETMANDType.GGETMANDDetailType }
     *     
     */
    public void setGGETMANDDetailType(GETMANDType.GGETMANDDetailType value) {
        this.ggetmandDetailType = value;
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
     *         &lt;element name="mGETMANDDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="T11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="T12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="T13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="T14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="T15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="T16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mgetmandDetailType"
    })
    public static class GGETMANDDetailType {

        @XmlElement(name = "mGETMANDDetailType")
        protected List<GETMANDType.GGETMANDDetailType.MGETMANDDetailType> mgetmandDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mgetmandDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mgetmandDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMGETMANDDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GETMANDType.GGETMANDDetailType.MGETMANDDetailType }
         * 
         * 
         */
        public List<GETMANDType.GGETMANDDetailType.MGETMANDDetailType> getMGETMANDDetailType() {
            if (mgetmandDetailType == null) {
                mgetmandDetailType = new ArrayList<GETMANDType.GGETMANDDetailType.MGETMANDDetailType>();
            }
            return this.mgetmandDetailType;
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
         *         &lt;element name="T11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="T12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="T13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="T14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="T15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="T16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "t11",
            "t12",
            "t13",
            "t14",
            "t15",
            "t16"
        })
        public static class MGETMANDDetailType {

            @XmlElement(name = "T11")
            protected String t11;
            @XmlElement(name = "T12")
            protected String t12;
            @XmlElement(name = "T13")
            protected String t13;
            @XmlElement(name = "T14")
            protected String t14;
            @XmlElement(name = "T15")
            protected String t15;
            @XmlElement(name = "T16")
            protected String t16;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété t11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getT11() {
                return t11;
            }

            /**
             * Définit la valeur de la propriété t11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setT11(String value) {
                this.t11 = value;
            }

            /**
             * Obtient la valeur de la propriété t12.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getT12() {
                return t12;
            }

            /**
             * Définit la valeur de la propriété t12.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setT12(String value) {
                this.t12 = value;
            }

            /**
             * Obtient la valeur de la propriété t13.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getT13() {
                return t13;
            }

            /**
             * Définit la valeur de la propriété t13.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setT13(String value) {
                this.t13 = value;
            }

            /**
             * Obtient la valeur de la propriété t14.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getT14() {
                return t14;
            }

            /**
             * Définit la valeur de la propriété t14.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setT14(String value) {
                this.t14 = value;
            }

            /**
             * Obtient la valeur de la propriété t15.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getT15() {
                return t15;
            }

            /**
             * Définit la valeur de la propriété t15.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setT15(String value) {
                this.t15 = value;
            }

            /**
             * Obtient la valeur de la propriété t16.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getT16() {
                return t16;
            }

            /**
             * Définit la valeur de la propriété t16.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setT16(String value) {
                this.t16 = value;
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
