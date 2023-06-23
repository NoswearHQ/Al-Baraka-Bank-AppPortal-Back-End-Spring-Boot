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
 * <p>Classe Java pour WSBILLSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSBILLSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gWSBILLSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mWSBILLSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEVALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATUREREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODECENTREREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEENREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEDEVISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MONTANTEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMBRETOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MONTANTINTERET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBTIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEAGCDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REFCOMMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEACCEPTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEENDOSSAVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REFCOMMTITEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEORDREPAYER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SITUATIONCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATURECOMPTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECOMPENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIDENTIFIANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDENTIFIANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODERISQUEBCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "WSBILLSType", propOrder = {
    "gwsbillsDetailType"
})
public class WSBILLSType {

    @XmlElement(name = "gWSBILLSDetailType")
    protected WSBILLSType.GWSBILLSDetailType gwsbillsDetailType;

    /**
     * Obtient la valeur de la propriété gwsbillsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link WSBILLSType.GWSBILLSDetailType }
     *     
     */
    public WSBILLSType.GWSBILLSDetailType getGWSBILLSDetailType() {
        return gwsbillsDetailType;
    }

    /**
     * Définit la valeur de la propriété gwsbillsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBILLSType.GWSBILLSDetailType }
     *     
     */
    public void setGWSBILLSDetailType(WSBILLSType.GWSBILLSDetailType value) {
        this.gwsbillsDetailType = value;
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
     *         &lt;element name="mWSBILLSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEVALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATUREREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODECENTREREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEENREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEDEVISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MONTANTEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMBRETOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MONTANTINTERET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBTIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEAGCDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFCOMMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEACCEPTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEENDOSSAVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFCOMMTITEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEORDREPAYER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SITUATIONCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATURECOMPTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECOMPENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIDENTIFIANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDENTIFIANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODERISQUEBCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mwsbillsDetailType"
    })
    public static class GWSBILLSDetailType {

        @XmlElement(name = "mWSBILLSDetailType")
        protected List<WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType> mwsbillsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mwsbillsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mwsbillsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMWSBILLSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType }
         * 
         * 
         */
        public List<WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType> getMWSBILLSDetailType() {
            if (mwsbillsDetailType == null) {
                mwsbillsDetailType = new ArrayList<WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType>();
            }
            return this.mwsbillsDetailType;
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
         *         &lt;element name="SENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEVALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATUREREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODECENTREREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEENREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEDEVISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MONTANTEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMBRETOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MONTANTINTERET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBTIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEAGCDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFCOMMTIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEACCEPTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEENDOSSAVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEECHEANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFCOMMTITEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEORDREPAYER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SITUATIONCEDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATURECOMPTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECOMPENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIDENTIFIANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDENTIFIANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODERISQUEBCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "sens",
            "codevaleur",
            "natureremettant",
            "coderemettant",
            "codecentrereg",
            "dateoperation",
            "numerolot",
            "codeenreg",
            "codedevise",
            "montanteffet",
            "nombretotal",
            "montantinteret",
            "numeroeffet",
            "ribtir",
            "codeinstdest",
            "codeagcdest",
            "ribcedant",
            "nomcedant",
            "nomtire",
            "refcommtire",
            "codeacceptation",
            "codeendossaval",
            "dateecheance",
            "dateeffet",
            "refcommtiteur",
            "codeordrepayer",
            "situationcedant",
            "naturecompte",
            "datecompens",
            "motifrejet",
            "rang",
            "adresse",
            "natidentifiant",
            "numidentifiant",
            "coderisquebct",
            "reserved1",
            "reserved2",
            "reserved3",
            "reserved4",
            "reserved5",
            "reserved6",
            "reserved7",
            "inputter",
            "datetime",
            "authoriser",
            "cocode",
            "deptcode",
            "auditorcode",
            "auditdatetime"
        })
        public static class MWSBILLSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "SENS")
            protected String sens;
            @XmlElement(name = "CODEVALEUR")
            protected String codevaleur;
            @XmlElement(name = "NATUREREMETTANT")
            protected String natureremettant;
            @XmlElement(name = "CODEREMETTANT")
            protected String coderemettant;
            @XmlElement(name = "CODECENTREREG")
            protected String codecentrereg;
            @XmlElement(name = "DATEOPERATION")
            protected String dateoperation;
            @XmlElement(name = "NUMEROLOT")
            protected String numerolot;
            @XmlElement(name = "CODEENREG")
            protected String codeenreg;
            @XmlElement(name = "CODEDEVISE")
            protected String codedevise;
            @XmlElement(name = "MONTANTEFFET")
            protected String montanteffet;
            @XmlElement(name = "NOMBRETOTAL")
            protected String nombretotal;
            @XmlElement(name = "MONTANTINTERET")
            protected String montantinteret;
            @XmlElement(name = "NUMEROEFFET")
            protected String numeroeffet;
            @XmlElement(name = "RIBTIR")
            protected String ribtir;
            @XmlElement(name = "CODEINSTDEST")
            protected String codeinstdest;
            @XmlElement(name = "CODEAGCDEST")
            protected String codeagcdest;
            @XmlElement(name = "RIBCEDANT")
            protected String ribcedant;
            @XmlElement(name = "NOMCEDANT")
            protected String nomcedant;
            @XmlElement(name = "NOMTIRE")
            protected String nomtire;
            @XmlElement(name = "REFCOMMTIRE")
            protected String refcommtire;
            @XmlElement(name = "CODEACCEPTATION")
            protected String codeacceptation;
            @XmlElement(name = "CODEENDOSSAVAL")
            protected String codeendossaval;
            @XmlElement(name = "DATEECHEANCE")
            protected String dateecheance;
            @XmlElement(name = "DATEEFFET")
            protected String dateeffet;
            @XmlElement(name = "REFCOMMTITEUR")
            protected String refcommtiteur;
            @XmlElement(name = "CODEORDREPAYER")
            protected String codeordrepayer;
            @XmlElement(name = "SITUATIONCEDANT")
            protected String situationcedant;
            @XmlElement(name = "NATURECOMPTE")
            protected String naturecompte;
            @XmlElement(name = "DATECOMPENS")
            protected String datecompens;
            @XmlElement(name = "MOTIFREJET")
            protected String motifrejet;
            @XmlElement(name = "RANG")
            protected String rang;
            @XmlElement(name = "ADRESSE")
            protected String adresse;
            @XmlElement(name = "NATIDENTIFIANT")
            protected String natidentifiant;
            @XmlElement(name = "NUMIDENTIFIANT")
            protected String numidentifiant;
            @XmlElement(name = "CODERISQUEBCT")
            protected String coderisquebct;
            @XmlElement(name = "RESERVED1")
            protected String reserved1;
            @XmlElement(name = "RESERVED2")
            protected String reserved2;
            @XmlElement(name = "RESERVED3")
            protected String reserved3;
            @XmlElement(name = "RESERVED4")
            protected String reserved4;
            @XmlElement(name = "RESERVED5")
            protected String reserved5;
            @XmlElement(name = "RESERVED6")
            protected String reserved6;
            @XmlElement(name = "RESERVED7")
            protected String reserved7;
            @XmlElement(name = "INPUTTER")
            protected String inputter;
            @XmlElement(name = "DATETIME")
            protected String datetime;
            @XmlElement(name = "AUTHORISER")
            protected String authoriser;
            @XmlElement(name = "COCODE")
            protected String cocode;
            @XmlElement(name = "DEPTCODE")
            protected String deptcode;
            @XmlElement(name = "AUDITORCODE")
            protected String auditorcode;
            @XmlElement(name = "AUDITDATETIME")
            protected String auditdatetime;
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
             * Obtient la valeur de la propriété sens.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSENS() {
                return sens;
            }

            /**
             * Définit la valeur de la propriété sens.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSENS(String value) {
                this.sens = value;
            }

            /**
             * Obtient la valeur de la propriété codevaleur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEVALEUR() {
                return codevaleur;
            }

            /**
             * Définit la valeur de la propriété codevaleur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEVALEUR(String value) {
                this.codevaleur = value;
            }

            /**
             * Obtient la valeur de la propriété natureremettant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATUREREMETTANT() {
                return natureremettant;
            }

            /**
             * Définit la valeur de la propriété natureremettant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATUREREMETTANT(String value) {
                this.natureremettant = value;
            }

            /**
             * Obtient la valeur de la propriété coderemettant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEREMETTANT() {
                return coderemettant;
            }

            /**
             * Définit la valeur de la propriété coderemettant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEREMETTANT(String value) {
                this.coderemettant = value;
            }

            /**
             * Obtient la valeur de la propriété codecentrereg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODECENTREREG() {
                return codecentrereg;
            }

            /**
             * Définit la valeur de la propriété codecentrereg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODECENTREREG(String value) {
                this.codecentrereg = value;
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
             * Obtient la valeur de la propriété numerolot.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROLOT() {
                return numerolot;
            }

            /**
             * Définit la valeur de la propriété numerolot.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROLOT(String value) {
                this.numerolot = value;
            }

            /**
             * Obtient la valeur de la propriété codeenreg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEENREG() {
                return codeenreg;
            }

            /**
             * Définit la valeur de la propriété codeenreg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEENREG(String value) {
                this.codeenreg = value;
            }

            /**
             * Obtient la valeur de la propriété codedevise.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEDEVISE() {
                return codedevise;
            }

            /**
             * Définit la valeur de la propriété codedevise.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEDEVISE(String value) {
                this.codedevise = value;
            }

            /**
             * Obtient la valeur de la propriété montanteffet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMONTANTEFFET() {
                return montanteffet;
            }

            /**
             * Définit la valeur de la propriété montanteffet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMONTANTEFFET(String value) {
                this.montanteffet = value;
            }

            /**
             * Obtient la valeur de la propriété nombretotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMBRETOTAL() {
                return nombretotal;
            }

            /**
             * Définit la valeur de la propriété nombretotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMBRETOTAL(String value) {
                this.nombretotal = value;
            }

            /**
             * Obtient la valeur de la propriété montantinteret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMONTANTINTERET() {
                return montantinteret;
            }

            /**
             * Définit la valeur de la propriété montantinteret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMONTANTINTERET(String value) {
                this.montantinteret = value;
            }

            /**
             * Obtient la valeur de la propriété numeroeffet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROEFFET() {
                return numeroeffet;
            }

            /**
             * Définit la valeur de la propriété numeroeffet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROEFFET(String value) {
                this.numeroeffet = value;
            }

            /**
             * Obtient la valeur de la propriété ribtir.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBTIR() {
                return ribtir;
            }

            /**
             * Définit la valeur de la propriété ribtir.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBTIR(String value) {
                this.ribtir = value;
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
             * Obtient la valeur de la propriété codeagcdest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEAGCDEST() {
                return codeagcdest;
            }

            /**
             * Définit la valeur de la propriété codeagcdest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEAGCDEST(String value) {
                this.codeagcdest = value;
            }

            /**
             * Obtient la valeur de la propriété ribcedant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBCEDANT() {
                return ribcedant;
            }

            /**
             * Définit la valeur de la propriété ribcedant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBCEDANT(String value) {
                this.ribcedant = value;
            }

            /**
             * Obtient la valeur de la propriété nomcedant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMCEDANT() {
                return nomcedant;
            }

            /**
             * Définit la valeur de la propriété nomcedant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMCEDANT(String value) {
                this.nomcedant = value;
            }

            /**
             * Obtient la valeur de la propriété nomtire.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMTIRE() {
                return nomtire;
            }

            /**
             * Définit la valeur de la propriété nomtire.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMTIRE(String value) {
                this.nomtire = value;
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
             * Obtient la valeur de la propriété codeacceptation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEACCEPTATION() {
                return codeacceptation;
            }

            /**
             * Définit la valeur de la propriété codeacceptation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEACCEPTATION(String value) {
                this.codeacceptation = value;
            }

            /**
             * Obtient la valeur de la propriété codeendossaval.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEENDOSSAVAL() {
                return codeendossaval;
            }

            /**
             * Définit la valeur de la propriété codeendossaval.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEENDOSSAVAL(String value) {
                this.codeendossaval = value;
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
             * Obtient la valeur de la propriété dateeffet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEEFFET() {
                return dateeffet;
            }

            /**
             * Définit la valeur de la propriété dateeffet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEEFFET(String value) {
                this.dateeffet = value;
            }

            /**
             * Obtient la valeur de la propriété refcommtiteur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFCOMMTITEUR() {
                return refcommtiteur;
            }

            /**
             * Définit la valeur de la propriété refcommtiteur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFCOMMTITEUR(String value) {
                this.refcommtiteur = value;
            }

            /**
             * Obtient la valeur de la propriété codeordrepayer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEORDREPAYER() {
                return codeordrepayer;
            }

            /**
             * Définit la valeur de la propriété codeordrepayer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEORDREPAYER(String value) {
                this.codeordrepayer = value;
            }

            /**
             * Obtient la valeur de la propriété situationcedant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSITUATIONCEDANT() {
                return situationcedant;
            }

            /**
             * Définit la valeur de la propriété situationcedant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSITUATIONCEDANT(String value) {
                this.situationcedant = value;
            }

            /**
             * Obtient la valeur de la propriété naturecompte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATURECOMPTE() {
                return naturecompte;
            }

            /**
             * Définit la valeur de la propriété naturecompte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATURECOMPTE(String value) {
                this.naturecompte = value;
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
             * Obtient la valeur de la propriété rang.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRANG() {
                return rang;
            }

            /**
             * Définit la valeur de la propriété rang.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRANG(String value) {
                this.rang = value;
            }

            /**
             * Obtient la valeur de la propriété adresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE(String value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété natidentifiant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIDENTIFIANT() {
                return natidentifiant;
            }

            /**
             * Définit la valeur de la propriété natidentifiant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIDENTIFIANT(String value) {
                this.natidentifiant = value;
            }

            /**
             * Obtient la valeur de la propriété numidentifiant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDENTIFIANT() {
                return numidentifiant;
            }

            /**
             * Définit la valeur de la propriété numidentifiant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDENTIFIANT(String value) {
                this.numidentifiant = value;
            }

            /**
             * Obtient la valeur de la propriété coderisquebct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODERISQUEBCT() {
                return coderisquebct;
            }

            /**
             * Définit la valeur de la propriété coderisquebct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODERISQUEBCT(String value) {
                this.coderisquebct = value;
            }

            /**
             * Obtient la valeur de la propriété reserved1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED1() {
                return reserved1;
            }

            /**
             * Définit la valeur de la propriété reserved1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED1(String value) {
                this.reserved1 = value;
            }

            /**
             * Obtient la valeur de la propriété reserved2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED2() {
                return reserved2;
            }

            /**
             * Définit la valeur de la propriété reserved2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED2(String value) {
                this.reserved2 = value;
            }

            /**
             * Obtient la valeur de la propriété reserved3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED3() {
                return reserved3;
            }

            /**
             * Définit la valeur de la propriété reserved3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED3(String value) {
                this.reserved3 = value;
            }

            /**
             * Obtient la valeur de la propriété reserved4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED4() {
                return reserved4;
            }

            /**
             * Définit la valeur de la propriété reserved4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED4(String value) {
                this.reserved4 = value;
            }

            /**
             * Obtient la valeur de la propriété reserved5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED5() {
                return reserved5;
            }

            /**
             * Définit la valeur de la propriété reserved5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED5(String value) {
                this.reserved5 = value;
            }

            /**
             * Obtient la valeur de la propriété reserved6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED6() {
                return reserved6;
            }

            /**
             * Définit la valeur de la propriété reserved6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED6(String value) {
                this.reserved6 = value;
            }

            /**
             * Obtient la valeur de la propriété reserved7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED7() {
                return reserved7;
            }

            /**
             * Définit la valeur de la propriété reserved7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED7(String value) {
                this.reserved7 = value;
            }

            /**
             * Obtient la valeur de la propriété inputter.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINPUTTER() {
                return inputter;
            }

            /**
             * Définit la valeur de la propriété inputter.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINPUTTER(String value) {
                this.inputter = value;
            }

            /**
             * Obtient la valeur de la propriété datetime.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATETIME() {
                return datetime;
            }

            /**
             * Définit la valeur de la propriété datetime.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATETIME(String value) {
                this.datetime = value;
            }

            /**
             * Obtient la valeur de la propriété authoriser.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUTHORISER() {
                return authoriser;
            }

            /**
             * Définit la valeur de la propriété authoriser.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUTHORISER(String value) {
                this.authoriser = value;
            }

            /**
             * Obtient la valeur de la propriété cocode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOCODE() {
                return cocode;
            }

            /**
             * Définit la valeur de la propriété cocode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOCODE(String value) {
                this.cocode = value;
            }

            /**
             * Obtient la valeur de la propriété deptcode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEPTCODE() {
                return deptcode;
            }

            /**
             * Définit la valeur de la propriété deptcode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEPTCODE(String value) {
                this.deptcode = value;
            }

            /**
             * Obtient la valeur de la propriété auditorcode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUDITORCODE() {
                return auditorcode;
            }

            /**
             * Définit la valeur de la propriété auditorcode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUDITORCODE(String value) {
                this.auditorcode = value;
            }

            /**
             * Obtient la valeur de la propriété auditdatetime.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUDITDATETIME() {
                return auditdatetime;
            }

            /**
             * Définit la valeur de la propriété auditdatetime.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUDITDATETIME(String value) {
                this.auditdatetime = value;
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
