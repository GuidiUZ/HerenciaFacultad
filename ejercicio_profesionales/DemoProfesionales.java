package ejercicio_profesionales;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoProfesionales {

	public static void main(String[] args) {
		
		Profesional chapatin = new Medico("Claudio", "Chapatin");
		Profesional pepe = new Cirujano("Pepe", "Zapata");
		Profesional carlos = new CirujanoCardioVascular("Carlos", "Alvarez");
		Profesional martin = new Dentista("Juan", "Martin");
		
		Profesional[] profesionales = {chapatin, pepe, carlos, martin}; 
		
		
		//Usando ArrayList
		ArrayList<Profesional> listaDeProfesionales = new ArrayList<Profesional>();
		listaDeProfesionales.add(chapatin);
		listaDeProfesionales.add(pepe);
		listaDeProfesionales.add(carlos);
		listaDeProfesionales.add(martin);
		

		for (Profesional p : profesionales) {
			System.out.println(p);
		}
		
		Arrays.sort(profesionales);
		
		
		System.out.println("*********");
		System.out.println("*********");
		System.out.println("*********");
		System.out.println("Ahora ordenados");
		System.out.println("*********");
		System.out.println("*********");
		System.out.println("*********");
		
		for (Profesional p : profesionales) {
			System.out.println(p);
		}
		
	}

}
