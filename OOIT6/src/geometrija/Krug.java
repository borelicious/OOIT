package geometrija;

import java.awt.Graphics;

public class Krug extends Oblik{
	private Tacka centar;
	private int radius;
	
	public Krug(){
		
	}
	
	public Krug(Tacka centar, int radius){
		this.centar = centar;
		this.radius = radius;
	}
	
	public Krug(Tacka centar, int radius, String boja){
		super(boja);
		this.centar = centar;
		this.radius = radius;
	}
	
	
	public void crtajSe(Graphics g) {
		g.drawOval(centar.getX() - radius, centar.getY() - radius, 2*radius, 2*radius);
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
	
	public String toString() {
		String s = "Centar: " + this.centar.toString() + ", poluprecnik: " + this.radius;
		return s;
	}
	
	public double obim() {
		double obim = 2* this.radius * Math.PI;
		return obim;
	}
	
	public double povrsina() {
		double povrsina = Math.pow(this.radius, 2) * Math.PI;
		return povrsina;
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
