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
		setTitle("BYTE GEAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 595);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacebook = new JLabel("");
		lblFacebook.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\facebook.png"));
		lblFacebook.setBounds(462, 505, 53, 39);
		contentPane.add(lblFacebook);
		
		JLabel lblInstagram = new JLabel("");
		lblInstagram.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\instagram.png"));
		lblInstagram.setBounds(263, 505, 53, 39);
		contentPane.add(lblInstagram);
		
		JLabel lblWhatsapp = new JLabel("");
		lblWhatsapp.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\whatsapp.png"));
		lblWhatsapp.setBounds(84, 505, 53, 39);
		contentPane.add(lblWhatsapp);
		
		JLabel lblByte_Gear = new JLabel("Byte Gear");
		lblByte_Gear.setForeground(new Color(255, 255, 255));
		lblByte_Gear.setHorizontalAlignment(SwingConstants.CENTER);
		lblByte_Gear.setFont(new Font("Eras Bold ITC", Font.PLAIN, 80));
		lblByte_Gear.setBounds(135, 0, 734, 91);
		contentPane.add(lblByte_Gear);
		
		JLabel lblLogoBG = new JLabel("");
		lblLogoBG.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\BG.png"));
		lblLogoBG.setBounds(50, 0, 80, 100);
		contentPane.add(lblLogoBG);
		
		JLabel lblAdorno1 = new JLabel("");
		lblAdorno1.setBounds(0, 0, 869, 100);
		lblAdorno1.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Adrono Azul.png"));
		contentPane.add(lblAdorno1);
		
		JLabel lblAdorno2 = new JLabel("");
		lblAdorno2.setBackground(new Color(255, 255, 255));
		lblAdorno2.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Adrono Azul.png"));
		lblAdorno2.setBounds(0, 505, 869, 51);
		contentPane.add(lblAdorno2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(0, 0, 64));
		menuBar.setBounds(0, 102, 869, 44);
		contentPane.add(menuBar);
		
		JMenu mnOpciones = new JMenu("Menu");
		mnOpciones.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Menu.png"));
		mnOpciones.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnOpciones);
		mnOpciones.setForeground(new Color(255, 255, 255));
		mnOpciones.setBackground(new Color(0, 0, 64));
		
		JMenuItem mntmACCESORIOS = new JMenuItem("ACCESORIOS");
		mntmACCESORIOS.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Mouse.png"));
		mntmACCESORIOS.setBackground(new Color(0, 0, 64));
		mntmACCESORIOS.setForeground(Color.WHITE);
		mnOpciones.add(mntmACCESORIOS);
		
		JMenuItem mntmCOMPUTADORAS = new JMenuItem("COMPUTADORAS");
		mntmCOMPUTADORAS.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\monitor.png"));
		mntmCOMPUTADORAS.setForeground(Color.WHITE);
		mntmCOMPUTADORAS.setBackground(new Color(0, 0, 64));
		mnOpciones.add(mntmCOMPUTADORAS);
		
		JMenuItem mntmALMACENAMIENTO = new JMenuItem("ALMACENAMIENTO");
		mntmALMACENAMIENTO.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\usb.png"));
		mntmALMACENAMIENTO.setBackground(new Color(0, 0, 64));
		mntmALMACENAMIENTO.setForeground(new Color(255, 255, 255));
		mnOpciones.add(mntmALMACENAMIENTO);
		
		JMenuItem mntmELECTRONICACONSUMO = new JMenuItem("ELECTRONICA DE CONSUMO");
		mntmELECTRONICACONSUMO.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\videogame.png"));
		mntmELECTRONICACONSUMO.setBackground(new Color(0, 0, 64));
		mntmELECTRONICACONSUMO.setForeground(Color.WHITE);
		mnOpciones.add(mntmELECTRONICACONSUMO);
		
		JMenuItem mntmComponentes = new JMenuItem("Componentes ");
		mntmComponentes.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Componentes.png"));
		mntmComponentes.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmComponentes.setForeground(new Color(255, 255, 255));
		mntmComponentes.setBackground(new Color(0, 0, 64));
		mnOpciones.add(mntmComponentes);
		
		JMenuItem mntmIMPRESIÓN = new JMenuItem("IMPRESI\u00D3N");
		mntmIMPRESIÓN.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\impresora.png"));
		mntmIMPRESIÓN.setBackground(new Color(0, 0, 64));
		mntmIMPRESIÓN.setForeground(Color.WHITE);
		mnOpciones.add(mntmIMPRESIÓN);
		
		JMenuItem mntmSOFTWARE = new JMenuItem("SOFTWARE");
		mntmSOFTWARE.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Software.png"));
		mntmSOFTWARE.setBackground(new Color(0, 0, 64));
		mntmSOFTWARE.setForeground(Color.WHITE);
		mnOpciones.add(mntmSOFTWARE);
		
		JMenuItem mntmMONITORES = new JMenuItem("MONITORES");
		mntmMONITORES.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\monitor.png"));
		mntmMONITORES.setBackground(new Color(0, 0, 64));
		mntmMONITORES.setForeground(Color.WHITE);
		mnOpciones.add(mntmMONITORES);
		
		JMenuItem mntmCELULARES = new JMenuItem("CELULARES");
		mntmCELULARES.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\telefono.png"));
		mntmCELULARES.setBackground(new Color(0, 0, 64));
		mntmCELULARES.setForeground(Color.WHITE);
		mnOpciones.add(mntmCELULARES);
		
		JMenuItem mntmENERGIA = new JMenuItem("ENERGIA");
		mntmENERGIA.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Energia.png"));
		mntmENERGIA.setBackground(new Color(0, 0, 64));
		mntmENERGIA.setForeground(Color.WHITE);
		mnOpciones.add(mntmENERGIA);
		
		JMenu mnUsuario = new JMenu("Ingresa");
		mnUsuario.setForeground(new Color(255, 255, 255));
		mnUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnUsuario.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Usuario.png"));
		menuBar.add(mnUsuario);
		
		JMenuItem mntmIngresa = new JMenuItem("Ingresa");
		mntmIngresa.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Ingresa.png"));
		mntmIngresa.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmIngresa.setBackground(new Color(0, 0, 64));
		mntmIngresa.setForeground(new Color(255, 255, 255));
		mnUsuario.add(mntmIngresa);
		
		JMenuItem mntmRegistra = new JMenuItem("Registra");
		mntmRegistra.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\registra.png"));
		mntmRegistra.setForeground(Color.WHITE);
		mntmRegistra.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmRegistra.setBackground(new Color(0, 0, 64));
		mnUsuario.add(mntmRegistra);
		
		JMenu mnCompras = new JMenu("Mi bolsa");
		mnCompras.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnCompras.setForeground(new Color(255, 255, 255));
		mnCompras.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Compras.png"));
		menuBar.add(mnCompras);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(new Color(255, 255, 255));
		mnAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnAyuda.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Atencion.png"));
		menuBar.add(mnAyuda);
		
		JMenuItem mntmContactos = new JMenuItem("Contacto");
		mntmContactos.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\contacto.png"));
		mntmContactos.setForeground(new Color(255, 255, 255));
		mntmContactos.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmContactos);
		
		JMenuItem mntmPreguntas_Frecuentes = new JMenuItem("Preguntas frecuentes ");
		mntmPreguntas_Frecuentes.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\pregunta.png"));
		mntmPreguntas_Frecuentes.setForeground(Color.WHITE);
		mntmPreguntas_Frecuentes.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmPreguntas_Frecuentes);
		
		JMenuItem mntmNosotros = new JMenuItem("Nosotros ");
		mntmNosotros.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\nosotros.png"));
		mntmNosotros.setForeground(Color.WHITE);
		mntmNosotros.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmNosotros);
		
		JMenuItem mntmAvisoLegal = new JMenuItem("Aviso Legal");
		mntmAvisoLegal.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\aviso.png"));
		mntmAvisoLegal.setForeground(Color.WHITE);
		mntmAvisoLegal.setBackground(new Color(0, 0, 64));
		mnAyuda.add(mntmAvisoLegal);
	}

}
