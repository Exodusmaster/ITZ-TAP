package itz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Inicio_sesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Correo;
	private JTextField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_sesion frame = new Inicio_sesion();
					frame.setVisible(true);
					frame.setLocationRelativeTo(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio_sesion() {
		setTitle("Byte Gear");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 383);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mnOpciones.add(mntmRegistrar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnOpciones.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIco = new JLabel("");
		lblIco.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\ICO InSs.png"));
		lblIco.setBounds(296, 65, 74, 64);
		contentPane.add(lblIco);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIniciar.setBounds(253, 252, 178, 37);
		contentPane.add(btnIniciar);
		
		Contraseña = new JTextField();
		Contraseña.setColumns(10);
		Contraseña.setBounds(184, 210, 304, 20);
		contentPane.add(Contraseña);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblContraseña.setBounds(184, 182, 117, 29);
		contentPane.add(lblContraseña);
		
		Correo = new JTextField();
		Correo.setColumns(10);
		Correo.setBounds(184, 151, 304, 20);
		contentPane.add(Correo);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCorreo.setBounds(184, 124, 95, 29);
		contentPane.add(lblCorreo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Byte Gear.jpg"));
		lblNewLabel.setBounds(10, 76, 150, 220);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimerNumero = new JLabel("INICIAR SESI\u00D3N");
		lblPrimerNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNumero.setForeground(new Color(255, 255, 255));
		lblPrimerNumero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		lblPrimerNumero.setBounds(0, 11, 502, 54);
		contentPane.add(lblPrimerNumero);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Fondo.jpg"));
		lblFondo.setBounds(0, 0, 502, 345);
		contentPane.add(lblFondo);
		
		JButton button = new JButton("New button");
		button.setBounds(220, 259, 89, 23);
		contentPane.add(button);
	}
}
