package poo;

public class Empleado extends Persona{

	/*
	 * Las clases de tipo provate se utilizan bajo el concepto de encapsulación de java
	 */
	private int sueldo;
	private String area;
	private String sede;
	private int id;
	
	/*
	 * Una variable de tipo "final" es una constante que nunca podra modificar su valor. solo se puede consultar
	 * o utilizar pero no modificar.
	 */
	private final int iva = 16;  //el valor del iva siempre sera el mismo
	private final String pais;  //esta variable se cargara en el constructor pero nunca mas se podra modificar en el objeto
	
	/*
	 * Una variable de tipo public es una variable que puedo acceder desde cualquier lugar, consultar y modificar
	 * no es necesario implementar un getter para acceder a ella
	 */
	public String empresa = "Endava";
	
	/*
	 * Creamos una variable static que se utilizara en comun en todos los objetos de esta clase y al ser static se 
	 * instanciara una unica vez en la memoria del equipo.
	 */
	private static int idSiguiente = 1;
	
	/*
	 * Clase constructor de la clase que carga todos los atributos iniciales del objeto
	 * Existe algo llamado sobrecarga de constructores que es crear mas constructores con diferente cantidad 
	 * de parametros y el sistema podra determinar cual estamos utilizando de acuerdo a esta cantidad de parametros
	 */
	public Empleado(String nombre, int sueldo, String area, String sede, String pais) {
		super(nombre);
		this.sueldo = sueldo;
		this.area = area;
		this.sede = sede;
		this.id = idSiguiente;
		this.pais= pais;
		//Incrementamos la variable de clase para que el siguiente empleado incremente el id de registro
		idSiguiente++;
	}
	
	
	public int getSueldo() {  //Getter		
		return sueldo;
	}
	
	public String getArea() {  //Getter		
		return area;
	}
	
	public String getSede() {  //Getter		
		return sede;
	}
	
	public int getIva() {  //Getter		
		return iva;
	}
	
	public int getId() {  //Getter		
		return id;
	}
	
	public String getPais() {  //Getter		
		return pais;
	}
	
	/*
	 * Los metodos static son metodos de clase, no actuan sobre los objetos instanciados. eso quiere decir que solo se
	 * cargan una vez en memoria y se deben consumir por medio de la clase original no de un objecto instanciado con esa clase
	 */
	public static int getIdSiguiente() {  //Getter		
		return idSiguiente;
	}
	
	/*
	 * Este metodo incrementa el sueldo pero no puede devolverlo porque es de tipo void (no retorna valores)
	 * al incrementar la variable se puede acceder a ella por el getter asignado
	 */
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}

	@Override
	/*
	 * Como la clase padre es de tipo abstracto debemos tener un metodo con el nombre del metodo 
	 * abastracto en el padre, 
	 */
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esta persona es un empleado de " + empresa;
	}
	
}