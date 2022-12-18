
package sevices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sevices package. 
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

    private final static QName _InsertCovidWeek_QNAME = new QName("http://services/", "insertCovidWeek");
    private final static QName _FindAllCovidWeekResponse_QNAME = new QName("http://services/", "findAllCovidWeekResponse");
    private final static QName _FindAllCovidWeek_QNAME = new QName("http://services/", "findAllCovidWeek");
    private final static QName _Covidweek_QNAME = new QName("http://services/", "covidweek");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sevices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Covidweek }
     * 
     */
    public Covidweek createCovidweek() {
        return new Covidweek();
    }

    /**
     * Create an instance of {@link FindAllCovidWeek }
     * 
     */
    public FindAllCovidWeek createFindAllCovidWeek() {
        return new FindAllCovidWeek();
    }

    /**
     * Create an instance of {@link InsertCovidWeek }
     * 
     */
    public InsertCovidWeek createInsertCovidWeek() {
        return new InsertCovidWeek();
    }

    /**
     * Create an instance of {@link FindAllCovidWeekResponse }
     * 
     */
    public FindAllCovidWeekResponse createFindAllCovidWeekResponse() {
        return new FindAllCovidWeekResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCovidWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertCovidWeek")
    public JAXBElement<InsertCovidWeek> createInsertCovidWeek(InsertCovidWeek value) {
        return new JAXBElement<InsertCovidWeek>(_InsertCovidWeek_QNAME, InsertCovidWeek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCovidWeekResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCovidWeekResponse")
    public JAXBElement<FindAllCovidWeekResponse> createFindAllCovidWeekResponse(FindAllCovidWeekResponse value) {
        return new JAXBElement<FindAllCovidWeekResponse>(_FindAllCovidWeekResponse_QNAME, FindAllCovidWeekResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCovidWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCovidWeek")
    public JAXBElement<FindAllCovidWeek> createFindAllCovidWeek(FindAllCovidWeek value) {
        return new JAXBElement<FindAllCovidWeek>(_FindAllCovidWeek_QNAME, FindAllCovidWeek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidweek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidweek")
    public JAXBElement<Covidweek> createCovidweek(Covidweek value) {
        return new JAXBElement<Covidweek>(_Covidweek_QNAME, Covidweek.class, null, value);
    }

}
