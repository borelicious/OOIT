package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class LicniPodaci extends JFrame {

	private JPanel contentPane;
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtJMBG;
	private JButton btnPodaci;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LicniPodaci frame = new LicniPodaci();
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
	public LicniPodaci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIme = new JTextField();
		txtIme.setBounds(119, 59, 86, 20);
		contentPane.add(txtIme);
		txtIme.setColumns(10);
		
		txtPrezime = new JTextField();
		txtPrezime.setBounds(119, 91, 86, 20);
		contentPane.add(txtPrezime);
		txtPrezime.setColumns(10);
		
		txtJMBG = new JTextField();
		txtJMBG.setToolTipText("");
		txtJMBG.setBounds(119, 122, 86, 20);
		contentPane.add(txtJMBG);
		txtJMBG.setColumns(10);
		
		btnPodaci = new JButton("Licni podaci");
		btnPodaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Double.parseDouble(txtJMBG.getText());
					
					if(txtJMBG.getText().length() == 13){
					JOptionPane.showMessageDialog(null, "Ime: " + txtIme.getText() + "\nPrezime: " + txtPrezime.getText() + "\nJMBG: " + txtJMBG.getText(), "Naslov", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "Niste uneli 13 brojeva!!", "Greska!!!", JOptionPane.ERROR_MESSAGE);
						
						txtJMBG.setText("");
						txtJMBG.requestFocus();
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Niste uneli broj u polje JMBG!", "Greska!!!", JOptionPane.ERROR_MESSAGE);
					
					txtJMBG.setText("");
					txtJMBG.requestFocus();
				}
				
			}
		});
		btnPodaci.setBounds(119, 153, 136, 23);
		contentPane.add(btnPodaci);
		
		JLabel lblIme = new JLabel("Ime");
		lblIme.setBounds(62, 62, 46, 14);
		contentPane.add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime");
		lblPrezime.setBounds(62, 94, 79, 14);
		contentPane.add(lblPrezime);
		
		JLabel lblJmbg = new JLabel("JMBG");
		lblJmbg.setBounds(62, 125, 46, 14);
		contentPane.add(lblJmbg);
	}
}
