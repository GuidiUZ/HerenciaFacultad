package herencia_ejercicio1;

public class Motocicleta extends Vehiculo {
	private int acompaniante;
	
	public Motocicleta(Chofer chofer, int kilometros, int acompaniante) {
		super(chofer, kilometros);
		this.acompaniante = acompaniante;
	}


	public void agregarAcomp(int acompaniante) {
		this.acompaniante = acompaniante;
	}


	@Override
	public void CambiarChofer(Chofer chofer) {
		
		if (acompaniante == 0) {
			setChofer(chofer);
		} else {
			System.out.println("Hay un acompañante, no puedes cambiar de chofer");
		}
	}
	
}
