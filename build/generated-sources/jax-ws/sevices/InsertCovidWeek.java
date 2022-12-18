
package sevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertCovidWeek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertCovidWeek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="covidWeek" type="{http://services/}covidweek" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertCovidWeek", propOrder = {
    "covidWeek"
})
public class InsertCovidWeek {

    protected Covidweek covidWeek;

    /**
     * Gets the value of the covidWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Covidweek }
     *     
     */
    public Covidweek getCovidWeek() {
        return covidWeek;
    }

    /**
     * Sets the value of the covidWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Covidweek }
     *     
     */
    public void setCovidWeek(Covidweek value) {
        this.covidWeek = value;
    }

}
