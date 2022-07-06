package BankAccount;

public class harrysChecking {
	
	private double saldo;

	public harrysChecking(double saldo) throws IllegalArgumentException {
		if(saldo<0)
			throw new IllegalArgumentException("Saldo negativo");
		this.saldo = saldo;
	}
	
	public void deposita(double somma) {
		if(somma<=0) 
			throw new IllegalArgumentException("La somma da versare deve essere maggiore di 0");
		saldo+=somma;
	}
	
	public void preleva (double somma) {
		if(saldo<=0)
			throw new IllegalArgumentException("Il saldo è minore o uguale a 0");
		saldo-=somma;
	}
	
	public void stampaSaldo() {
		System.out.println("Il saldo rimanente è di: "+saldo);
	}
	
	public void interesse(int rate) {
		saldo = saldo+((saldo*rate)/100);
		
	}
	
	
	
}
