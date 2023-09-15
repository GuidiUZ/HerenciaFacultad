package biblioteca;

public class Libro {
	
	private String titulo;
	private String autor;
	private Genero genero;
	private int cantidadPaginas;
	
	
	public Libro(String titulo, String autor, Genero genero, int cantidadPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.cantidadPaginas = cantidadPaginas;
	}


	public int getPaginas() {
		return cantidadPaginas;
	}
	public String getTitulo() {
		return titulo;
	}


	
	
	
}

