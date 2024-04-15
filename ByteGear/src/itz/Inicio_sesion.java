package itz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class Inicio_sesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

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
	public Inicio_sesion() {
		setTitle("ByteGear");
		setDefaultCloseOperation(JFrame. DISPOSE_ON_CLOSE);
		setBounds(100, 100, 516, 383);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
        menuBar.setBackground(new Color(0, 0, 64));
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
        mnOpciones.setForeground(new Color(255, 255, 255));
        mnOpciones.setIcon(new ImageIcon("Imagenes/Menu.png"));
        mnOpciones.setBackground(new Color(0, 0, 64));
		menuBar.add(mnOpciones);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		  mntmRegistrar.setIcon(new ImageIcon("Imagenes/registra.png"));
		  mntmRegistrar.setForeground(Color.WHITE);
	        mntmRegistrar.setBackground(new Color(0, 0, 64));
	        mntmRegistrar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                showRegistroUsuario();
	            }
	        });
	        mnOpciones.add(mntmRegistrar);
		//Item salir
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
	        
		// Item Muñeco
		JLabel lblIco = new JLabel("");
		lblIco.setIcon(new ImageIcon("Imagenes/ICO InSs.png"));
		lblIco.setBounds(296, 65, 74, 64);
		contentPane.add(lblIco);
		
		//==========================================================_Usuario_==========================================================\\
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblUsuario.setBounds(184, 124, 95, 29);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(184, 151, 304, 20);
		contentPane.add(txtUsuario);
		
		
		//==========================================================_Contraseña_==========================================================\\
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblContrasena.setBounds(184, 182, 117, 29);
		contentPane.add(lblContrasena);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(184, 210, 304, 20);
		contentPane.add(txtContrasena);
		
		//==========================================================_Iniciar_==========================================================\\
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtUsuario.getText().isEmpty()&&!txtContrasena.getText().isEmpty()) {
					if(Logic.verificar(txtUsuario.getText(),txtContrasena.getText())) {
						JOptionPane.showMessageDialog(null, "Bienbenido");
						Pantalla_Inicio i = new Pantalla_Inicio();
						i.setVisible(true);
					}else {
						JOptionPane.showInternalMessageDialog(null, "Correo o contaseña incorrecta");
					}
					
				}
				else {
				JOptionPane.showMessageDialog(null, "Falta ingresar usuario y contraseña");	
				}
			}
		});
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIniciar.setBounds(184, 241, 137, 29);
		contentPane.add(btnIniciar);
		
		//==========================================================_Registrar_==========================================================\\
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrar.setBounds(371, 273, 89, 23);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Registro_Usuario registro = new Registro_Usuario();
			registro.setVisible(true);
			
			}
		});
		contentPane.add(btnRegistrar);
		
		
		
		JCheckBox Mostrarcontra = new JCheckBox("Mostrar Contraseña");
		Mostrarcontra.setFont(new Font("Tahoma", Font.BOLD, 12));
		Mostrarcontra.setBounds(338, 237, 150, 23);
		Mostrarcontra.addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
			if(Mostrarcontra.isSelected()) {
				txtContrasena.setEchoChar((char)0);
			}else {
				txtContrasena.setEchoChar('*');
			}
				
			}
		});
		contentPane.add(Mostrarcontra);
		
        //Igamgen ByteGear
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Imagenes/Byte Gear.jpg"));
		lblNewLabel.setBounds(10, 76, 150, 220);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimerNumero = new JLabel("INICIAR SESION");
		lblPrimerNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNumero.setForeground(new Color(255, 255, 255));
		lblPrimerNumero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		lblPrimerNumero.setBounds(0, 11, 502, 54);
		contentPane.add(lblPrimerNumero);
		
        //Imagen fondo
        
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("Imagenes/Fondo.jpg"));
		lblFondo.setBounds(0, 0, 502, 322);
		contentPane.add(lblFondo);
		
	}
	 private void showRegistroUsuario() {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                Registro_Usuario RegistroUsuario = new Registro_Usuario();
	                RegistroUsuario.setVisible(true);
	                RegistroUsuario.setLocationRelativeTo(Inicio_sesion.this);
	                Inicio_sesion.this.setVisible(false); // Oculta la ventana actual
	            }
	        });
	    }
}

