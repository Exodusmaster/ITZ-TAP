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
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro_Usuario extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JPasswordField txtContra;
	private JTextField textUusario;

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

	// Constructor de la clase
	public Registro_Usuario() {
		setTitle("ByteGear");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 370);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 0, 64));
		setJMenuBar(menuBar);

		JMenu mnOpciones = new JMenu("Opciones");
		mnOpciones.setIcon(new ImageIcon("Imagenes/Menu.png"));
		mnOpciones.setForeground(Color.WHITE);
		mnOpciones.setBackground(new Color(0, 0, 64));
		menuBar.add(mnOpciones);

		// Ítem Ingresa
		JMenuItem mntmIngresa = new JMenuItem("Ingresa");
		mntmIngresa.setIcon(new ImageIcon("Imagenes/Ingresa.png"));
		mntmIngresa.setForeground(Color.WHITE);
		mntmIngresa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmIngresa.setBackground(new Color(0, 0, 64));
		mntmIngresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInicioSesion();
			}
		});
		mnOpciones.add(mntmIngresa);

		// Ítem Salir
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon("Imagenes/Cerrar.png"));
		mntmSalir.setForeground(Color.WHITE);
		mntmSalir.setBackground(new Color(0, 0, 64));
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnOpciones.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		// ========================================================== Nombre
		// ==========================================================\\
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNombre.setBounds(170, 96, 95, 29);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(258, 102, 241, 20);
		contentPane.add(txtNombre);

		JLabel lblIco = new JLabel("");
		lblIco.setIcon(new ImageIcon("Imagenes/ICO InSs.png"));
		lblIco.setBounds(283, 50, 74, 64);
		contentPane.add(lblIco);
		// ========================================================== Apellido ==========================================================\\
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(new Color(255, 255, 255));
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblApellido.setBounds(170, 141, 74, 14);
		contentPane.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(258, 136, 241, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		// ========================================================== Usuario ==========================================================\\
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblUsuario.setBounds(170, 206, 74, 14);
		contentPane.add(lblUsuario);

		textUusario = new JTextField();
		textUusario.setBounds(258, 205, 241, 20);
		contentPane.add(textUusario);
		textUusario.setColumns(10);
		// ========================================================== Contrasela ==========================================================\\
		JLabel lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblContrasena.setBounds(170, 231, 117, 29);
		contentPane.add(lblContrasena);

		txtContra = new JPasswordField();
		txtContra.setBounds(297, 234, 202, 20);
		contentPane.add(txtContra);

		// ========================================================== Correo ==========================================================\\
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCorreo.setBounds(170, 166, 95, 29);
		contentPane.add(lblCorreo);
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(258, 172, 241, 20);
		contentPane.add(txtCorreo);

		// ==========================================================_Registrar_==========================================================\\
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtCorreo.getText().isEmpty()
						&& !textUusario.getText().isEmpty() && !txtContra.getText().isEmpty()) {
					Usuario usuario = new Usuario(textUusario.getText(), txtContra.getText(), txtNombre.getText(),
							txtApellido.getText(), txtCorreo.getText());
					if (Logic.insertar(usuario)) {
						JOptionPane.showMessageDialog(null, "Usuario registrado existosamente");
						Pantalla_Inicio i = new Pantalla_Inicio();
						i.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Usuario ya existente");
					}

				}
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegistrar.setBounds(170, 271, 127, 29);
		contentPane.add(btnRegistrar);

		// ==========================================================_Modificar_==========================================================\\

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtCorreo.getText().isEmpty()
						&& !textUusario.getText().isEmpty() && !txtContra.getText().isEmpty()) {
					Usuario usuario = new Usuario(textUusario.getText(), txtContra.getText(), txtNombre.getText(),
							txtApellido.getText(), txtCorreo.getText());
					if (Logic.insertar(usuario)) {
						JOptionPane.showMessageDialog(null, "Usuario Modificado");
					} else {
						JOptionPane.showMessageDialog(null, "Usuario no existente");
					}

				}
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModificar.setBounds(307, 265, 110, 30);
		contentPane.add(btnModificar);

		// ==========================================================_Eliminar_==========================================================\\
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textUusario.getText().isEmpty()) {
					if (Logic.eliminar(textUusario.getText())) {
						JOptionPane.showMessageDialog(null, "Usuario Eliminado existosamente");
					} else {
						JOptionPane.showMessageDialog(null, "Usuario no existente");
					}

				}
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEliminar.setBounds(428, 265, 95, 30);
		contentPane.add(btnEliminar);
		// ==========================================================_Otros_==========================================================\\

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Imagenes/BG 150220.png"));
		lblNewLabel.setBounds(24, 62, 150, 234);
		contentPane.add(lblNewLabel);

		JLabel lblRegistro = new JLabel("Registro Usuario");
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setForeground(new Color(255, 255, 255));
		lblRegistro.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblRegistro.setBounds(0, 0, 502, 54);
		contentPane.add(lblRegistro);

		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("Imagenes/Fondo.jpg"));
		lblFondo.setBounds(0, 0, 502, 322);
		contentPane.add(lblFondo);
	
	}

	// Método para mostrar la ventana de inicio de sesión
	private void showInicioSesion() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Inicio_sesion inicioSesion = new Inicio_sesion();
				inicioSesion.setVisible(true);
			}
		});
	}
}
