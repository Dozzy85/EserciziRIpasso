/*Es. 3.1: scrivere un programma che costruisca un conto bancario chiamato
harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e
infine visualizzi il saldo rimanente.
Il programma deve poi creare un altro conto bancario chiamato momsSaving,
utilizzando il costruttore che inizializza la variabile balance.
Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito
del quale viene stampato il saldo.
Consigli:
Il programma non presenta particolari difficoltà. Si invita a rivedere i
consigli dell’esercizio sul rettangolo.*/
package BankAccount;

public class main {

	public static void main(String[] args) {
		
		harrysChecking hc=new harrysChecking(0);
		hc.deposita(1000);
		hc.preleva(500);
		hc.preleva(400);
		hc.stampaSaldo();
		
		harrysChecking momsSaving= new harrysChecking(1000);
		momsSaving.interesse(10);
		momsSaving.stampaSaldo();

	}

}
