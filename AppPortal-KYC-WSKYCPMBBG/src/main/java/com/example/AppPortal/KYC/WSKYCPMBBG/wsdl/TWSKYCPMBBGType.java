//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:01:16 AM WAT 
//


package com.example.AppPortal.KYC.WSKYCPMBBG.wsdl;

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
 * <p>Classe Java pour TWSKYCPMBBGType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TWSKYCPMBBGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERONORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTWSKYCPMBBGDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTWSKYCPMBBGDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GROUPECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GROUPENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUELOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUEETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BOURSECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RELATIONCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GROUPERELATIONCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RELATIONCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TELBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAXBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMAILBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TWSKYCPMBBGType", propOrder = {
    "zeronorecords",
    "gtwskycpmbbgDetailType"
})
public class TWSKYCPMBBGType {

    @XmlElement(name = "ZERONORECORDS")
    protected String zeronorecords;
    @XmlElement(name = "gTWSKYCPMBBGDetailType")
    protected TWSKYCPMBBGType.GTWSKYCPMBBGDetailType gtwskycpmbbgDetailType;

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
     * Obtient la valeur de la propriété gtwskycpmbbgDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TWSKYCPMBBGType.GTWSKYCPMBBGDetailType }
     *     
     */
    public TWSKYCPMBBGType.GTWSKYCPMBBGDetailType getGTWSKYCPMBBGDetailType() {
        return gtwskycpmbbgDetailType;
    }

    /**
     * Définit la valeur de la propriété gtwskycpmbbgDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TWSKYCPMBBGType.GTWSKYCPMBBGDetailType }
     *     
     */
    public void setGTWSKYCPMBBGDetailType(TWSKYCPMBBGType.GTWSKYCPMBBGDetailType value) {
        this.gtwskycpmbbgDetailType = value;
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
     *         &lt;element name="mTWSKYCPMBBGDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GROUPECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GROUPENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUELOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUEETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BOURSECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RELATIONCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GROUPERELATIONCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RELATIONCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TELBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAXBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMAILBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtwskycpmbbgDetailType"
    })
    public static class GTWSKYCPMBBGDetailType {

        @XmlElement(name = "mTWSKYCPMBBGDetailType")
        protected List<TWSKYCPMBBGType.GTWSKYCPMBBGDetailType.MTWSKYCPMBBGDetailType> mtwskycpmbbgDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtwskycpmbbgDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtwskycpmbbgDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTWSKYCPMBBGDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSKYCPMBBGType.GTWSKYCPMBBGDetailType.MTWSKYCPMBBGDetailType }
         * 
         * 
         */
        public List<TWSKYCPMBBGType.GTWSKYCPMBBGDetailType.MTWSKYCPMBBGDetailType> getMTWSKYCPMBBGDetailType() {
            if (mtwskycpmbbgDetailType == null) {
                mtwskycpmbbgDetailType = new ArrayList<TWSKYCPMBBGType.GTWSKYCPMBBGDetailType.MTWSKYCPMBBGDetailType>();
            }
            return this.mtwskycpmbbgDetailType;
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
         *         &lt;element name="GROUPECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GROUPENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUELOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUEETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BOURSECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RELATIONCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GROUPERELATIONCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RELATIONCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TELBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAXBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMAILBBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "groupecheck",
            "groupenom",
            "banquecheck",
            "banquelocale",
            "banqueetrangere",
            "boursecheck",
            "relationcheck",
            "grouperelationcheck",
            "relationcustomer",
            "pepcheck",
            "pepmandat",
            "riskclass",
            "telbbg",
            "faxbbg",
            "emailbbg",
            "daterelation"
        })
        public static class MTWSKYCPMBBGDetailType {

            protected String selFldID;
            @XmlElement(name = "GROUPECHECK")
            protected String groupecheck;
            @XmlElement(name = "GROUPENOM")
            protected String groupenom;
            @XmlElement(name = "BANQUECHECK")
            protected String banquecheck;
            @XmlElement(name = "BANQUELOCALE")
            protected String banquelocale;
            @XmlElement(name = "BANQUEETRANGERE")
            protected String banqueetrangere;
            @XmlElement(name = "BOURSECHECK")
            protected String boursecheck;
            @XmlElement(name = "RELATIONCHECK")
            protected String relationcheck;
            @XmlElement(name = "GROUPERELATIONCHECK")
            protected String grouperelationcheck;
            @XmlElement(name = "RELATIONCUSTOMER")
            protected String relationcustomer;
            @XmlElement(name = "PEPCHECK")
            protected String pepcheck;
            @XmlElement(name = "PEPMANDAT")
            protected String pepmandat;
            @XmlElement(name = "RISKCLASS")
            protected String riskclass;
            @XmlElement(name = "TELBBG")
            protected String telbbg;
            @XmlElement(name = "FAXBBG")
            protected String faxbbg;
            @XmlElement(name = "EMAILBBG")
            protected String emailbbg;
            @XmlElement(name = "DATERELATION")
            protected String daterelation;
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
             * Obtient la valeur de la propriété groupecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGROUPECHECK() {
                return groupecheck;
            }

            /**
             * Définit la valeur de la propriété groupecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGROUPECHECK(String value) {
                this.groupecheck = value;
            }

            /**
             * Obtient la valeur de la propriété groupenom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGROUPENOM() {
                return groupenom;
            }

            /**
             * Définit la valeur de la propriété groupenom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGROUPENOM(String value) {
                this.groupenom = value;
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
             * Obtient la valeur de la propriété banquelocale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUELOCALE() {
                return banquelocale;
            }

            /**
             * Définit la valeur de la propriété banquelocale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUELOCALE(String value) {
                this.banquelocale = value;
            }

            /**
             * Obtient la valeur de la propriété banqueetrangere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUEETRANGERE() {
                return banqueetrangere;
            }

            /**
             * Définit la valeur de la propriété banqueetrangere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUEETRANGERE(String value) {
                this.banqueetrangere = value;
            }

            /**
             * Obtient la valeur de la propriété boursecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOURSECHECK() {
                return boursecheck;
            }

            /**
             * Définit la valeur de la propriété boursecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOURSECHECK(String value) {
                this.boursecheck = value;
            }

            /**
             * Obtient la valeur de la propriété relationcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATIONCHECK() {
                return relationcheck;
            }

            /**
             * Définit la valeur de la propriété relationcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATIONCHECK(String value) {
                this.relationcheck = value;
            }

            /**
             * Obtient la valeur de la propriété grouperelationcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGROUPERELATIONCHECK() {
                return grouperelationcheck;
            }

            /**
             * Définit la valeur de la propriété grouperelationcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGROUPERELATIONCHECK(String value) {
                this.grouperelationcheck = value;
            }

            /**
             * Obtient la valeur de la propriété relationcustomer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATIONCUSTOMER() {
                return relationcustomer;
            }

            /**
             * Définit la valeur de la propriété relationcustomer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATIONCUSTOMER(String value) {
                this.relationcustomer = value;
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
             * Obtient la valeur de la propriété telbbg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTELBBG() {
                return telbbg;
            }

            /**
             * Définit la valeur de la propriété telbbg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTELBBG(String value) {
                this.telbbg = value;
            }

            /**
             * Obtient la valeur de la propriété faxbbg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAXBBG() {
                return faxbbg;
            }

            /**
             * Définit la valeur de la propriété faxbbg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAXBBG(String value) {
                this.faxbbg = value;
            }

            /**
             * Obtient la valeur de la propriété emailbbg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAILBBG() {
                return emailbbg;
            }

            /**
             * Définit la valeur de la propriété emailbbg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAILBBG(String value) {
                this.emailbbg = value;
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
