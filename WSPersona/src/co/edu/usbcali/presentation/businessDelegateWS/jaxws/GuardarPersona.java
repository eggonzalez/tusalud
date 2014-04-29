
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

@XmlRootElement(name = "guardarPersona", namespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarPersona", namespace = "http://businessDelegateWS.presentation.usbcali.edu.co/", propOrder = {"identificacion", "primerNombre", "segundoNombre", "primerApellido", "segundoApellido", "fechaNacimiento", "genero", "profesion"})

public class GuardarPersona {

    @XmlElement(name = "identificacion")
    private java.lang.Long identificacion;
    @XmlElement(name = "primerNombre")
    private java.lang.String primerNombre;
    @XmlElement(name = "segundoNombre")
    private java.lang.String segundoNombre;
    @XmlElement(name = "primerApellido")
    private java.lang.String primerApellido;
    @XmlElement(name = "segundoApellido")
    private java.lang.String segundoApellido;
    @XmlElement(name = "fechaNacimiento")
    private java.lang.String fechaNacimiento;
    @XmlElement(name = "genero")
    private java.lang.String genero;
    @XmlElement(name = "profesion")
    private java.lang.String profesion;

    public java.lang.Long getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(java.lang.Long newIdentificacion)  {
        this.identificacion = newIdentificacion;
    }

    public java.lang.String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(java.lang.String newPrimerNombre)  {
        this.primerNombre = newPrimerNombre;
    }

    public java.lang.String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(java.lang.String newSegundoNombre)  {
        this.segundoNombre = newSegundoNombre;
    }

    public java.lang.String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(java.lang.String newPrimerApellido)  {
        this.primerApellido = newPrimerApellido;
    }

    public java.lang.String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(java.lang.String newSegundoApellido)  {
        this.segundoApellido = newSegundoApellido;
    }

    public java.lang.String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(java.lang.String newFechaNacimiento)  {
        this.fechaNacimiento = newFechaNacimiento;
    }

    public java.lang.String getGenero() {
        return this.genero;
    }

    public void setGenero(java.lang.String newGenero)  {
        this.genero = newGenero;
    }

    public java.lang.String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(java.lang.String newProfesion)  {
        this.profesion = newProfesion;
    }

}
