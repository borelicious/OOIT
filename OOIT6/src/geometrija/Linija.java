package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public class Linija extends Oblik implements Comparable{
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
	
	public int compareTo(Object o){
		Linija nova = (Linija) o;
		return (int) (this.duzina() - nova.duzina());
	}

	public void selektovan(Graphics g){
		g.setColor(Color.BLUE);
		tPocetna.selektovan(g);
		tKrajnja.selektovan(g);
		sredinaLinije().selektovan(g);
	}



	public void crtajSe(Graphics g) {
		g.setColor(pronadjiBoju(getBoja()));
		g.drawLine(tPocetna.getX(), tPocetna.getY(), tKrajnja.getX(), tKrajnja.getY());

		if(isSelektovan())
			selektovan(g);
		
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


	public String toString(){
		String s = tPocetna+"-->"+tKrajnja;
		return s;
	}

	public Tacka sredinaLinije(){
		int sredinaX = (tPocetna.getX() + tKrajnja.getX()) / 2;
		int sredinaY = (tPocetna.getY() + tKrajnja.getY()) / 2;
		Tacka sredina = new Tacka(sredinaX,sredinaY);
		return sredina;
	}

	public void pomeriZa(int poX, int poY){
		tPocetna.pomeriZa(poX, poY);
		tKrajnja.pomeriZa(poX, poY);
	}

	public double duzina(){
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
