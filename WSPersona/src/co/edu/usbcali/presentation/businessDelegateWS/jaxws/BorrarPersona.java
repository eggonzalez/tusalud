
package co.edu.usbcali.presentation.businessDelegateWS.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.10
 * Sun Mar 30 13:13:47 COT 2014
 * Generated source version: 2.7.10
 */

@XmlRootElement(name = "borrarPersona", namespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrarPersona", namespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")

public class BorrarPersona {

    @XmlElement(name = "identificacion")
    private java.lang.Long identificacion;

    public java.lang.Long getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(java.lang.Long newIdentificacion)  {
        this.identificacion = newIdentificacion;
    }

}

