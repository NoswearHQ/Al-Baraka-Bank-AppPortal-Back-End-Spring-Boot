//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:58:20 AM WAT 
//


package com.example.AppPortal.KYC.TWSKYCPM2.wsdl;

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
 * <p>Classe Java pour TWSKYCPM2Type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TWSKYCPM2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gTWSKYCPM2DetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mTWSKYCPM2DetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SALARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROFESSIONLIBERALCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CINCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PASSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATDEMANDEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATFISCCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMPLOYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMPADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CELIBATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DIVORCECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VEUFCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CONJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROFCONJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMBREENFANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REVENUSANNUELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUENOMLOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANQUENOMETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROPRIETAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIONALITYCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEPOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MINEURCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MAJEURCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LEGALEXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUEMI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATUREMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OPERINTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OPERINTERPAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DEMSPONTCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RECOMTIERSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INITBNKCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RECOMCOLABCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MNTOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LUCRATIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SOURCEFONDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRSITEWEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESSOURCESASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INDUSTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMEROJUGEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEJORTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FORMEJURID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODEDOUANE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODETVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODECADEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMETAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATECONSTIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRENOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CINCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PASSCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CSCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATDEMANDEIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LEGALEXP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUEMI1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIONAL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIONALITYCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODE1POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OPERINTERPAYS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EMAILM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SOURCEFONDS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMSECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIDT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOM10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPROFESSION10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMNATIONAL10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMRESIDENCE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENCLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENCLT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENCLT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CLT1LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CLT2LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CLT3LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="F1NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="F2NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="F3NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="F1LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="F2LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="F3LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CODESECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTIVATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMPRENACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPEIDTACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NYMIDTACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CAPITALACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYSACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADRESSE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TEL10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FAX10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IDUNIQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BENEFEFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PPEACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHIFFRESAFFA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESIDENCE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LIEUNAIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BIRTH10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TWSKYCPM2Type", propOrder = {
    "gtwskycpm2DetailType"
})
public class TWSKYCPM2Type {

    @XmlElement(name = "gTWSKYCPM2DetailType")
    protected TWSKYCPM2Type.GTWSKYCPM2DetailType gtwskycpm2DetailType;

    /**
     * Obtient la valeur de la propriété gtwskycpm2DetailType.
     * 
     * @return
     *     possible object is
     *     {@link TWSKYCPM2Type.GTWSKYCPM2DetailType }
     *     
     */
    public TWSKYCPM2Type.GTWSKYCPM2DetailType getGTWSKYCPM2DetailType() {
        return gtwskycpm2DetailType;
    }

    /**
     * Définit la valeur de la propriété gtwskycpm2DetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TWSKYCPM2Type.GTWSKYCPM2DetailType }
     *     
     */
    public void setGTWSKYCPM2DetailType(TWSKYCPM2Type.GTWSKYCPM2DetailType value) {
        this.gtwskycpm2DetailType = value;
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
     *         &lt;element name="mTWSKYCPM2DetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="selFldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SALARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROFESSIONLIBERALCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CINCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PASSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATDEMANDEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATFISCCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMPLOYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMPADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CELIBATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DIVORCECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VEUFCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CONJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROFCONJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMBREENFANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REVENUSANNUELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUENOMLOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANQUENOMETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROPRIETAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIONALITYCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEPOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MINEURCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MAJEURCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LEGALEXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUEMI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATUREMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OPERINTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OPERINTERPAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DEMSPONTCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RECOMTIERSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INITBNKCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RECOMCOLABCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MNTOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LUCRATIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SOURCEFONDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRSITEWEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESSOURCESASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INDUSTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMEROJUGEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEJORTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FORMEJURID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODEDOUANE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODETVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODECADEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMETAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATECONSTIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRENOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CINCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PASSCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CSCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATDEMANDEIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LEGALEXP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUEMI1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIONAL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIONALITYCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODE1POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OPERINTERPAYS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EMAILM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SOURCEFONDS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMSECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIDT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOM10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPROFESSION10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMNATIONAL10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMRESIDENCE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENCLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENCLT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENCLT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLT1LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLT2LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLT3LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="F1NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="F2NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="F3NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="F1LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="F2LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="F3LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODESECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTIVATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMPRENACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPEIDTACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NYMIDTACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CAPITALACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYSACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADRESSE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TEL10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IDUNIQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BENEFEFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PPEACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHIFFRESAFFA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESIDENCE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIEUNAIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BIRTH10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mtwskycpm2DetailType"
    })
    public static class GTWSKYCPM2DetailType {

        @XmlElement(name = "mTWSKYCPM2DetailType")
        protected List<TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType> mtwskycpm2DetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtwskycpm2DetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtwskycpm2DetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTWSKYCPM2DetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType }
         * 
         * 
         */
        public List<TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType> getMTWSKYCPM2DetailType() {
            if (mtwskycpm2DetailType == null) {
                mtwskycpm2DetailType = new ArrayList<TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType>();
            }
            return this.mtwskycpm2DetailType;
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
         *         &lt;element name="DATETODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATERELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SALARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROFESSIONLIBERALCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CINCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PASSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATDEMANDEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATFISCCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMPLOYEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMPADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MARIECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CELIBATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DIVORCECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VEUFCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CONJOINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROFCONJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMBREENFANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REVENUSANNUELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUENOMLOCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANQUENOMETRANGERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LOCATAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROPRIETAIRECHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PEPCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PEPMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIONALITYCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEPOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MINEURCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MAJEURCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LEGALEXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUEMI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATUREMANDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OPERINTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OPERINTERPAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DEMSPONTCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RECOMTIERSCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INITBNKCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RECOMCOLABCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MNTOPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LUCRATIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SOURCEFONDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRSITEWEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESSOURCESASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INDUSTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMEROJUGEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEJORTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEEFFET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FORMEJURID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODEDOUANE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODETVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODECADEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMETAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATECONSTIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRENOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CINCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PASSCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CSCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATDEMANDEIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LEGALEXP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUEMI1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIONAL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIONALITYCHECK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODE1POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OPERINTERPAYS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EMAILM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SOURCEFONDS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMSECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMIDT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOM10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPROFESSION10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMNATIONAL10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMRESIDENCE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENCLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENCLT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENCLT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CLT1LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CLT2LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CLT3LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="F1NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="F2NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="F3NOMPREN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="F1LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="F2LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="F3LIEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODESECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTIVATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMPRENACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPEIDTACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NYMIDTACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CAPITALACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYSACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATACT10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADRESSE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TEL10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IDUNIQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BENEFEFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PPEACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHIFFRESAFFA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESIDENCE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIEUNAIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BIRTH10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "datetoday",
            "agence",
            "cusid",
            "daterelation",
            "salariecheck",
            "professionliberalcheck",
            "prof",
            "cincheck",
            "passcheck",
            "cscheck",
            "numidt",
            "datdemandeidt",
            "matfisccheck",
            "matfisc",
            "adresse",
            "employeur",
            "empadresse",
            "mariecheck",
            "celibatairecheck",
            "divorcecheck",
            "veufcheck",
            "conjoint",
            "profconj",
            "nombreenfants",
            "revenusannuels",
            "annualbonus",
            "resident",
            "nom",
            "prenom",
            "banquecheck",
            "banquenomlocale",
            "banquenometrangere",
            "locatairecheck",
            "proprietairecheck",
            "pepcheck",
            "pepmandat",
            "riskclass",
            "nationalitycheck",
            "birth",
            "lieunais",
            "nationality",
            "country",
            "codepost",
            "tel",
            "emp",
            "mineurcheck",
            "majeurcheck",
            "typeidt",
            "legalexp",
            "lieuemi",
            "ppe",
            "naturemandat",
            "operinter",
            "operinterpays",
            "demspontcheck",
            "recomtierscheck",
            "initbnkcheck",
            "recomcolabcheck",
            "product",
            "mntoperation",
            "lucratif",
            "sourcefonds",
            "adrsiteweb",
            "ressourcesass",
            "industry",
            "email1",
            "numerojugement",
            "datejorte",
            "datecreate",
            "codemand",
            "town",
            "dateeffet",
            "formejurid",
            "rccl",
            "codedouane",
            "codetva",
            "codecadeg",
            "fax",
            "numetab",
            "dateconstit",
            "nom1",
            "prenom1",
            "lieunais1",
            "typeidt1",
            "cincheck1",
            "passcheck1",
            "cscheck1",
            "birth1",
            "datdemandeidt1",
            "numidt1",
            "legalexp1",
            "lieuemi1",
            "national1",
            "nationalitycheck1",
            "adresse1",
            "code1POST",
            "operinterpays1",
            "tel1",
            "fax1",
            "emailm",
            "sourcefonds1",
            "nomprofession",
            "nomsector",
            "numidt2",
            "nom2",
            "nomprofession2",
            "nomnational2",
            "nomresidence2",
            "numidt3",
            "nom3",
            "nomprofession3",
            "nomnational3",
            "nomresidence3",
            "numidt4",
            "nom4",
            "nomprofession4",
            "nomnational4",
            "nomresidence4",
            "numidt5",
            "nom5",
            "nomprofession5",
            "nomnational5",
            "nomresidence5",
            "numidt6",
            "nom6",
            "nomprofession6",
            "nomnational6",
            "nomresidence6",
            "numidt7",
            "nom7",
            "nomprofession7",
            "nomnational7",
            "nomresidence7",
            "numidt8",
            "nom8",
            "nomprofession8",
            "nomnational8",
            "nomresidence8",
            "numidt9",
            "nom9",
            "nomprofession9",
            "nomnational9",
            "nomresidence9",
            "numidt10",
            "nom10",
            "nomprofession10",
            "nomnational10",
            "nomresidence10",
            "nomprenclt",
            "nomprenclt2",
            "nomprenclt3",
            "clt1LIEU",
            "clt2LIEU",
            "clt3LIEU",
            "f1NOMPREN",
            "f2NOMPREN",
            "f3NOMPREN",
            "f1LIEU",
            "f2LIEU",
            "f3LIEU",
            "nomprenact1",
            "nomprenact2",
            "nomprenact3",
            "typeidtact1",
            "typeidtact2",
            "typeidtact3",
            "nymidtact1",
            "nymidtact2",
            "nymidtact3",
            "capitalact1",
            "capitalact2",
            "capitalact3",
            "paysact1",
            "paysact2",
            "paysact3",
            "natact1",
            "natact2",
            "natact3",
            "codesector",
            "motivation",
            "nomprenact4",
            "typeidtact4",
            "nymidtact4",
            "capitalact4",
            "paysact4",
            "natact4",
            "nomprenact5",
            "typeidtact5",
            "nymidtact5",
            "capitalact5",
            "paysact5",
            "natact5",
            "nomprenact6",
            "typeidtact6",
            "nymidtact6",
            "capitalact6",
            "paysact6",
            "natact6",
            "nomprenact7",
            "typeidtact7",
            "nymidtact7",
            "capitalact7",
            "paysact7",
            "natact7",
            "nomprenact8",
            "typeidtact8",
            "nymidtact8",
            "capitalact8",
            "paysact8",
            "natact8",
            "nomprenact9",
            "typeidtact9",
            "nymidtact9",
            "capitalact9",
            "paysact9",
            "natact9",
            "nomprenact10",
            "typeidtact10",
            "nymidtact10",
            "capitalact10",
            "paysact10",
            "natact10",
            "adresse2",
            "tel2",
            "fax2",
            "adresse3",
            "tel3",
            "fax3",
            "adresse4",
            "tel4",
            "fax4",
            "adresse5",
            "tel5",
            "fax5",
            "adresse6",
            "tel6",
            "fax6",
            "adresse7",
            "tel7",
            "fax7",
            "adresse8",
            "tel8",
            "fax8",
            "adresse9",
            "tel9",
            "fax9",
            "adresse10",
            "tel10",
            "fax10",
            "idunique",
            "benefeff",
            "ppeact",
            "chiffresaffa",
            "residence1",
            "lieunais2",
            "birth2",
            "lieunais3",
            "birth3",
            "lieunais4",
            "birth4",
            "lieunais5",
            "birth5",
            "lieunais6",
            "birth6",
            "lieunais7",
            "birth7",
            "lieunais8",
            "birth8",
            "lieunais9",
            "birth9",
            "lieunais10",
            "birth10"
        })
        public static class MTWSKYCPM2DetailType {

            protected String selFldID;
            @XmlElement(name = "DATETODAY")
            protected String datetoday;
            @XmlElement(name = "AGENCE")
            protected String agence;
            @XmlElement(name = "CUSID")
            protected String cusid;
            @XmlElement(name = "DATERELATION")
            protected String daterelation;
            @XmlElement(name = "SALARIECHECK")
            protected String salariecheck;
            @XmlElement(name = "PROFESSIONLIBERALCHECK")
            protected String professionliberalcheck;
            @XmlElement(name = "PROF")
            protected String prof;
            @XmlElement(name = "CINCHECK")
            protected String cincheck;
            @XmlElement(name = "PASSCHECK")
            protected String passcheck;
            @XmlElement(name = "CSCHECK")
            protected String cscheck;
            @XmlElement(name = "NUMIDT")
            protected String numidt;
            @XmlElement(name = "DATDEMANDEIDT")
            protected String datdemandeidt;
            @XmlElement(name = "MATFISCCHECK")
            protected String matfisccheck;
            @XmlElement(name = "MATFISC")
            protected String matfisc;
            @XmlElement(name = "ADRESSE")
            protected String adresse;
            @XmlElement(name = "EMPLOYEUR")
            protected String employeur;
            @XmlElement(name = "EMPADRESSE")
            protected String empadresse;
            @XmlElement(name = "MARIECHECK")
            protected String mariecheck;
            @XmlElement(name = "CELIBATAIRECHECK")
            protected String celibatairecheck;
            @XmlElement(name = "DIVORCECHECK")
            protected String divorcecheck;
            @XmlElement(name = "VEUFCHECK")
            protected String veufcheck;
            @XmlElement(name = "CONJOINT")
            protected String conjoint;
            @XmlElement(name = "PROFCONJ")
            protected String profconj;
            @XmlElement(name = "NOMBREENFANTS")
            protected String nombreenfants;
            @XmlElement(name = "REVENUSANNUELS")
            protected String revenusannuels;
            @XmlElement(name = "ANNUALBONUS")
            protected String annualbonus;
            @XmlElement(name = "RESIDENT")
            protected String resident;
            @XmlElement(name = "NOM")
            protected String nom;
            @XmlElement(name = "PRENOM")
            protected String prenom;
            @XmlElement(name = "BANQUECHECK")
            protected String banquecheck;
            @XmlElement(name = "BANQUENOMLOCALE")
            protected String banquenomlocale;
            @XmlElement(name = "BANQUENOMETRANGERE")
            protected String banquenometrangere;
            @XmlElement(name = "LOCATAIRECHECK")
            protected String locatairecheck;
            @XmlElement(name = "PROPRIETAIRECHECK")
            protected String proprietairecheck;
            @XmlElement(name = "PEPCHECK")
            protected String pepcheck;
            @XmlElement(name = "PEPMANDAT")
            protected String pepmandat;
            @XmlElement(name = "RISKCLASS")
            protected String riskclass;
            @XmlElement(name = "NATIONALITYCHECK")
            protected String nationalitycheck;
            @XmlElement(name = "BIRTH")
            protected String birth;
            @XmlElement(name = "LIEUNAIS")
            protected String lieunais;
            @XmlElement(name = "NATIONALITY")
            protected String nationality;
            @XmlElement(name = "COUNTRY")
            protected String country;
            @XmlElement(name = "CODEPOST")
            protected String codepost;
            @XmlElement(name = "TEL")
            protected String tel;
            @XmlElement(name = "EMP")
            protected String emp;
            @XmlElement(name = "MINEURCHECK")
            protected String mineurcheck;
            @XmlElement(name = "MAJEURCHECK")
            protected String majeurcheck;
            @XmlElement(name = "TYPEIDT")
            protected String typeidt;
            @XmlElement(name = "LEGALEXP")
            protected String legalexp;
            @XmlElement(name = "LIEUEMI")
            protected String lieuemi;
            @XmlElement(name = "PPE")
            protected String ppe;
            @XmlElement(name = "NATUREMANDAT")
            protected String naturemandat;
            @XmlElement(name = "OPERINTER")
            protected String operinter;
            @XmlElement(name = "OPERINTERPAYS")
            protected String operinterpays;
            @XmlElement(name = "DEMSPONTCHECK")
            protected String demspontcheck;
            @XmlElement(name = "RECOMTIERSCHECK")
            protected String recomtierscheck;
            @XmlElement(name = "INITBNKCHECK")
            protected String initbnkcheck;
            @XmlElement(name = "RECOMCOLABCHECK")
            protected String recomcolabcheck;
            @XmlElement(name = "PRODUCT")
            protected String product;
            @XmlElement(name = "MNTOPERATION")
            protected String mntoperation;
            @XmlElement(name = "LUCRATIF")
            protected String lucratif;
            @XmlElement(name = "SOURCEFONDS")
            protected String sourcefonds;
            @XmlElement(name = "ADRSITEWEB")
            protected String adrsiteweb;
            @XmlElement(name = "RESSOURCESASS")
            protected String ressourcesass;
            @XmlElement(name = "INDUSTRY")
            protected String industry;
            @XmlElement(name = "EMAIL1")
            protected String email1;
            @XmlElement(name = "NUMEROJUGEMENT")
            protected String numerojugement;
            @XmlElement(name = "DATEJORTE")
            protected String datejorte;
            @XmlElement(name = "DATECREATE")
            protected String datecreate;
            @XmlElement(name = "CODEMAND")
            protected String codemand;
            @XmlElement(name = "TOWN")
            protected String town;
            @XmlElement(name = "DATEEFFET")
            protected String dateeffet;
            @XmlElement(name = "FORMEJURID")
            protected String formejurid;
            @XmlElement(name = "RCCL")
            protected String rccl;
            @XmlElement(name = "CODEDOUANE")
            protected String codedouane;
            @XmlElement(name = "CODETVA")
            protected String codetva;
            @XmlElement(name = "CODECADEG")
            protected String codecadeg;
            @XmlElement(name = "FAX")
            protected String fax;
            @XmlElement(name = "NUMETAB")
            protected String numetab;
            @XmlElement(name = "DATECONSTIT")
            protected String dateconstit;
            @XmlElement(name = "NOM1")
            protected String nom1;
            @XmlElement(name = "PRENOM1")
            protected String prenom1;
            @XmlElement(name = "LIEUNAIS1")
            protected String lieunais1;
            @XmlElement(name = "TYPEIDT1")
            protected String typeidt1;
            @XmlElement(name = "CINCHECK1")
            protected String cincheck1;
            @XmlElement(name = "PASSCHECK1")
            protected String passcheck1;
            @XmlElement(name = "CSCHECK1")
            protected String cscheck1;
            @XmlElement(name = "BIRTH1")
            protected String birth1;
            @XmlElement(name = "DATDEMANDEIDT1")
            protected String datdemandeidt1;
            @XmlElement(name = "NUMIDT1")
            protected String numidt1;
            @XmlElement(name = "LEGALEXP1")
            protected String legalexp1;
            @XmlElement(name = "LIEUEMI1")
            protected String lieuemi1;
            @XmlElement(name = "NATIONAL1")
            protected String national1;
            @XmlElement(name = "NATIONALITYCHECK1")
            protected String nationalitycheck1;
            @XmlElement(name = "ADRESSE1")
            protected String adresse1;
            @XmlElement(name = "CODE1POST")
            protected String code1POST;
            @XmlElement(name = "OPERINTERPAYS1")
            protected String operinterpays1;
            @XmlElement(name = "TEL1")
            protected String tel1;
            @XmlElement(name = "FAX1")
            protected String fax1;
            @XmlElement(name = "EMAILM")
            protected String emailm;
            @XmlElement(name = "SOURCEFONDS1")
            protected String sourcefonds1;
            @XmlElement(name = "NOMPROFESSION")
            protected String nomprofession;
            @XmlElement(name = "NOMSECTOR")
            protected String nomsector;
            @XmlElement(name = "NUMIDT2")
            protected String numidt2;
            @XmlElement(name = "NOM2")
            protected String nom2;
            @XmlElement(name = "NOMPROFESSION2")
            protected String nomprofession2;
            @XmlElement(name = "NOMNATIONAL2")
            protected String nomnational2;
            @XmlElement(name = "NOMRESIDENCE2")
            protected String nomresidence2;
            @XmlElement(name = "NUMIDT3")
            protected String numidt3;
            @XmlElement(name = "NOM3")
            protected String nom3;
            @XmlElement(name = "NOMPROFESSION3")
            protected String nomprofession3;
            @XmlElement(name = "NOMNATIONAL3")
            protected String nomnational3;
            @XmlElement(name = "NOMRESIDENCE3")
            protected String nomresidence3;
            @XmlElement(name = "NUMIDT4")
            protected String numidt4;
            @XmlElement(name = "NOM4")
            protected String nom4;
            @XmlElement(name = "NOMPROFESSION4")
            protected String nomprofession4;
            @XmlElement(name = "NOMNATIONAL4")
            protected String nomnational4;
            @XmlElement(name = "NOMRESIDENCE4")
            protected String nomresidence4;
            @XmlElement(name = "NUMIDT5")
            protected String numidt5;
            @XmlElement(name = "NOM5")
            protected String nom5;
            @XmlElement(name = "NOMPROFESSION5")
            protected String nomprofession5;
            @XmlElement(name = "NOMNATIONAL5")
            protected String nomnational5;
            @XmlElement(name = "NOMRESIDENCE5")
            protected String nomresidence5;
            @XmlElement(name = "NUMIDT6")
            protected String numidt6;
            @XmlElement(name = "NOM6")
            protected String nom6;
            @XmlElement(name = "NOMPROFESSION6")
            protected String nomprofession6;
            @XmlElement(name = "NOMNATIONAL6")
            protected String nomnational6;
            @XmlElement(name = "NOMRESIDENCE6")
            protected String nomresidence6;
            @XmlElement(name = "NUMIDT7")
            protected String numidt7;
            @XmlElement(name = "NOM7")
            protected String nom7;
            @XmlElement(name = "NOMPROFESSION7")
            protected String nomprofession7;
            @XmlElement(name = "NOMNATIONAL7")
            protected String nomnational7;
            @XmlElement(name = "NOMRESIDENCE7")
            protected String nomresidence7;
            @XmlElement(name = "NUMIDT8")
            protected String numidt8;
            @XmlElement(name = "NOM8")
            protected String nom8;
            @XmlElement(name = "NOMPROFESSION8")
            protected String nomprofession8;
            @XmlElement(name = "NOMNATIONAL8")
            protected String nomnational8;
            @XmlElement(name = "NOMRESIDENCE8")
            protected String nomresidence8;
            @XmlElement(name = "NUMIDT9")
            protected String numidt9;
            @XmlElement(name = "NOM9")
            protected String nom9;
            @XmlElement(name = "NOMPROFESSION9")
            protected String nomprofession9;
            @XmlElement(name = "NOMNATIONAL9")
            protected String nomnational9;
            @XmlElement(name = "NOMRESIDENCE9")
            protected String nomresidence9;
            @XmlElement(name = "NUMIDT10")
            protected String numidt10;
            @XmlElement(name = "NOM10")
            protected String nom10;
            @XmlElement(name = "NOMPROFESSION10")
            protected String nomprofession10;
            @XmlElement(name = "NOMNATIONAL10")
            protected String nomnational10;
            @XmlElement(name = "NOMRESIDENCE10")
            protected String nomresidence10;
            @XmlElement(name = "NOMPRENCLT")
            protected String nomprenclt;
            @XmlElement(name = "NOMPRENCLT2")
            protected String nomprenclt2;
            @XmlElement(name = "NOMPRENCLT3")
            protected String nomprenclt3;
            @XmlElement(name = "CLT1LIEU")
            protected String clt1LIEU;
            @XmlElement(name = "CLT2LIEU")
            protected String clt2LIEU;
            @XmlElement(name = "CLT3LIEU")
            protected String clt3LIEU;
            @XmlElement(name = "F1NOMPREN")
            protected String f1NOMPREN;
            @XmlElement(name = "F2NOMPREN")
            protected String f2NOMPREN;
            @XmlElement(name = "F3NOMPREN")
            protected String f3NOMPREN;
            @XmlElement(name = "F1LIEU")
            protected String f1LIEU;
            @XmlElement(name = "F2LIEU")
            protected String f2LIEU;
            @XmlElement(name = "F3LIEU")
            protected String f3LIEU;
            @XmlElement(name = "NOMPRENACT1")
            protected String nomprenact1;
            @XmlElement(name = "NOMPRENACT2")
            protected String nomprenact2;
            @XmlElement(name = "NOMPRENACT3")
            protected String nomprenact3;
            @XmlElement(name = "TYPEIDTACT1")
            protected String typeidtact1;
            @XmlElement(name = "TYPEIDTACT2")
            protected String typeidtact2;
            @XmlElement(name = "TYPEIDTACT3")
            protected String typeidtact3;
            @XmlElement(name = "NYMIDTACT1")
            protected String nymidtact1;
            @XmlElement(name = "NYMIDTACT2")
            protected String nymidtact2;
            @XmlElement(name = "NYMIDTACT3")
            protected String nymidtact3;
            @XmlElement(name = "CAPITALACT1")
            protected String capitalact1;
            @XmlElement(name = "CAPITALACT2")
            protected String capitalact2;
            @XmlElement(name = "CAPITALACT3")
            protected String capitalact3;
            @XmlElement(name = "PAYSACT1")
            protected String paysact1;
            @XmlElement(name = "PAYSACT2")
            protected String paysact2;
            @XmlElement(name = "PAYSACT3")
            protected String paysact3;
            @XmlElement(name = "NATACT1")
            protected String natact1;
            @XmlElement(name = "NATACT2")
            protected String natact2;
            @XmlElement(name = "NATACT3")
            protected String natact3;
            @XmlElement(name = "CODESECTOR")
            protected String codesector;
            @XmlElement(name = "MOTIVATION")
            protected String motivation;
            @XmlElement(name = "NOMPRENACT4")
            protected String nomprenact4;
            @XmlElement(name = "TYPEIDTACT4")
            protected String typeidtact4;
            @XmlElement(name = "NYMIDTACT4")
            protected String nymidtact4;
            @XmlElement(name = "CAPITALACT4")
            protected String capitalact4;
            @XmlElement(name = "PAYSACT4")
            protected String paysact4;
            @XmlElement(name = "NATACT4")
            protected String natact4;
            @XmlElement(name = "NOMPRENACT5")
            protected String nomprenact5;
            @XmlElement(name = "TYPEIDTACT5")
            protected String typeidtact5;
            @XmlElement(name = "NYMIDTACT5")
            protected String nymidtact5;
            @XmlElement(name = "CAPITALACT5")
            protected String capitalact5;
            @XmlElement(name = "PAYSACT5")
            protected String paysact5;
            @XmlElement(name = "NATACT5")
            protected String natact5;
            @XmlElement(name = "NOMPRENACT6")
            protected String nomprenact6;
            @XmlElement(name = "TYPEIDTACT6")
            protected String typeidtact6;
            @XmlElement(name = "NYMIDTACT6")
            protected String nymidtact6;
            @XmlElement(name = "CAPITALACT6")
            protected String capitalact6;
            @XmlElement(name = "PAYSACT6")
            protected String paysact6;
            @XmlElement(name = "NATACT6")
            protected String natact6;
            @XmlElement(name = "NOMPRENACT7")
            protected String nomprenact7;
            @XmlElement(name = "TYPEIDTACT7")
            protected String typeidtact7;
            @XmlElement(name = "NYMIDTACT7")
            protected String nymidtact7;
            @XmlElement(name = "CAPITALACT7")
            protected String capitalact7;
            @XmlElement(name = "PAYSACT7")
            protected String paysact7;
            @XmlElement(name = "NATACT7")
            protected String natact7;
            @XmlElement(name = "NOMPRENACT8")
            protected String nomprenact8;
            @XmlElement(name = "TYPEIDTACT8")
            protected String typeidtact8;
            @XmlElement(name = "NYMIDTACT8")
            protected String nymidtact8;
            @XmlElement(name = "CAPITALACT8")
            protected String capitalact8;
            @XmlElement(name = "PAYSACT8")
            protected String paysact8;
            @XmlElement(name = "NATACT8")
            protected String natact8;
            @XmlElement(name = "NOMPRENACT9")
            protected String nomprenact9;
            @XmlElement(name = "TYPEIDTACT9")
            protected String typeidtact9;
            @XmlElement(name = "NYMIDTACT9")
            protected String nymidtact9;
            @XmlElement(name = "CAPITALACT9")
            protected String capitalact9;
            @XmlElement(name = "PAYSACT9")
            protected String paysact9;
            @XmlElement(name = "NATACT9")
            protected String natact9;
            @XmlElement(name = "NOMPRENACT10")
            protected String nomprenact10;
            @XmlElement(name = "TYPEIDTACT10")
            protected String typeidtact10;
            @XmlElement(name = "NYMIDTACT10")
            protected String nymidtact10;
            @XmlElement(name = "CAPITALACT10")
            protected String capitalact10;
            @XmlElement(name = "PAYSACT10")
            protected String paysact10;
            @XmlElement(name = "NATACT10")
            protected String natact10;
            @XmlElement(name = "ADRESSE2")
            protected String adresse2;
            @XmlElement(name = "TEL2")
            protected String tel2;
            @XmlElement(name = "FAX2")
            protected String fax2;
            @XmlElement(name = "ADRESSE3")
            protected String adresse3;
            @XmlElement(name = "TEL3")
            protected String tel3;
            @XmlElement(name = "FAX3")
            protected String fax3;
            @XmlElement(name = "ADRESSE4")
            protected String adresse4;
            @XmlElement(name = "TEL4")
            protected String tel4;
            @XmlElement(name = "FAX4")
            protected String fax4;
            @XmlElement(name = "ADRESSE5")
            protected String adresse5;
            @XmlElement(name = "TEL5")
            protected String tel5;
            @XmlElement(name = "FAX5")
            protected String fax5;
            @XmlElement(name = "ADRESSE6")
            protected String adresse6;
            @XmlElement(name = "TEL6")
            protected String tel6;
            @XmlElement(name = "FAX6")
            protected String fax6;
            @XmlElement(name = "ADRESSE7")
            protected String adresse7;
            @XmlElement(name = "TEL7")
            protected String tel7;
            @XmlElement(name = "FAX7")
            protected String fax7;
            @XmlElement(name = "ADRESSE8")
            protected String adresse8;
            @XmlElement(name = "TEL8")
            protected String tel8;
            @XmlElement(name = "FAX8")
            protected String fax8;
            @XmlElement(name = "ADRESSE9")
            protected String adresse9;
            @XmlElement(name = "TEL9")
            protected String tel9;
            @XmlElement(name = "FAX9")
            protected String fax9;
            @XmlElement(name = "ADRESSE10")
            protected String adresse10;
            @XmlElement(name = "TEL10")
            protected String tel10;
            @XmlElement(name = "FAX10")
            protected String fax10;
            @XmlElement(name = "IDUNIQUE")
            protected String idunique;
            @XmlElement(name = "BENEFEFF")
            protected String benefeff;
            @XmlElement(name = "PPEACT")
            protected String ppeact;
            @XmlElement(name = "CHIFFRESAFFA")
            protected String chiffresaffa;
            @XmlElement(name = "RESIDENCE1")
            protected String residence1;
            @XmlElement(name = "LIEUNAIS2")
            protected String lieunais2;
            @XmlElement(name = "BIRTH2")
            protected String birth2;
            @XmlElement(name = "LIEUNAIS3")
            protected String lieunais3;
            @XmlElement(name = "BIRTH3")
            protected String birth3;
            @XmlElement(name = "LIEUNAIS4")
            protected String lieunais4;
            @XmlElement(name = "BIRTH4")
            protected String birth4;
            @XmlElement(name = "LIEUNAIS5")
            protected String lieunais5;
            @XmlElement(name = "BIRTH5")
            protected String birth5;
            @XmlElement(name = "LIEUNAIS6")
            protected String lieunais6;
            @XmlElement(name = "BIRTH6")
            protected String birth6;
            @XmlElement(name = "LIEUNAIS7")
            protected String lieunais7;
            @XmlElement(name = "BIRTH7")
            protected String birth7;
            @XmlElement(name = "LIEUNAIS8")
            protected String lieunais8;
            @XmlElement(name = "BIRTH8")
            protected String birth8;
            @XmlElement(name = "LIEUNAIS9")
            protected String lieunais9;
            @XmlElement(name = "BIRTH9")
            protected String birth9;
            @XmlElement(name = "LIEUNAIS10")
            protected String lieunais10;
            @XmlElement(name = "BIRTH10")
            protected String birth10;
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
             * Obtient la valeur de la propriété datetoday.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATETODAY() {
                return datetoday;
            }

            /**
             * Définit la valeur de la propriété datetoday.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATETODAY(String value) {
                this.datetoday = value;
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
             * Obtient la valeur de la propriété cusid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSID() {
                return cusid;
            }

            /**
             * Définit la valeur de la propriété cusid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSID(String value) {
                this.cusid = value;
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
             * Obtient la valeur de la propriété salariecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSALARIECHECK() {
                return salariecheck;
            }

            /**
             * Définit la valeur de la propriété salariecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSALARIECHECK(String value) {
                this.salariecheck = value;
            }

            /**
             * Obtient la valeur de la propriété professionliberalcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROFESSIONLIBERALCHECK() {
                return professionliberalcheck;
            }

            /**
             * Définit la valeur de la propriété professionliberalcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROFESSIONLIBERALCHECK(String value) {
                this.professionliberalcheck = value;
            }

            /**
             * Obtient la valeur de la propriété prof.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROF() {
                return prof;
            }

            /**
             * Définit la valeur de la propriété prof.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROF(String value) {
                this.prof = value;
            }

            /**
             * Obtient la valeur de la propriété cincheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCINCHECK() {
                return cincheck;
            }

            /**
             * Définit la valeur de la propriété cincheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCINCHECK(String value) {
                this.cincheck = value;
            }

            /**
             * Obtient la valeur de la propriété passcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPASSCHECK() {
                return passcheck;
            }

            /**
             * Définit la valeur de la propriété passcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPASSCHECK(String value) {
                this.passcheck = value;
            }

            /**
             * Obtient la valeur de la propriété cscheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSCHECK() {
                return cscheck;
            }

            /**
             * Définit la valeur de la propriété cscheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSCHECK(String value) {
                this.cscheck = value;
            }

            /**
             * Obtient la valeur de la propriété numidt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT() {
                return numidt;
            }

            /**
             * Définit la valeur de la propriété numidt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT(String value) {
                this.numidt = value;
            }

            /**
             * Obtient la valeur de la propriété datdemandeidt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATDEMANDEIDT() {
                return datdemandeidt;
            }

            /**
             * Définit la valeur de la propriété datdemandeidt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATDEMANDEIDT(String value) {
                this.datdemandeidt = value;
            }

            /**
             * Obtient la valeur de la propriété matfisccheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMATFISCCHECK() {
                return matfisccheck;
            }

            /**
             * Définit la valeur de la propriété matfisccheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMATFISCCHECK(String value) {
                this.matfisccheck = value;
            }

            /**
             * Obtient la valeur de la propriété matfisc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMATFISC() {
                return matfisc;
            }

            /**
             * Définit la valeur de la propriété matfisc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMATFISC(String value) {
                this.matfisc = value;
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
             * Obtient la valeur de la propriété employeur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPLOYEUR() {
                return employeur;
            }

            /**
             * Définit la valeur de la propriété employeur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPLOYEUR(String value) {
                this.employeur = value;
            }

            /**
             * Obtient la valeur de la propriété empadresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPADRESSE() {
                return empadresse;
            }

            /**
             * Définit la valeur de la propriété empadresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPADRESSE(String value) {
                this.empadresse = value;
            }

            /**
             * Obtient la valeur de la propriété mariecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMARIECHECK() {
                return mariecheck;
            }

            /**
             * Définit la valeur de la propriété mariecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMARIECHECK(String value) {
                this.mariecheck = value;
            }

            /**
             * Obtient la valeur de la propriété celibatairecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCELIBATAIRECHECK() {
                return celibatairecheck;
            }

            /**
             * Définit la valeur de la propriété celibatairecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCELIBATAIRECHECK(String value) {
                this.celibatairecheck = value;
            }

            /**
             * Obtient la valeur de la propriété divorcecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIVORCECHECK() {
                return divorcecheck;
            }

            /**
             * Définit la valeur de la propriété divorcecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIVORCECHECK(String value) {
                this.divorcecheck = value;
            }

            /**
             * Obtient la valeur de la propriété veufcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVEUFCHECK() {
                return veufcheck;
            }

            /**
             * Définit la valeur de la propriété veufcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVEUFCHECK(String value) {
                this.veufcheck = value;
            }

            /**
             * Obtient la valeur de la propriété conjoint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONJOINT() {
                return conjoint;
            }

            /**
             * Définit la valeur de la propriété conjoint.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONJOINT(String value) {
                this.conjoint = value;
            }

            /**
             * Obtient la valeur de la propriété profconj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROFCONJ() {
                return profconj;
            }

            /**
             * Définit la valeur de la propriété profconj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROFCONJ(String value) {
                this.profconj = value;
            }

            /**
             * Obtient la valeur de la propriété nombreenfants.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMBREENFANTS() {
                return nombreenfants;
            }

            /**
             * Définit la valeur de la propriété nombreenfants.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMBREENFANTS(String value) {
                this.nombreenfants = value;
            }

            /**
             * Obtient la valeur de la propriété revenusannuels.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVENUSANNUELS() {
                return revenusannuels;
            }

            /**
             * Définit la valeur de la propriété revenusannuels.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVENUSANNUELS(String value) {
                this.revenusannuels = value;
            }

            /**
             * Obtient la valeur de la propriété annualbonus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getANNUALBONUS() {
                return annualbonus;
            }

            /**
             * Définit la valeur de la propriété annualbonus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setANNUALBONUS(String value) {
                this.annualbonus = value;
            }

            /**
             * Obtient la valeur de la propriété resident.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENT() {
                return resident;
            }

            /**
             * Définit la valeur de la propriété resident.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENT(String value) {
                this.resident = value;
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
             * Obtient la valeur de la propriété banquenomlocale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUENOMLOCALE() {
                return banquenomlocale;
            }

            /**
             * Définit la valeur de la propriété banquenomlocale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUENOMLOCALE(String value) {
                this.banquenomlocale = value;
            }

            /**
             * Obtient la valeur de la propriété banquenometrangere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANQUENOMETRANGERE() {
                return banquenometrangere;
            }

            /**
             * Définit la valeur de la propriété banquenometrangere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANQUENOMETRANGERE(String value) {
                this.banquenometrangere = value;
            }

            /**
             * Obtient la valeur de la propriété locatairecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATAIRECHECK() {
                return locatairecheck;
            }

            /**
             * Définit la valeur de la propriété locatairecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATAIRECHECK(String value) {
                this.locatairecheck = value;
            }

            /**
             * Obtient la valeur de la propriété proprietairecheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROPRIETAIRECHECK() {
                return proprietairecheck;
            }

            /**
             * Définit la valeur de la propriété proprietairecheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROPRIETAIRECHECK(String value) {
                this.proprietairecheck = value;
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
             * Obtient la valeur de la propriété nationalitycheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONALITYCHECK() {
                return nationalitycheck;
            }

            /**
             * Définit la valeur de la propriété nationalitycheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONALITYCHECK(String value) {
                this.nationalitycheck = value;
            }

            /**
             * Obtient la valeur de la propriété birth.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH() {
                return birth;
            }

            /**
             * Définit la valeur de la propriété birth.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH(String value) {
                this.birth = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS() {
                return lieunais;
            }

            /**
             * Définit la valeur de la propriété lieunais.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS(String value) {
                this.lieunais = value;
            }

            /**
             * Obtient la valeur de la propriété nationality.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONALITY() {
                return nationality;
            }

            /**
             * Définit la valeur de la propriété nationality.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONALITY(String value) {
                this.nationality = value;
            }

            /**
             * Obtient la valeur de la propriété country.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRY() {
                return country;
            }

            /**
             * Définit la valeur de la propriété country.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRY(String value) {
                this.country = value;
            }

            /**
             * Obtient la valeur de la propriété codepost.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEPOST() {
                return codepost;
            }

            /**
             * Définit la valeur de la propriété codepost.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEPOST(String value) {
                this.codepost = value;
            }

            /**
             * Obtient la valeur de la propriété tel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL() {
                return tel;
            }

            /**
             * Définit la valeur de la propriété tel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL(String value) {
                this.tel = value;
            }

            /**
             * Obtient la valeur de la propriété emp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMP() {
                return emp;
            }

            /**
             * Définit la valeur de la propriété emp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMP(String value) {
                this.emp = value;
            }

            /**
             * Obtient la valeur de la propriété mineurcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMINEURCHECK() {
                return mineurcheck;
            }

            /**
             * Définit la valeur de la propriété mineurcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMINEURCHECK(String value) {
                this.mineurcheck = value;
            }

            /**
             * Obtient la valeur de la propriété majeurcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMAJEURCHECK() {
                return majeurcheck;
            }

            /**
             * Définit la valeur de la propriété majeurcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMAJEURCHECK(String value) {
                this.majeurcheck = value;
            }

            /**
             * Obtient la valeur de la propriété typeidt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDT() {
                return typeidt;
            }

            /**
             * Définit la valeur de la propriété typeidt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDT(String value) {
                this.typeidt = value;
            }

            /**
             * Obtient la valeur de la propriété legalexp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALEXP() {
                return legalexp;
            }

            /**
             * Définit la valeur de la propriété legalexp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALEXP(String value) {
                this.legalexp = value;
            }

            /**
             * Obtient la valeur de la propriété lieuemi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUEMI() {
                return lieuemi;
            }

            /**
             * Définit la valeur de la propriété lieuemi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUEMI(String value) {
                this.lieuemi = value;
            }

            /**
             * Obtient la valeur de la propriété ppe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPPE() {
                return ppe;
            }

            /**
             * Définit la valeur de la propriété ppe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPPE(String value) {
                this.ppe = value;
            }

            /**
             * Obtient la valeur de la propriété naturemandat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATUREMANDAT() {
                return naturemandat;
            }

            /**
             * Définit la valeur de la propriété naturemandat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATUREMANDAT(String value) {
                this.naturemandat = value;
            }

            /**
             * Obtient la valeur de la propriété operinter.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOPERINTER() {
                return operinter;
            }

            /**
             * Définit la valeur de la propriété operinter.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOPERINTER(String value) {
                this.operinter = value;
            }

            /**
             * Obtient la valeur de la propriété operinterpays.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOPERINTERPAYS() {
                return operinterpays;
            }

            /**
             * Définit la valeur de la propriété operinterpays.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOPERINTERPAYS(String value) {
                this.operinterpays = value;
            }

            /**
             * Obtient la valeur de la propriété demspontcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEMSPONTCHECK() {
                return demspontcheck;
            }

            /**
             * Définit la valeur de la propriété demspontcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEMSPONTCHECK(String value) {
                this.demspontcheck = value;
            }

            /**
             * Obtient la valeur de la propriété recomtierscheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECOMTIERSCHECK() {
                return recomtierscheck;
            }

            /**
             * Définit la valeur de la propriété recomtierscheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECOMTIERSCHECK(String value) {
                this.recomtierscheck = value;
            }

            /**
             * Obtient la valeur de la propriété initbnkcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINITBNKCHECK() {
                return initbnkcheck;
            }

            /**
             * Définit la valeur de la propriété initbnkcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINITBNKCHECK(String value) {
                this.initbnkcheck = value;
            }

            /**
             * Obtient la valeur de la propriété recomcolabcheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECOMCOLABCHECK() {
                return recomcolabcheck;
            }

            /**
             * Définit la valeur de la propriété recomcolabcheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECOMCOLABCHECK(String value) {
                this.recomcolabcheck = value;
            }

            /**
             * Obtient la valeur de la propriété product.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRODUCT() {
                return product;
            }

            /**
             * Définit la valeur de la propriété product.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRODUCT(String value) {
                this.product = value;
            }

            /**
             * Obtient la valeur de la propriété mntoperation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMNTOPERATION() {
                return mntoperation;
            }

            /**
             * Définit la valeur de la propriété mntoperation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMNTOPERATION(String value) {
                this.mntoperation = value;
            }

            /**
             * Obtient la valeur de la propriété lucratif.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLUCRATIF() {
                return lucratif;
            }

            /**
             * Définit la valeur de la propriété lucratif.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLUCRATIF(String value) {
                this.lucratif = value;
            }

            /**
             * Obtient la valeur de la propriété sourcefonds.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSOURCEFONDS() {
                return sourcefonds;
            }

            /**
             * Définit la valeur de la propriété sourcefonds.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSOURCEFONDS(String value) {
                this.sourcefonds = value;
            }

            /**
             * Obtient la valeur de la propriété adrsiteweb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRSITEWEB() {
                return adrsiteweb;
            }

            /**
             * Définit la valeur de la propriété adrsiteweb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRSITEWEB(String value) {
                this.adrsiteweb = value;
            }

            /**
             * Obtient la valeur de la propriété ressourcesass.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESSOURCESASS() {
                return ressourcesass;
            }

            /**
             * Définit la valeur de la propriété ressourcesass.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESSOURCESASS(String value) {
                this.ressourcesass = value;
            }

            /**
             * Obtient la valeur de la propriété industry.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINDUSTRY() {
                return industry;
            }

            /**
             * Définit la valeur de la propriété industry.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINDUSTRY(String value) {
                this.industry = value;
            }

            /**
             * Obtient la valeur de la propriété email1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAIL1() {
                return email1;
            }

            /**
             * Définit la valeur de la propriété email1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAIL1(String value) {
                this.email1 = value;
            }

            /**
             * Obtient la valeur de la propriété numerojugement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMEROJUGEMENT() {
                return numerojugement;
            }

            /**
             * Définit la valeur de la propriété numerojugement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMEROJUGEMENT(String value) {
                this.numerojugement = value;
            }

            /**
             * Obtient la valeur de la propriété datejorte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEJORTE() {
                return datejorte;
            }

            /**
             * Définit la valeur de la propriété datejorte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEJORTE(String value) {
                this.datejorte = value;
            }

            /**
             * Obtient la valeur de la propriété datecreate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATECREATE() {
                return datecreate;
            }

            /**
             * Définit la valeur de la propriété datecreate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATECREATE(String value) {
                this.datecreate = value;
            }

            /**
             * Obtient la valeur de la propriété codemand.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEMAND() {
                return codemand;
            }

            /**
             * Définit la valeur de la propriété codemand.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEMAND(String value) {
                this.codemand = value;
            }

            /**
             * Obtient la valeur de la propriété town.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOWN() {
                return town;
            }

            /**
             * Définit la valeur de la propriété town.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOWN(String value) {
                this.town = value;
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
             * Obtient la valeur de la propriété formejurid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMEJURID() {
                return formejurid;
            }

            /**
             * Définit la valeur de la propriété formejurid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMEJURID(String value) {
                this.formejurid = value;
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
             * Obtient la valeur de la propriété codedouane.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEDOUANE() {
                return codedouane;
            }

            /**
             * Définit la valeur de la propriété codedouane.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEDOUANE(String value) {
                this.codedouane = value;
            }

            /**
             * Obtient la valeur de la propriété codetva.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODETVA() {
                return codetva;
            }

            /**
             * Définit la valeur de la propriété codetva.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODETVA(String value) {
                this.codetva = value;
            }

            /**
             * Obtient la valeur de la propriété codecadeg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODECADEG() {
                return codecadeg;
            }

            /**
             * Définit la valeur de la propriété codecadeg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODECADEG(String value) {
                this.codecadeg = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX(String value) {
                this.fax = value;
            }

            /**
             * Obtient la valeur de la propriété numetab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMETAB() {
                return numetab;
            }

            /**
             * Définit la valeur de la propriété numetab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMETAB(String value) {
                this.numetab = value;
            }

            /**
             * Obtient la valeur de la propriété dateconstit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATECONSTIT() {
                return dateconstit;
            }

            /**
             * Définit la valeur de la propriété dateconstit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATECONSTIT(String value) {
                this.dateconstit = value;
            }

            /**
             * Obtient la valeur de la propriété nom1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM1() {
                return nom1;
            }

            /**
             * Définit la valeur de la propriété nom1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM1(String value) {
                this.nom1 = value;
            }

            /**
             * Obtient la valeur de la propriété prenom1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRENOM1() {
                return prenom1;
            }

            /**
             * Définit la valeur de la propriété prenom1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRENOM1(String value) {
                this.prenom1 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS1() {
                return lieunais1;
            }

            /**
             * Définit la valeur de la propriété lieunais1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS1(String value) {
                this.lieunais1 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidt1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDT1() {
                return typeidt1;
            }

            /**
             * Définit la valeur de la propriété typeidt1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDT1(String value) {
                this.typeidt1 = value;
            }

            /**
             * Obtient la valeur de la propriété cincheck1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCINCHECK1() {
                return cincheck1;
            }

            /**
             * Définit la valeur de la propriété cincheck1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCINCHECK1(String value) {
                this.cincheck1 = value;
            }

            /**
             * Obtient la valeur de la propriété passcheck1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPASSCHECK1() {
                return passcheck1;
            }

            /**
             * Définit la valeur de la propriété passcheck1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPASSCHECK1(String value) {
                this.passcheck1 = value;
            }

            /**
             * Obtient la valeur de la propriété cscheck1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSCHECK1() {
                return cscheck1;
            }

            /**
             * Définit la valeur de la propriété cscheck1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSCHECK1(String value) {
                this.cscheck1 = value;
            }

            /**
             * Obtient la valeur de la propriété birth1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH1() {
                return birth1;
            }

            /**
             * Définit la valeur de la propriété birth1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH1(String value) {
                this.birth1 = value;
            }

            /**
             * Obtient la valeur de la propriété datdemandeidt1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATDEMANDEIDT1() {
                return datdemandeidt1;
            }

            /**
             * Définit la valeur de la propriété datdemandeidt1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATDEMANDEIDT1(String value) {
                this.datdemandeidt1 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT1() {
                return numidt1;
            }

            /**
             * Définit la valeur de la propriété numidt1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT1(String value) {
                this.numidt1 = value;
            }

            /**
             * Obtient la valeur de la propriété legalexp1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALEXP1() {
                return legalexp1;
            }

            /**
             * Définit la valeur de la propriété legalexp1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALEXP1(String value) {
                this.legalexp1 = value;
            }

            /**
             * Obtient la valeur de la propriété lieuemi1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUEMI1() {
                return lieuemi1;
            }

            /**
             * Définit la valeur de la propriété lieuemi1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUEMI1(String value) {
                this.lieuemi1 = value;
            }

            /**
             * Obtient la valeur de la propriété national1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONAL1() {
                return national1;
            }

            /**
             * Définit la valeur de la propriété national1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONAL1(String value) {
                this.national1 = value;
            }

            /**
             * Obtient la valeur de la propriété nationalitycheck1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONALITYCHECK1() {
                return nationalitycheck1;
            }

            /**
             * Définit la valeur de la propriété nationalitycheck1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONALITYCHECK1(String value) {
                this.nationalitycheck1 = value;
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
             * Obtient la valeur de la propriété code1POST.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE1POST() {
                return code1POST;
            }

            /**
             * Définit la valeur de la propriété code1POST.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE1POST(String value) {
                this.code1POST = value;
            }

            /**
             * Obtient la valeur de la propriété operinterpays1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOPERINTERPAYS1() {
                return operinterpays1;
            }

            /**
             * Définit la valeur de la propriété operinterpays1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOPERINTERPAYS1(String value) {
                this.operinterpays1 = value;
            }

            /**
             * Obtient la valeur de la propriété tel1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL1() {
                return tel1;
            }

            /**
             * Définit la valeur de la propriété tel1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL1(String value) {
                this.tel1 = value;
            }

            /**
             * Obtient la valeur de la propriété fax1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX1() {
                return fax1;
            }

            /**
             * Définit la valeur de la propriété fax1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX1(String value) {
                this.fax1 = value;
            }

            /**
             * Obtient la valeur de la propriété emailm.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAILM() {
                return emailm;
            }

            /**
             * Définit la valeur de la propriété emailm.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAILM(String value) {
                this.emailm = value;
            }

            /**
             * Obtient la valeur de la propriété sourcefonds1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSOURCEFONDS1() {
                return sourcefonds1;
            }

            /**
             * Définit la valeur de la propriété sourcefonds1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSOURCEFONDS1(String value) {
                this.sourcefonds1 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION() {
                return nomprofession;
            }

            /**
             * Définit la valeur de la propriété nomprofession.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION(String value) {
                this.nomprofession = value;
            }

            /**
             * Obtient la valeur de la propriété nomsector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMSECTOR() {
                return nomsector;
            }

            /**
             * Définit la valeur de la propriété nomsector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMSECTOR(String value) {
                this.nomsector = value;
            }

            /**
             * Obtient la valeur de la propriété numidt2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT2() {
                return numidt2;
            }

            /**
             * Définit la valeur de la propriété numidt2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT2(String value) {
                this.numidt2 = value;
            }

            /**
             * Obtient la valeur de la propriété nom2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM2() {
                return nom2;
            }

            /**
             * Définit la valeur de la propriété nom2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM2(String value) {
                this.nom2 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION2() {
                return nomprofession2;
            }

            /**
             * Définit la valeur de la propriété nomprofession2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION2(String value) {
                this.nomprofession2 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL2() {
                return nomnational2;
            }

            /**
             * Définit la valeur de la propriété nomnational2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL2(String value) {
                this.nomnational2 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE2() {
                return nomresidence2;
            }

            /**
             * Définit la valeur de la propriété nomresidence2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE2(String value) {
                this.nomresidence2 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT3() {
                return numidt3;
            }

            /**
             * Définit la valeur de la propriété numidt3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT3(String value) {
                this.numidt3 = value;
            }

            /**
             * Obtient la valeur de la propriété nom3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM3() {
                return nom3;
            }

            /**
             * Définit la valeur de la propriété nom3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM3(String value) {
                this.nom3 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION3() {
                return nomprofession3;
            }

            /**
             * Définit la valeur de la propriété nomprofession3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION3(String value) {
                this.nomprofession3 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL3() {
                return nomnational3;
            }

            /**
             * Définit la valeur de la propriété nomnational3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL3(String value) {
                this.nomnational3 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE3() {
                return nomresidence3;
            }

            /**
             * Définit la valeur de la propriété nomresidence3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE3(String value) {
                this.nomresidence3 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT4() {
                return numidt4;
            }

            /**
             * Définit la valeur de la propriété numidt4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT4(String value) {
                this.numidt4 = value;
            }

            /**
             * Obtient la valeur de la propriété nom4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM4() {
                return nom4;
            }

            /**
             * Définit la valeur de la propriété nom4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM4(String value) {
                this.nom4 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION4() {
                return nomprofession4;
            }

            /**
             * Définit la valeur de la propriété nomprofession4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION4(String value) {
                this.nomprofession4 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL4() {
                return nomnational4;
            }

            /**
             * Définit la valeur de la propriété nomnational4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL4(String value) {
                this.nomnational4 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE4() {
                return nomresidence4;
            }

            /**
             * Définit la valeur de la propriété nomresidence4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE4(String value) {
                this.nomresidence4 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT5() {
                return numidt5;
            }

            /**
             * Définit la valeur de la propriété numidt5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT5(String value) {
                this.numidt5 = value;
            }

            /**
             * Obtient la valeur de la propriété nom5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM5() {
                return nom5;
            }

            /**
             * Définit la valeur de la propriété nom5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM5(String value) {
                this.nom5 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION5() {
                return nomprofession5;
            }

            /**
             * Définit la valeur de la propriété nomprofession5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION5(String value) {
                this.nomprofession5 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL5() {
                return nomnational5;
            }

            /**
             * Définit la valeur de la propriété nomnational5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL5(String value) {
                this.nomnational5 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE5() {
                return nomresidence5;
            }

            /**
             * Définit la valeur de la propriété nomresidence5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE5(String value) {
                this.nomresidence5 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT6() {
                return numidt6;
            }

            /**
             * Définit la valeur de la propriété numidt6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT6(String value) {
                this.numidt6 = value;
            }

            /**
             * Obtient la valeur de la propriété nom6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM6() {
                return nom6;
            }

            /**
             * Définit la valeur de la propriété nom6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM6(String value) {
                this.nom6 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION6() {
                return nomprofession6;
            }

            /**
             * Définit la valeur de la propriété nomprofession6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION6(String value) {
                this.nomprofession6 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL6() {
                return nomnational6;
            }

            /**
             * Définit la valeur de la propriété nomnational6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL6(String value) {
                this.nomnational6 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE6() {
                return nomresidence6;
            }

            /**
             * Définit la valeur de la propriété nomresidence6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE6(String value) {
                this.nomresidence6 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT7() {
                return numidt7;
            }

            /**
             * Définit la valeur de la propriété numidt7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT7(String value) {
                this.numidt7 = value;
            }

            /**
             * Obtient la valeur de la propriété nom7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM7() {
                return nom7;
            }

            /**
             * Définit la valeur de la propriété nom7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM7(String value) {
                this.nom7 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION7() {
                return nomprofession7;
            }

            /**
             * Définit la valeur de la propriété nomprofession7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION7(String value) {
                this.nomprofession7 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL7() {
                return nomnational7;
            }

            /**
             * Définit la valeur de la propriété nomnational7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL7(String value) {
                this.nomnational7 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE7() {
                return nomresidence7;
            }

            /**
             * Définit la valeur de la propriété nomresidence7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE7(String value) {
                this.nomresidence7 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT8() {
                return numidt8;
            }

            /**
             * Définit la valeur de la propriété numidt8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT8(String value) {
                this.numidt8 = value;
            }

            /**
             * Obtient la valeur de la propriété nom8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM8() {
                return nom8;
            }

            /**
             * Définit la valeur de la propriété nom8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM8(String value) {
                this.nom8 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION8() {
                return nomprofession8;
            }

            /**
             * Définit la valeur de la propriété nomprofession8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION8(String value) {
                this.nomprofession8 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL8() {
                return nomnational8;
            }

            /**
             * Définit la valeur de la propriété nomnational8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL8(String value) {
                this.nomnational8 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE8() {
                return nomresidence8;
            }

            /**
             * Définit la valeur de la propriété nomresidence8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE8(String value) {
                this.nomresidence8 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT9() {
                return numidt9;
            }

            /**
             * Définit la valeur de la propriété numidt9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT9(String value) {
                this.numidt9 = value;
            }

            /**
             * Obtient la valeur de la propriété nom9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM9() {
                return nom9;
            }

            /**
             * Définit la valeur de la propriété nom9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM9(String value) {
                this.nom9 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION9() {
                return nomprofession9;
            }

            /**
             * Définit la valeur de la propriété nomprofession9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION9(String value) {
                this.nomprofession9 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL9() {
                return nomnational9;
            }

            /**
             * Définit la valeur de la propriété nomnational9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL9(String value) {
                this.nomnational9 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE9() {
                return nomresidence9;
            }

            /**
             * Définit la valeur de la propriété nomresidence9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE9(String value) {
                this.nomresidence9 = value;
            }

            /**
             * Obtient la valeur de la propriété numidt10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMIDT10() {
                return numidt10;
            }

            /**
             * Définit la valeur de la propriété numidt10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMIDT10(String value) {
                this.numidt10 = value;
            }

            /**
             * Obtient la valeur de la propriété nom10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOM10() {
                return nom10;
            }

            /**
             * Définit la valeur de la propriété nom10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOM10(String value) {
                this.nom10 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprofession10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPROFESSION10() {
                return nomprofession10;
            }

            /**
             * Définit la valeur de la propriété nomprofession10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPROFESSION10(String value) {
                this.nomprofession10 = value;
            }

            /**
             * Obtient la valeur de la propriété nomnational10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMNATIONAL10() {
                return nomnational10;
            }

            /**
             * Définit la valeur de la propriété nomnational10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMNATIONAL10(String value) {
                this.nomnational10 = value;
            }

            /**
             * Obtient la valeur de la propriété nomresidence10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMRESIDENCE10() {
                return nomresidence10;
            }

            /**
             * Définit la valeur de la propriété nomresidence10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMRESIDENCE10(String value) {
                this.nomresidence10 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenclt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENCLT() {
                return nomprenclt;
            }

            /**
             * Définit la valeur de la propriété nomprenclt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENCLT(String value) {
                this.nomprenclt = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenclt2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENCLT2() {
                return nomprenclt2;
            }

            /**
             * Définit la valeur de la propriété nomprenclt2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENCLT2(String value) {
                this.nomprenclt2 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenclt3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENCLT3() {
                return nomprenclt3;
            }

            /**
             * Définit la valeur de la propriété nomprenclt3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENCLT3(String value) {
                this.nomprenclt3 = value;
            }

            /**
             * Obtient la valeur de la propriété clt1LIEU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLT1LIEU() {
                return clt1LIEU;
            }

            /**
             * Définit la valeur de la propriété clt1LIEU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLT1LIEU(String value) {
                this.clt1LIEU = value;
            }

            /**
             * Obtient la valeur de la propriété clt2LIEU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLT2LIEU() {
                return clt2LIEU;
            }

            /**
             * Définit la valeur de la propriété clt2LIEU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLT2LIEU(String value) {
                this.clt2LIEU = value;
            }

            /**
             * Obtient la valeur de la propriété clt3LIEU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLT3LIEU() {
                return clt3LIEU;
            }

            /**
             * Définit la valeur de la propriété clt3LIEU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLT3LIEU(String value) {
                this.clt3LIEU = value;
            }

            /**
             * Obtient la valeur de la propriété f1NOMPREN.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getF1NOMPREN() {
                return f1NOMPREN;
            }

            /**
             * Définit la valeur de la propriété f1NOMPREN.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setF1NOMPREN(String value) {
                this.f1NOMPREN = value;
            }

            /**
             * Obtient la valeur de la propriété f2NOMPREN.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getF2NOMPREN() {
                return f2NOMPREN;
            }

            /**
             * Définit la valeur de la propriété f2NOMPREN.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setF2NOMPREN(String value) {
                this.f2NOMPREN = value;
            }

            /**
             * Obtient la valeur de la propriété f3NOMPREN.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getF3NOMPREN() {
                return f3NOMPREN;
            }

            /**
             * Définit la valeur de la propriété f3NOMPREN.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setF3NOMPREN(String value) {
                this.f3NOMPREN = value;
            }

            /**
             * Obtient la valeur de la propriété f1LIEU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getF1LIEU() {
                return f1LIEU;
            }

            /**
             * Définit la valeur de la propriété f1LIEU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setF1LIEU(String value) {
                this.f1LIEU = value;
            }

            /**
             * Obtient la valeur de la propriété f2LIEU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getF2LIEU() {
                return f2LIEU;
            }

            /**
             * Définit la valeur de la propriété f2LIEU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setF2LIEU(String value) {
                this.f2LIEU = value;
            }

            /**
             * Obtient la valeur de la propriété f3LIEU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getF3LIEU() {
                return f3LIEU;
            }

            /**
             * Définit la valeur de la propriété f3LIEU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setF3LIEU(String value) {
                this.f3LIEU = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT1() {
                return nomprenact1;
            }

            /**
             * Définit la valeur de la propriété nomprenact1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT1(String value) {
                this.nomprenact1 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT2() {
                return nomprenact2;
            }

            /**
             * Définit la valeur de la propriété nomprenact2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT2(String value) {
                this.nomprenact2 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT3() {
                return nomprenact3;
            }

            /**
             * Définit la valeur de la propriété nomprenact3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT3(String value) {
                this.nomprenact3 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT1() {
                return typeidtact1;
            }

            /**
             * Définit la valeur de la propriété typeidtact1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT1(String value) {
                this.typeidtact1 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT2() {
                return typeidtact2;
            }

            /**
             * Définit la valeur de la propriété typeidtact2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT2(String value) {
                this.typeidtact2 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT3() {
                return typeidtact3;
            }

            /**
             * Définit la valeur de la propriété typeidtact3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT3(String value) {
                this.typeidtact3 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT1() {
                return nymidtact1;
            }

            /**
             * Définit la valeur de la propriété nymidtact1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT1(String value) {
                this.nymidtact1 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT2() {
                return nymidtact2;
            }

            /**
             * Définit la valeur de la propriété nymidtact2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT2(String value) {
                this.nymidtact2 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT3() {
                return nymidtact3;
            }

            /**
             * Définit la valeur de la propriété nymidtact3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT3(String value) {
                this.nymidtact3 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT1() {
                return capitalact1;
            }

            /**
             * Définit la valeur de la propriété capitalact1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT1(String value) {
                this.capitalact1 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT2() {
                return capitalact2;
            }

            /**
             * Définit la valeur de la propriété capitalact2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT2(String value) {
                this.capitalact2 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT3() {
                return capitalact3;
            }

            /**
             * Définit la valeur de la propriété capitalact3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT3(String value) {
                this.capitalact3 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT1() {
                return paysact1;
            }

            /**
             * Définit la valeur de la propriété paysact1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT1(String value) {
                this.paysact1 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT2() {
                return paysact2;
            }

            /**
             * Définit la valeur de la propriété paysact2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT2(String value) {
                this.paysact2 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT3() {
                return paysact3;
            }

            /**
             * Définit la valeur de la propriété paysact3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT3(String value) {
                this.paysact3 = value;
            }

            /**
             * Obtient la valeur de la propriété natact1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT1() {
                return natact1;
            }

            /**
             * Définit la valeur de la propriété natact1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT1(String value) {
                this.natact1 = value;
            }

            /**
             * Obtient la valeur de la propriété natact2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT2() {
                return natact2;
            }

            /**
             * Définit la valeur de la propriété natact2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT2(String value) {
                this.natact2 = value;
            }

            /**
             * Obtient la valeur de la propriété natact3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT3() {
                return natact3;
            }

            /**
             * Définit la valeur de la propriété natact3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT3(String value) {
                this.natact3 = value;
            }

            /**
             * Obtient la valeur de la propriété codesector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODESECTOR() {
                return codesector;
            }

            /**
             * Définit la valeur de la propriété codesector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODESECTOR(String value) {
                this.codesector = value;
            }

            /**
             * Obtient la valeur de la propriété motivation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOTIVATION() {
                return motivation;
            }

            /**
             * Définit la valeur de la propriété motivation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOTIVATION(String value) {
                this.motivation = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT4() {
                return nomprenact4;
            }

            /**
             * Définit la valeur de la propriété nomprenact4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT4(String value) {
                this.nomprenact4 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT4() {
                return typeidtact4;
            }

            /**
             * Définit la valeur de la propriété typeidtact4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT4(String value) {
                this.typeidtact4 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT4() {
                return nymidtact4;
            }

            /**
             * Définit la valeur de la propriété nymidtact4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT4(String value) {
                this.nymidtact4 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT4() {
                return capitalact4;
            }

            /**
             * Définit la valeur de la propriété capitalact4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT4(String value) {
                this.capitalact4 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT4() {
                return paysact4;
            }

            /**
             * Définit la valeur de la propriété paysact4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT4(String value) {
                this.paysact4 = value;
            }

            /**
             * Obtient la valeur de la propriété natact4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT4() {
                return natact4;
            }

            /**
             * Définit la valeur de la propriété natact4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT4(String value) {
                this.natact4 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT5() {
                return nomprenact5;
            }

            /**
             * Définit la valeur de la propriété nomprenact5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT5(String value) {
                this.nomprenact5 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT5() {
                return typeidtact5;
            }

            /**
             * Définit la valeur de la propriété typeidtact5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT5(String value) {
                this.typeidtact5 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT5() {
                return nymidtact5;
            }

            /**
             * Définit la valeur de la propriété nymidtact5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT5(String value) {
                this.nymidtact5 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT5() {
                return capitalact5;
            }

            /**
             * Définit la valeur de la propriété capitalact5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT5(String value) {
                this.capitalact5 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT5() {
                return paysact5;
            }

            /**
             * Définit la valeur de la propriété paysact5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT5(String value) {
                this.paysact5 = value;
            }

            /**
             * Obtient la valeur de la propriété natact5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT5() {
                return natact5;
            }

            /**
             * Définit la valeur de la propriété natact5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT5(String value) {
                this.natact5 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT6() {
                return nomprenact6;
            }

            /**
             * Définit la valeur de la propriété nomprenact6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT6(String value) {
                this.nomprenact6 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT6() {
                return typeidtact6;
            }

            /**
             * Définit la valeur de la propriété typeidtact6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT6(String value) {
                this.typeidtact6 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT6() {
                return nymidtact6;
            }

            /**
             * Définit la valeur de la propriété nymidtact6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT6(String value) {
                this.nymidtact6 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT6() {
                return capitalact6;
            }

            /**
             * Définit la valeur de la propriété capitalact6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT6(String value) {
                this.capitalact6 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT6() {
                return paysact6;
            }

            /**
             * Définit la valeur de la propriété paysact6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT6(String value) {
                this.paysact6 = value;
            }

            /**
             * Obtient la valeur de la propriété natact6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT6() {
                return natact6;
            }

            /**
             * Définit la valeur de la propriété natact6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT6(String value) {
                this.natact6 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT7() {
                return nomprenact7;
            }

            /**
             * Définit la valeur de la propriété nomprenact7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT7(String value) {
                this.nomprenact7 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT7() {
                return typeidtact7;
            }

            /**
             * Définit la valeur de la propriété typeidtact7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT7(String value) {
                this.typeidtact7 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT7() {
                return nymidtact7;
            }

            /**
             * Définit la valeur de la propriété nymidtact7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT7(String value) {
                this.nymidtact7 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT7() {
                return capitalact7;
            }

            /**
             * Définit la valeur de la propriété capitalact7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT7(String value) {
                this.capitalact7 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT7() {
                return paysact7;
            }

            /**
             * Définit la valeur de la propriété paysact7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT7(String value) {
                this.paysact7 = value;
            }

            /**
             * Obtient la valeur de la propriété natact7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT7() {
                return natact7;
            }

            /**
             * Définit la valeur de la propriété natact7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT7(String value) {
                this.natact7 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT8() {
                return nomprenact8;
            }

            /**
             * Définit la valeur de la propriété nomprenact8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT8(String value) {
                this.nomprenact8 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT8() {
                return typeidtact8;
            }

            /**
             * Définit la valeur de la propriété typeidtact8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT8(String value) {
                this.typeidtact8 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT8() {
                return nymidtact8;
            }

            /**
             * Définit la valeur de la propriété nymidtact8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT8(String value) {
                this.nymidtact8 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT8() {
                return capitalact8;
            }

            /**
             * Définit la valeur de la propriété capitalact8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT8(String value) {
                this.capitalact8 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT8() {
                return paysact8;
            }

            /**
             * Définit la valeur de la propriété paysact8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT8(String value) {
                this.paysact8 = value;
            }

            /**
             * Obtient la valeur de la propriété natact8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT8() {
                return natact8;
            }

            /**
             * Définit la valeur de la propriété natact8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT8(String value) {
                this.natact8 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT9() {
                return nomprenact9;
            }

            /**
             * Définit la valeur de la propriété nomprenact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT9(String value) {
                this.nomprenact9 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT9() {
                return typeidtact9;
            }

            /**
             * Définit la valeur de la propriété typeidtact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT9(String value) {
                this.typeidtact9 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT9() {
                return nymidtact9;
            }

            /**
             * Définit la valeur de la propriété nymidtact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT9(String value) {
                this.nymidtact9 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT9() {
                return capitalact9;
            }

            /**
             * Définit la valeur de la propriété capitalact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT9(String value) {
                this.capitalact9 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT9() {
                return paysact9;
            }

            /**
             * Définit la valeur de la propriété paysact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT9(String value) {
                this.paysact9 = value;
            }

            /**
             * Obtient la valeur de la propriété natact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT9() {
                return natact9;
            }

            /**
             * Définit la valeur de la propriété natact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT9(String value) {
                this.natact9 = value;
            }

            /**
             * Obtient la valeur de la propriété nomprenact10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMPRENACT10() {
                return nomprenact10;
            }

            /**
             * Définit la valeur de la propriété nomprenact10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMPRENACT10(String value) {
                this.nomprenact10 = value;
            }

            /**
             * Obtient la valeur de la propriété typeidtact10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDTACT10() {
                return typeidtact10;
            }

            /**
             * Définit la valeur de la propriété typeidtact10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDTACT10(String value) {
                this.typeidtact10 = value;
            }

            /**
             * Obtient la valeur de la propriété nymidtact10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNYMIDTACT10() {
                return nymidtact10;
            }

            /**
             * Définit la valeur de la propriété nymidtact10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNYMIDTACT10(String value) {
                this.nymidtact10 = value;
            }

            /**
             * Obtient la valeur de la propriété capitalact10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPITALACT10() {
                return capitalact10;
            }

            /**
             * Définit la valeur de la propriété capitalact10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPITALACT10(String value) {
                this.capitalact10 = value;
            }

            /**
             * Obtient la valeur de la propriété paysact10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYSACT10() {
                return paysact10;
            }

            /**
             * Définit la valeur de la propriété paysact10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYSACT10(String value) {
                this.paysact10 = value;
            }

            /**
             * Obtient la valeur de la propriété natact10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATACT10() {
                return natact10;
            }

            /**
             * Définit la valeur de la propriété natact10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATACT10(String value) {
                this.natact10 = value;
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
             * Obtient la valeur de la propriété tel2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL2() {
                return tel2;
            }

            /**
             * Définit la valeur de la propriété tel2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL2(String value) {
                this.tel2 = value;
            }

            /**
             * Obtient la valeur de la propriété fax2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX2() {
                return fax2;
            }

            /**
             * Définit la valeur de la propriété fax2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX2(String value) {
                this.fax2 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE3() {
                return adresse3;
            }

            /**
             * Définit la valeur de la propriété adresse3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE3(String value) {
                this.adresse3 = value;
            }

            /**
             * Obtient la valeur de la propriété tel3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL3() {
                return tel3;
            }

            /**
             * Définit la valeur de la propriété tel3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL3(String value) {
                this.tel3 = value;
            }

            /**
             * Obtient la valeur de la propriété fax3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX3() {
                return fax3;
            }

            /**
             * Définit la valeur de la propriété fax3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX3(String value) {
                this.fax3 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE4() {
                return adresse4;
            }

            /**
             * Définit la valeur de la propriété adresse4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE4(String value) {
                this.adresse4 = value;
            }

            /**
             * Obtient la valeur de la propriété tel4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL4() {
                return tel4;
            }

            /**
             * Définit la valeur de la propriété tel4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL4(String value) {
                this.tel4 = value;
            }

            /**
             * Obtient la valeur de la propriété fax4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX4() {
                return fax4;
            }

            /**
             * Définit la valeur de la propriété fax4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX4(String value) {
                this.fax4 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE5() {
                return adresse5;
            }

            /**
             * Définit la valeur de la propriété adresse5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE5(String value) {
                this.adresse5 = value;
            }

            /**
             * Obtient la valeur de la propriété tel5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL5() {
                return tel5;
            }

            /**
             * Définit la valeur de la propriété tel5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL5(String value) {
                this.tel5 = value;
            }

            /**
             * Obtient la valeur de la propriété fax5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX5() {
                return fax5;
            }

            /**
             * Définit la valeur de la propriété fax5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX5(String value) {
                this.fax5 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE6() {
                return adresse6;
            }

            /**
             * Définit la valeur de la propriété adresse6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE6(String value) {
                this.adresse6 = value;
            }

            /**
             * Obtient la valeur de la propriété tel6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL6() {
                return tel6;
            }

            /**
             * Définit la valeur de la propriété tel6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL6(String value) {
                this.tel6 = value;
            }

            /**
             * Obtient la valeur de la propriété fax6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX6() {
                return fax6;
            }

            /**
             * Définit la valeur de la propriété fax6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX6(String value) {
                this.fax6 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE7() {
                return adresse7;
            }

            /**
             * Définit la valeur de la propriété adresse7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE7(String value) {
                this.adresse7 = value;
            }

            /**
             * Obtient la valeur de la propriété tel7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL7() {
                return tel7;
            }

            /**
             * Définit la valeur de la propriété tel7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL7(String value) {
                this.tel7 = value;
            }

            /**
             * Obtient la valeur de la propriété fax7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX7() {
                return fax7;
            }

            /**
             * Définit la valeur de la propriété fax7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX7(String value) {
                this.fax7 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE8() {
                return adresse8;
            }

            /**
             * Définit la valeur de la propriété adresse8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE8(String value) {
                this.adresse8 = value;
            }

            /**
             * Obtient la valeur de la propriété tel8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL8() {
                return tel8;
            }

            /**
             * Définit la valeur de la propriété tel8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL8(String value) {
                this.tel8 = value;
            }

            /**
             * Obtient la valeur de la propriété fax8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX8() {
                return fax8;
            }

            /**
             * Définit la valeur de la propriété fax8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX8(String value) {
                this.fax8 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE9() {
                return adresse9;
            }

            /**
             * Définit la valeur de la propriété adresse9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE9(String value) {
                this.adresse9 = value;
            }

            /**
             * Obtient la valeur de la propriété tel9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL9() {
                return tel9;
            }

            /**
             * Définit la valeur de la propriété tel9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL9(String value) {
                this.tel9 = value;
            }

            /**
             * Obtient la valeur de la propriété fax9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX9() {
                return fax9;
            }

            /**
             * Définit la valeur de la propriété fax9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX9(String value) {
                this.fax9 = value;
            }

            /**
             * Obtient la valeur de la propriété adresse10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRESSE10() {
                return adresse10;
            }

            /**
             * Définit la valeur de la propriété adresse10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRESSE10(String value) {
                this.adresse10 = value;
            }

            /**
             * Obtient la valeur de la propriété tel10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEL10() {
                return tel10;
            }

            /**
             * Définit la valeur de la propriété tel10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEL10(String value) {
                this.tel10 = value;
            }

            /**
             * Obtient la valeur de la propriété fax10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX10() {
                return fax10;
            }

            /**
             * Définit la valeur de la propriété fax10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX10(String value) {
                this.fax10 = value;
            }

            /**
             * Obtient la valeur de la propriété idunique.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDUNIQUE() {
                return idunique;
            }

            /**
             * Définit la valeur de la propriété idunique.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDUNIQUE(String value) {
                this.idunique = value;
            }

            /**
             * Obtient la valeur de la propriété benefeff.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENEFEFF() {
                return benefeff;
            }

            /**
             * Définit la valeur de la propriété benefeff.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENEFEFF(String value) {
                this.benefeff = value;
            }

            /**
             * Obtient la valeur de la propriété ppeact.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPPEACT() {
                return ppeact;
            }

            /**
             * Définit la valeur de la propriété ppeact.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPPEACT(String value) {
                this.ppeact = value;
            }

            /**
             * Obtient la valeur de la propriété chiffresaffa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHIFFRESAFFA() {
                return chiffresaffa;
            }

            /**
             * Définit la valeur de la propriété chiffresaffa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHIFFRESAFFA(String value) {
                this.chiffresaffa = value;
            }

            /**
             * Obtient la valeur de la propriété residence1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENCE1() {
                return residence1;
            }

            /**
             * Définit la valeur de la propriété residence1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENCE1(String value) {
                this.residence1 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS2() {
                return lieunais2;
            }

            /**
             * Définit la valeur de la propriété lieunais2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS2(String value) {
                this.lieunais2 = value;
            }

            /**
             * Obtient la valeur de la propriété birth2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH2() {
                return birth2;
            }

            /**
             * Définit la valeur de la propriété birth2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH2(String value) {
                this.birth2 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS3() {
                return lieunais3;
            }

            /**
             * Définit la valeur de la propriété lieunais3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS3(String value) {
                this.lieunais3 = value;
            }

            /**
             * Obtient la valeur de la propriété birth3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH3() {
                return birth3;
            }

            /**
             * Définit la valeur de la propriété birth3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH3(String value) {
                this.birth3 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS4() {
                return lieunais4;
            }

            /**
             * Définit la valeur de la propriété lieunais4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS4(String value) {
                this.lieunais4 = value;
            }

            /**
             * Obtient la valeur de la propriété birth4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH4() {
                return birth4;
            }

            /**
             * Définit la valeur de la propriété birth4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH4(String value) {
                this.birth4 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS5() {
                return lieunais5;
            }

            /**
             * Définit la valeur de la propriété lieunais5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS5(String value) {
                this.lieunais5 = value;
            }

            /**
             * Obtient la valeur de la propriété birth5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH5() {
                return birth5;
            }

            /**
             * Définit la valeur de la propriété birth5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH5(String value) {
                this.birth5 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS6() {
                return lieunais6;
            }

            /**
             * Définit la valeur de la propriété lieunais6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS6(String value) {
                this.lieunais6 = value;
            }

            /**
             * Obtient la valeur de la propriété birth6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH6() {
                return birth6;
            }

            /**
             * Définit la valeur de la propriété birth6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH6(String value) {
                this.birth6 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS7() {
                return lieunais7;
            }

            /**
             * Définit la valeur de la propriété lieunais7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS7(String value) {
                this.lieunais7 = value;
            }

            /**
             * Obtient la valeur de la propriété birth7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH7() {
                return birth7;
            }

            /**
             * Définit la valeur de la propriété birth7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH7(String value) {
                this.birth7 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS8() {
                return lieunais8;
            }

            /**
             * Définit la valeur de la propriété lieunais8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS8(String value) {
                this.lieunais8 = value;
            }

            /**
             * Obtient la valeur de la propriété birth8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH8() {
                return birth8;
            }

            /**
             * Définit la valeur de la propriété birth8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH8(String value) {
                this.birth8 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS9() {
                return lieunais9;
            }

            /**
             * Définit la valeur de la propriété lieunais9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS9(String value) {
                this.lieunais9 = value;
            }

            /**
             * Obtient la valeur de la propriété birth9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH9() {
                return birth9;
            }

            /**
             * Définit la valeur de la propriété birth9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH9(String value) {
                this.birth9 = value;
            }

            /**
             * Obtient la valeur de la propriété lieunais10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIEUNAIS10() {
                return lieunais10;
            }

            /**
             * Définit la valeur de la propriété lieunais10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIEUNAIS10(String value) {
                this.lieunais10 = value;
            }

            /**
             * Obtient la valeur de la propriété birth10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTH10() {
                return birth10;
            }

            /**
             * Définit la valeur de la propriété birth10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTH10(String value) {
                this.birth10 = value;
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
