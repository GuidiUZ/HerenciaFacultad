package herencia_ejercicio1;

public abstract class Vehiculo {
	private Chofer chofer;
	private int kilometros;
	
	public Vehiculo(Chofer chofer, int kilometros) {
		this.chofer = chofer;
		this.kilometros = kilometros;
	}
	
	
	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}


	public int conocerKm() {
		return kilometros;
	}
	
	public abstract void CambiarChofer(Chofer chofer);
	
}
