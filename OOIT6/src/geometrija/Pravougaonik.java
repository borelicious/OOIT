package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public class Pravougaonik extends Kvadrat{
	private int visina;

	public Pravougaonik(){

	}

	public Pravougaonik(Tacka goreLevo, int sirina, int visina){
		super(goreLevo, sirina);
		this.visina = visina;
	}

	public Pravougaonik(Tacka goreLevo, int sirina, int visina, String boja){
		this(goreLevo,sirina, visina);
		setBoja(boja);

	}

	public void selektovan(Graphics g){
		g.setColor(Color.BLUE);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY())).selektovan(g);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+visina)).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY()), dijagonala().gettKrajnja()).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+visina), dijagonala().gettKrajnja()).selektovan(g);



	}
	public void crtajSe(Graphics g) {
		if(isSelektovan())
			selektovan(g);
		g.setColor(pronadjiBoju(getBoja()));
		g.drawRect(getGoreLevo().getX(),getGoreLevo().getY(),getStranica(),visina);
	}

	public boolean equals(Object obj){
		if(obj instanceof Pravougaonik){
			Pravougaonik pomocna = (Pravougaonik) obj;
			if (super.getGoreLevo().equals(pomocna.getGoreLevo()) && this.visina==pomocna.visina && super.stranica == pomocna.stranica)
				return true;
			else
				return false;
		}
		else 
			return false;
	}	



	public String toString(){
		String s = "Gornji levi ugao = " +getGoreLevo()+", sirina = "+stranica+", visina = "+visina;
		return s;
	}

	public Linija dijagonala() {
		int doleDesnoX = getGoreLevo().getX() + getStranica();
		int doleDesnoY = getGoreLevo().getY() + visina;
		Linija d = new Linija(getGoreLevo(), new Tacka(doleDesnoX,doleDesnoY));
		return d;
	}

	public Tacka centar(){
		Tacka srednja = dijagonala().sredinaLinije();
		return srednja;
	}

	public double obim() {
		int o = 2 * getStranica() + 2 * visina;
		return o;
	}
	public double povrsina() {
		int p = visina * getStranica();
		return p;
	}


	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}




}
