package herencia_ejercicio1;

public class Colectivo extends Vehiculo {
	private int pasajeros;
	
	public Colectivo(Chofer chofer, int kilometros, int pasajeros) {
		super(chofer, kilometros);
		this.pasajeros = pasajeros;
	}



	public void agregarPasajeros(int cantPasajeros) {
		pasajeros = cantPasajeros;
	}
	
	

	@Override
	public void CambiarChofer(Chofer chofer) {
	
		if (pasajeros == 0) {
			setChofer(chofer);
		} else {
			System.out.println("Hay pasajeros, no puedes cambiar de chofer");
		}
	}
	
}
