//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.08 à 11:52:48 AM WAT 
//


package com.example.AppPortal.WSPREV.OUT.wsdl;

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
 * <p>Classe Java pour SIBTELPRELEVOUTType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SIBTELPRELEVOUTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gSIBTELPRELEVOUTDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mSIBTELPRELEVOUTDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldDATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="selFldCODEEMETTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MONTANTPRELEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROPRELEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBPAYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMINSTEMETT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBEMETTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMCONTRAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECOMPENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SIBTELPRELEVOUTType", propOrder = {
    "gsibtelprelevoutDetailType"
})
public class SIBTELPRELEVOUTType {

    @XmlElement(name = "gSIBTELPRELEVOUTDetailType")
    protected SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType gsibtelprelevoutDetailType;

    /**
     * Obtient la valeur de la propriété gsibtelprelevoutDetailType.
     * 
     * @return
     *     possible object is
     *     {@link SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType }
     *     
     */
    public SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType getGSIBTELPRELEVOUTDetailType() {
        return gsibtelprelevoutDetailType;
    }

    /**
     * Définit la valeur de la propriété gsibtelprelevoutDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType }
     *     
     */
    public void setGSIBTELPRELEVOUTDetailType(SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType value) {
        this.gsibtelprelevoutDetailType = value;
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
     *         &lt;element name="mSIBTELPRELEVOUTDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldDATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="selFldCODEEMETTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MONTANTPRELEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROPRELEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBPAYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMINSTEMETT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBEMETTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMCONTRAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECOMPENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "msibtelprelevoutDetailType"
    })
    public static class GSIBTELPRELEVOUTDetailType {

        @XmlElement(name = "mSIBTELPRELEVOUTDetailType")
        protected List<SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType.MSIBTELPRELEVOUTDetailType> msibtelprelevoutDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the msibtelprelevoutDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msibtelprelevoutDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSIBTELPRELEVOUTDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType.MSIBTELPRELEVOUTDetailType }
         * 
         * 
         */
        public List<SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType.MSIBTELPRELEVOUTDetailType> getMSIBTELPRELEVOUTDetailType() {
            if (msibtelprelevoutDetailType == null) {
                msibtelprelevoutDetailType = new ArrayList<SIBTELPRELEVOUTType.GSIBTELPRELEVOUTDetailType.MSIBTELPRELEVOUTDetailType>();
            }
            return this.msibtelprelevoutDetailType;
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
         *         &lt;element name="selFldDATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="selFldCODEEMETTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MONTANTPRELEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROPRELEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBPAYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMINSTEMETT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBEMETTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMCONTRAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECOMPENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "selFldDATEOPERATION",
            "selFldCODEEMETTEUR",
            "id",
            "dateoperation",
            "montantprelev",
            "numeroprelev",
            "ribpayeur",
            "codeinstdest",
            "nominstdest",
            "nominstemett",
            "ribemetteur",
            "dateecheance",
            "numcontrat",
            "datecompens",
            "datetr",
            "motifrejet",
            "typerejet"
        })
        public static class MSIBTELPRELEVOUTDetailType {

            protected String selFldDATEOPERATION;
            protected String selFldCODEEMETTEUR;
            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "DATEOPERATION")
            protected String dateoperation;
            @XmlElement(name = "MONTANTPRELEV")
            protected String montantprelev;
            @XmlElement(name = "NUMEROPRELEV")
            protected String numeroprelev;
            @XmlElement(name = "RIBPAYEUR")
            protected String ribpayeur;
            @XmlElement(name = "CODEINSTDEST")
            protected String codeinstdest;
            @XmlElement(name = "NOMINSTDEST")
            protected String nominstdest;
            @XmlElement(name = "NOMINSTEMETT")
            protected String nominstemett;
            @XmlElement(name = "RIBEMETTEUR")
            protected String ribemetteur;
            @XmlElement(name = "DATEECHEANCE")
            protected String dateecheance;
            @XmlElement(name = "NUMCONTRAT")
            protected String numcontrat;
            @XmlElement(name = "DATECOMPENS")
            protected String datecompens;
            @XmlElement(name = "DATETR")
            protected String datetr;
            @XmlElement(name = "MOTIFREJET")
            protected String motifrejet;
            @XmlElement(name = "TYPEREJET")
            protected String typerejet;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété selFldDATEOPERATION.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldDATEOPERATION() {
                return selFldDATEOPERATION;
            }

            /**
             * Définit la valeur de la propriété selFldDATEOPERATION.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldDATEOPERATION(String value) {
                this.selFldDATEOPERATION = value;
            }

            /**
             * Obtient la valeur de la propriété selFldCODEEMETTEUR.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldCODEEMETTEUR() {
                return selFldCODEEMETTEUR;
            }

            /**
             * Définit la valeur de la propriété selFldCODEEMETTEUR.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldCODEEMETTEUR(String value) {
                this.selFldCODEEMETTEUR = value;
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
             * Obtient la valeur de la propriété dateoperation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEOPERATION() {
                return dateoperation;
            }

            /**
             * Définit la valeur de la propriété dateoperation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEOPERATION(String value) {
                this.dateoperation = value;
            }

            /**
             * Obtient la valeur de la propriété montantprelev.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMONTANTPRELEV() {
                return montantprelev;
            }

            /**
             * Définit la valeur de la propriété montantprelev.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMONTANTPRELEV(String value) {
                this.montantprelev = value;
            }

            /**
             * Obtient la valeur de la propriété numeroprelev.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROPRELEV() {
                return numeroprelev;
            }

            /**
             * Définit la valeur de la propriété numeroprelev.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROPRELEV(String value) {
                this.numeroprelev = value;
            }

            /**
             * Obtient la valeur de la propriété ribpayeur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBPAYEUR() {
                return ribpayeur;
            }

            /**
             * Définit la valeur de la propriété ribpayeur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBPAYEUR(String value) {
                this.ribpayeur = value;
            }

            /**
             * Obtient la valeur de la propriété codeinstdest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEINSTDEST() {
                return codeinstdest;
            }

            /**
             * Définit la valeur de la propriété codeinstdest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEINSTDEST(String value) {
                this.codeinstdest = value;
            }

            /**
             * Obtient la valeur de la propriété nominstdest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMINSTDEST() {
                return nominstdest;
            }

            /**
             * Définit la valeur de la propriété nominstdest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMINSTDEST(String value) {
                this.nominstdest = value;
            }

            /**
             * Obtient la valeur de la propriété nominstemett.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMINSTEMETT() {
                return nominstemett;
            }

            /**
             * Définit la valeur de la propriété nominstemett.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMINSTEMETT(String value) {
                this.nominstemett = value;
            }

            /**
             * Obtient la valeur de la propriété ribemetteur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBEMETTEUR() {
                return ribemetteur;
            }

            /**
             * Définit la valeur de la propriété ribemetteur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBEMETTEUR(String value) {
                this.ribemetteur = value;
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
             * Obtient la valeur de la propriété numcontrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMCONTRAT() {
                return numcontrat;
            }

            /**
             * Définit la valeur de la propriété numcontrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMCONTRAT(String value) {
                this.numcontrat = value;
            }

            /**
             * Obtient la valeur de la propriété datecompens.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATECOMPENS() {
                return datecompens;
            }

            /**
             * Définit la valeur de la propriété datecompens.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATECOMPENS(String value) {
                this.datecompens = value;
            }

            /**
             * Obtient la valeur de la propriété datetr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATETR() {
                return datetr;
            }

            /**
             * Définit la valeur de la propriété datetr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATETR(String value) {
                this.datetr = value;
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
