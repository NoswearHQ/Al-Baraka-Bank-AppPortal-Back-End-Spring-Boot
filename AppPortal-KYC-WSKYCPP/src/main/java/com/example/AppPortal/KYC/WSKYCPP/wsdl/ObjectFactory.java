//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.23 à 09:58:35 AM WAT 
//


package com.example.AppPortal.KYC.WSKYCPP.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.AppPortal.KYC.WSKYCPP.wsdl package. 
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

    private final static QName _TWSKYC_QNAME = new QName("http://temenos.com/WSKYC2", "TWSKYC");
    private final static QName _TWSKYCResponse_QNAME = new QName("http://temenos.com/WSKYC2", "TWSKYCResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.AppPortal.KYC.WSKYCPP.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TWSKYCPP2Type }
     * 
     */
    public TWSKYCPP2Type createTWSKYCPP2Type() {
        return new TWSKYCPP2Type();
    }

    /**
     * Create an instance of {@link TWSKYCPP2Type.GTWSKYCPP2DetailType }
     * 
     */
    public TWSKYCPP2Type.GTWSKYCPP2DetailType createTWSKYCPP2TypeGTWSKYCPP2DetailType() {
        return new TWSKYCPP2Type.GTWSKYCPP2DetailType();
    }

    /**
     * Create an instance of {@link TWSKYC }
     * 
     */
    public TWSKYC createTWSKYC() {
        return new TWSKYC();
    }

    /**
     * Create an instance of {@link TWSKYCResponse }
     * 
     */
    public TWSKYCResponse createTWSKYCResponse() {
        return new TWSKYCResponse();
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
     * Create an instance of {@link TWSKYCPP2Type.GTWSKYCPP2DetailType.MTWSKYCPP2DetailType }
     * 
     */
    public TWSKYCPP2Type.GTWSKYCPP2DetailType.MTWSKYCPP2DetailType createTWSKYCPP2TypeGTWSKYCPP2DetailTypeMTWSKYCPP2DetailType() {
        return new TWSKYCPP2Type.GTWSKYCPP2DetailType.MTWSKYCPP2DetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TWSKYC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TWSKYC }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSKYC2", name = "TWSKYC")
    public JAXBElement<TWSKYC> createTWSKYC(TWSKYC value) {
        return new JAXBElement<TWSKYC>(_TWSKYC_QNAME, TWSKYC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TWSKYCResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TWSKYCResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSKYC2", name = "TWSKYCResponse")
    public JAXBElement<TWSKYCResponse> createTWSKYCResponse(TWSKYCResponse value) {
        return new JAXBElement<TWSKYCResponse>(_TWSKYCResponse_QNAME, TWSKYCResponse.class, null, value);
    }

}
