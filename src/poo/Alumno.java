package poo;

public class Alumno extends Persona{

	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}
	@Override
	public String getDescripcion() {
		return "Esta persona es un alumno de " + carrera;
	}
	
}
