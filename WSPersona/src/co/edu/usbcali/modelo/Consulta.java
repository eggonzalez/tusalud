package co.edu.usbcali.modelo;


public final class Consulta {

	static int lista=0;
	static int guardar=0;
	static int borrar=0;
	static int modificar=0;
	static int consultas=0;


	public static int getConsultas() {
		return consultas;
	}

	public static void setConsultas() {
		Consulta.consultas = consultas+1;
	}

	public static int getLista() {
		return lista;
	}

	public static void setLista() {
		Consulta.lista = lista+1;
	}

	public static int getGuardar() {
		return guardar;
	}

	public static void setGuardar() {
		Consulta.guardar = guardar+1;
	}

	public static int getBorrar() {
		return borrar;
	}

	public static void setBorrar() {
		Consulta.borrar = borrar+1;
	}

	public static int getModificar() {
		return modificar;
	}

	public static void setModificar() {
		Consulta.modificar = modificar+1;
	}
	

	
}
