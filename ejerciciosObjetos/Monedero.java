package ejerciciosObjetos;

public class Monedero {
	
	private Double pesos;
	
	public Monedero (double pesos) {
		this.pesos = pesos;
	}
	
	
	public Double consultarSaldo() {
		return pesos;
	}
	
	
	public void ingresarDinero(double monto) {
		pesos += monto;
	}
	
	
	public void retirarDinero (double montoRetiro) {
		if (montoRetiro > pesos) {
			System.out.println("No posee fondos");
		} else {
			pesos -= montoRetiro;
		}
		
	}
	

	public static void main(String[] args) {
		
		
		Monedero billetera = new Monedero(0.0);
		System.out.println(billetera.consultarSaldo());
		billetera.ingresarDinero(1000.0);
		System.out.println(billetera.consultarSaldo());
		billetera.retirarDinero(300.0);
		System.out.println(billetera.consultarSaldo());
		billetera.retirarDinero(1300.0);
		billetera.retirarDinero(300.0);
		System.out.println(billetera.consultarSaldo());
		
		
	}
	
}
