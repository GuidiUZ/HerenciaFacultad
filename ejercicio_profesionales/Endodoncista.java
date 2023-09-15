package ejercicio_profesionales;

public class Endodoncista extends Dentista {

	public Endodoncista(String nombre, String apellido) {
		super(nombre, apellido);
		
	}

	@Override
	public double getSalario() {
		return super.getSalario() * 1.25;
	}
	
	@Override
	public String toString() {
		return "Endodoncista. " + super.toString();
	}
	
}
