package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public class Kvadrat extends PovrsinskiOblik{
	private Tacka goreLevo;
	protected int stranica;


	public Kvadrat(){

	}

	public Kvadrat(Tacka goreLevo, int stranica){
		this.goreLevo = goreLevo;
		this.stranica = stranica;

	}

	public Kvadrat(Tacka goreLevo, int stranica, String boja){
		setBoja(boja);
		this.goreLevo = goreLevo;
		this.stranica = stranica;

	}

	public void selektovan(Graphics g){
		g.setColor(Color.BLUE);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY())).selektovan(g);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+stranica)).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY()), dijagonala().gettKrajnja()).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+stranica), dijagonala().gettKrajnja()).selektovan(g);



	}



	public boolean sadrzi(int x, int y) {
		if (x >= goreLevo.getX() && x <= goreLevo.getX() + stranica 
				&& y >= goreLevo.getY() && y <= goreLevo.getY() + stranica)
			return true;
		else
			return false;
	}

	public void popuni(Graphics g) {
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillRect(goreLevo.getX() + 1, goreLevo.getY() + 1, stranica - 1, stranica - 1);
	}


	public void crtajSe(Graphics g) {
		g.setColor(pronadjiBoju(getBoja()));
		g.drawRect(goreLevo.getX(), goreLevo.getY(), stranica, stranica);

		if(isSelektovan())
			selektovan(g);
	}

	public boolean equals(Object obj){
		if(obj instanceof Kvadrat){
			Kvadrat pomocna = (Kvadrat) obj;
			if (this.goreLevo.equals(pomocna.goreLevo) && this.stranica==pomocna.stranica)
				return true;
			else
				return false;
		}
		else 
			return false;
	}	


	public String toString(){
		String s = "Gornji levi ugao = " +goreLevo+", stranica = "+stranica;
		return s;
	}

	public Linija dijagonala() {
		Tacka doleDesno = new Tacka(goreLevo.getX() + stranica, goreLevo.getY() + stranica);
		Linija d = new Linija(goreLevo, doleDesno);
		return d;
	}

	public Tacka centar() {
		Tacka srednja = dijagonala().sredinaLinije();
		return srednja;
	}

	public double obim() {
		int o = 4 * stranica;
		return o;
	}
	public double povrsina() {
		int p = stranica * stranica;
		return p;
	}

	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public int getStranica() {
		return stranica;
	}
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}




}
