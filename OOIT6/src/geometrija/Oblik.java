package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Oblik {
	private String boja;

	public Oblik() {

	}

	public Oblik(String boja) {
		this.boja = boja;
	}

	public abstract void crtajSe(Graphics g);

	public static Color pronadjiBoju(String boja) {
		if(boja != null){
			if(boja.equalsIgnoreCase("crna"))
				return Color.BLACK;
			else if(boja.equalsIgnoreCase("plava"))
				return Color.BLUE;
			else if(boja.equalsIgnoreCase("zelena"))
				return Color.GREEN;
			else if(boja.equalsIgnoreCase("crvena"))
				return Color.RED;
			else if(boja.equalsIgnoreCase("roza"))
				return Color.PINK;
			else if(boja.equalsIgnoreCase("zuta"))
				return Color.YELLOW;
			else if(boja.equalsIgnoreCase("bela"))
				return Color.WHITE;
		}
		return Color.BLACK;

	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}


}
