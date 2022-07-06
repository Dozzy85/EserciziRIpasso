/*Scrivere un programma che stampi i seguenti valori:
1
10
100
1000
10000
100000
1000000
10000000
100000000
1000000000
10000000000
100000000000
Consigli:
Si rammenta, come già enunciato negli esercizi del capitolo 2, la necessità di
importare una libreria Java per poter eseguire talune operazioni: in questo
caso, sarà la classe Math. Nel caso specifico, essa sarà utile per creare
l’elevamento a potenza. Si ricorda, inoltre, di incrementare la variabile
d’istanza “exp”. Da questo esercizio in poi i Tester saranno privi di commenti.*/
package PowerGenerator;

public class PowerGeneratorTester {

	public static void main(String[] args) {
		
		PowerGenerator p=new PowerGenerator();
		p.setBase(10);
		
		for(int i=0;i<12;i++) {
			System.out.println(p.nextPow());
		}

	}

}
