package DistributoreBenzina;
import Car.*;

public class DistributoreBenzina {
	
	private double deposito;
	private double euroPerLitro;
	
	public DistributoreBenzina(double euroPerLitro) {
		this.deposito = 0;
		this.euroPerLitro = euroPerLitro;
	}
	
	public void rifornisci(double unaQuantita) {
		deposito += unaQuantita;
	}
	
	public void vendi(double euro, Car unaAutomobile) {
		double rifornimeto = (euro/euroPerLitro);
		deposito -= rifornimeto;
		unaAutomobile.addGas(rifornimeto);
	}
	
	public void aggiorna(double unPrezzoPerLitro) {
		euroPerLitro=unPrezzoPerLitro;
	}

	public double getDeposito() {
		return deposito;
	}
	
	

}
