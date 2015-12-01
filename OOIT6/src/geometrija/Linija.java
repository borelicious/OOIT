package geometrija;

import java.awt.Graphics;

public class Linija extends Oblik{
	private Tacka tPocetna;
	private Tacka tKrajnja;
	
	public Linija(){
		
	}
	
	public Linija(Tacka tPocetna, Tacka tKrajnja){
		this.tPocetna = tPocetna;
		this.tKrajnja = tKrajnja;
	}
	
	public Linija(Tacka tPocetna, Tacka tKrajnja, String boja){
		super(boja);
		this.tPocetna = tPocetna;
		this.tKrajnja = tKrajnja;
	}
	
	
	public void crtajSe(Graphics g) {
		g.drawLine(tPocetna.getX(), tPocetna.getY(), tKrajnja.getX(), tKrajnja.getY());
	}

	
	public boolean equals(Object obj) {
		if (obj instanceof Linija) {
			Linija pomocna = (Linija) obj;
			if (tPocetna.equals(pomocna.tPocetna) 
					&& tKrajnja.equals(pomocna.tKrajnja)) {

				if (this.getBoja()== null && pomocna.getBoja() == null)
					return true;
				else if (this.getBoja()!= null && pomocna.getBoja()!=null){
					if(this.tPocetna.getBoja().equalsIgnoreCase(pomocna.tKrajnja.getBoja()))
						return true;
					else
						return false;
				}
				else
					return false;

			}
			else
				return false;
		}
		else 
			return false;
	}
	
	public String toString() {
		String s = this.tPocetna.toString()+" --> "+ this.tKrajnja.toString();
		return s;
	}
	
	public Tacka sredinaLinije(){
		int sredinaX = (tPocetna.getX() + tKrajnja.getX()) / 2;
		int sredinaY = (tPocetna.getY() + tKrajnja.getY()) / 2;
		Tacka sredina = new Tacka(sredinaX,sredinaY);
		return sredina;
	}
	
	public void pomeriZa(int poX, int poY) {
		tPocetna.pomeriZa(poX, poY);
		tKrajnja.pomeriZa(poX, poY);
	}
	
	public double duzinaLinije() {
		double d;
		d = tPocetna.udaljenost(tKrajnja);
		return d;
	}
	
	public Tacka gettPocetna() {
		return tPocetna;
	}
	public void settPocetna(Tacka tPocetna) {
		this.tPocetna = tPocetna;
	}
	public Tacka gettKrajnja() {
		return tKrajnja;
	}
	public void settKrajnja(Tacka tKrajnja) {
		this.tKrajnja = tKrajnja;
	}

}
