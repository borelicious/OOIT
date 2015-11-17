package geometrija;

public class Pravougaonik {
	private Tacka goreLevo;
	private int sirina;
	private int visina;
	private String boja;
	
	public Pravougaonik(Tacka goreLevo, int sirina, int visina, String boja){
		this.goreLevo = goreLevo;
		this.sirina = sirina;
		this.visina = visina;
		this.boja = boja;
	}
	
	public String toString() {
		String s = "Gornji levi ugao: " + this.goreLevo.toString() + ", sirina: " + this.sirina + ", visina: " + this.visina;
		return s;
	}
	
	public Linija dijagonala(){
		Linija lDijagonala = new Linija(this.goreLevo, new Tacka(this.goreLevo.getX()+this.sirina, this.goreLevo.getY()+this.visina, null),  null);
		return lDijagonala;
	}
	
	public Tacka centar(){
		Tacka srednja = dijagonala().sredinaLinije();
		return srednja;
	}
	
	public int povrsina() {
		int povrsina = this.sirina * this.visina;
		return povrsina;
	}
	
	public int obim() {
		int obim = 2*this.sirina + 2*this.visina;
		return obim;
	}
	
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
}
