/*Scrivere un programma che usi la classe Random per simulare il lancio di un
dado, visualizzando un numero casuale compreso tra 1 e 6 ogni volta che viene
eseguito.
Consigli:
Il seguente programma può essere di difficile comprensione ai neofiti della
materia perché viene introdotta la classe Random. Essa, come molte altre classi
(Scanner, Rectangle), deve essere importata dalla libreria virtuale di Java,
tramite la dicitura "import nomePacchetto.nomeClasse". Viene anche introdotta la
classe Math che va importata nello stesso modo. Si rimanda al ripasso del
capitolo 2 l’approfondimento dell’importazione di classi.*/
package Dado;

public class main {

	public static void main(String[] args) {
		
		dado d=new dado();
		
		System.out.println("Lancia 1= "+d.lancia());
		System.out.println("Lancia 2= "+d.lancia2());

	}

}
