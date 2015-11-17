package geometrija;

public class Linija {
	private Tacka tPocetna;
	private Tacka tKrajnja;
	private String boja;
	
	public Linija(Tacka tPocetna, Tacka tKrajnja, String boja){
		this.tPocetna = tPocetna;
		this.tKrajnja = tKrajnja;
		this.boja = boja;
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

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
}
