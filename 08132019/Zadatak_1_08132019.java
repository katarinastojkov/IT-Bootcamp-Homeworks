package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		/*Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), 
		 * post dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati kako koji primer funkcionise. 
		 * Napisati po 2 primera o svakom.
		 */
		Scanner sc = new Scanner(System.in);
				
		int i=5, j=3, k=4; //I primer od 4 inkrementa
		
		j=++i;
		/* Ovo je pre increment - prvo povecavamo i za 1, a onda uzimamo vrednost i ubacujemo u j.
		 * i+1=5+1=6 i sada je j=6, (k=4).
		 * */
		
		i=k++;
		/*Ovo je post increment - prvo uzimamo vrednost iz k i smestamo u i, a onda k povecavamo za 1.
		 *i je bilo 6 (prethodna linija), a sad postaje 4, a k koje je bilo 4 povecavamo za 1 i ono postaje 5.
		 */
		
		k=--j;
		/*Ovo je pre decrement - prvo smanjujemo j za 1, a onda uzimamo vrednost j i ubacujemo u k.
		 * I primer: j postaje 5 zbog (6-1), a onda tu vrednost ubacujemo u k i k postaje 5, (i=4).
		 * */
		j=i--;
		/* Ovo je post decrement - prvo uzimamo vrednost i i smestamo u j, a onda smanjujemo i za 1.
		 * i=3, j=4, (k=5);
		 */
		
		
		int a=10, b=6, c=2;; //II primer od 4 inkrementa
		b=++a;
		// Prvo a povecamo za 1 => 11 i tu vrednost smestamo u b, pa tako b postaje 11, (c=2).
		
		a=c++;
		// a=2, c=3, (b=11).
		
		c=--b;
		// b=10, c=10, (a=2).
		
		b=a--;
		// b=2, a=1, (c=10).
	}

}
