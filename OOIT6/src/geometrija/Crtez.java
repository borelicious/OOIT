package geometrija;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class Crtez extends JPanel{
	ArrayList oblici = new ArrayList();
	
	public Crtez() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tacka t = new Tacka(e.getX(), e.getY());
				oblici.add(t);
			}
		});
	}

	public static void main(String[] args) {
		
		JFrame prozor = new JFrame();
		prozor.setVisible(true);
		prozor.setSize(800, 600);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setTitle("Prozor");
		
		Crtez c = new Crtez();
		prozor.getContentPane().add(c);
		//c.setBackground(Color.BLACK);
	}
	
	public void paint(Graphics g){
		//g.setColor(Color.BLUE);
		//g.drawString("Neki string", 100, 100);
		
		/*Tacka t1 = new Tacka(200, 200);
		//t1.crtajSe(g);
		
		Linija l1 = new Linija(new Tacka(300, 300), t1);
		l1.crtajSe(g);
		l1.gettPocetna().crtajSe(g);
		l1.gettKrajnja().crtajSe(g);
		l1.sredinaLinije().crtajSe(g);
		
		Kvadrat k1 = new Kvadrat(new Tacka(600, 300), 100);
		k1.crtajSe(g);
		k1.dijagonala().crtajSe(g);
		//k1.dijagonala().sredinaLinije().crtajSe(g);
		//k1.getGoreLevo().crtajSe(g);
		//k1.dijagonala().gettPocetna().crtajSe(g);
		k1.centar().crtajSe(g);
		
		Pravougaonik p1 = new Pravougaonik(t1, 200, 100);
		p1.crtajSe(g);
		//p1.dijagonala().sredinaLinije().crtajSe(g);
		p1.centar().crtajSe(g);
		
		Krug kr1 = new Krug(k1.dijagonala().sredinaLinije(), k1.getStranica()/2);
		kr1.crtajSe(g);*/
		
		Iterator it = oblici.iterator();
		while(it.hasNext()){
			Oblik o = (Oblik)it.next();
			o.crtajSe(g);
		}
		
		repaint();
	}

}
