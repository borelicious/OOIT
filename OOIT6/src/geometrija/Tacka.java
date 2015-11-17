package geometrija;

public class Tacka extends Oblik{
	private int x;
	private int y;
	
	public Tacka(){
		
	}
	
	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Tacka (int x, int y, String boja){
		super(boja);
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Tacka){
			Tacka pomocna = (Tacka)obj;
			if(this.x == pomocna.getX() && 
					this.y == pomocna.getY() && 
					this.getBoja().equalsIgnoreCase(pomocna.getBoja()))
				return true;
			else
				return false;
		}
		else
			return false;
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

}
