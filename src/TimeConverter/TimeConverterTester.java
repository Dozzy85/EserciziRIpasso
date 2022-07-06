/*Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi,
restituisca il numero totale di secondi.
Consigli:
Si prega di osservare che un giorno ha 86400 secondi, un’ora ha 3600 secondi e
un minuto 60 secondi. Per la prima volta viene utilizzata la classe Scanner (è
necessario importarla) per la stesura del Tester, si prega di leggere gli ultimi
punti del Remind capitolo 4.*/
package TimeConverter;
import java.util.Scanner;

public class TimeConverterTester {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci il numero di Giorni=");
		int dd=in.nextInt();
		System.out.print("\nInserisci il numero di Ore=");
		int hh=in.nextInt();
		System.out.print("\nInserisci il numero di Minuti=");
		int mm=in.nextInt();
		System.out.print("Inserisci il numero di Secondi=");
		int ss=in.nextInt();
		
		TimeConverter tc=new TimeConverter(ss, mm, hh, dd);
		System.out.println("Secondi Totali="+tc.getSecTot());

	}

}
