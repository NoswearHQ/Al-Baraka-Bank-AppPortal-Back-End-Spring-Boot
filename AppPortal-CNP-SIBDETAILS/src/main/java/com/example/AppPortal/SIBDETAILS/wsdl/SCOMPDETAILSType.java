//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.09 à 08:19:54 AM WAT 
//


package com.example.AppPortal.SIBDETAILS.wsdl;

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
 * <p>Classe Java pour SCOMPDETAILSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SCOMPDETAILSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gSCOMPDETAILSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mSCOMPDETAILSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDVISA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SCOMPDETAILSType", propOrder = {
    "gscompdetailsDetailType"
})
public class SCOMPDETAILSType {

    @XmlElement(name = "gSCOMPDETAILSDetailType")
    protected SCOMPDETAILSType.GSCOMPDETAILSDetailType gscompdetailsDetailType;

    /**
     * Obtient la valeur de la propriété gscompdetailsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link SCOMPDETAILSType.GSCOMPDETAILSDetailType }
     *     
     */
    public SCOMPDETAILSType.GSCOMPDETAILSDetailType getGSCOMPDETAILSDetailType() {
        return gscompdetailsDetailType;
    }

    /**
     * Définit la valeur de la propriété gscompdetailsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link SCOMPDETAILSType.GSCOMPDETAILSDetailType }
     *     
     */
    public void setGSCOMPDETAILSDetailType(SCOMPDETAILSType.GSCOMPDETAILSDetailType value) {
        this.gscompdetailsDetailType = value;
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
     *         &lt;element name="mSCOMPDETAILSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDVISA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mscompdetailsDetailType"
    })
    public static class GSCOMPDETAILSDetailType {

        @XmlElement(name = "mSCOMPDETAILSDetailType")
        protected List<SCOMPDETAILSType.GSCOMPDETAILSDetailType.MSCOMPDETAILSDetailType> mscompdetailsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mscompdetailsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mscompdetailsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSCOMPDETAILSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCOMPDETAILSType.GSCOMPDETAILSDetailType.MSCOMPDETAILSDetailType }
         * 
         * 
         */
        public List<SCOMPDETAILSType.GSCOMPDETAILSDetailType.MSCOMPDETAILSDetailType> getMSCOMPDETAILSDetailType() {
            if (mscompdetailsDetailType == null) {
                mscompdetailsDetailType = new ArrayList<SCOMPDETAILSType.GSCOMPDETAILSDetailType.MSCOMPDETAILSDetailType>();
            }
            return this.mscompdetailsDetailType;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDVISA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "type",
            "numidvisa",
            "nomprenom",
            "rccl",
            "adresse2",
            "adresse1",
            "id"
        })
        public static class MSCOMPDETAILSDetailType {

            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "NUMIDVISA")
            protected String numidvisa;
            @XmlElement(name = "NOMPRENOM")
            protected String nomprenom;
            @XmlElement(name = "RCCL")
            protected String rccl;
            @XmlElement(name = "ADRESSE2")
            protected String adresse2;
            @XmlElement(name = "ADRESSE1")
            protected String adresse1;
            @XmlElement(name = "ID")
            protected String id;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Obtient la valeur de la propriété numidvisa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDVISA() {
                return numidvisa;
            }

            /**
             * Définit la valeur de la propriété numidvisa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDVISA(String value) {
                this.numidvisa = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENOM() {
                return nomprenom;
            }

            /**
             * Définit la valeur de la propriété nomprenom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENOM(String value) {
                this.nomprenom = value;
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
             * Obtient la valeur de la propriété adresse2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE2() {
                return adresse2;
            }

            /**
             * Définit la valeur de la propriété adresse2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE2(String value) {
                this.adresse2 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE1() {
                return adresse1;
            }

            /**
             * Définit la valeur de la propriété adresse1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE1(String value) {
                this.adresse1 = value;
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
