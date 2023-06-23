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
 * <p>Classe Java pour TWSKYCPMType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TWSKYCPMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERONORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTWSKYCPMDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTWSKYCPMDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRSITEWEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEDOUANE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECONSTIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FORMEJURID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FORMJURIDLIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TWSKYCPMType", propOrder = {
    "zeronorecords",
    "gtwskycpmDetailType"
})
public class TWSKYCPMType {

    @XmlElement(name = "ZERONORECORDS")
    protected String zeronorecords;
    @XmlElement(name = "gTWSKYCPMDetailType")
    protected TWSKYCPMType.GTWSKYCPMDetailType gtwskycpmDetailType;

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
     * Obtient la valeur de la propriété gtwskycpmDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TWSKYCPMType.GTWSKYCPMDetailType }
     *     
     */
    public TWSKYCPMType.GTWSKYCPMDetailType getGTWSKYCPMDetailType() {
        return gtwskycpmDetailType;
    }

    /**
     * Définit la valeur de la propriété gtwskycpmDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TWSKYCPMType.GTWSKYCPMDetailType }
     *     
     */
    public void setGTWSKYCPMDetailType(TWSKYCPMType.GTWSKYCPMDetailType value) {
        this.gtwskycpmDetailType = value;
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
     *         &lt;element name="mTWSKYCPMDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRSITEWEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEDOUANE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECONSTIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FORMEJURID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FORMJURIDLIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtwskycpmDetailType"
    })
    public static class GTWSKYCPMDetailType {

        @XmlElement(name = "mTWSKYCPMDetailType")
        protected List<TWSKYCPMType.GTWSKYCPMDetailType.MTWSKYCPMDetailType> mtwskycpmDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtwskycpmDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtwskycpmDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTWSKYCPMDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSKYCPMType.GTWSKYCPMDetailType.MTWSKYCPMDetailType }
         * 
         * 
         */
        public List<TWSKYCPMType.GTWSKYCPMDetailType.MTWSKYCPMDetailType> getMTWSKYCPMDetailType() {
            if (mtwskycpmDetailType == null) {
                mtwskycpmDetailType = new ArrayList<TWSKYCPMType.GTWSKYCPMDetailType.MTWSKYCPMDetailType>();
            }
            return this.mtwskycpmDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRSITEWEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEDOUANE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECONSTIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FORMEJURID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FORMJURIDLIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "id",
            "accountofficer",
            "shortname",
            "sector",
            "street",
            "postcode",
            "towncountry",
            "country",
            "phone1",
            "fax1",
            "email1",
            "adrsiteweb",
            "rccl",
            "codedouane",
            "matfisc",
            "dateconstit",
            "formejurid",
            "formjuridlib",
            "resident",
            "address"
        })
        public static class MTWSKYCPMDetailType {

            protected String selFldID;
            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "ACCOUNTOFFICER")
            protected String accountofficer;
            @XmlElement(name = "SHORTNAME")
            protected String shortname;
            @XmlElement(name = "SECTOR")
            protected String sector;
            @XmlElement(name = "STREET")
            protected String street;
            @XmlElement(name = "POSTCODE")
            protected String postcode;
            @XmlElement(name = "TOWNCOUNTRY")
            protected String towncountry;
            @XmlElement(name = "COUNTRY")
            protected String country;
            @XmlElement(name = "PHONE1")
            protected String phone1;
            @XmlElement(name = "FAX1")
            protected String fax1;
            @XmlElement(name = "EMAIL1")
            protected String email1;
            @XmlElement(name = "ADRSITEWEB")
            protected String adrsiteweb;
            @XmlElement(name = "RCCL")
            protected String rccl;
            @XmlElement(name = "CODEDOUANE")
            protected String codedouane;
            @XmlElement(name = "MATFISC")
            protected String matfisc;
            @XmlElement(name = "DATECONSTIT")
            protected String dateconstit;
            @XmlElement(name = "FORMEJURID")
            protected String formejurid;
            @XmlElement(name = "FORMJURIDLIB")
            protected String formjuridlib;
            @XmlElement(name = "RESIDENT")
            protected String resident;
            @XmlElement(name = "ADDRESS")
            protected String address;
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
             * Obtient la valeur de la propriété accountofficer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTOFFICER() {
                return accountofficer;
            }

            /**
             * Définit la valeur de la propriété accountofficer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTOFFICER(String value) {
                this.accountofficer = value;
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
             * Obtient la valeur de la propriété sector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSECTOR() {
                return sector;
            }

            /**
             * Définit la valeur de la propriété sector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSECTOR(String value) {
                this.sector = value;
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
             * Obtient la valeur de la propriété phone1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPHONE1() {
                return phone1;
            }

            /**
             * Définit la valeur de la propriété phone1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPHONE1(String value) {
                this.phone1 = value;
            }

            /**
             * Obtient la valeur de la propriété fax1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX1() {
                return fax1;
            }

            /**
             * Définit la valeur de la propriété fax1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX1(String value) {
                this.fax1 = value;
            }

            /**
             * Obtient la valeur de la propriété email1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAIL1() {
                return email1;
            }

            /**
             * Définit la valeur de la propriété email1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAIL1(String value) {
                this.email1 = value;
            }

            /**
             * Obtient la valeur de la propriété adrsiteweb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRSITEWEB() {
                return adrsiteweb;
            }

            /**
             * Définit la valeur de la propriété adrsiteweb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRSITEWEB(String value) {
                this.adrsiteweb = value;
            }

            /**
             * Obtient la valeur de la propriété rccl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCCL() {
                return rccl;
            }

            /**
             * Définit la valeur de la propriété rccl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCCL(String value) {
                this.rccl = value;
            }

            /**
             * Obtient la valeur de la propriété codedouane.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEDOUANE() {
                return codedouane;
            }

            /**
             * Définit la valeur de la propriété codedouane.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEDOUANE(String value) {
                this.codedouane = value;
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
             * Obtient la valeur de la propriété dateconstit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATECONSTIT() {
                return dateconstit;
            }

            /**
             * Définit la valeur de la propriété dateconstit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATECONSTIT(String value) {
                this.dateconstit = value;
            }

            /**
             * Obtient la valeur de la propriété formejurid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMEJURID() {
                return formejurid;
            }

            /**
             * Définit la valeur de la propriété formejurid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMEJURID(String value) {
                this.formejurid = value;
            }

            /**
             * Obtient la valeur de la propriété formjuridlib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMJURIDLIB() {
                return formjuridlib;
            }

            /**
             * Définit la valeur de la propriété formjuridlib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMJURIDLIB(String value) {
                this.formjuridlib = value;
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
