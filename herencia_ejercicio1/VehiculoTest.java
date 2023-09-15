package herencia_ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculoTest {

	@Test
	public void testValidaciones() {
		Chofer juan = new Chofer("Juan", "Milei", 245);
		Chofer pablo = new Chofer("Pablo", "Saad", 420);
		Motocicleta motito = new Motocicleta(juan, 100, 0);
		motito.CambiarChofer(pablo);
		assertEquals("Pablo", motito.getChofer());
	}
	
	
	@Test
	public void testCambioChofer() {
		Chofer pepe = new Chofer("Pepe", "Nazhi", 205);
		Chofer mati = new Chofer("Matias", "Zaro", 760);
		Motocicleta motito2 = new Motocicleta(pepe, 100, 0);
		motito2.agregarAcomp(1);
		motito2.CambiarChofer(mati);
		assertEquals(mati, motito2.getChofer());
	}
	
	
	@Test 
	public void testColectivo() {
		Chofer dario = new Chofer("Dario", "Acevedo", 666);
		Chofer axel = new Chofer("Axel", "Kiciloff", 850);
		Colectivo laPerlita = new Colectivo(dario, 150, 0);
		laPerlita.CambiarChofer(axel);
		assertEquals(axel, laPerlita.getChofer());
		
	}

	
	
	
}
