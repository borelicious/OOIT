package geometrija;

import java.awt.Graphics;

public class Pravougaonik extends Kvadrat{
	private int visina;
	
	public Pravougaonik(Tacka goreLevo, int sirina, int visina) {
		super(goreLevo, sirina);
		this.visina = visina;
	}
	
	public Pravougaonik(Tacka goreLevo, int sirina, int visina, String boja){
		this(goreLevo, visina, sirina);
		setBoja(boja);
	}
	
	public void crtajSe(Graphics g) {
		g.drawRect(super.getGoreLevo().getX(), super.getGoreLevo().getX(), super.getStranica(), visina);
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
	
	public String toString() {
		String s = "Gornji levi ugao: " + getGoreLevo().toString() + ", sirina: " + stranica + ", visina: " + this.visina;
		return s;
	}
	
	public Linija dijagonala(){
		Linija lDijagonala = new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY()+this.visina, null),  null);
		return lDijagonala;
	}
	
	public Tacka centar(){
		Tacka srednja = dijagonala().sredinaLinije();
		return srednja;
	}
	
	public int povrsina() {
		int povrsina = stranica * this.visina;
		return povrsina;
	}
	
	public int obim() {
		int obim = 2*stranica + 2*this.visina;
		return obim;
	}
	
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}

}
