package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	private int broj = 0;
	private int operacija;
	private double rezultat = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator frame = new Kalkulator();
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
	public Kalkulator() {
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelOsnovni = new JPanel();
		contentPane.add(panelOsnovni, BorderLayout.CENTER);
		panelOsnovni.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 404, 40);
		panelOsnovni.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("1");
			}
		});
		btn1.setBounds(10, 93, 89, 40);
		panelOsnovni.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("4");
			}
		});
		btn4.setBounds(10, 144, 89, 40);
		panelOsnovni.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("7");
			}
		});
		btn7.setBounds(10, 199, 89, 40);
		panelOsnovni.add(btn7);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnClear.setBounds(10, 250, 89, 40);
		panelOsnovni.add(btnClear);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("2");
			}
		});
		btn2.setBounds(109, 93, 89, 40);
		panelOsnovni.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("5");
			}
		});
		btn5.setBounds(109, 144, 89, 40);
		panelOsnovni.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("8");
			}
		});
		btn8.setBounds(109, 199, 89, 40);
		panelOsnovni.add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("0");
			}
		});
		btn0.setBounds(109, 250, 89, 40);
		panelOsnovni.add(btn0);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("3");
			}
		});
		btn3.setBounds(208, 93, 89, 40);
		panelOsnovni.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("6");
			}
		});
		btn6.setBounds(208, 144, 89, 40);
		panelOsnovni.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("9");
			}
		});
		btn9.setBounds(208, 199, 89, 40);
		panelOsnovni.add(btn9);
		
		JButton btnJednako = new JButton("=");
		btnJednako.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(operacija){
					case 1: rezultat = broj + Integer.parseInt(txtDisplay.getText());
							txtDisplay.setText(String.valueOf(rezultat));
							break;
					case 2: rezultat = broj - Integer.parseInt(txtDisplay.getText());
							txtDisplay.setText(String.valueOf(rezultat));
							break;
					case 3: rezultat = broj * Integer.parseInt(txtDisplay.getText());
							txtDisplay.setText(String.valueOf(rezultat));
							break;
					case 4: rezultat = (double)broj / (double)Integer.parseInt(txtDisplay.getText());
							txtDisplay.setText(String.valueOf(rezultat));
							break;
				}
			}
		});
		btnJednako.setBounds(208, 250, 89, 40);
		panelOsnovni.add(btnJednako);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				broj = Integer.parseInt(txtDisplay.getText());
				operacija = 1;
			}
		});
		btnPlus.setBounds(325, 93, 89, 40);
		panelOsnovni.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				broj = Integer.parseInt(txtDisplay.getText());
				operacija = 2;
			}
		});
		btnMinus.setBounds(325, 144, 89, 40);
		panelOsnovni.add(btnMinus);
		
		JButton btnPuta = new JButton("*");
		btnPuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				broj = Integer.parseInt(txtDisplay.getText());
				operacija = 3;
			}
		});
		btnPuta.setBounds(325, 199, 89, 40);
		panelOsnovni.add(btnPuta);
		
		JButton btnPodeljeno = new JButton("/");
		btnPodeljeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				broj = Integer.parseInt(txtDisplay.getText());
				operacija = 4;
			}
		});
		btnPodeljeno.setBounds(325, 250, 89, 40);
		panelOsnovni.add(btnPodeljeno);
	}
}
