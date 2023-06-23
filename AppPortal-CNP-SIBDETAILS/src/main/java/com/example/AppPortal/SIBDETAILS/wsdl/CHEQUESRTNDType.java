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
 * <p>Classe Java pour CHEQUESRTNDType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CHEQUESRTNDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gCHEQUESRTNDDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mCHEQUESRTNDDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHEQUECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHEQUEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHEQUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRESENTINGBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RETURNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGULARISATNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REJECTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REJECTIONDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEPROTET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBERPROTET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NEXTREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROVISIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PREAVISREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROVISIONACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGULARIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROVISIONCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBBENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECHQISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INPCHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INPREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INPRETURNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INTRETARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNTHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FEESHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEARP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEUNBLOCKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CLEARINGMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEANR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CHEQUESRTNDType", propOrder = {
    "gchequesrtndDetailType"
})
public class CHEQUESRTNDType {

    @XmlElement(name = "gCHEQUESRTNDDetailType")
    protected CHEQUESRTNDType.GCHEQUESRTNDDetailType gchequesrtndDetailType;

    /**
     * Obtient la valeur de la propriété gchequesrtndDetailType.
     * 
     * @return
     *     possible object is
     *     {@link CHEQUESRTNDType.GCHEQUESRTNDDetailType }
     *     
     */
    public CHEQUESRTNDType.GCHEQUESRTNDDetailType getGCHEQUESRTNDDetailType() {
        return gchequesrtndDetailType;
    }

    /**
     * Définit la valeur de la propriété gchequesrtndDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link CHEQUESRTNDType.GCHEQUESRTNDDetailType }
     *     
     */
    public void setGCHEQUESRTNDDetailType(CHEQUESRTNDType.GCHEQUESRTNDDetailType value) {
        this.gchequesrtndDetailType = value;
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
     *         &lt;element name="mCHEQUESRTNDDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHEQUECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHEQUEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHEQUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRESENTINGBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RETURNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGULARISATNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REJECTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REJECTIONDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEPROTET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBERPROTET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NEXTREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROVISIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PREAVISREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROVISIONACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGULARIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROVISIONCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBBENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECHQISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INPCHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INPREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INPRETURNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INTRETARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNTHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FEESHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEARP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEUNBLOCKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLEARINGMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEANR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mchequesrtndDetailType"
    })
    public static class GCHEQUESRTNDDetailType {

        @XmlElement(name = "mCHEQUESRTNDDetailType")
        protected List<CHEQUESRTNDType.GCHEQUESRTNDDetailType.MCHEQUESRTNDDetailType> mchequesrtndDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mchequesrtndDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mchequesrtndDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCHEQUESRTNDDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CHEQUESRTNDType.GCHEQUESRTNDDetailType.MCHEQUESRTNDDetailType }
         * 
         * 
         */
        public List<CHEQUESRTNDType.GCHEQUESRTNDDetailType.MCHEQUESRTNDDetailType> getMCHEQUESRTNDDetailType() {
            if (mchequesrtndDetailType == null) {
                mchequesrtndDetailType = new ArrayList<CHEQUESRTNDType.GCHEQUESRTNDDetailType.MCHEQUESRTNDDetailType>();
            }
            return this.mchequesrtndDetailType;
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
         *         &lt;element name="ACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHEQUECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHEQUEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHEQUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRESENTINGBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RETURNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGULARISATNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REJECTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REJECTIONDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEPROTET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMBERPROTET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NEXTREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROVISIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PREAVISREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROVISIONACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGULARIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROVISIONCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBBENEFICIARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECHQISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INPCHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INPREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INPRETURNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INTRETARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNTHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FEESHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEARP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PENALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEUNBLOCKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CLEARINGMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEANR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "accountno",
            "accountccy",
            "chequeccy",
            "chequeamount",
            "chequedate",
            "place",
            "presentingbank",
            "beneficiary",
            "chequestatus",
            "reason",
            "returndate",
            "regularisatndate",
            "rejected",
            "rejectiondate",
            "dateprotet",
            "numberprotet",
            "nextreviewdate",
            "provisionamt",
            "preavisrefno",
            "provisionacct",
            "regularize",
            "provisionccy",
            "ribbeneficiary",
            "datechqissued",
            "inpchequestatus",
            "inpreason",
            "inpreturndate",
            "intretard",
            "accounthn",
            "feeshn",
            "datearp",
            "penalty",
            "dateunblocked",
            "clearingmode",
            "dateanr"
        })
        public static class MCHEQUESRTNDDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "ACCOUNTNO")
            protected String accountno;
            @XmlElement(name = "ACCOUNTCCY")
            protected String accountccy;
            @XmlElement(name = "CHEQUECCY")
            protected String chequeccy;
            @XmlElement(name = "CHEQUEAMOUNT")
            protected String chequeamount;
            @XmlElement(name = "CHEQUEDATE")
            protected String chequedate;
            @XmlElement(name = "PLACE")
            protected String place;
            @XmlElement(name = "PRESENTINGBANK")
            protected String presentingbank;
            @XmlElement(name = "BENEFICIARY")
            protected String beneficiary;
            @XmlElement(name = "CHEQUESTATUS")
            protected String chequestatus;
            @XmlElement(name = "REASON")
            protected String reason;
            @XmlElement(name = "RETURNDATE")
            protected String returndate;
            @XmlElement(name = "REGULARISATNDATE")
            protected String regularisatndate;
            @XmlElement(name = "REJECTED")
            protected String rejected;
            @XmlElement(name = "REJECTIONDATE")
            protected String rejectiondate;
            @XmlElement(name = "DATEPROTET")
            protected String dateprotet;
            @XmlElement(name = "NUMBERPROTET")
            protected String numberprotet;
            @XmlElement(name = "NEXTREVIEWDATE")
            protected String nextreviewdate;
            @XmlElement(name = "PROVISIONAMT")
            protected String provisionamt;
            @XmlElement(name = "PREAVISREFNO")
            protected String preavisrefno;
            @XmlElement(name = "PROVISIONACCT")
            protected String provisionacct;
            @XmlElement(name = "REGULARIZE")
            protected String regularize;
            @XmlElement(name = "PROVISIONCCY")
            protected String provisionccy;
            @XmlElement(name = "RIBBENEFICIARY")
            protected String ribbeneficiary;
            @XmlElement(name = "DATECHQISSUED")
            protected String datechqissued;
            @XmlElement(name = "INPCHEQUESTATUS")
            protected String inpchequestatus;
            @XmlElement(name = "INPREASON")
            protected String inpreason;
            @XmlElement(name = "INPRETURNDATE")
            protected String inpreturndate;
            @XmlElement(name = "INTRETARD")
            protected String intretard;
            @XmlElement(name = "ACCOUNTHN")
            protected String accounthn;
            @XmlElement(name = "FEESHN")
            protected String feeshn;
            @XmlElement(name = "DATEARP")
            protected String datearp;
            @XmlElement(name = "PENALTY")
            protected String penalty;
            @XmlElement(name = "DATEUNBLOCKED")
            protected String dateunblocked;
            @XmlElement(name = "CLEARINGMODE")
            protected String clearingmode;
            @XmlElement(name = "DATEANR")
            protected String dateanr;
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
             * Obtient la valeur de la propriété accountno.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNO() {
                return accountno;
            }

            /**
             * Définit la valeur de la propriété accountno.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNO(String value) {
                this.accountno = value;
            }

            /**
             * Obtient la valeur de la propriété accountccy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCCY() {
                return accountccy;
            }

            /**
             * Définit la valeur de la propriété accountccy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCCY(String value) {
                this.accountccy = value;
            }

            /**
             * Obtient la valeur de la propriété chequeccy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHEQUECCY() {
                return chequeccy;
            }

            /**
             * Définit la valeur de la propriété chequeccy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHEQUECCY(String value) {
                this.chequeccy = value;
            }

            /**
             * Obtient la valeur de la propriété chequeamount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHEQUEAMOUNT() {
                return chequeamount;
            }

            /**
             * Définit la valeur de la propriété chequeamount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHEQUEAMOUNT(String value) {
                this.chequeamount = value;
            }

            /**
             * Obtient la valeur de la propriété chequedate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHEQUEDATE() {
                return chequedate;
            }

            /**
             * Définit la valeur de la propriété chequedate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHEQUEDATE(String value) {
                this.chequedate = value;
            }

            /**
             * Obtient la valeur de la propriété place.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLACE() {
                return place;
            }

            /**
             * Définit la valeur de la propriété place.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLACE(String value) {
                this.place = value;
            }

            /**
             * Obtient la valeur de la propriété presentingbank.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRESENTINGBANK() {
                return presentingbank;
            }

            /**
             * Définit la valeur de la propriété presentingbank.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRESENTINGBANK(String value) {
                this.presentingbank = value;
            }

            /**
             * Obtient la valeur de la propriété beneficiary.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENEFICIARY() {
                return beneficiary;
            }

            /**
             * Définit la valeur de la propriété beneficiary.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENEFICIARY(String value) {
                this.beneficiary = value;
            }

            /**
             * Obtient la valeur de la propriété chequestatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHEQUESTATUS() {
                return chequestatus;
            }

            /**
             * Définit la valeur de la propriété chequestatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHEQUESTATUS(String value) {
                this.chequestatus = value;
            }

            /**
             * Obtient la valeur de la propriété reason.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREASON() {
                return reason;
            }

            /**
             * Définit la valeur de la propriété reason.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREASON(String value) {
                this.reason = value;
            }

            /**
             * Obtient la valeur de la propriété returndate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRETURNDATE() {
                return returndate;
            }

            /**
             * Définit la valeur de la propriété returndate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRETURNDATE(String value) {
                this.returndate = value;
            }

            /**
             * Obtient la valeur de la propriété regularisatndate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREGULARISATNDATE() {
                return regularisatndate;
            }

            /**
             * Définit la valeur de la propriété regularisatndate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREGULARISATNDATE(String value) {
                this.regularisatndate = value;
            }

            /**
             * Obtient la valeur de la propriété rejected.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREJECTED() {
                return rejected;
            }

            /**
             * Définit la valeur de la propriété rejected.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREJECTED(String value) {
                this.rejected = value;
            }

            /**
             * Obtient la valeur de la propriété rejectiondate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREJECTIONDATE() {
                return rejectiondate;
            }

            /**
             * Définit la valeur de la propriété rejectiondate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREJECTIONDATE(String value) {
                this.rejectiondate = value;
            }

            /**
             * Obtient la valeur de la propriété dateprotet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEPROTET() {
                return dateprotet;
            }

            /**
             * Définit la valeur de la propriété dateprotet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEPROTET(String value) {
                this.dateprotet = value;
            }

            /**
             * Obtient la valeur de la propriété numberprotet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBERPROTET() {
                return numberprotet;
            }

            /**
             * Définit la valeur de la propriété numberprotet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBERPROTET(String value) {
                this.numberprotet = value;
            }

            /**
             * Obtient la valeur de la propriété nextreviewdate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNEXTREVIEWDATE() {
                return nextreviewdate;
            }

            /**
             * Définit la valeur de la propriété nextreviewdate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNEXTREVIEWDATE(String value) {
                this.nextreviewdate = value;
            }

            /**
             * Obtient la valeur de la propriété provisionamt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVISIONAMT() {
                return provisionamt;
            }

            /**
             * Définit la valeur de la propriété provisionamt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVISIONAMT(String value) {
                this.provisionamt = value;
            }

            /**
             * Obtient la valeur de la propriété preavisrefno.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREAVISREFNO() {
                return preavisrefno;
            }

            /**
             * Définit la valeur de la propriété preavisrefno.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREAVISREFNO(String value) {
                this.preavisrefno = value;
            }

            /**
             * Obtient la valeur de la propriété provisionacct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVISIONACCT() {
                return provisionacct;
            }

            /**
             * Définit la valeur de la propriété provisionacct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVISIONACCT(String value) {
                this.provisionacct = value;
            }

            /**
             * Obtient la valeur de la propriété regularize.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREGULARIZE() {
                return regularize;
            }

            /**
             * Définit la valeur de la propriété regularize.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREGULARIZE(String value) {
                this.regularize = value;
            }

            /**
             * Obtient la valeur de la propriété provisionccy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVISIONCCY() {
                return provisionccy;
            }

            /**
             * Définit la valeur de la propriété provisionccy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVISIONCCY(String value) {
                this.provisionccy = value;
            }

            /**
             * Obtient la valeur de la propriété ribbeneficiary.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBBENEFICIARY() {
                return ribbeneficiary;
            }

            /**
             * Définit la valeur de la propriété ribbeneficiary.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBBENEFICIARY(String value) {
                this.ribbeneficiary = value;
            }

            /**
             * Obtient la valeur de la propriété datechqissued.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATECHQISSUED() {
                return datechqissued;
            }

            /**
             * Définit la valeur de la propriété datechqissued.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATECHQISSUED(String value) {
                this.datechqissued = value;
            }

            /**
             * Obtient la valeur de la propriété inpchequestatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINPCHEQUESTATUS() {
                return inpchequestatus;
            }

            /**
             * Définit la valeur de la propriété inpchequestatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINPCHEQUESTATUS(String value) {
                this.inpchequestatus = value;
            }

            /**
             * Obtient la valeur de la propriété inpreason.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINPREASON() {
                return inpreason;
            }

            /**
             * Définit la valeur de la propriété inpreason.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINPREASON(String value) {
                this.inpreason = value;
            }

            /**
             * Obtient la valeur de la propriété inpreturndate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINPRETURNDATE() {
                return inpreturndate;
            }

            /**
             * Définit la valeur de la propriété inpreturndate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINPRETURNDATE(String value) {
                this.inpreturndate = value;
            }

            /**
             * Obtient la valeur de la propriété intretard.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINTRETARD() {
                return intretard;
            }

            /**
             * Définit la valeur de la propriété intretard.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINTRETARD(String value) {
                this.intretard = value;
            }

            /**
             * Obtient la valeur de la propriété accounthn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTHN() {
                return accounthn;
            }

            /**
             * Définit la valeur de la propriété accounthn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTHN(String value) {
                this.accounthn = value;
            }

            /**
             * Obtient la valeur de la propriété feeshn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFEESHN() {
                return feeshn;
            }

            /**
             * Définit la valeur de la propriété feeshn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFEESHN(String value) {
                this.feeshn = value;
            }

            /**
             * Obtient la valeur de la propriété datearp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEARP() {
                return datearp;
            }

            /**
             * Définit la valeur de la propriété datearp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEARP(String value) {
                this.datearp = value;
            }

            /**
             * Obtient la valeur de la propriété penalty.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPENALTY() {
                return penalty;
            }

            /**
             * Définit la valeur de la propriété penalty.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPENALTY(String value) {
                this.penalty = value;
            }

            /**
             * Obtient la valeur de la propriété dateunblocked.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEUNBLOCKED() {
                return dateunblocked;
            }

            /**
             * Définit la valeur de la propriété dateunblocked.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEUNBLOCKED(String value) {
                this.dateunblocked = value;
            }

            /**
             * Obtient la valeur de la propriété clearingmode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLEARINGMODE() {
                return clearingmode;
            }

            /**
             * Définit la valeur de la propriété clearingmode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLEARINGMODE(String value) {
                this.clearingmode = value;
            }

            /**
             * Obtient la valeur de la propriété dateanr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEANR() {
                return dateanr;
            }

            /**
             * Définit la valeur de la propriété dateanr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEANR(String value) {
                this.dateanr = value;
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
