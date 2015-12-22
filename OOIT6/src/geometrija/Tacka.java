package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public class Tacka extends Oblik implements Comparable{
	private int x;
	private int y;

	public Tacka(){

	}

	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Tacka(int x, int y, String boja){
		super(boja);
		this.x = x;
		this.y = y;

	}


	public int compareTo(Object o) {
		Tacka nova = (Tacka) o;
		Tacka nula = new Tacka(0, 0);
		return (int) (this.udaljenost(nula) - nova.udaljenost(nula));
	}

	public void selektovan(Graphics g){
		g.setColor(Color.BLUE);
		g.drawRect(x-3, y-3, 6, 6);
	}

	public void crtajSe(Graphics g) {
		g.setColor(pronadjiBoju(getBoja()));
		g.drawLine(x, y-2, x, y+2);
		g.drawLine(x-2, y, x+2, y);

		if(isSelektovan())
			selektovan(g);
	}

	public boolean equals(Object obj){
		if (obj instanceof Tacka){
			Tacka pomocna = (Tacka) obj;
			if (this.x == pomocna.getX() &&
					this.y == pomocna.getY())
				return true;
			else 
				return false;

		}
		else 
			return false;
	}

	public String toString(){
		String s = "("+this.x+","+this.y+")";

		return s;
	}

	public void pomeriNa(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void pomeriZa(int x, int y){
		this.x += x;
		this.y = this.y + y;
	}

	public double udaljenost (Tacka t){
		int dx = this.x - t.getX();
		int dy = this.y - t.y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}

	public int getX() {
		return x;
	}
	public void setX(int novoX) {
		x = novoX;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}




}
