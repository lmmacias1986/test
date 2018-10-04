package poo;

public class inicio {
	/*
	 * La clase main es la primera que se ejecuta al correr el programa, de ahi en adelante todo se ejecuta en cascada
	 * o de acuerdo a las instancias creadas
	 */
	public static void main(String[] args) {
		/*
		 * Instanciamos una variable como un objeto del tipo de clase y le tenemos que enviar los parametros 
		 * que esta esperando el constructor de esa clase
		 */
		Empleado emp1 = new Empleado("Luis",4060000, "QA", "Bogotá", "Colombia");
		Empleado emp2 = new Empleado("Miguel",5800000, "Desarrollo", "Bogotá", "Argentina");
		
		//Incrementamos el valor del sueldo al emp1
		emp1.subeSueldo(5);
		
		/*
		 * Modificamos el valor de una variable publica directamente desde el objeto sin necesidad de un 
		 * setter
		 */
		emp2.empresa = "Choucair Testing";
		
		/*
		 * El metodo static no se puede traer por medio de un objeto, solamente por medio de la clase
		 */
		
		Empleado.getIdSiguiente();
		/*
		 * Invocamos los metdos getter que existen en la clase para poder acceder a la 
		 * información que se almaceno en sus variables al momento de contruir el objeto
		 */
		
		//Esta clase jefe es heredada de la clase empleado
		Jefe jef1 = new Jefe("Martin",7000000, "Management", "Bogotá", "Uruguay");
		
		/*
		 * Estamos utiliando un metodo propio de la clase padre, pero invocandolo desde un objeto instanciado de la 
		 * clase heredada,
		 */
		jef1.subeSueldo(10);
		
		/*
		 * Invocamos una clase propia de la clase heredada
		 */
		jef1.setBonoJefe(2000000);
		
		/*
		 * Invocamos un metodo de la clase heredada que sobre escribe uno de la clase padre.
		 * jef1.getSueldo(); 
		 */
	
		System.out.println("País: " + emp1.getPais() + " Empresa: " + emp1.empresa + " Area: " + emp1.getArea() + " - aumento: " + emp1.getSueldo() + " id:" + emp1.getId());
		System.out.println("País: " + emp2.getPais() + " Empresa: " + emp2.empresa + " Area: " + emp2.getArea() + " - aumento: " + emp2.getSueldo() + " id:" + emp2.getId());
		System.out.println("País: " + jef1.getPais() + " Empresa: " + jef1.empresa + " Area: " + jef1.getArea() + " - aumento: " + jef1.getSueldo() + " id:" + jef1.getId());
		
		/*
		 * El polimorfismo o principio de sustitución hace referencia a tomar un tipo de objeto y hacerlo pasar como 
		 * otro tipo de objeto, en el ejemplo se instanciara un objeto de tipo jefe con sus atibutos normales, y luego
		 * se instanciara un objeto de la clase empleado pero a esta no le enviaremos atributos si no que le enviaremos 
		 * el objeto jefe que ya creamos.
		 */
		Jefe jef2 = new Jefe("Sandra",6000000, "Sub Management", "Medellin", "Brasil");
		Empleado emp3 = jef2;
		
		System.out.println("País: " + emp3.getPais() + " Empresa: " + emp3.empresa + " Area: " + emp3.getArea() + " - aumento: " + emp3.getSueldo() + " id:" + emp3.getId());
		
		/*
		 * Podemos tener a un jefe que por medio de polimorfismo se convirtio empleado y ahora por medio de casting
		 * queremos volverlo a sus metodos y permisos como jefe PERO sin dejar de ser empleado usamos el CASTING o refundición
		 */
		
		Jefe jef3 = (Jefe) emp3;
		
		//Ahora ya puedo utilizar metodos de la clase jefe en un empleado
		
		jef3.setBonoJefe(3000000);

		System.out.println("País: " + jef3.getPais() + " Empresa: " + jef3.empresa + " Area: " + jef3.getArea() + " - aumento: " + jef3.getSueldo() + " id:" + jef3.getId());
		
		
		/*
		 * Vamos a crear un objeto de la clase abstracta Persona y vamos a crear varias personas de diferentes
		 * tipos, empleados, alumnos, jefes.
		 */
		
		Persona[] sociedad = new Persona[2];
		
		sociedad[0] = new Empleado("Karina",3400000, "Diseño", "Bogotá", "Perú");
		sociedad[1] = new Alumno("Alejandra","Ing Sistemas");
		
		
		for(Persona p: sociedad) {
			/*
			 * Traemos un metodo de la clase persona, y un metodo abstracto de las clases empleado y alumno
			 */
			System.out.println("Nombre: " + p.getNombre() + " - Descripción: " + p.getDescripcion());
		}
	}
}
