package ejercicio_profesionales;

public class CirujanoCardioVascular extends Cirujano {

	public CirujanoCardioVascular(String nombre, String apellido) {
		super(nombre, apellido);
		
	}
	
	
	@Override
	public double getSalario() {
		return super.getSalario() * 1.25;
	}

	
	@Override
	public String toString() {
		return "CardioVascular " + super.toString();
	}
}
