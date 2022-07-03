package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;

public class frmReservar_Hora extends JFrame {

	private JPanel contentPane;
	private JButton btnConfirmar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmReservar_Hora frame = new frmReservar_Hora();
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
	public frmReservar_Hora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione la hora para su cita");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(98, 40, 243, 14);
		contentPane.add(lblNewLabel);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(261, 190, 110, 23);
		contentPane.add(btnConfirmar);
		
		btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(50, 190, 110, 23);
		contentPane.add(btnNewButton);
	}
}
