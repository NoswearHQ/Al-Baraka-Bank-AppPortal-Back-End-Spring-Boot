//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.08 à 11:27:11 AM WAT 
//


package com.example.AppPortal.WSREJET.CPT.CPT.wsdl;

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
 * <p>Classe Java pour REJETCPTCPTType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="REJETCPTCPTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gREJETCPTCPTDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mREJETCPTCPTDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldSTARTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="selFldCOMPTECLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMPTECLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMCLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMPTECLDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMCLDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REFCOMMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATETELE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "REJETCPTCPTType", propOrder = {
    "grejetcptcptDetailType"
})
public class REJETCPTCPTType {

    @XmlElement(name = "gREJETCPTCPTDetailType")
    protected REJETCPTCPTType.GREJETCPTCPTDetailType grejetcptcptDetailType;

    /**
     * Obtient la valeur de la propriété grejetcptcptDetailType.
     * 
     * @return
     *     possible object is
     *     {@link REJETCPTCPTType.GREJETCPTCPTDetailType }
     *     
     */
    public REJETCPTCPTType.GREJETCPTCPTDetailType getGREJETCPTCPTDetailType() {
        return grejetcptcptDetailType;
    }

    /**
     * Définit la valeur de la propriété grejetcptcptDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link REJETCPTCPTType.GREJETCPTCPTDetailType }
     *     
     */
    public void setGREJETCPTCPTDetailType(REJETCPTCPTType.GREJETCPTCPTDetailType value) {
        this.grejetcptcptDetailType = value;
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
     *         &lt;element name="mREJETCPTCPTDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldSTARTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="selFldCOMPTECLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMPTECLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMCLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMPTECLDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMCLDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFCOMMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATETELE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mrejetcptcptDetailType"
    })
    public static class GREJETCPTCPTDetailType {

        @XmlElement(name = "mREJETCPTCPTDetailType")
        protected List<REJETCPTCPTType.GREJETCPTCPTDetailType.MREJETCPTCPTDetailType> mrejetcptcptDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mrejetcptcptDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mrejetcptcptDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMREJETCPTCPTDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REJETCPTCPTType.GREJETCPTCPTDetailType.MREJETCPTCPTDetailType }
         * 
         * 
         */
        public List<REJETCPTCPTType.GREJETCPTCPTDetailType.MREJETCPTCPTDetailType> getMREJETCPTCPTDetailType() {
            if (mrejetcptcptDetailType == null) {
                mrejetcptcptDetailType = new ArrayList<REJETCPTCPTType.GREJETCPTCPTDetailType.MREJETCPTCPTDetailType>();
            }
            return this.mrejetcptcptDetailType;
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
         *         &lt;element name="selFldSTARTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="selFldCOMPTECLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMPTECLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMCLCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMPTECLDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMCLDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFCOMMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATETELE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "selFldSTARTDATE",
            "selFldCOMPTECLCR",
            "id",
            "compteclcr",
            "nomclcr",
            "comptecldb",
            "nomcldb",
            "refcommtire",
            "amt",
            "dateecheance",
            "datetele",
            "typerejet",
            "motifrejet"
        })
        public static class MREJETCPTCPTDetailType {

            protected String selFldSTARTDATE;
            protected String selFldCOMPTECLCR;
            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "COMPTECLCR")
            protected String compteclcr;
            @XmlElement(name = "NOMCLCR")
            protected String nomclcr;
            @XmlElement(name = "COMPTECLDB")
            protected String comptecldb;
            @XmlElement(name = "NOMCLDB")
            protected String nomcldb;
            @XmlElement(name = "REFCOMMTIRE")
            protected String refcommtire;
            @XmlElement(name = "AMT")
            protected String amt;
            @XmlElement(name = "DATEECHEANCE")
            protected String dateecheance;
            @XmlElement(name = "DATETELE")
            protected String datetele;
            @XmlElement(name = "TYPEREJET")
            protected String typerejet;
            @XmlElement(name = "MOTIFREJET")
            protected String motifrejet;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété selFldSTARTDATE.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldSTARTDATE() {
                return selFldSTARTDATE;
            }

            /**
             * Définit la valeur de la propriété selFldSTARTDATE.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldSTARTDATE(String value) {
                this.selFldSTARTDATE = value;
            }

            /**
             * Obtient la valeur de la propriété selFldCOMPTECLCR.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldCOMPTECLCR() {
                return selFldCOMPTECLCR;
            }

            /**
             * Définit la valeur de la propriété selFldCOMPTECLCR.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldCOMPTECLCR(String value) {
                this.selFldCOMPTECLCR = value;
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
             * Obtient la valeur de la propriété compteclcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPTECLCR() {
                return compteclcr;
            }

            /**
             * Définit la valeur de la propriété compteclcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPTECLCR(String value) {
                this.compteclcr = value;
            }

            /**
             * Obtient la valeur de la propriété nomclcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMCLCR() {
                return nomclcr;
            }

            /**
             * Définit la valeur de la propriété nomclcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMCLCR(String value) {
                this.nomclcr = value;
            }

            /**
             * Obtient la valeur de la propriété comptecldb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPTECLDB() {
                return comptecldb;
            }

            /**
             * Définit la valeur de la propriété comptecldb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPTECLDB(String value) {
                this.comptecldb = value;
            }

            /**
             * Obtient la valeur de la propriété nomcldb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMCLDB() {
                return nomcldb;
            }

            /**
             * Définit la valeur de la propriété nomcldb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMCLDB(String value) {
                this.nomcldb = value;
            }

            /**
             * Obtient la valeur de la propriété refcommtire.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFCOMMTIRE() {
                return refcommtire;
            }

            /**
             * Définit la valeur de la propriété refcommtire.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFCOMMTIRE(String value) {
                this.refcommtire = value;
            }

            /**
             * Obtient la valeur de la propriété amt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMT() {
                return amt;
            }

            /**
             * Définit la valeur de la propriété amt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMT(String value) {
                this.amt = value;
            }

            /**
             * Obtient la valeur de la propriété dateecheance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEECHEANCE() {
                return dateecheance;
            }

            /**
             * Définit la valeur de la propriété dateecheance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEECHEANCE(String value) {
                this.dateecheance = value;
            }

            /**
             * Obtient la valeur de la propriété datetele.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATETELE() {
                return datetele;
            }

            /**
             * Définit la valeur de la propriété datetele.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATETELE(String value) {
                this.datetele = value;
            }

            /**
             * Obtient la valeur de la propriété typerejet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEREJET() {
                return typerejet;
            }

            /**
             * Définit la valeur de la propriété typerejet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEREJET(String value) {
                this.typerejet = value;
            }

            /**
             * Obtient la valeur de la propriété motifrejet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOTIFREJET() {
                return motifrejet;
            }

            /**
             * Définit la valeur de la propriété motifrejet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOTIFREJET(String value) {
                this.motifrejet = value;
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
