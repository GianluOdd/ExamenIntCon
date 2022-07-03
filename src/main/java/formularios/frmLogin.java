package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Usuario;
import mantenimiento.GestionUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(67, 62, 59, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(67, 110, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(174, 67, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(168, 107, 108, 20);
		contentPane.add(txtPassword);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				salir();
			}
		});
		btnNewButton.setBounds(67, 193, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresar();
			}
		});
		btnNewButton_1.setBounds(263, 193, 89, 23);
		contentPane.add(btnNewButton_1);
	}

	protected void ingresar() {
		// TODO Auto-generated method stub
		
		String usuario = txtUsuario.getText();
		String password = String.valueOf(txtPassword.getPassword());
		
		GestionUsuario gestionUsuario = new GestionUsuario();
		
		Usuario usuario2 = new Usuario();
		usuario2.setNombreUsuario(usuario);
		usuario2.setPassword(password);
		
		Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
		
		if(usu!=null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			
			this.dispose();
			
			frmReservar_Hora reservar_hora = new frmReservar_Hora();
			reservar_hora.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(contentPane, "El usuario o la contraseña no coinciden","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	protected void salir() {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
