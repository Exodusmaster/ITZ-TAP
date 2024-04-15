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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Clase Registro_Usuario
public class Registro_Usuario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Correo;
    private JTextField Contraseña;
    private JTextField Nombre;

    // Método principal
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registro_Usuario frame = new Registro_Usuario();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Constructor de la clase
    public Registro_Usuario() {
        setTitle("Byte Gear");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 516, 383);
        
        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(0, 0, 64));
        setJMenuBar(menuBar);
        
        // Menú Opciones
        JMenu mnOpciones = new JMenu("Opciones");
        mnOpciones.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Menu.png"));
        mnOpciones.setForeground(Color.WHITE);
        mnOpciones.setBackground(new Color(0, 0, 64));
        menuBar.add(mnOpciones);
        
        // Ítem Ingresa
        JMenuItem mntmIngresa = new JMenuItem("Ingresa");
        mntmIngresa.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Ingresa.png"));
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
        mntmSalir.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Cerrar.png"));
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
        
        // Etiqueta Nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(Color.WHITE);
        lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblNombre.setBounds(184, 87, 95, 29);
        contentPane.add(lblNombre);
        
        // Campo de texto Nombre
        Nombre = new JTextField();
        Nombre.setColumns(10);
        Nombre.setBounds(184, 115, 304, 20);
        contentPane.add(Nombre);
        
        // Etiqueta Icono
        JLabel lblIco = new JLabel("");
        lblIco.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\ICO InSs.png"));
        lblIco.setBounds(296, 51, 74, 64);
        contentPane.add(lblIco);
        
        // Botón Iniciar
        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnIniciar.setBounds(252, 260, 178, 37);
        contentPane.add(btnIniciar);
        
        // Campo de texto Contraseña
        Contraseña = new JTextField();
        Contraseña.setColumns(10);
        Contraseña.setBounds(184, 229, 304, 20);
        contentPane.add(Contraseña);
        
        // Etiqueta Contraseña
        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setForeground(Color.WHITE);
        lblContraseña.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblContraseña.setBounds(184, 203, 117, 29);
        contentPane.add(lblContraseña);
        
        // Campo de texto Correo
        Correo = new JTextField();
        Correo.setColumns(10);
        Correo.setBounds(184, 172, 304, 20);
        contentPane.add(Correo);
        
        // Etiqueta Correo
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setForeground(Color.WHITE);
        lblCorreo.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblCorreo.setBounds(184, 143, 95, 29);
        contentPane.add(lblCorreo);
        
        // Etiqueta de imagen
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\BG 150220.png"));
        lblNewLabel.setBounds(24, 62, 150, 234);
        contentPane.add(lblNewLabel);
        
        // Etiqueta de título
        JLabel lblPrimerNumero = new JLabel("Registro Usuario");
        lblPrimerNumero.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrimerNumero.setForeground(new Color(255, 255, 255));
        lblPrimerNumero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
        lblPrimerNumero.setBounds(0, 0, 502, 65);
        contentPane.add(lblPrimerNumero);
        
        // Etiqueta de fondo
        JLabel lblFondo = new JLabel("New label");
        lblFondo.setIcon(new ImageIcon("C:\\Users\\Wendy\\eclipse-workspace\\Proyecto Byte Gear\\bin\\Imagenes\\Fondo.jpg"));
        lblFondo.setBounds(0, 0, 502, 345);
        contentPane.add(lblFondo);
        
        JButton button = new JButton("New button");
        button.setBounds(220, 259, 89, 23);
        contentPane.add(button);
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
