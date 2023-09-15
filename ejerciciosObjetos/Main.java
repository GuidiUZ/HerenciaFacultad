package ejerciciosObjetos;

public class Main {

	public static void main(String[] args) {
		Sube sube1 = new Sube();
		
		
		sube1.cargarSaldo(500.00);
		System.out.println(sube1.consultaSaldo());
		sube1.pagarSubte();
		System.out.println(sube1.consultaSaldo());
		sube1.pagarColectivo();
		System.out.println(sube1.consultaSaldo());
		
		
		
	}
	
}
