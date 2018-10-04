package poo;

/*
 * Con Extends Heredamos esta clase de una superior, esto quiere decir que tendremos acceso a sus metodos y ademas
 * a los metodos que creemos en esta clase, tambien podemos usar la estructura "final class" para indicar que nadie
 * mas puede heredar de esta clase, rompiendo la cadena de herencia de esta clase hacia abajo.
 */ 

public class Jefe extends Empleado{
	
	private int bonoJefes;
	
	/*
	 * El constructor de una clase heredada debe tener como mínimo los parametros que exije el 
	 * constructor de la clase padre 
	 */
	public Jefe(String nombre, int sueldo, String area, String sede, String pais) {
		//Con "super" enviamos los parametros al constructor de la clase padre.
		super(nombre,sueldo, area, sede, pais);
	}
	
	//Seter utilizado para setear valores a las variables de la clase que son privadas por temas de encapsulación
	public void setBonoJefe(int bono) { 
		this.bonoJefes = bono;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see poo.Empleado#getSueldo()
	 * Este metodo ya existe de la misma manera en la clase padre, pero como esta clase heredada necesita modificarlo
	 * Se marca a la izquierda con un triangulo verde que indica que se esta sobre escribiendo el metodo padre para todos
	 * los objetos instanciados en la clase heredada, y los objetos instanciados de la clase padre si utilizaran el metodo original
	 */
	public int getSueldo() {
		int sueldoJefe = super.getSueldo();
		return sueldoJefe + bonoJefes;
	}
	/*
	 * Si el metodo getSueldo de la clase padre fuese de tipo "final" solo podriamos consultarlo y no podriamos 
	 *  sobrescrir por lo cual tendriamos que declarar este metodo con otro nombre, 
	 */
}
