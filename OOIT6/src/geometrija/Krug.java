package geometrija;

public class Krug {
	private Tacka centar;
	private int radius;
	private String boja;
	
	public Krug(Tacka centar, int radius, String boja){
		this.centar = centar;
		this.radius = radius;
		this.boja = boja;
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

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
}
