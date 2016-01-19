package wb;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgPravougaonik extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVisina;
	private JTextField txtSirina;

	public String visina;
	public String sirina;
	public String boja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPravougaonik dialog = new DlgPravougaonik();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPravougaonik() {
		setModal(true);
		setBounds(100, 100, 192, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblVisina = new JLabel("Visina");
			lblVisina.setBounds(10, 11, 57, 14);
			contentPanel.add(lblVisina);
		}
		{
			JLabel lblSirina = new JLabel("Sirina");
			lblSirina.setBounds(10, 36, 46, 14);
			contentPanel.add(lblSirina);
		}
		{
			txtVisina = new JTextField();
			txtVisina.setBounds(77, 8, 86, 20);
			contentPanel.add(txtVisina);
			txtVisina.setColumns(10);
		}
		{
			txtSirina = new JTextField();
			txtSirina.setBounds(77, 33, 86, 20);
			contentPanel.add(txtSirina);
			txtSirina.setColumns(10);
		}

		JComboBox cbxBoja = new JComboBox();
		cbxBoja.setModel(new DefaultComboBoxModel(new String[] {"Plava", "Zuta", "Zelena", "Crvena", "Ljubicasta", "Crna"}));
		cbxBoja.setSelectedIndex(0);
		cbxBoja.setBounds(77, 64, 86, 20);
		contentPanel.add(cbxBoja);

		JLabel lblBoja = new JLabel("Boja");
		lblBoja.setBounds(10, 67, 46, 14);
		contentPanel.add(lblBoja);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 311, 183, 30);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						visina = txtVisina.getText();
						sirina = txtSirina.getText();
						boja = cbxBoja.getSelectedItem().toString();
						setVisible(false);

						try {
							Integer.parseInt(visina);
							Integer.parseInt(sirina);
							
							JOptionPane.showMessageDialog(null, "Visina: " + visina + "\nSirina: " + sirina + "\nBoja: " + boja, "Info", JOptionPane.INFORMATION_MESSAGE);
						} catch (HeadlessException e1) {
							// TODO Auto-generated catch block
							//e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "Niste uneli broj!", "Greska!!!", JOptionPane.ERROR_MESSAGE);
							
							txtVisina.setText("");
							txtSirina.setText("");
						}
					}
				});
				okButton.setBounds(10, 0, 65, 23);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBounds(85, 0, 88, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
