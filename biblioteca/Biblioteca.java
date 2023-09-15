package biblioteca;

public class Biblioteca {
	
	private Libro[] libros;
	private int cantidadDeLibros = 0;
	
	public Biblioteca (int maxCantidadLibros) {
		libros = new Libro[maxCantidadLibros];
	}
	
	public void agregarLibro (String titulo, String autor, Genero genero, int cantidadPaginas) {
		if (cantidadDeLibros >= libros.length) {
			throw new Error("Biblioteca Llena");
		} else {
			Libro libroNuevo = new Libro("Sombra", "Carlos", Genero.POESIA, 100);
			libros[cantidadDeLibros] = libroNuevo;
			cantidadDeLibros++;
		}
	}
	
	//Sobrecarga de metodos
	public void agregarLibro (Libro libro) {
		if (cantidadDeLibros >= libros.length) {
			throw new Error("Biblioteca Llena");
		} else {
			libros[cantidadDeLibros] = libro;
			cantidadDeLibros++;
		}
	}
	
	public int cuantosLibros() {
		return cantidadDeLibros;
	}
	
	public String libroEnLaPosicion(int posicion) {
		return libros[posicion - 1].getTitulo();
	}
	
	public Libro libroConMasPaginas() {
		
		Libro max = libros[0];
		for (int i = 1; i < cantidadDeLibros; i++) {
			if (libros[i].getPaginas() > max.getPaginas()) {
				max = libros[i];
			}
			
 		}
		
		return max;
		
	}
	
}
