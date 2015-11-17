package geometrija;

public class Test {

	public static void main(String[] args) {/*
		
		// Rad sa tackama
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka();
		Tacka t3 = new Tacka();
		Tacka t4 = new Tacka();
		Tacka t5 = new Tacka();
		Tacka t6 = new Tacka();
		
		t1.setX(10);
		t1.setY(15);
		
		t2.setX(100);
		t2.setY(50);
		
		t3.setX(56);
		t3.setY(13);
		
		t4.setX(85);
		t4.setY(90);
		
		t5.setX(185);
		t5.setY(190);
		
		t6.setX(18);
		t6.setY(19);
		
		System.out.println("X koord t1 je: " + t1.getX());
		System.out.println("Y koord t1 je: " + t1.getY());
		
		t1.pomeriNa(5, 40);
		
		System.out.println("X: " + t1.getX() + " Y: " + t1.getY());
		
		t1.pomeriZa(10, -20);
		
		System.out.println("X: " + t1.getX() + " Y: " + t1.getY());
		
		System.out.println("Udaljenost tacke [" + t1.getX() + ", " + t1.getY() + "] od tacke [" + t2.getX() + ", " + t2.getY() + "] je: " + t1.udaljenost(t2));

		t1.setX(t2.getY());
		System.out.println("\nX koordinata t1 je: " + t1.getX());
		
		System.out.println("X koord t1 je: " + t1.getX());
		System.out.println("Y koord t1 je: " + t1.getY());
		
		System.out.println("X koord t2 je: " + t2.getX());
		System.out.println("Y koord t2 je: " + t2.getY());
		
		t1.pomeriNa(t1.getY(), t1.getX()+t2.getX());
		
		System.out.println("X koord t1 posle pomeranja je: " + t1.getX());
		System.out.println("Y koord t1 posle pomeranja je: " + t1.getY());
		
		
		// Rad sa linijama
		Linija l1 = new Linija();
		Linija l2 = new Linija();
		
		l1.settPocetna(t1);
		l1.settKrajnja(t2);
		
		l2.settPocetna(t3);
		l2.settKrajnja(t4);
		
		System.out.println("X koord pocetne tacke linije je: " + l1.gettPocetna().getX() );
		System.out.println("Y koord pocetne tacke linije je: " + l1.gettPocetna().getY() );
		
		System.out.println("X koord krajnje tacke linije je: " + l1.gettKrajnja().getX() );
		System.out.println("Y koord krajnje tacke linije je: " + l1.gettKrajnja().getY() );
		
		l1.gettPocetna().setX(l1.gettKrajnja().getY());
		
		System.out.println("\nX koord pocetne tacke linije je: " + l1.gettPocetna().getX());
		
		System.out.println("\nDuzina linije je: " + l1.duzinaLinije());
		
		// Rad sa pravougaonikom
		Pravougaonik p1 = new Pravougaonik();
		
		p1.setGoreLevo(t1);
		p1.setSirina((int)l1.duzinaLinije());
		p1.setVisina((int)l2.duzinaLinije());
		
		System.out.println("\nObim pravougaonika je: " + p1.obim() + ", a povrsina je: " + p1.povrsina());
		System.out.println("X koord tacko gore levo je: " + p1.getGoreLevo().getX() + "\nY koord tacke gore levo je:" + p1.getGoreLevo().getY());
		System.out.println("\nSirina pravougaonika je: " + p1.getSirina() + ", a visina je: " + p1.getVisina());
		
		// Rad sa kvadratom
		Kvadrat k1 = new Kvadrat();
		
		k1.setGoreLevo(t5);
		k1.setStranica(10);
		
		System.out.println("\nObim kvadrata je: " + k1.obim() + ", a povrsina je: " + k1.povrsina());
		System.out.println("X koord tacko gore levo je: " + k1.getGoreLevo().getX() + "\nY koord tacke gore levo je:" + k1.getGoreLevo().getY());
		
		// Rad sa krugom
		Krug kr1 = new Krug();
		
		kr1.setCentar(t6);
		kr1.setRadius(10);
		
		System.out.println("\nObim kruga je: " + kr1.obim()+ ", a povrsina je: " + kr1.povrsina());
		System.out.println("X koord centra kruga je: " + kr1.getCentar().getX() + "\nY koord centra kruga je:" + kr1.getCentar().getY());
		
		
		l1.gettPocetna().setY((int)kr1.povrsina()+k1.obim());
		System.out.println("\nY koord linije l1: " + l1.gettPocetna().getY());
	*/
	
		// Tacke
		Tacka t5 = new Tacka(12, 30, "zelena");
		System.out.println("X: " + t5.getX() + " Y: " + t5.getY() + " boja: " + t5.getBoja());
		
		Tacka t6 = new Tacka(5, 300, "plava");
		System.out.println("Boja tacke je " + t6.getBoja());
		
		// Linije
		Linija l5 = new Linija(t5, t6, null);
		System.out.println("Y koord pocetne tacke linije: " + l5.gettPocetna().getY());
		System.out.println("Boja krajnje tacke linije je " + l5.gettKrajnja().getBoja());
		
		Linija l6 = new Linija(t6, t5, "zuta");
		System.out.println("Boja linije je " + l6.getBoja());
		
		Linija l7 = new Linija(new Tacka(50, 100, "siva"), t5, "crvena");
		System.out.println("X koord pocetne tacke l7 je: " + l7.gettPocetna().getX());
		
		Linija l8 = new Linija(new Tacka(75, 85, null),  new Tacka(t5.getX(), t6.getY(), null), t6.getBoja());
		System.out.println("Y koord krajnje tacke linije: " + l8.gettKrajnja().getY());
		
		l8.gettPocetna().setBoja(t6.getBoja());
		System.out.println("Boja pocetne tacke linije je " + l8.gettPocetna().getBoja());
		
		// Pravougaonik
		Pravougaonik p5 = new Pravougaonik(new Tacka(t5.getX()+t6.getY(), t5.getY()-t6.getY(), l8.getBoja()), (int)l7.duzinaLinije(), (int)t5.udaljenost(t6), l8.gettKrajnja().getBoja());
		
		// Kvadrat
		Kvadrat k5 = new Kvadrat(t5, (int)l8.duzinaLinije(), p5.getBoja());
		
		// Krug
		//Krug kr1 = new Krug(t6, (int)l7.duzinaLinije(), "golubije siva");
		
		// Vezba
		System.out.println("X koord sredisne tacke linije l8 je: " + l8.sredinaLinije().getX());
		System.out.println("X koord krajnje tacke dijagoale pravougaonika p5 je: " + p5.dijagonala().gettKrajnja().getX());
		System.out.println("Sredina kvadrata [" + k5.centar().getX() + ", " + k5.centar().getY()+ "]");
		
		System.out.println(t5.toString());
		System.out.println(l5.toString());
		
		//t5 = t6;
		
		System.out.println(t5.equals(t6));
	
	
	}

}
