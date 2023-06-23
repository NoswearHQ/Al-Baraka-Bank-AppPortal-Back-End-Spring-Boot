//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.09 à 10:50:32 AM WAT 
//


package com.example.AppPortal.Auth.wsdl;

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
 * <p>Classe Java pour USERAUTHType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="USERAUTHType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gUSERAUTHDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mUSERAUTHDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldSIGNONNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="APP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEAGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "USERAUTHType", propOrder = {
    "guserauthDetailType"
})
public class USERAUTHType {

    @XmlElement(name = "gUSERAUTHDetailType")
    protected USERAUTHType.GUSERAUTHDetailType guserauthDetailType;

    /**
     * Obtient la valeur de la propriété guserauthDetailType.
     * 
     * @return
     *     possible object is
     *     {@link USERAUTHType.GUSERAUTHDetailType }
     *     
     */
    public USERAUTHType.GUSERAUTHDetailType getGUSERAUTHDetailType() {
        return guserauthDetailType;
    }

    /**
     * Définit la valeur de la propriété guserauthDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link USERAUTHType.GUSERAUTHDetailType }
     *     
     */
    public void setGUSERAUTHDetailType(USERAUTHType.GUSERAUTHDetailType value) {
        this.guserauthDetailType = value;
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
     *         &lt;element name="mUSERAUTHDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldSIGNONNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="APP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEAGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "muserauthDetailType"
    })
    public static class GUSERAUTHDetailType {

        @XmlElement(name = "mUSERAUTHDetailType")
        protected List<USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType> muserauthDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the muserauthDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the muserauthDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMUSERAUTHDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType }
         * 
         * 
         */
        public List<USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType> getMUSERAUTHDetailType() {
            if (muserauthDetailType == null) {
                muserauthDetailType = new ArrayList<USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType>();
            }
            return this.muserauthDetailType;
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
         *         &lt;element name="selFldSIGNONNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="APP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEAGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "selFldSIGNONNAME",
            "agence",
            "menu",
            "app",
            "codeagence"
        })
        public static class MUSERAUTHDetailType {

            protected String selFldSIGNONNAME;
            @XmlElement(name = "AGENCE")
            protected String agence;
            @XmlElement(name = "MENU")
            protected String menu;
            @XmlElement(name = "APP")
            protected String app;
            @XmlElement(name = "CODEAGENCE")
            protected String codeagence;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtient la valeur de la propriété selFldSIGNONNAME.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldSIGNONNAME() {
                return selFldSIGNONNAME;
            }

            /**
             * Définit la valeur de la propriété selFldSIGNONNAME.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldSIGNONNAME(String value) {
                this.selFldSIGNONNAME = value;
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
             * Obtient la valeur de la propriété menu.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMENU() {
                return menu;
            }

            /**
             * Définit la valeur de la propriété menu.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMENU(String value) {
                this.menu = value;
            }

            /**
             * Obtient la valeur de la propriété app.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAPP() {
                return app;
            }

            /**
             * Définit la valeur de la propriété app.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAPP(String value) {
                this.app = value;
            }

            /**
             * Obtient la valeur de la propriété codeagence.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEAGENCE() {
                return codeagence;
            }

            /**
             * Définit la valeur de la propriété codeagence.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEAGENCE(String value) {
                this.codeagence = value;
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
