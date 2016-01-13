
package com.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserObject" type="{http://server.demo.com/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserByNameResponse", propOrder = {
    "userObject"
})
public class GetUserByNameResponse {

    @XmlElement(name = "UserObject")
    protected User userObject;

    /**
     * Gets the value of the userObject property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserObject() {
        return userObject;
    }

    /**
     * Sets the value of the userObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserObject(User value) {
        this.userObject = value;
    }

}
