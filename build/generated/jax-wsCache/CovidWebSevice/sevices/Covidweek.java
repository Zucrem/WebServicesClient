
package sevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for covidweek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covidweek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseForeign" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caseNewDiff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caseNewPrev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="casePrison" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caseWalkin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="covidyear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deathNewDiff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deathNewPrev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newDeath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newRecovered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalDeath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRecovered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="weeknum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covidweek", propOrder = {
    "caseForeign",
    "caseNewDiff",
    "caseNewPrev",
    "casePrison",
    "caseWalkin",
    "covidyear",
    "deathNewDiff",
    "deathNewPrev",
    "newCase",
    "newCaseExcludeabroad",
    "newDeath",
    "newRecovered",
    "seq",
    "totalCase",
    "totalCaseExcludeabroad",
    "totalDeath",
    "totalRecovered",
    "updateDate",
    "weeknum"
})
public class Covidweek {

    protected Integer caseForeign;
    protected Integer caseNewDiff;
    protected Integer caseNewPrev;
    protected Integer casePrison;
    protected Integer caseWalkin;
    protected Integer covidyear;
    protected Integer deathNewDiff;
    protected Integer deathNewPrev;
    protected Integer newCase;
    protected Integer newCaseExcludeabroad;
    protected Integer newDeath;
    protected Integer newRecovered;
    protected Integer seq;
    protected Integer totalCase;
    protected Integer totalCaseExcludeabroad;
    protected Integer totalDeath;
    protected Integer totalRecovered;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    protected Integer weeknum;

    /**
     * Gets the value of the caseForeign property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseForeign() {
        return caseForeign;
    }

    /**
     * Sets the value of the caseForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseForeign(Integer value) {
        this.caseForeign = value;
    }

    /**
     * Gets the value of the caseNewDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    /**
     * Sets the value of the caseNewDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseNewDiff(Integer value) {
        this.caseNewDiff = value;
    }

    /**
     * Gets the value of the caseNewPrev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    /**
     * Sets the value of the caseNewPrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseNewPrev(Integer value) {
        this.caseNewPrev = value;
    }

    /**
     * Gets the value of the casePrison property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCasePrison() {
        return casePrison;
    }

    /**
     * Sets the value of the casePrison property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCasePrison(Integer value) {
        this.casePrison = value;
    }

    /**
     * Gets the value of the caseWalkin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    /**
     * Sets the value of the caseWalkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseWalkin(Integer value) {
        this.caseWalkin = value;
    }

    /**
     * Gets the value of the covidyear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCovidyear() {
        return covidyear;
    }

    /**
     * Sets the value of the covidyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCovidyear(Integer value) {
        this.covidyear = value;
    }

    /**
     * Gets the value of the deathNewDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    /**
     * Sets the value of the deathNewDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeathNewDiff(Integer value) {
        this.deathNewDiff = value;
    }

    /**
     * Gets the value of the deathNewPrev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    /**
     * Sets the value of the deathNewPrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeathNewPrev(Integer value) {
        this.deathNewPrev = value;
    }

    /**
     * Gets the value of the newCase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCase() {
        return newCase;
    }

    /**
     * Sets the value of the newCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCase(Integer value) {
        this.newCase = value;
    }

    /**
     * Gets the value of the newCaseExcludeabroad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    /**
     * Sets the value of the newCaseExcludeabroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCaseExcludeabroad(Integer value) {
        this.newCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the newDeath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewDeath() {
        return newDeath;
    }

    /**
     * Sets the value of the newDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewDeath(Integer value) {
        this.newDeath = value;
    }

    /**
     * Gets the value of the newRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewRecovered() {
        return newRecovered;
    }

    /**
     * Sets the value of the newRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewRecovered(Integer value) {
        this.newRecovered = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeq(Integer value) {
        this.seq = value;
    }

    /**
     * Gets the value of the totalCase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCase() {
        return totalCase;
    }

    /**
     * Sets the value of the totalCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCase(Integer value) {
        this.totalCase = value;
    }

    /**
     * Gets the value of the totalCaseExcludeabroad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    /**
     * Sets the value of the totalCaseExcludeabroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCaseExcludeabroad(Integer value) {
        this.totalCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the totalDeath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDeath() {
        return totalDeath;
    }

    /**
     * Sets the value of the totalDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDeath(Integer value) {
        this.totalDeath = value;
    }

    /**
     * Gets the value of the totalRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    /**
     * Sets the value of the totalRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecovered(Integer value) {
        this.totalRecovered = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the weeknum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeknum() {
        return weeknum;
    }

    /**
     * Sets the value of the weeknum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeknum(Integer value) {
        this.weeknum = value;
    }

}
