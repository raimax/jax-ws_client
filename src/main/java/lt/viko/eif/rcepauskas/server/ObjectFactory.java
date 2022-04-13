
package lt.viko.eif.rcepauskas.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.rcepauskas.server package. 
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

    private final static QName _GetHappyness_QNAME = new QName("http://server.rcepauskas.eif.viko.lt/", "getHappyness");
    private final static QName _GetHappynessResponse_QNAME = new QName("http://server.rcepauskas.eif.viko.lt/", "getHappynessResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.rcepauskas.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHappyness }
     * 
     */
    public GetHappyness createGetHappyness() {
        return new GetHappyness();
    }

    /**
     * Create an instance of {@link GetHappynessResponse }
     * 
     */
    public GetHappynessResponse createGetHappynessResponse() {
        return new GetHappynessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHappyness }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.rcepauskas.eif.viko.lt/", name = "getHappyness")
    public JAXBElement<GetHappyness> createGetHappyness(GetHappyness value) {
        return new JAXBElement<GetHappyness>(_GetHappyness_QNAME, GetHappyness.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHappynessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.rcepauskas.eif.viko.lt/", name = "getHappynessResponse")
    public JAXBElement<GetHappynessResponse> createGetHappynessResponse(GetHappynessResponse value) {
        return new JAXBElement<GetHappynessResponse>(_GetHappynessResponse_QNAME, GetHappynessResponse.class, null, value);
    }

}
