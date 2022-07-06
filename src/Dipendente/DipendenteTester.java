/*Progettare una classe di nome Dipendente. Tale classe prevede due variabili di
istanza una definita come nome, di tipo String e una definita come stipendio di
tipo double. Scrivere un costruttore senza parametri, un costruttore con due
parametri (nome e stipendio).La classe deve inoltre implementare i seguenti
metodi. Un metodo definito come public String getNome() che restituisce il nome
del dipendente. Un metodo definito come public double getStipendio() che
restituisce lo stipendio del dipendente. Un metodo public void
setStipendio(double nuovoStipendio) che modifica il valore dello stipendio. Un
metodo public void setNome(String nuovoNome) che cambia il nome al dipendente.
Aggiungere poi un metodo aumento(double percentuale), che incrementi lo
stipendio del dipendente secondo una certa percentuale.
Consigli:
Il seguente esercizio è simile a quelli precedenti. Lo scopo risulta
semplicemente acquisire una metodologia di lavoro.
Da notare che inizialmente al nome viene fatto assumere il valore “”: questo
significa che la stringa è vuota, perché il costruttore non ha paramentri quindi
non ci sono informazioni riguardo al nome del dipendente.*/
package Dipendente;

public class DipendenteTester {

	public static void main(String[] args) {
		
		Dipendente d = new Dipendente();
		d.setNome("Andrea");
		d.setStipendio(1000);
		d.aumento(10);
		System.out.println("Il dipendente "+d.getNome()+" percepisce uno stipendio di "+d.getStipendio());
		
		Dipendente d1 =new Dipendente("Mario", 1000);
		d1.aumento(10);
		System.out.println("Il dipendente "+d1.getNome()+" percepisce uno stipendio di "+d1.getStipendio());

	}

}
