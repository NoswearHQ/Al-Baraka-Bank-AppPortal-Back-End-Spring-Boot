//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.09 à 08:19:54 AM WAT 
//


package com.example.AppPortal.CNP.CHEQUERETURNED.wsdl;

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
 * <p>Classe Java pour SDETAILSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SDETAILSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gSDETAILSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mSDETAILSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEVALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATUREREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODECENTREREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEENREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEDEVISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MONTANTCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBTIREUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEAGCDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RIBPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NAMEPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEEMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUEMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SITUATIONPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATURECOMPTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROCNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEDEVISEPOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MONTANTRECLAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEPREAVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MONTANTPROVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEETABCNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEPRSNTCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEDLVRCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NMBRENRGCMPLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SIGNELECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REFCLEPULC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATUREPERSONNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEPERSONNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROCRDIDENTITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IDENTIFIANTRCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSENUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROPOSTALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEPOSTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="QUALITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MNTREGULARISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MNTINTERET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEEMISSPAPILLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMPAPILLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SDETAILSType", propOrder = {
    "gsdetailsDetailType"
})
public class SDETAILSType {

    @XmlElement(name = "gSDETAILSDetailType")
    protected SDETAILSType.GSDETAILSDetailType gsdetailsDetailType;

    /**
     * Obtient la valeur de la propriété gsdetailsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link SDETAILSType.GSDETAILSDetailType }
     *     
     */
    public SDETAILSType.GSDETAILSDetailType getGSDETAILSDetailType() {
        return gsdetailsDetailType;
    }

    /**
     * Définit la valeur de la propriété gsdetailsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link SDETAILSType.GSDETAILSDetailType }
     *     
     */
    public void setGSDETAILSDetailType(SDETAILSType.GSDETAILSDetailType value) {
        this.gsdetailsDetailType = value;
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
     *         &lt;element name="mSDETAILSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEVALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATUREREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODECENTREREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEENREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEDEVISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MONTANTCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBTIREUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEAGCDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RIBPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NAMEPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEEMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUEMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SITUATIONPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATURECOMPTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROCNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEDEVISEPOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MONTANTRECLAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEPREAVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MONTANTPROVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEETABCNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEPRSNTCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEDLVRCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NMBRENRGCMPLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SIGNELECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFCLEPULC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATUREPERSONNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEPERSONNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROCRDIDENTITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IDENTIFIANTRCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSENUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROPOSTALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEPOSTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="QUALITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MNTREGULARISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MNTINTERET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEEMISSPAPILLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMPAPILLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "msdetailsDetailType"
    })
    public static class GSDETAILSDetailType {

        @XmlElement(name = "mSDETAILSDetailType")
        protected List<SDETAILSType.GSDETAILSDetailType.MSDETAILSDetailType> msdetailsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the msdetailsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msdetailsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSDETAILSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SDETAILSType.GSDETAILSDetailType.MSDETAILSDetailType }
         * 
         * 
         */
        public List<SDETAILSType.GSDETAILSDetailType.MSDETAILSDetailType> getMSDETAILSDetailType() {
            if (msdetailsDetailType == null) {
                msdetailsDetailType = new ArrayList<SDETAILSType.GSDETAILSDetailType.MSDETAILSDetailType>();
            }
            return this.msdetailsDetailType;
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
         *         &lt;element name="SENS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEVALEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATUREREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEREMETTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODECENTREREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEENREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEDEVISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MONTANTCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBTIREUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEINSTDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEAGCDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RIBPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NAMEPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEEMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUEMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SITUATIONPORTEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATURECOMPTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTIFREJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROCNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEDEVISEPOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MONTANTRECLAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEPREAVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MONTANTPROVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEETABCNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEPRSNTCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEDLVRCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NMBRENRGCMPLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SIGNELECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFCLEPULC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATUREPERSONNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEPERSONNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROCRDIDENTITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IDENTIFIANTRCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSENUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROPOSTALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEPOSTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="QUALITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MNTREGULARISE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MNTINTERET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEEMISSPAPILLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMPAPILLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "sens",
            "codevaleur",
            "natureremettant",
            "coderemettant",
            "codecentrereg",
            "dateoperation",
            "numerolot",
            "codeenreg",
            "codedevise",
            "montantcheque",
            "numerocheque",
            "ribtireur",
            "codeinstdest",
            "codeagcdest",
            "ribporteur",
            "nameporteur",
            "dateemission",
            "lieuemission",
            "situationporteur",
            "naturecompte",
            "motifrejet",
            "datecnp",
            "numerocnp",
            "codedevisepos",
            "montantreclame",
            "datepreavis",
            "montantprovision",
            "rang",
            "dateetabcnp",
            "dateprsntcheque",
            "datedlvrcheque",
            "nmbrenrgcmplt",
            "signelect",
            "refclepulc",
            "naturepersonne",
            "typepersonne",
            "numerocrdidentite",
            "identifiantrcs",
            "adressenumero",
            "nomrue",
            "numeropostale",
            "codepostal",
            "qualite",
            "mntregularise",
            "mntinteret",
            "dateemisspapillon",
            "numpapillon",
            "flag",
            "id"
        })
        public static class MSDETAILSDetailType {

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
            @XmlElement(name = "MONTANTCHEQUE")
            protected String montantcheque;
            @XmlElement(name = "NUMEROCHEQUE")
            protected String numerocheque;
            @XmlElement(name = "RIBTIREUR")
            protected String ribtireur;
            @XmlElement(name = "CODEINSTDEST")
            protected String codeinstdest;
            @XmlElement(name = "CODEAGCDEST")
            protected String codeagcdest;
            @XmlElement(name = "RIBPORTEUR")
            protected String ribporteur;
            @XmlElement(name = "NAMEPORTEUR")
            protected String nameporteur;
            @XmlElement(name = "DATEEMISSION")
            protected String dateemission;
            @XmlElement(name = "LIEUEMISSION")
            protected String lieuemission;
            @XmlElement(name = "SITUATIONPORTEUR")
            protected String situationporteur;
            @XmlElement(name = "NATURECOMPTE")
            protected String naturecompte;
            @XmlElement(name = "MOTIFREJET")
            protected String motifrejet;
            @XmlElement(name = "DATECNP")
            protected String datecnp;
            @XmlElement(name = "NUMEROCNP")
            protected String numerocnp;
            @XmlElement(name = "CODEDEVISEPOS")
            protected String codedevisepos;
            @XmlElement(name = "MONTANTRECLAME")
            protected String montantreclame;
            @XmlElement(name = "DATEPREAVIS")
            protected String datepreavis;
            @XmlElement(name = "MONTANTPROVISION")
            protected String montantprovision;
            @XmlElement(name = "RANG")
            protected String rang;
            @XmlElement(name = "DATEETABCNP")
            protected String dateetabcnp;
            @XmlElement(name = "DATEPRSNTCHEQUE")
            protected String dateprsntcheque;
            @XmlElement(name = "DATEDLVRCHEQUE")
            protected String datedlvrcheque;
            @XmlElement(name = "NMBRENRGCMPLT")
            protected String nmbrenrgcmplt;
            @XmlElement(name = "SIGNELECT")
            protected String signelect;
            @XmlElement(name = "REFCLEPULC")
            protected String refclepulc;
            @XmlElement(name = "NATUREPERSONNE")
            protected String naturepersonne;
            @XmlElement(name = "TYPEPERSONNE")
            protected String typepersonne;
            @XmlElement(name = "NUMEROCRDIDENTITE")
            protected String numerocrdidentite;
            @XmlElement(name = "IDENTIFIANTRCS")
            protected String identifiantrcs;
            @XmlElement(name = "ADRESSENUMERO")
            protected String adressenumero;
            @XmlElement(name = "NOMRUE")
            protected String nomrue;
            @XmlElement(name = "NUMEROPOSTALE")
            protected String numeropostale;
            @XmlElement(name = "CODEPOSTAL")
            protected String codepostal;
            @XmlElement(name = "QUALITE")
            protected String qualite;
            @XmlElement(name = "MNTREGULARISE")
            protected String mntregularise;
            @XmlElement(name = "MNTINTERET")
            protected String mntinteret;
            @XmlElement(name = "DATEEMISSPAPILLON")
            protected String dateemisspapillon;
            @XmlElement(name = "NUMPAPILLON")
            protected String numpapillon;
            @XmlElement(name = "FLAG")
            protected String flag;
            @XmlElement(name = "ID")
            protected String id;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

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
             * Obtient la valeur de la propriété montantcheque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMONTANTCHEQUE() {
                return montantcheque;
            }

            /**
             * Définit la valeur de la propriété montantcheque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMONTANTCHEQUE(String value) {
                this.montantcheque = value;
            }

            /**
             * Obtient la valeur de la propriété numerocheque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROCHEQUE() {
                return numerocheque;
            }

            /**
             * Définit la valeur de la propriété numerocheque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROCHEQUE(String value) {
                this.numerocheque = value;
            }

            /**
             * Obtient la valeur de la propriété ribtireur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBTIREUR() {
                return ribtireur;
            }

            /**
             * Définit la valeur de la propriété ribtireur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBTIREUR(String value) {
                this.ribtireur = value;
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
             * Obtient la valeur de la propriété ribporteur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRIBPORTEUR() {
                return ribporteur;
            }

            /**
             * Définit la valeur de la propriété ribporteur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRIBPORTEUR(String value) {
                this.ribporteur = value;
            }

            /**
             * Obtient la valeur de la propriété nameporteur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAMEPORTEUR() {
                return nameporteur;
            }

            /**
             * Définit la valeur de la propriété nameporteur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAMEPORTEUR(String value) {
                this.nameporteur = value;
            }

            /**
             * Obtient la valeur de la propriété dateemission.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEEMISSION() {
                return dateemission;
            }

            /**
             * Définit la valeur de la propriété dateemission.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEEMISSION(String value) {
                this.dateemission = value;
            }

            /**
             * Obtient la valeur de la propriété lieuemission.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUEMISSION() {
                return lieuemission;
            }

            /**
             * Définit la valeur de la propriété lieuemission.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUEMISSION(String value) {
                this.lieuemission = value;
            }

            /**
             * Obtient la valeur de la propriété situationporteur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSITUATIONPORTEUR() {
                return situationporteur;
            }

            /**
             * Définit la valeur de la propriété situationporteur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSITUATIONPORTEUR(String value) {
                this.situationporteur = value;
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
             * Obtient la valeur de la propriété datecnp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATECNP() {
                return datecnp;
            }

            /**
             * Définit la valeur de la propriété datecnp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATECNP(String value) {
                this.datecnp = value;
            }

            /**
             * Obtient la valeur de la propriété numerocnp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROCNP() {
                return numerocnp;
            }

            /**
             * Définit la valeur de la propriété numerocnp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROCNP(String value) {
                this.numerocnp = value;
            }

            /**
             * Obtient la valeur de la propriété codedevisepos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEDEVISEPOS() {
                return codedevisepos;
            }

            /**
             * Définit la valeur de la propriété codedevisepos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEDEVISEPOS(String value) {
                this.codedevisepos = value;
            }

            /**
             * Obtient la valeur de la propriété montantreclame.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMONTANTRECLAME() {
                return montantreclame;
            }

            /**
             * Définit la valeur de la propriété montantreclame.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMONTANTRECLAME(String value) {
                this.montantreclame = value;
            }

            /**
             * Obtient la valeur de la propriété datepreavis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEPREAVIS() {
                return datepreavis;
            }

            /**
             * Définit la valeur de la propriété datepreavis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEPREAVIS(String value) {
                this.datepreavis = value;
            }

            /**
             * Obtient la valeur de la propriété montantprovision.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMONTANTPROVISION() {
                return montantprovision;
            }

            /**
             * Définit la valeur de la propriété montantprovision.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMONTANTPROVISION(String value) {
                this.montantprovision = value;
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
             * Obtient la valeur de la propriété dateetabcnp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEETABCNP() {
                return dateetabcnp;
            }

            /**
             * Définit la valeur de la propriété dateetabcnp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEETABCNP(String value) {
                this.dateetabcnp = value;
            }

            /**
             * Obtient la valeur de la propriété dateprsntcheque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEPRSNTCHEQUE() {
                return dateprsntcheque;
            }

            /**
             * Définit la valeur de la propriété dateprsntcheque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEPRSNTCHEQUE(String value) {
                this.dateprsntcheque = value;
            }

            /**
             * Obtient la valeur de la propriété datedlvrcheque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEDLVRCHEQUE() {
                return datedlvrcheque;
            }

            /**
             * Définit la valeur de la propriété datedlvrcheque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEDLVRCHEQUE(String value) {
                this.datedlvrcheque = value;
            }

            /**
             * Obtient la valeur de la propriété nmbrenrgcmplt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNMBRENRGCMPLT() {
                return nmbrenrgcmplt;
            }

            /**
             * Définit la valeur de la propriété nmbrenrgcmplt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNMBRENRGCMPLT(String value) {
                this.nmbrenrgcmplt = value;
            }

            /**
             * Obtient la valeur de la propriété signelect.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNELECT() {
                return signelect;
            }

            /**
             * Définit la valeur de la propriété signelect.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNELECT(String value) {
                this.signelect = value;
            }

            /**
             * Obtient la valeur de la propriété refclepulc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFCLEPULC() {
                return refclepulc;
            }

            /**
             * Définit la valeur de la propriété refclepulc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFCLEPULC(String value) {
                this.refclepulc = value;
            }

            /**
             * Obtient la valeur de la propriété naturepersonne.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATUREPERSONNE() {
                return naturepersonne;
            }

            /**
             * Définit la valeur de la propriété naturepersonne.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATUREPERSONNE(String value) {
                this.naturepersonne = value;
            }

            /**
             * Obtient la valeur de la propriété typepersonne.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEPERSONNE() {
                return typepersonne;
            }

            /**
             * Définit la valeur de la propriété typepersonne.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEPERSONNE(String value) {
                this.typepersonne = value;
            }

            /**
             * Obtient la valeur de la propriété numerocrdidentite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROCRDIDENTITE() {
                return numerocrdidentite;
            }

            /**
             * Définit la valeur de la propriété numerocrdidentite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROCRDIDENTITE(String value) {
                this.numerocrdidentite = value;
            }

            /**
             * Obtient la valeur de la propriété identifiantrcs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDENTIFIANTRCS() {
                return identifiantrcs;
            }

            /**
             * Définit la valeur de la propriété identifiantrcs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDENTIFIANTRCS(String value) {
                this.identifiantrcs = value;
            }

            /**
             * Obtient la valeur de la propriété adressenumero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSENUMERO() {
                return adressenumero;
            }

            /**
             * Définit la valeur de la propriété adressenumero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSENUMERO(String value) {
                this.adressenumero = value;
            }

            /**
             * Obtient la valeur de la propriété nomrue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRUE() {
                return nomrue;
            }

            /**
             * Définit la valeur de la propriété nomrue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRUE(String value) {
                this.nomrue = value;
            }

            /**
             * Obtient la valeur de la propriété numeropostale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROPOSTALE() {
                return numeropostale;
            }

            /**
             * Définit la valeur de la propriété numeropostale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROPOSTALE(String value) {
                this.numeropostale = value;
            }

            /**
             * Obtient la valeur de la propriété codepostal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEPOSTAL() {
                return codepostal;
            }

            /**
             * Définit la valeur de la propriété codepostal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEPOSTAL(String value) {
                this.codepostal = value;
            }

            /**
             * Obtient la valeur de la propriété qualite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQUALITE() {
                return qualite;
            }

            /**
             * Définit la valeur de la propriété qualite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQUALITE(String value) {
                this.qualite = value;
            }

            /**
             * Obtient la valeur de la propriété mntregularise.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMNTREGULARISE() {
                return mntregularise;
            }

            /**
             * Définit la valeur de la propriété mntregularise.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMNTREGULARISE(String value) {
                this.mntregularise = value;
            }

            /**
             * Obtient la valeur de la propriété mntinteret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMNTINTERET() {
                return mntinteret;
            }

            /**
             * Définit la valeur de la propriété mntinteret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMNTINTERET(String value) {
                this.mntinteret = value;
            }

            /**
             * Obtient la valeur de la propriété dateemisspapillon.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEEMISSPAPILLON() {
                return dateemisspapillon;
            }

            /**
             * Définit la valeur de la propriété dateemisspapillon.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEEMISSPAPILLON(String value) {
                this.dateemisspapillon = value;
            }

            /**
             * Obtient la valeur de la propriété numpapillon.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMPAPILLON() {
                return numpapillon;
            }

            /**
             * Définit la valeur de la propriété numpapillon.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMPAPILLON(String value) {
                this.numpapillon = value;
            }

            /**
             * Obtient la valeur de la propriété flag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAG() {
                return flag;
            }

            /**
             * Définit la valeur de la propriété flag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAG(String value) {
                this.flag = value;
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
