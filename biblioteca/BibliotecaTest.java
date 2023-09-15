package biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BibliotecaTest {

	
	/*@Test
	public void bibliotecaNuevaTest() {
		Biblioteca biblio = new Biblioteca(10);
		int esperado = 0;
		int obtenido = biblio.cuantosLibros();
		assertEquals(esperado, obtenido);
	}*/
	
	@Test
	public void agregarLibroTest() {
		Biblioteca biblio = new Biblioteca(10);
		biblio.agregarLibro("Moby Dick", "Melville", Genero.NOVELA, 200);
		int esperado = 1;
		int obtenido = biblio.cuantosLibros();
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void libroEnLaPrimeraPosicionTest() {
		Biblioteca biblio = new Biblioteca(10);
		biblio.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 909);
		assertEquals("Moby Dick", biblio.libroEnLaPosicion(1));
	}

}
