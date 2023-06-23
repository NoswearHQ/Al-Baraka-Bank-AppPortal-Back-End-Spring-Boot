//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.09 à 10:50:32 AM WAT 
//


package com.example.AppPortal.Auth.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.AppPortal.Auth.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WSAUTHENTIFICATION_QNAME = new QName("http://temenos.com/WSAUTH", "WSAUTHENTIFICATION");
    private final static QName _WSAUTHENTIFICATIONResponse_QNAME = new QName("http://temenos.com/WSAUTH", "WSAUTHENTIFICATIONResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.AppPortal.Auth.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link USERAUTHType }
     * 
     */
    public USERAUTHType createUSERAUTHType() {
        return new USERAUTHType();
    }

    /**
     * Create an instance of {@link USERAUTHType.GUSERAUTHDetailType }
     * 
     */
    public USERAUTHType.GUSERAUTHDetailType createUSERAUTHTypeGUSERAUTHDetailType() {
        return new USERAUTHType.GUSERAUTHDetailType();
    }

    /**
     * Create an instance of {@link WSAUTHENTIFICATION }
     * 
     */
    public WSAUTHENTIFICATION createWSAUTHENTIFICATION() {
        return new WSAUTHENTIFICATION();
    }

    /**
     * Create an instance of {@link WSAUTHENTIFICATIONResponse }
     * 
     */
    public WSAUTHENTIFICATIONResponse createWSAUTHENTIFICATIONResponse() {
        return new WSAUTHENTIFICATIONResponse();
    }

    /**
     * Create an instance of {@link WebRequestCommon }
     * 
     */
    public WebRequestCommon createWebRequestCommon() {
        return new WebRequestCommon();
    }

    /**
     * Create an instance of {@link EnquiryInput }
     * 
     */
    public EnquiryInput createEnquiryInput() {
        return new EnquiryInput();
    }

    /**
     * Create an instance of {@link EnquiryInputCollection }
     * 
     */
    public EnquiryInputCollection createEnquiryInputCollection() {
        return new EnquiryInputCollection();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link AnyTypeArray }
     * 
     */
    public AnyTypeArray createAnyTypeArray() {
        return new AnyTypeArray();
    }

    /**
     * Create an instance of {@link USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType }
     * 
     */
    public USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType createUSERAUTHTypeGUSERAUTHDetailTypeMUSERAUTHDetailType() {
        return new USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSAUTHENTIFICATION }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSAUTHENTIFICATION }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSAUTH", name = "WSAUTHENTIFICATION")
    public JAXBElement<WSAUTHENTIFICATION> createWSAUTHENTIFICATION(WSAUTHENTIFICATION value) {
        return new JAXBElement<WSAUTHENTIFICATION>(_WSAUTHENTIFICATION_QNAME, WSAUTHENTIFICATION.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSAUTHENTIFICATIONResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSAUTHENTIFICATIONResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSAUTH", name = "WSAUTHENTIFICATIONResponse")
    public JAXBElement<WSAUTHENTIFICATIONResponse> createWSAUTHENTIFICATIONResponse(WSAUTHENTIFICATIONResponse value) {
        return new JAXBElement<WSAUTHENTIFICATIONResponse>(_WSAUTHENTIFICATIONResponse_QNAME, WSAUTHENTIFICATIONResponse.class, null, value);
    }

}
