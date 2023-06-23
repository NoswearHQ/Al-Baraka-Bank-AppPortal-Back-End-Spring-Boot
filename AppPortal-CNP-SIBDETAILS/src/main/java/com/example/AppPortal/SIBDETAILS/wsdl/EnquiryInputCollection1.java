package com.example.AppPortal.SIBDETAILS.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour enquiryInputCollection complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="enquiryInputCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="criteriaValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryInputCollection", propOrder = {
    "columnName",
    "criteriaValue",
    "operand"
})
public class EnquiryInputCollection1 {

    protected String columnName1;
    protected String criteriaValue1;
    protected String operand1;
   

    /**
     * Obtient la valeur de la propriété columnName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName1() {
        return columnName1;
    }

    /**
     * Définit la valeur de la propriété columnName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName1(String value) {
        this.columnName1 = value;
    }

    /**
     * Obtient la valeur de la propriété criteriaValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaValue1() {
        return criteriaValue1;
    }

    /**
     * Définit la valeur de la propriété criteriaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaValue1(String value) {
        this.criteriaValue1 = value;
    }

    /**
     * Obtient la valeur de la propriété operand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperand1() {
        return operand1;
    }

    /**
     * Définit la valeur de la propriété operand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperand1(String value) {
        this.operand1 = value;
    }



}

