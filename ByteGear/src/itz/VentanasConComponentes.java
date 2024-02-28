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

        JToolBar toolbar = new JToolBar();

        JButton buttonWithText = new JButton("Componenetes");
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
        nuevaVentana.add(nuevoBoton);

        // Configurar la nueva ventana
        nuevaVentana.setSize(200, 150);
        nuevaVentana.setLocationRelativeTo(null);
        nuevaVentana.setVisible(true);
    }
}

