package geometrija;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		// Tacke
		Tacka t1 = new Tacka(12, 30, "zelena");
		System.out.println("X: " + t1.getX() + " Y: " + t1.getY() + " boja: " + t1.getBoja());

		Tacka t2 = new Tacka(5, 300, "plava");
		System.out.println("Boja tacke je " + t2.getBoja());

		// Linije
		Linija l1 = new Linija(t1, t2, null);
		System.out.println("Y koord pocetne tacke linije: " + l1.gettPocetna().getY());
		System.out.println("Boja krajnje tacke linije je " + l1.gettKrajnja().getBoja());

		Linija l2 = new Linija(t1, t2, "zuta");
		System.out.println("Boja linije je " + l2.getBoja());

		Linija l3 = new Linija(new Tacka(50, 100, "siva"), t1, "crvena");
		System.out.println("X koord pocetne tacke l7 je: " + l3.gettPocetna().getX());

		Linija l4 = new Linija(new Tacka(75, 85, null),  new Tacka(t1.getX(), t2.getY(), null), t2.getBoja());
		System.out.println("Y koord krajnje tacke linije: " + l4.gettKrajnja().getY());

		l4.gettPocetna().setBoja(t2.getBoja());
		System.out.println("Boja pocetne tacke linije je " + l4.gettPocetna().getBoja());


		Linija nizLinija[] = new Linija[3];
		nizLinija[0] = l1;
		nizLinija[1] = l2;
		nizLinija[2] = l3;

		/*for(int i = 0; i< nizLinija.length; i++){
			System.out.println(nizLinija[i]);
		}

		Arrays.sort(nizLinija);

		for(int i = 0; i< nizLinija.length; i++){
			System.out.println(nizLinija[i]);
		}*/
		
		ArrayList lista = new ArrayList();
		
		lista.add("Ovo je neki string!");
		lista.add(l2);
		lista.add(t2);
		
		Iterator it = lista.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}

