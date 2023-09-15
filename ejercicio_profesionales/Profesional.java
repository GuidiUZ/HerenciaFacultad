package ejercicio_profesionales;

public abstract class Profesional implements Comparable<Profesional> {

	private static final double SALARIO_BASICO = 500000.00;
	private String nombre;
	private String apellido;

	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public double getSalario() {
		return Profesional.SALARIO_BASICO;
	}

	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + " " + ", salario: " + this.getSalario();
	}

	@Override
	public int compareTo(Profesional p) {

		return (-1) * Double.compare(this.getSalario(), p.getSalario());

	}

}
