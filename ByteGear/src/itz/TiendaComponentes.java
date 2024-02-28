package itz;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Componente {
    String nombre;
    double precio;

    public Componente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

class TiendaComponentes extends JFrame {
    private List<Componente> inventario;

    public TiendaComponentes() {
        inventario = new ArrayList<>();
        setTitle("Tienda de Componentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        // Crear una barra de herramientas
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false); // Puedes ajustar si la barra de herramientas es flotante

        // Crear botones para la barra de herramientas
        JButton botonImagenMenu = new JButton(new ImageIcon("src/recursos/opciones.png"));
        // Reemplaza con la ruta de tu imagen

        // Agregar acción al botón
        botonImagenMenu.addActionListener(e -> {
            // Puedes agregar lógica aquí para manejar la acción del botón
           
            
        });

        // Agregar botón a la barra de herramientas
        toolbar.add(botonImagenMenu);

        // Agregar la barra de herramientas al contenedor de contenido del frame
        add(toolbar);
    }

    public void agregarComponente(Componente componente) {
        inventario.add(componente);
    }

    public static void main(String[] args) {
    	TiendaComponentes tienda = new TiendaComponentes();

        Componente componente1 = new Componente("Procesador", 200.0);
        Componente componente2 = new Componente("Tarjeta gráfica", 300.0);
        Componente componente3 = new Componente("Memoria RAM", 80.0);

        tienda.agregarComponente(componente1);
        tienda.agregarComponente(componente2);
        tienda.agregarComponente(componente3);

        SwingUtilities.invokeLater(() -> tienda.setVisible(true));
    }
}

