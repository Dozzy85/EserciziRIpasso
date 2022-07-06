package Cellulare;

public class Cellulare {
	
	private double carica;
	private int numeroChiamate;
	
	public Cellulare(double carica) {
		this.carica = carica;
	}
	
	public void ricarica(double unaRicarica) {
		carica += unaRicarica;
	}
	
	public void chiama(double minutiDurata) {
		this.numeroChiamate++;
		this.carica=this.carica-(minutiDurata*0.20);
	}
	
	public double numero404() {
		return carica;
	}
	
	public int getNumeroChiamate() {
		return numeroChiamate;
	}
	
	public void azzeraChiamate() {
		numeroChiamate=0;
	}

}
