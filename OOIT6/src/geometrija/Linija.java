package geometrija;

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
	
	public boolean equals(Object obj){
		if(obj instanceof Linija){
			Linija pomocna = (Linija)obj;
			if(this.tPocetna == pomocna.gettPocetna() && 
					this.tKrajnja == pomocna.gettKrajnja() && 
					this.getBoja().equalsIgnoreCase(pomocna.getBoja()))
				return true;
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
	
	public Tacka sredinaLinije() {
		Tacka tSredina = new Tacka((this.tPocetna.getX()-this.tKrajnja.getX())/2, (this.tPocetna.getY()-this.tKrajnja.getY())/2, null);
		return tSredina;
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
