
package com.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Wed Jan 31 08:37:06 IST 2018
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "messageResponse", namespace = "http://soap.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageResponse", namespace = "http://soap.com/")

public class MessageResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

