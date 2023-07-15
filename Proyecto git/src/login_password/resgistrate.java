package login_password;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class resgistrate extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField jpassclave;
	private JButton btniniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resgistrate frame = new resgistrate();
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
	public resgistrate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(152, 11, 114, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(172, 86, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraceña:");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(164, 144, 102, 20);
		contentPane.add(lblNewLabel_2);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(133, 111, 145, 20);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		jpassclave = new JPasswordField();
		jpassclave.setBounds(133, 175, 145, 20);
		contentPane.add(jpassclave);
		
		btniniciar = new JButton("Iniciar Sesion");
		btniniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			char[] clave= jpassclave.getPassword();
			String clavefinal = new String(clave);
			
			if(txtusuario.getText().equals("bryan") && clavefinal.equals("password")) {
				dispose();
				JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
				
				inicio p = new inicio ();
				
				p.setVisible(true);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Usuario o Contraceña incorrectos","ERROR",
						JOptionPane.ERROR_MESSAGE);
				
				txtusuario.setText("");
				jpassclave.setText("");
				txtusuario.requestFocus();
				
				
				///
				
				
			}
			
			
			
			
			}
		});
		btniniciar.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 12));
		btniniciar.setBounds(152, 227, 114, 23);
		contentPane.add(btniniciar);
	}
}
