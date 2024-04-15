package itz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Inicio frame = new Pantalla_Inicio();
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
	public Pantalla_Inicio() {
		setTitle("BYTEGEAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 595);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacebook = new JLabel("");
		lblFacebook.setIcon(new ImageIcon("Imagenes/facebook.png"));
		lblFacebook.setBounds(462, 505, 53, 39);
		contentPane.add(lblFacebook);
		
		JLabel lblInstagram = new JLabel("");
		lblInstagram.setIcon(new ImageIcon("Imagenes/instagram.png"));
		lblInstagram.setBounds(263, 505, 53, 39);
		contentPane.add(lblInstagram);
		
		JLabel lblWhatsapp = new JLabel("");
		lblWhatsapp.setIcon(new ImageIcon("Imagenes/whatsapp.png"));
		lblWhatsapp.setBounds(84, 505, 53, 39);
		contentPane.add(lblWhatsapp);
		
		JLabel lblByte_Gear = new JLabel("Byte Gear");
		lblByte_Gear.setForeground(new Color(255, 255, 255));
		lblByte_Gear.setHorizontalAlignment(SwingConstants.CENTER);
		lblByte_Gear.setFont(new Font("Eras Bold ITC", Font.PLAIN, 80));
		lblByte_Gear.setBounds(135, 0, 734, 91);
		contentPane.add(lblByte_Gear);
		//Imagen Logo
		JLabel lblLogoBG = new JLabel("");
		lblLogoBG.setIcon(new ImageIcon("Imagenes/BG.png"));
		lblLogoBG.setBounds(50, 0, 80, 100);
		contentPane.add(lblLogoBG);
		//Imagen Azul
		JLabel lblAdorno1 = new JLabel("");
		lblAdorno1.setBounds(0, 0, 869, 100);
		lblAdorno1.setIcon(new ImageIcon("Imagenes/Adrono Azul.png"));
		contentPane.add(lblAdorno1);
		
		JLabel lblAdorno2 = new JLabel("");
		lblAdorno2.setBackground(new Color(255, 255, 255));
		lblAdorno2.setIcon(new ImageIcon("Imagenes/Adrono Azul.png"));
		lblAdorno2.setBounds(0, 505, 869, 51);
		contentPane.add(lblAdorno2);
		//Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(0, 0, 64));
		menuBar.setBounds(0, 102, 869, 44);
		contentPane.add(menuBar);
		//Opciones
		JMenu mnOpciones = new JMenu("Menu");
		mnOpciones.setIcon(new ImageIcon("Imagenes/Menu.png"));
		mnOpciones.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnOpciones);
		mnOpciones.setForeground(new Color(255, 255, 255));
		mnOpciones.setBackground(new Color(0, 0, 64));
		//Regresa a inicio
		JMenuItem mntmInicio = new JMenuItem("INICIO");
		mntmInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla_Inicio inicio= new Pantalla_Inicio();
				inicio.setVisible(true);
			}
		});
		mntmInicio.setBackground(new Color(0, 0, 64));
		mntmInicio.setForeground(Color.WHITE);
		mntmInicio.setIcon(new ImageIcon("Imagenes/BG32.png"));
		mnOpciones.add(mntmInicio);
		//Accesorios
		JMenuItem mntmACCESORIOS = new JMenuItem("ACCESORIOS");
		mntmACCESORIOS.setIcon(new ImageIcon("Imagenes/Mouse.png"));
		mntmACCESORIOS.setBackground(new Color(0, 0, 64));
		mntmACCESORIOS.setForeground(Color.WHITE);
		mnOpciones.add(mntmACCESORIOS);
		//Computadoras
		JMenuItem mntmCOMPUTADORAS = new JMenuItem("COMPUTADORAS");
		mntmCOMPUTADORAS.setIcon(new ImageIcon("Imagenes/monitor.png"));
		mntmCOMPUTADORAS.setForeground(Color.WHITE);
		mntmCOMPUTADORAS.setBackground(new Color(0, 0, 64));
		mnOpciones.add(mntmCOMPUTADORAS);
		//Mantenimiento
		JMenuItem mntmALMACENAMIENTO = new JMenuItem("ALMACENAMIENTO");
		mntmALMACENAMIENTO.setIcon(new ImageIcon("Imagenes/usb.png"));
		mntmALMACENAMIENTO.setBackground(new Color(0, 0, 64));
		mntmALMACENAMIENTO.setForeground(new Color(255, 255, 255));
		mnOpciones.add(mntmALMACENAMIENTO);
		//Electronica de consumo
		JMenuItem mntmELECTRONICACONSUMO = new JMenuItem("ELECTRONICA DE CONSUMO");
		mntmELECTRONICACONSUMO.setIcon(new ImageIcon("Imagenes/videogame.png"));
		mntmELECTRONICACONSUMO.setBackground(new Color(0, 0, 64));
		mntmELECTRONICACONSUMO.setForeground(Color.WHITE);
		mnOpciones.add(mntmELECTRONICACONSUMO);
		//Componentes 
		JMenuItem mntmComponentes = new JMenuItem("COMPONENTES");
		mntmComponentes.setIcon(new ImageIcon("Imagenes/Componentes.png"));
		mntmComponentes.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmComponentes.setForeground(Color.WHITE);
		mntmComponentes.setBackground(new Color(0, 0, 64));
		mnOpciones.add(mntmComponentes);
		//Impresoras
		JMenuItem mntmIMPRESIÓN = new JMenuItem("IMPRESI\u00D3N");
		mntmIMPRESIÓN.setIcon(new ImageIcon("Imagenes/impresora.png"));
		mntmIMPRESIÓN.setBackground(new Color(0, 0, 64));
		mntmIMPRESIÓN.setForeground(Color.WHITE);
		mnOpciones.add(mntmIMPRESIÓN);
		//Software
		JMenuItem mntmSOFTWARE = new JMenuItem("SOFTWARE");
		mntmSOFTWARE.setIcon(new ImageIcon("Imagenes/Software.png"));
		mntmSOFTWARE.setBackground(new Color(0, 0, 64));
		mntmSOFTWARE.setForeground(Color.WHITE);
		mnOpciones.add(mntmSOFTWARE);
		//Monitores
		JMenuItem mntmMONITORES = new JMenuItem("MONITORES");
		mntmMONITORES.setIcon(new ImageIcon("Imagenes/monitor.png"));
		mntmMONITORES.setBackground(new Color(0, 0, 64));
		mntmMONITORES.setForeground(Color.WHITE);
		mnOpciones.add(mntmMONITORES);
		//Celulares
		JMenuItem mntmCELULARES = new JMenuItem("CELULARES");
		mntmCELULARES.setIcon(new ImageIcon("Imagenes/telefono.png"));
		mntmCELULARES.setBackground(new Color(0, 0, 64));
		mntmCELULARES.setForeground(Color.WHITE);
		mnOpciones.add(mntmCELULARES);
		//Energia
		JMenuItem mntmENERGIA = new JMenuItem("ENERGIA");
		mntmENERGIA.setIcon(new ImageIcon("Imagenes/Energia.png"));
		mntmENERGIA.setBackground(new Color(0, 0, 64));
		mntmENERGIA.setForeground(Color.WHITE);
		mnOpciones.add(mntmENERGIA);
		//Menu Usuario
		JMenu mnUsuario = new JMenu("Ingresa");
		mnUsuario.setForeground(new Color(255, 255, 255));
		mnUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnUsuario.setIcon(new ImageIcon("Imagenes/Usuario.png"));
		menuBar.add(mnUsuario);
		//Ingresa (Abrir una nueva ventana para iniciar sesion)
		JMenuItem mntmIngresa = new JMenuItem("Ingresa");
		mntmIngresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
			
		});
		mntmIngresa.setIcon(new ImageIcon("Imagenes/Ingresa.png"));
		mntmIngresa.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmIngresa.setBackground(new Color(0, 0, 64));
		mntmIngresa.setForeground(new Color(255, 255, 255));
		mnUsuario.add(mntmIngresa);
		//Registra (Abrir una nueva ventana para registrar)
		JMenuItem mntmRegistra = new JMenuItem("Registra");
		mntmRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Registro_Usuario frame = new Registro_Usuario();
								frame.setVisible(true);
								frame.setLocationRelativeTo(frame);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			
		});
		mntmRegistra.setIcon(new ImageIcon("Imagenes/registra.png"));
		mntmRegistra.setForeground(Color.WHITE);
		mntmRegistra.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmRegistra.setBackground(new Color(0, 0, 64));
		mnUsuario.add(mntmRegistra);
		//Carrito de compra
		JMenu mnCompras = new JMenu("Mi bolsa");
		mnCompras.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnCompras.setForeground(new Color(255, 255, 255));
		mnCompras.setIcon(new ImageIcon("Imagenes/Compras.png"));
		menuBar.add(mnCompras);
		//Ayuda
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(new Color(255, 255, 255));
		mnAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnAyuda.setIcon(new ImageIcon("Imagenes/Atencion.png"));
		menuBar.add(mnAyuda);
		//Forma de comunicar con servicio
		JMenuItem mntmContactos = new JMenuItem("Contacto");
		mntmContactos.setIcon(new ImageIcon("Imagenes/contacto.png"));
		mntmContactos.setForeground(new Color(255, 255, 255));
		mntmContactos.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmContactos);
		//pregunta frecuentes
		JMenuItem mntmPreguntas_Frecuentes = new JMenuItem("Preguntas frecuentes ");
		mntmPreguntas_Frecuentes.setIcon(new ImageIcon("Imagenes/pregunta.png"));
		mntmPreguntas_Frecuentes.setForeground(Color.WHITE);
		mntmPreguntas_Frecuentes.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmPreguntas_Frecuentes);
		//informacion sobre nosotros
		JMenuItem mntmNosotros = new JMenuItem("Nosotros ");
		mntmNosotros.setIcon(new ImageIcon("Imagenes/nosotros.png"));
		mntmNosotros.setForeground(Color.WHITE);
		mntmNosotros.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmNosotros);
		//Legal
		JMenuItem mntmAvisoLegal = new JMenuItem("Aviso Legal");
		mntmAvisoLegal.setIcon(new ImageIcon("Imagenes/aviso.png"));
		mntmAvisoLegal.setForeground(Color.WHITE);
		mntmAvisoLegal.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmAvisoLegal);
	}
	
}
