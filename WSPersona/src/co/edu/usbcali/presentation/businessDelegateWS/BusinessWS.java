package co.edu.usbcali.presentation.businessDelegateWS;

import java.text.SimpleDateFormat;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import co.edu.usbcali.modelo.Consulta;
import co.edu.usbcali.modelo.Personas;
import co.edu.usbcali.presentation.businessDelegate.BusinessDelegatorView;


@WebService(targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/", portName = "BusinessWSPort", serviceName = "BusinessWSService")
public class BusinessWS {
	
	@WebMethod(operationName = "ListaPersonas", action = "urn:ListaPersonas")
	@RequestWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.ListaPersonas", localName = "ListaPersonas", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
	@ResponseWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.ListaPersonasResponse", localName = "ListaPersonasResponse", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
	@WebResult(name = "return")
	public String ListaPersonas() throws Exception {
        
		 String ps="";
		 
		 for (Personas personas : BusinessDelegatorView.getPersonas()) {
			ps+=personas.toString()+"\n";
		}
		 Consulta.setLista();
       return ps;
   }

   @WebMethod(operationName = "guardarPersona", action = "urn:GuardarPersona")
@RequestWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.GuardarPersona", localName = "guardarPersona", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@ResponseWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.GuardarPersonaResponse", localName = "guardarPersonaResponse", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@WebResult(name = "return")
public String guardarPersona(@WebParam(name = "identificacion") Long idPersona, @WebParam(name = "primerNombre") String primerNombre,@WebParam(name = "segundoNombre") String segundoNombre,
   		@WebParam(name = "primerApellido") String primerApellido, @WebParam(name = "segundoApellido") String segundoApellido,
   		@WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "genero") String genero, @WebParam(name = "profesion") String profesion)
       throws Exception {
      
	   SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
   	BusinessDelegatorView.savePersonas(formatoFecha.parse(fechaNacimiento), genero, idPersona,
           primerApellido, primerNombre, profesion, segundoApellido,
           segundoNombre);
   	Consulta.setGuardar();
       
       return "La Persona se ha creado correctamente";
   }

   @WebMethod(operationName = "borrarPersona", action = "urn:BorrarPersona")
@RequestWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.BorrarPersona", localName = "borrarPersona", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@ResponseWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.BorrarPersonaResponse", localName = "borrarPersonaResponse", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@WebResult(name = "return")
public String borrarPersona(@WebParam(name = "identificacion") Long idPersona) throws Exception {
   	
   	BusinessDelegatorView.deletePersonas(idPersona);
   	Consulta.setBorrar();
   	
       return "La Persona se ha Eliminado correctamente";
   }

   @WebMethod(operationName = "modificarPersona", action = "urn:ModificarPersona")
@RequestWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.ModificarPersona", localName = "modificarPersona", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@ResponseWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.ModificarPersonaResponse", localName = "modificarPersonaResponse", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@WebResult(name = "return")
public String modificarPersona(@WebParam(name = "identificacion") Long idPersona, @WebParam(name = "primerNombre") String primerNombre,@WebParam(name = "segundoNombre") String segundoNombre,
   		@WebParam(name = "primerApellido") String primerApellido, @WebParam(name = "segundoApellido") String segundoApellido,
   		@WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "genero") String genero, @WebParam(name = "profesion") String profesion)
       throws Exception {
      
	   SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	   	   
   	BusinessDelegatorView.updatePersonas(formatoFecha.parse(fechaNacimiento), genero, idPersona,
           primerApellido, primerNombre, profesion, segundoApellido,
           segundoNombre);
   	Consulta.setModificar();
   	
   	return "La Persona se ha Modificado correctamente";
   }

   @WebMethod(operationName = "consultarPersona", action = "urn:ConsultarPersona")
@RequestWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.ConsultarPersona", localName = "consultarPersona", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@ResponseWrapper(className = "co.edu.usbcali.presentation.businessDelegateWS.jaxws.ConsultarPersonaResponse", localName = "consultarPersonaResponse", targetNamespace = "http://businessDelegateWS.presentation.usbcali.edu.co/")
@WebResult(name = "return")
public String consultarPersona(@WebParam(name = "identificacion") Long idPersona)
       throws Exception {
   	
       Personas personas = null;

       try {
           personas = BusinessDelegatorView.getPersonas(idPersona);
           Consulta.setConsultas();
       } catch (Exception e) {
           throw e;
       }

       return personas.toString();
   }

}
