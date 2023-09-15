package ejercicio_profesionales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfesionalTest {

	@Test
	void medicoTest() {
		Medico chapatin = new Medico("Doctor", "Chapatin");
		assertEquals(500000.00, chapatin.getSalario());
	}
	
	
	@Test
	void CirujanoTest() {
		Cirujano chapatin = new Cirujano("Doctor", "Chapatin");
		assertEquals(625000.00, chapatin.getSalario());
	}
	
	@Test
	void CirujanoCardioVascularTest() {
		Cirujano chapatin = new CirujanoCardioVascular("Doctor", "Chapatin");
		assertEquals(781250.00, chapatin.getSalario());
	}

}
