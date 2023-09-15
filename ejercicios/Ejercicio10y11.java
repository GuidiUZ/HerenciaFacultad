package ejercicios;



//Se ingresa un valor numérico por consola, determinar e informar 
//si se trata de un número primo o no.

public class Ejercicio10y11 {

	public static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}

		return true;

	}

	
public static void primerosPrimos (int n) {
		
		for (int i = 2; i < n + 1; i++) {
			
			if (i > 2) {
				System.out.println(esPrimo(i)); 
			} 
			
			
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(esPrimo(3));
		primerosPrimos(10);

	}

}
