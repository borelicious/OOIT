package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class VezbaWB extends JFrame {
	private JTextField txtTekst;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private DefaultListModel dlm = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VezbaWB frame = new VezbaWB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VezbaWB() {
		getContentPane().setBackground(Color.PINK);
		setTitle("Vezba Windows Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		JPanel pnlOsnovni = new JPanel();
		pnlOsnovni.setBounds(10, 11, 764, 539);
		getContentPane().add(pnlOsnovni);
		pnlOsnovni.setLayout(null);
		
		JLabel lblTekst = new JLabel("Jedan kreativan tekst!");
		lblTekst.setBounds(360, 109, 205, 14);
		pnlOsnovni.add(lblTekst);
		
		txtTekst = new JTextField();
		txtTekst.setBounds(360, 158, 181, 20);
		pnlOsnovni.add(txtTekst);
		txtTekst.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 209, 468);
		pnlOsnovni.add(scrollPane);
		
		JList lstImena = new JList();
		scrollPane.setViewportView(lstImena);
		lstImena.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lstImena.setModel(dlm);
		
		JButton btnTest = new JButton("Dugme");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sakrili ste labelu!");
				lblTekst.setVisible(false);;
			}
		});
		btnTest.setBounds(229, 105, 89, 23);
		pnlOsnovni.add(btnTest);
		
		JLabel lblNaslov = new JLabel("Naslov");
		lblNaslov.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNaslov.setBounds(327, 11, 93, 23);
		pnlOsnovni.add(lblNaslov);
		
		JButton btnPostaviTekst = new JButton("Postavi tekst");
		btnPostaviTekst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTekst.setText(txtTekst.getText());
			}
		});
		btnPostaviTekst.setBounds(229, 157, 95, 23);
		pnlOsnovni.add(btnPostaviTekst);
		
		JLabel lblIvanovic = new JLabel("");
		lblIvanovic.setBounds(360, 251, 181, 14);
		pnlOsnovni.add(lblIvanovic);
		
		JLabel lblMatic = new JLabel("");
		lblMatic.setBounds(360, 285, 181, 14);
		pnlOsnovni.add(lblMatic);
		
		JLabel lblKolarov = new JLabel("");
		lblKolarov.setBounds(360, 319, 181, 14);
		pnlOsnovni.add(lblKolarov);
		
		JToggleButton tglIvanovic = new JToggleButton("Ivanovic");
		buttonGroup.add(tglIvanovic);
		tglIvanovic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIvanovic.setVisible(true);
				lblIvanovic.setText("Branislav Ivanovic");
				lblMatic.setVisible(false);
				lblKolarov.setVisible(false);
				dlm.addElement("Branislav Ivanovic");
			}
		});
		tglIvanovic.setBounds(229, 247, 121, 23);
		pnlOsnovni.add(tglIvanovic);
		
		JToggleButton tglMatic = new JToggleButton("Matic");
		buttonGroup.add(tglMatic);
		tglMatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMatic.setVisible(true);
				lblMatic.setText("Nemanja Matic");
				lblIvanovic.setVisible(false);
				lblKolarov.setVisible(false);
				dlm.addElement("Nemanja Matic");
			}
		});
		tglMatic.setBounds(229, 281, 121, 23);
		pnlOsnovni.add(tglMatic);
		
		JToggleButton tglKolarov = new JToggleButton("Kolarov");
		buttonGroup.add(tglKolarov);
		tglKolarov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblKolarov.setVisible(true);
				lblKolarov.setText("Aca Kolarov");
				lblIvanovic.setVisible(false);
				lblMatic.setVisible(false);
				dlm.addElement("Aca Kolarov");
			}
		});
		tglKolarov.setBounds(229, 315, 121, 23);
		pnlOsnovni.add(tglKolarov);
		
		JButton btnBriseListu = new JButton("Obrisi");
		btnBriseListu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBriseListu.setBounds(71, 490, 89, 23);
		pnlOsnovni.add(btnBriseListu);
		
		JButton btnPravougaonik = new JButton("Pravougaonik");
		btnPravougaonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgPravougaonik dlgp = new DlgPravougaonik();
				
				dlgp.setVisible(true);
				
				System.out.println("Visina: " + dlgp.visina + "\nSirina: " + dlgp.sirina + "\nBoja: " + dlgp.boja);
			}
		});
		btnPravougaonik.setBounds(583, 490, 171, 23);
		pnlOsnovni.add(btnPravougaonik);
		
		
		
	}
}
