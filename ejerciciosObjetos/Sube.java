package ejerciciosObjetos;

public class Sube {

	private Double saldo = 00.0;
	
	public Double SALDO_NEGATIVO_MAX = -300.00;
	public Double BOLETO_SUBTE = 200.00;
	public Double BOLETO_TREN = 150.00;
	public Double BOLETO_COLECTIVO = 100.00;
	public Double DESCUENTO_ESTUDIANTIL = 50.00;
	public Double DESCUENTO_JUBILADO = 80.00;
	
	
	public Sube() {
		this.saldo = 100.00;
	}
	
	public Sube(double saldo) {
		this.saldo = saldo;
	}
	
	
	public Double consultaSaldo() {
		return saldo;
	}
	
	
	public void cargarSaldo(Double pesos) {
		saldo += pesos;
	}
	
	
	private boolean pagarBoleto(Double monto) {
		if (saldo - monto >= SALDO_NEGATIVO_MAX) {
			saldo -= monto ;
			return true;
		}
		return false;
	}
	
	
	public void pagarSubte() {
		pagarBoleto(BOLETO_SUBTE);
	}
	
	public void pagarTren() {
		pagarBoleto(BOLETO_TREN);
	}
	
	public void pagarColectivo() {
		pagarBoleto(BOLETO_COLECTIVO);
	}
	
	

}
