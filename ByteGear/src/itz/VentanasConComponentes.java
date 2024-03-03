package itz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanasConComponentes {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Crear y configurar el JFrame principal
        JFrame frame = new JFrame("Ventanas con Componentes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear y configurar la barra de herramientas
        JToolBar toolbar = new JToolBar();
        toolbar.setBackground(new Color(128, 128, 128)); // Color de fondo

        // Crear y configurar el botón con texto
        JButton buttonWithText = new JButton("Componentes");
        buttonWithText.setBackground(Color.GRAY);
        buttonWithText.setForeground(Color.BLACK);
        buttonWithText.addActionListener(e -> mostrarNuevaVentana()); // Acción al hacer clic

        // Crear y configurar el botón con ícono
        JButton buttonWithIcon = new JButton(new ImageIcon("src/recursos/opciones2.png"));
        buttonWithIcon.setPreferredSize(new Dimension(32, 32));
        buttonWithIcon.addActionListener(e -> mostrarNuevaVentana()); // Acción al hacer clic

        // Crear y configurar el menú de usuario
        JMenu usuarioMenu = new JMenu("Usuario");
        JMenuItem iniciarSesionMenuItem = new JMenuItem("Iniciar Sesión");
        JMenuItem registrarMenuItem = new JMenuItem("Registrar");

        // Acciones para las opciones del menú de usuario
        iniciarSesionMenuItem.addActionListener(e -> {
            // Acciones al iniciar sesión
        });

        registrarMenuItem.addActionListener(e -> {
           tabla t = new tabla();
        });

        // Agregar opciones al menú de usuario
        usuarioMenu.add(iniciarSesionMenuItem);
        usuarioMenu.add(registrarMenuItem);

        // Crear y configurar la barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(usuarioMenu);

        // Crear una caja horizontal para alinear el menú a la derecha
        Box box = Box.createHorizontalBox();
        box.add(Box.createHorizontalGlue()); // Espacio elástico
        box.add(menuBar);

        // Configurar la barra de herramientas
        toolbar.setFloatable(false); // Desactivar flotabilidad
        toolbar.add(buttonWithIcon);
        toolbar.addSeparator(); // Separador
        toolbar.add(buttonWithText);
        toolbar.add(box); // Añadir el menú a la barra de herramientas

        // Agregar la barra de herramientas al JFrame
        frame.add(toolbar, BorderLayout.NORTH);

        // Configurar el JFrame principal
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void mostrarNuevaVentana() {
        // Crear y configurar un nuevo JFrame para la nueva ventana
        JFrame nuevaVentana = new JFrame("Nueva Ventana");
        nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear y configurar un nuevo botón para la nueva ventana
        JButton nuevoBoton = new JButton("Nuevo Botón");
        nuevoBoton.setBackground(new Color(13, 69, 128));
        nuevoBoton.setForeground(Color.WHITE);

        // Agregar el nuevo botón a la nueva ventana
        nuevaVentana.add(nuevoBoton);

        // Configurar la nueva ventana
        nuevaVentana.setSize(200, 150);
        nuevaVentana.setLocationRelativeTo(null);
        nuevaVentana.setVisible(true);
    }
}
