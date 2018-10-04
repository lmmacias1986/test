package poo;

abstract class Persona{
	
	//Variables tipo private solo pueden ser vistas y accedidas desde la clase en que se declaran.
	
	private int edad;
	private String nombre;
	
	/*Un metodo constructor debe tener el mismo nombre de la clase y ser de tipo publico para 
	*ser accedido desde cualquier lugar, adicional puede o no traer los valores para instanciar los 
	*atributos de la clase.
	*/
	public Persona(String nombre) {
		this.edad = 0;
		this.nombre = nombre;
	}
	
	/*
	 * Utilizamos un metodo abstracto cuando queremos que las clases hijas utilicen el metodo pero 
	 * en todas ellas va a tener un comportamiento diferente, al declarar un metodo como abstract toda
	 * la clase debe ser declarada abstract asi solo un metodo sea de este tipo
	 */
	
	public abstract String getDescripcion();

	//Los metodos de tipo get permiten acceder al valor de las variables private desde fuera de la clase
	public int getEdad() {
		return this.edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	/*Los metodos de tipo set permiten setear valores en las variables de tipo private desde fuera de la clase
	 *adicional llevan la palabra "void" que indica que este metodo no retorna ninguna valor. 
	 */
	public void setEdad(int edad) {
		this.edad = edad ;
	}	
}
