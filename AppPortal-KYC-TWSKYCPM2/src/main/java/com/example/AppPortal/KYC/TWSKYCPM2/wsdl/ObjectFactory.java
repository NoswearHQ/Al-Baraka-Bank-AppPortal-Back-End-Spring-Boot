//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.24 à 10:58:20 AM WAT 
//


package com.example.AppPortal.KYC.TWSKYCPM2.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.AppPortal.KYC.TWSKYCPM2.wsdl package. 
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

    private final static QName _WEBSERVICEKYCPERSONNEMORALE_QNAME = new QName("http://temenos.com/TWSKYCPM2", "WEBSERVICEKYCPERSONNEMORALE");
    private final static QName _WEBSERVICEKYCPERSONNEMORALEResponse_QNAME = new QName("http://temenos.com/TWSKYCPM2", "WEBSERVICEKYCPERSONNEMORALEResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.AppPortal.KYC.TWSKYCPM2.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TWSKYCPM2Type }
     * 
     */
    public TWSKYCPM2Type createTWSKYCPM2Type() {
        return new TWSKYCPM2Type();
    }

    /**
     * Create an instance of {@link TWSKYCPM2Type.GTWSKYCPM2DetailType }
     * 
     */
    public TWSKYCPM2Type.GTWSKYCPM2DetailType createTWSKYCPM2TypeGTWSKYCPM2DetailType() {
        return new TWSKYCPM2Type.GTWSKYCPM2DetailType();
    }

    /**
     * Create an instance of {@link WEBSERVICEKYCPERSONNEMORALE }
     * 
     */
    public WEBSERVICEKYCPERSONNEMORALE createWEBSERVICEKYCPERSONNEMORALE() {
        return new WEBSERVICEKYCPERSONNEMORALE();
    }

    /**
     * Create an instance of {@link WEBSERVICEKYCPERSONNEMORALEResponse }
     * 
     */
    public WEBSERVICEKYCPERSONNEMORALEResponse createWEBSERVICEKYCPERSONNEMORALEResponse() {
        return new WEBSERVICEKYCPERSONNEMORALEResponse();
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
     * Create an instance of {@link TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType }
     * 
     */
    public TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType createTWSKYCPM2TypeGTWSKYCPM2DetailTypeMTWSKYCPM2DetailType() {
        return new TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WEBSERVICEKYCPERSONNEMORALE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WEBSERVICEKYCPERSONNEMORALE }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/TWSKYCPM2", name = "WEBSERVICEKYCPERSONNEMORALE")
    public JAXBElement<WEBSERVICEKYCPERSONNEMORALE> createWEBSERVICEKYCPERSONNEMORALE(WEBSERVICEKYCPERSONNEMORALE value) {
        return new JAXBElement<WEBSERVICEKYCPERSONNEMORALE>(_WEBSERVICEKYCPERSONNEMORALE_QNAME, WEBSERVICEKYCPERSONNEMORALE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WEBSERVICEKYCPERSONNEMORALEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WEBSERVICEKYCPERSONNEMORALEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/TWSKYCPM2", name = "WEBSERVICEKYCPERSONNEMORALEResponse")
    public JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse> createWEBSERVICEKYCPERSONNEMORALEResponse(WEBSERVICEKYCPERSONNEMORALEResponse value) {
        return new JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse>(_WEBSERVICEKYCPERSONNEMORALEResponse_QNAME, WEBSERVICEKYCPERSONNEMORALEResponse.class, null, value);
    }

}
