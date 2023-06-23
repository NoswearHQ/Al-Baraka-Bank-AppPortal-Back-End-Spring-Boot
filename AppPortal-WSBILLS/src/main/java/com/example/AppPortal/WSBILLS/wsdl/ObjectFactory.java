//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.01 à 10:12:34 AM WAT 
//


package com.example.AppPortal.WSBILLS.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.AppPortal.WSBILLS.wsdl package. 
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

    private final static QName _WSBILLS_QNAME = new QName("http://temenos.com/BILLS", "WSBILLS");
    private final static QName _WSBILLSResponse_QNAME = new QName("http://temenos.com/BILLS", "WSBILLSResponse");
    private final static QName _WSCNPBCSORTCODE_QNAME = new QName("http://temenos.com/BILLS", "WSCNPBCSORTCODE");
    private final static QName _WSCNPBCSORTCODEResponse_QNAME = new QName("http://temenos.com/BILLS", "WSCNPBCSORTCODEResponse");
    private final static QName _WSGETCUS_QNAME = new QName("http://temenos.com/BILLS", "WSGETCUS");
    private final static QName _WSGETCUSResponse_QNAME = new QName("http://temenos.com/BILLS", "WSGETCUSResponse");
    private final static QName _WSRONEOUSER_QNAME = new QName("http://temenos.com/BILLS", "WSRONEOUSER");
    private final static QName _WSRONEOUSERResponse_QNAME = new QName("http://temenos.com/BILLS", "WSRONEOUSERResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.AppPortal.WSBILLS.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RONEOUSERType }
     * 
     */
    public RONEOUSERType createRONEOUSERType() {
        return new RONEOUSERType();
    }

    /**
     * Create an instance of {@link RONEOUSERType.GRONEOUSERDetailType }
     * 
     */
    public RONEOUSERType.GRONEOUSERDetailType createRONEOUSERTypeGRONEOUSERDetailType() {
        return new RONEOUSERType.GRONEOUSERDetailType();
    }

    /**
     * Create an instance of {@link BCSORTCODEType }
     * 
     */
    public BCSORTCODEType createBCSORTCODEType() {
        return new BCSORTCODEType();
    }

    /**
     * Create an instance of {@link BCSORTCODEType.GBCSORTCODEDetailType }
     * 
     */
    public BCSORTCODEType.GBCSORTCODEDetailType createBCSORTCODETypeGBCSORTCODEDetailType() {
        return new BCSORTCODEType.GBCSORTCODEDetailType();
    }

    /**
     * Create an instance of {@link WSBILLSType }
     * 
     */
    public WSBILLSType createWSBILLSType() {
        return new WSBILLSType();
    }

    /**
     * Create an instance of {@link WSBILLSType.GWSBILLSDetailType }
     * 
     */
    public WSBILLSType.GWSBILLSDetailType createWSBILLSTypeGWSBILLSDetailType() {
        return new WSBILLSType.GWSBILLSDetailType();
    }

    /**
     * Create an instance of {@link GETCUSType }
     * 
     */
    public GETCUSType createGETCUSType() {
        return new GETCUSType();
    }

    /**
     * Create an instance of {@link GETCUSType.GGETCUSDetailType }
     * 
     */
    public GETCUSType.GGETCUSDetailType createGETCUSTypeGGETCUSDetailType() {
        return new GETCUSType.GGETCUSDetailType();
    }

    /**
     * Create an instance of {@link WSBILLS }
     * 
     */
    public WSBILLS createWSBILLS() {
        return new WSBILLS();
    }

    /**
     * Create an instance of {@link WSBILLSResponse }
     * 
     */
    public WSBILLSResponse createWSBILLSResponse() {
        return new WSBILLSResponse();
    }

    /**
     * Create an instance of {@link WSCNPBCSORTCODE }
     * 
     */
    public WSCNPBCSORTCODE createWSCNPBCSORTCODE() {
        return new WSCNPBCSORTCODE();
    }

    /**
     * Create an instance of {@link WSCNPBCSORTCODEResponse }
     * 
     */
    public WSCNPBCSORTCODEResponse createWSCNPBCSORTCODEResponse() {
        return new WSCNPBCSORTCODEResponse();
    }

    /**
     * Create an instance of {@link WSGETCUS }
     * 
     */
    public WSGETCUS createWSGETCUS() {
        return new WSGETCUS();
    }

    /**
     * Create an instance of {@link WSGETCUSResponse }
     * 
     */
    public WSGETCUSResponse createWSGETCUSResponse() {
        return new WSGETCUSResponse();
    }

    /**
     * Create an instance of {@link WSRONEOUSER }
     * 
     */
    public WSRONEOUSER createWSRONEOUSER() {
        return new WSRONEOUSER();
    }

    /**
     * Create an instance of {@link WSRONEOUSERResponse }
     * 
     */
    public WSRONEOUSERResponse createWSRONEOUSERResponse() {
        return new WSRONEOUSERResponse();
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
     * Create an instance of {@link RONEOUSERType.GRONEOUSERDetailType.MRONEOUSERDetailType }
     * 
     */
    public RONEOUSERType.GRONEOUSERDetailType.MRONEOUSERDetailType createRONEOUSERTypeGRONEOUSERDetailTypeMRONEOUSERDetailType() {
        return new RONEOUSERType.GRONEOUSERDetailType.MRONEOUSERDetailType();
    }

    /**
     * Create an instance of {@link BCSORTCODEType.GBCSORTCODEDetailType.MBCSORTCODEDetailType }
     * 
     */
    public BCSORTCODEType.GBCSORTCODEDetailType.MBCSORTCODEDetailType createBCSORTCODETypeGBCSORTCODEDetailTypeMBCSORTCODEDetailType() {
        return new BCSORTCODEType.GBCSORTCODEDetailType.MBCSORTCODEDetailType();
    }

    /**
     * Create an instance of {@link WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType }
     * 
     */
    public WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType createWSBILLSTypeGWSBILLSDetailTypeMWSBILLSDetailType() {
        return new WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType();
    }

    /**
     * Create an instance of {@link GETCUSType.GGETCUSDetailType.MGETCUSDetailType }
     * 
     */
    public GETCUSType.GGETCUSDetailType.MGETCUSDetailType createGETCUSTypeGGETCUSDetailTypeMGETCUSDetailType() {
        return new GETCUSType.GGETCUSDetailType.MGETCUSDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSBILLS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSBILLS }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSBILLS")
    public JAXBElement<WSBILLS> createWSBILLS(WSBILLS value) {
        return new JAXBElement<WSBILLS>(_WSBILLS_QNAME, WSBILLS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSBILLSResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSBILLSResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSBILLSResponse")
    public JAXBElement<WSBILLSResponse> createWSBILLSResponse(WSBILLSResponse value) {
        return new JAXBElement<WSBILLSResponse>(_WSBILLSResponse_QNAME, WSBILLSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCNPBCSORTCODE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSCNPBCSORTCODE }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSCNPBCSORTCODE")
    public JAXBElement<WSCNPBCSORTCODE> createWSCNPBCSORTCODE(WSCNPBCSORTCODE value) {
        return new JAXBElement<WSCNPBCSORTCODE>(_WSCNPBCSORTCODE_QNAME, WSCNPBCSORTCODE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCNPBCSORTCODEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSCNPBCSORTCODEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSCNPBCSORTCODEResponse")
    public JAXBElement<WSCNPBCSORTCODEResponse> createWSCNPBCSORTCODEResponse(WSCNPBCSORTCODEResponse value) {
        return new JAXBElement<WSCNPBCSORTCODEResponse>(_WSCNPBCSORTCODEResponse_QNAME, WSCNPBCSORTCODEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSGETCUS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSGETCUS }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSGETCUS")
    public JAXBElement<WSGETCUS> createWSGETCUS(WSGETCUS value) {
        return new JAXBElement<WSGETCUS>(_WSGETCUS_QNAME, WSGETCUS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSGETCUSResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSGETCUSResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSGETCUSResponse")
    public JAXBElement<WSGETCUSResponse> createWSGETCUSResponse(WSGETCUSResponse value) {
        return new JAXBElement<WSGETCUSResponse>(_WSGETCUSResponse_QNAME, WSGETCUSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRONEOUSER }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSRONEOUSER }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSRONEOUSER")
    public JAXBElement<WSRONEOUSER> createWSRONEOUSER(WSRONEOUSER value) {
        return new JAXBElement<WSRONEOUSER>(_WSRONEOUSER_QNAME, WSRONEOUSER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRONEOUSERResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSRONEOUSERResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://temenos.com/BILLS", name = "WSRONEOUSERResponse")
    public JAXBElement<WSRONEOUSERResponse> createWSRONEOUSERResponse(WSRONEOUSERResponse value) {
        return new JAXBElement<WSRONEOUSERResponse>(_WSRONEOUSERResponse_QNAME, WSRONEOUSERResponse.class, null, value);
    }

}
