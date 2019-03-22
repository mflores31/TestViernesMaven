package modelo;

public class Persona {

	private String nombre;
	private int edad;


	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) throws Exception {

		if(edad<0) throw new Exception("Error Edad");
		this.edad = edad;
	}

}