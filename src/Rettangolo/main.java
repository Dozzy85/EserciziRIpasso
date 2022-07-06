/*Si costruisce un rettangolo partendo da una base, un’altezza e dalle coordinate
del piano.
Consigli:
Per chi si affaccia per la prima volta al panorama della programmazione
d’informatica, può risultare difficile la risoluzione di tale problema. Si
cerchi, quindi, di comprendere ogni passaggio:
- costruttore: ne sono presenti due. Il primo crea un rettangolo con le
dimensioni definite, il secondo, invece, permette all’utente di assegnare
i valori.*/
package Rettangolo;

public class main {

	public static void main(String[] args) {
		
		Rettangolo r1=new Rettangolo();
		System.out.println("Il perimetro del triangolo è: " +r1.getPerimetro());
		System.out.println("L'area del triangolo è: " +r1.getArea());
		
		Rettangolo r2=new Rettangolo(5,3,9,2);
		System.out.println("Il perimetro del triangolo è: " +r2.getPerimetro());
		System.out.println("L'area del triangolo è: " +r2.getArea());
	}

}
