package co.edu.usbcali.presentation.backingBeans;

	import java.io.Serializable;  
	  

	import org.primefaces.model.chart.CartesianChartModel;  
import org.primefaces.model.chart.ChartSeries;  

import co.edu.usbcali.modelo.Consulta;
	  
	public class ChartBean implements Serializable {  
		 
	    private CartesianChartModel categoryModel;  
	  
	    public ChartBean() {  
	        createCategoryModel();  
	    }  
	  
	    public CartesianChartModel getCategoryModel() {  
	        return categoryModel;  
	    }  
	  
	    private void createCategoryModel() {  
	        categoryModel = new CartesianChartModel();  
	  
	        ChartSeries consultas = new ChartSeries();  
	        consultas.setLabel("Consultas");  
	  
	        consultas.set("Consultas", Consulta.getConsultas());  
	        categoryModel.addSeries(consultas);
	        
	        ChartSeries listaPersonas = new ChartSeries();  
	        consultas.setLabel("ListaPersonas");  
	  
	        consultas.set("ListaPersonas", Consulta.getLista());  
	        categoryModel.addSeries(listaPersonas);
	        
	        ChartSeries guardarPersonas = new ChartSeries();  
	        consultas.setLabel("GuardarPersona");  
	  
	        consultas.set("GuardarPersona", Consulta.getGuardar());  
	        categoryModel.addSeries(guardarPersonas);
	        
	        ChartSeries borrarPersona = new ChartSeries();  
	        consultas.setLabel("BorrarPersona");  
	  
	        consultas.set("BorrarPersona", Consulta.getBorrar());  
	        categoryModel.addSeries(borrarPersona);
	        
	        ChartSeries modificarPersona = new ChartSeries();  
	        consultas.setLabel("ModificarPersona");  
	  
	        consultas.set("ModificarPersona", Consulta.getModificar());  
	        categoryModel.addSeries(modificarPersona);
	        
	    }  

}
