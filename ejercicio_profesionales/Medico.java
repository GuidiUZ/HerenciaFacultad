package ejercicio_profesionales;

public class Medico extends Profesional{

	public Medico(String nombre, String apellido) {
		super(nombre, apellido);
		
	}

	@Override
	public String toString() {
		return "Dr. " + super.toString();
	}
	
	
}
