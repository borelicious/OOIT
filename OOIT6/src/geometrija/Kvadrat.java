package geometrija;

import java.awt.Graphics;

public class Kvadrat extends Oblik{
	private Tacka goreLevo;
	protected int stranica;
	
	public Kvadrat(){
		
	}
	
	public Kvadrat(Tacka goreLevo, int stranica){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
	}
	
	public Kvadrat(Tacka goreLevo, int stranica, String boja){
		super(boja);
		this.goreLevo = goreLevo;
		this.stranica = stranica;
	}
	
	
	public void crtajSe(Graphics g) {
		g.drawRect(goreLevo.getX(), goreLevo.getY(), stranica, stranica);
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
	
	
	public String toString() {
		String s = "Gornji levi ugao= " + this.goreLevo.toString() + ", stranica= " + this.stranica;  
		return s;
	}
	
	public Linija dijagonala(){
		Linija lDijagonala = new Linija(this.goreLevo, new Tacka(this.goreLevo.getX()+this.stranica, this.goreLevo.getY()+this.stranica, null),  null);
		return lDijagonala;
	}
	
	public Tacka centar(){
		Tacka srednja = dijagonala().sredinaLinije();
		return srednja;
	}
	
	public int povrsina() {
		int povrsina = (int)Math.pow(this.stranica, 2);
		return povrsina;
	}
	
	public int obim() {
		int obim = 2*this.stranica;
		return obim;
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
