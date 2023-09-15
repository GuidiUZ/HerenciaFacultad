package ejercicios;

public class FIZZBUZZ {

	//100 numeros
	//Multiplo de 3 = Fizz
	//Multiplo de 5 = Buzz
	//Multiplo de 3 y 5 = FIZZBUZZ
	
	
	public static void fizzBuzz (int n) {
		for(int i = 1; i < n + 1; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ" + " " + i);
			} else if (i % 3 == 0) {
				System.out.println("Fizz" + " " + i);
			} else if (i % 5 == 00) {
				System.out.println("Buzz" + " " + i);
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		fizzBuzz(100); 
	}

}
