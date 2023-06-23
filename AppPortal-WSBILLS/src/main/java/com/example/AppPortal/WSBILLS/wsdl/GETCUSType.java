//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.01 à 10:12:34 AM WAT 
//


package com.example.AppPortal.WSBILLS.wsdl;

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
 * <p>Classe Java pour GETCUSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GETCUSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gGETCUSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mGETCUSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MNEMONIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GETCUSType", propOrder = {
    "ggetcusDetailType"
})
public class GETCUSType {

    @XmlElement(name = "gGETCUSDetailType")
    protected GETCUSType.GGETCUSDetailType ggetcusDetailType;

    /**
     * Obtient la valeur de la propriété ggetcusDetailType.
     * 
     * @return
     *     possible object is
     *     {@link GETCUSType.GGETCUSDetailType }
     *     
     */
    public GETCUSType.GGETCUSDetailType getGGETCUSDetailType() {
        return ggetcusDetailType;
    }

    /**
     * Définit la valeur de la propriété ggetcusDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link GETCUSType.GGETCUSDetailType }
     *     
     */
    public void setGGETCUSDetailType(GETCUSType.GGETCUSDetailType value) {
        this.ggetcusDetailType = value;
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
     *         &lt;element name="mGETCUSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MNEMONIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mgetcusDetailType"
    })
    public static class GGETCUSDetailType {

        @XmlElement(name = "mGETCUSDetailType")
        protected List<GETCUSType.GGETCUSDetailType.MGETCUSDetailType> mgetcusDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mgetcusDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mgetcusDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMGETCUSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GETCUSType.GGETCUSDetailType.MGETCUSDetailType }
         * 
         * 
         */
        public List<GETCUSType.GGETCUSDetailType.MGETCUSDetailType> getMGETCUSDetailType() {
            if (mgetcusDetailType == null) {
                mgetcusDetailType = new ArrayList<GETCUSType.GGETCUSDetailType.MGETCUSDetailType>();
            }
            return this.mgetcusDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MNEMONIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "id",
            "mnemonic",
            "shortname",
            "name1",
            "name2",
            "street",
            "address",
            "towncountry",
            "postcode",
            "country"
        })
        public static class MGETCUSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "MNEMONIC")
            protected String mnemonic;
            @XmlElement(name = "SHORTNAME")
            protected String shortname;
            @XmlElement(name = "NAME1")
            protected String name1;
            @XmlElement(name = "NAME2")
            protected String name2;
            @XmlElement(name = "STREET")
            protected String street;
            @XmlElement(name = "ADDRESS")
            protected String address;
            @XmlElement(name = "TOWNCOUNTRY")
            protected String towncountry;
            @XmlElement(name = "POSTCODE")
            protected String postcode;
            @XmlElement(name = "COUNTRY")
            protected String country;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Définit la valeur de la propriété id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propriété mnemonic.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMNEMONIC() {
                return mnemonic;
            }

            /**
             * Définit la valeur de la propriété mnemonic.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMNEMONIC(String value) {
                this.mnemonic = value;
            }

            /**
             * Obtient la valeur de la propriété shortname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSHORTNAME() {
                return shortname;
            }

            /**
             * Définit la valeur de la propriété shortname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSHORTNAME(String value) {
                this.shortname = value;
            }

            /**
             * Obtient la valeur de la propriété name1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME1() {
                return name1;
            }

            /**
             * Définit la valeur de la propriété name1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME1(String value) {
                this.name1 = value;
            }

            /**
             * Obtient la valeur de la propriété name2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME2() {
                return name2;
            }

            /**
             * Définit la valeur de la propriété name2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME2(String value) {
                this.name2 = value;
            }

            /**
             * Obtient la valeur de la propriété street.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTREET() {
                return street;
            }

            /**
             * Définit la valeur de la propriété street.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTREET(String value) {
                this.street = value;
            }

            /**
             * Obtient la valeur de la propriété address.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS() {
                return address;
            }

            /**
             * Définit la valeur de la propriété address.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS(String value) {
                this.address = value;
            }

            /**
             * Obtient la valeur de la propriété towncountry.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOWNCOUNTRY() {
                return towncountry;
            }

            /**
             * Définit la valeur de la propriété towncountry.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOWNCOUNTRY(String value) {
                this.towncountry = value;
            }

            /**
             * Obtient la valeur de la propriété postcode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOSTCODE() {
                return postcode;
            }

            /**
             * Définit la valeur de la propriété postcode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOSTCODE(String value) {
                this.postcode = value;
            }

            /**
             * Obtient la valeur de la propriété country.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRY() {
                return country;
            }

            /**
             * Définit la valeur de la propriété country.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRY(String value) {
                this.country = value;
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
