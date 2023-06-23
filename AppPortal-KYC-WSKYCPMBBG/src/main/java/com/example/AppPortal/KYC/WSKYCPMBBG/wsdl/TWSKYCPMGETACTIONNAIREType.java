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
 * <p>Classe Java pour TWSKYCPMGETACTIONNAIREType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TWSKYCPMGETACTIONNAIREType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERONORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gTWSKYCPMGETACTIONNAIREDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTWSKYCPMGETACTIONNAIREDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POURCENTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TWSKYCPMGETACTIONNAIREType", propOrder = {
    "zeronorecords",
    "gtwskycpmgetactionnaireDetailType"
})
public class TWSKYCPMGETACTIONNAIREType {

    @XmlElement(name = "ZERONORECORDS")
    protected String zeronorecords;
    @XmlElement(name = "gTWSKYCPMGETACTIONNAIREDetailType")
    protected TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType gtwskycpmgetactionnaireDetailType;

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
     * Obtient la valeur de la propriété gtwskycpmgetactionnaireDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType }
     *     
     */
    public TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType getGTWSKYCPMGETACTIONNAIREDetailType() {
        return gtwskycpmgetactionnaireDetailType;
    }

    /**
     * Définit la valeur de la propriété gtwskycpmgetactionnaireDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType }
     *     
     */
    public void setGTWSKYCPMGETACTIONNAIREDetailType(TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType value) {
        this.gtwskycpmgetactionnaireDetailType = value;
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
     *         &lt;element name="mTWSKYCPMGETACTIONNAIREDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POURCENTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtwskycpmgetactionnaireDetailType"
    })
    public static class GTWSKYCPMGETACTIONNAIREDetailType {

        @XmlElement(name = "mTWSKYCPMGETACTIONNAIREDetailType")
        protected List<TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType.MTWSKYCPMGETACTIONNAIREDetailType> mtwskycpmgetactionnaireDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtwskycpmgetactionnaireDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtwskycpmgetactionnaireDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTWSKYCPMGETACTIONNAIREDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType.MTWSKYCPMGETACTIONNAIREDetailType }
         * 
         * 
         */
        public List<TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType.MTWSKYCPMGETACTIONNAIREDetailType> getMTWSKYCPMGETACTIONNAIREDetailType() {
            if (mtwskycpmgetactionnaireDetailType == null) {
                mtwskycpmgetactionnaireDetailType = new ArrayList<TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType.MTWSKYCPMGETACTIONNAIREDetailType>();
            }
            return this.mtwskycpmgetactionnaireDetailType;
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
         *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POURCENTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "nom",
            "prenom",
            "numid",
            "pourcentage"
        })
        public static class MTWSKYCPMGETACTIONNAIREDetailType {

            protected String selFldID;
            @XmlElement(name = "NOM")
            protected String nom;
            @XmlElement(name = "PRENOM")
            protected String prenom;
            @XmlElement(name = "NUMID")
            protected String numid;
            @XmlElement(name = "POURCENTAGE")
            protected String pourcentage;
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
             * Obtient la valeur de la propriété numid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMID() {
                return numid;
            }

            /**
             * Définit la valeur de la propriété numid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMID(String value) {
                this.numid = value;
            }

            /**
             * Obtient la valeur de la propriété pourcentage.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOURCENTAGE() {
                return pourcentage;
            }

            /**
             * Définit la valeur de la propriété pourcentage.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOURCENTAGE(String value) {
                this.pourcentage = value;
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
