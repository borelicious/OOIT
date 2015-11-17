package geometrija;

public class Tacka {
	private int x;
	private int y;
	private String boja;
	
	public Tacka (int x, int y, String boja){
		this.x = x;
		this.y = y;
		this.boja = boja;
	}
	
	public String toString() {
		String s = "("+this.x+", "+this.y+")";
		return s;
	}
	
	public void pomeriNa(int n, int m) {
		this.x = n;
		this.y = m;
	}
	
	public void pomeriZa(int n, int m) {
		this.x += n;
		this.y += m;
	}
	
	public double udaljenost(Tacka t) {
		double u = Math.sqrt(Math.pow(x-t.getX(), 2) + Math.pow(y-t.getY(), 2));
		return u;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
}
