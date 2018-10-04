package fallos;

public class Exeptions {

	public static void main(String[] args) {
		
		int[] matriz = new int[5];
		
		matriz[0] = 5;
		matriz[1] = 15;
		matriz[2] = 25;
		matriz[3] = 35;
		matriz[4] = 45;
		
		for (int i=0; i<5;i++) {
			System.out.println("Posición: " + i + "  valor: " + matriz[i]);
		}
	}

}
