package herencia_ejercicio1;

import java.util.Objects;

public class Chofer {
	
	private String nombre;
	private String apellido;
	private int carnet;
	
	
	public Chofer(String nombre, String apellido, int carnet) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.carnet = carnet;
	}


	
	public String getNombre() {
		return nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellido, carnet, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chofer other = (Chofer) obj;
		return Objects.equals(apellido, other.apellido) && carnet == other.carnet
				&& Objects.equals(nombre, other.nombre);
	}

}
