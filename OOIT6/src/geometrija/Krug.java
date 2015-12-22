package geometrija;

import java.awt.Graphics;

public class Krug extends PovrsinskiOblik{
	private Tacka centar;
	private int radius;

	public Krug(){

	}

	public Krug(Tacka centar, int radius){
		this.centar = centar;
		this.radius = radius;

	}

	public Krug(Tacka centar, int radius, String boja){
		setBoja(boja);
		this.centar = centar;
		this.radius = radius;
	}
	
	public void selektovan(Graphics g)
	{
		new Linija(new Tacka(centar.getX(), centar.getY()-radius), new Tacka(centar.getX(), centar.getY() + radius)).selektovan(g);
		new Linija(new Tacka(centar.getX()-radius, centar.getY()), new Tacka(centar.getX()+radius, centar.getY())).selektovan(g);
	}

	public void popuni(Graphics g) {
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillOval(centar.getX()-radius+1, centar.getY()-radius+1, 
				2*radius-2, 2*radius-2);
	}


	public boolean sadrzi(int x, int y) {
		if(centar.udaljenost(new Tacka(x,y))<radius)
			return true;
		else
			return false;
	}



	public void crtajSe(Graphics g) {
		g.setColor(pronadjiBoju(getBoja()));
		g.drawOval(centar.getX() - radius, centar.getY() - radius, 2*radius, 2*radius);
		if(isSelektovan())
			selektovan(g);
	}


	public boolean equals(Object obj){
		if(obj instanceof Krug){
			Krug pomocni = (Krug)obj;
			if(this.getCentar().equals(pomocni.getCentar()) && 
					this.getRadius() == pomocni.getRadius())
				return true;
		}
		return false;
	}

	public String toString(){
		String s = "Centar = " +centar+", poluprecnik = "+radius;
		return s;
	}

	public double obim() {
		return 2*radius*Math.PI;
	}

	public double povrsina() {
		return radius * radius * Math.PI;
	}

	public Tacka getCentar() {
		return centar;
	}
	public void setCentar(Tacka centar) {
		this.centar = centar;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}





}
