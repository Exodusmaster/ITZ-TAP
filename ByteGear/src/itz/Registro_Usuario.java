package itz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Registro_Usuario extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Correo;
	private JTextField Contraseña;
	private JTextField Nombre;

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
	public Registro_Usuario() {
		setTitle("Byte Gear");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 383);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmRegistrar = new JMenuItem("Inicio Sesi\u00F3n");
		mnOpciones.add(mntmRegistrar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnOpciones.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNombre.setBounds(184, 96, 95, 29);
		contentPane.add(lblNombre);
		
		Nombre = new JTextField();
		Nombre.setColumns(10);
		Nombre.setBounds(184, 136, 304, 20);
		contentPane.add(Nombre);
		
		JLabel lblIco = new JLabel("");
		lblIco.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\ICO InSs.png"));
		lblIco.setBounds(283, 50, 74, 64);
		contentPane.add(lblIco);
		
		JButton btnIniciar = new JButton("Registrar");
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIniciar.setBounds(254, 281, 144, 30);
		contentPane.add(btnIniciar);
		
		Contraseña = new JTextField();
		Contraseña.setColumns(10);
		Contraseña.setBounds(184, 250, 304, 20);
		contentPane.add(Contraseña);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblContraseña.setBounds(184, 210, 117, 29);
		contentPane.add(lblContraseña);
		
		Correo = new JTextField();
		Correo.setColumns(10);
		Correo.setBounds(184, 194, 304, 20);
		contentPane.add(Correo);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCorreo.setBounds(184, 154, 95, 29);
		contentPane.add(lblCorreo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Byte Gear.jpg"));
		lblNewLabel.setBounds(10, 76, 150, 220);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimerNumero = new JLabel("Registro Usuario");
		lblPrimerNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNumero.setForeground(new Color(255, 255, 255));
		lblPrimerNumero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblPrimerNumero.setBounds(0, 0, 502, 54);
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
