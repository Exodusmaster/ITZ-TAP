package itz;
//hola
// Hola 2
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

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
        JFrame frame = new JFrame("Ventanas con Componentes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Personaliza la barra de título
        frame.getRootPane().setBackground(new Color(0, 0, 128)); // Azul oscuro
        JToolBar toolbar = new JToolBar();
        toolbar.setBackground(new Color(128, 128, 128)); // Gris rata

        JButton buttonWithText = new JButton("Componentes");
        buttonWithText.setBackground(Color.GRAY);
        buttonWithText.setForeground(Color.BLACK);
        buttonWithText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar una nueva ventana o diálogo
                mostrarNuevaVentana();
            }
        });

        JButton buttonWithIcon = new JButton(new ImageIcon("src/recursos/opciones2.png"));// Reemplaza con la ruta de tu imagen
        buttonWithIcon.setPreferredSize(new DimensionUIResource(2, 1));
        buttonWithIcon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar una nueva ventana o diálogo
                mostrarNuevaVentana();
            }
        });
        toolbar.setFloatable(false);
        toolbar.add(buttonWithIcon);
        toolbar.addSeparator();
        toolbar.add(buttonWithText);

        frame.add(toolbar, BorderLayout.NORTH);

        // Configurar el frame
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private static void mostrarNuevaVentana() {
        JFrame nuevaVentana = new JFrame("Nueva Ventana");
        nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Agregar componentes a la nueva ventana
        JButton nuevoBoton = new JButton("Nuevo Botón");
        nuevoBoton.setBackground(new Color(13, 69, 128)); // Color Azul petróleo
     nuevoBoton.setForeground(Color.WHITE);
        nuevaVentana.add(nuevoBoton);
        // Configurar la nueva ventana
        nuevaVentana.setSize(200, 150);
        nuevaVentana.setLocationRelativeTo(null);
        nuevaVentana.setVisible(true);
    }
}

