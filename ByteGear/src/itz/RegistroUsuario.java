package itz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuario extends JFrame {
    // Atributos para almacenar los datos del usuario
    private String Nombre;
    private String Correo;
    private String Contraseña;

    // Constructor por defecto
    public RegistroUsuario() {
        // TODO Auto-generated constructor stub
    }

    // Constructor con parámetros para inicializar los datos del usuario
    public RegistroUsuario(String nombre, String correo, String contraseña) throws HeadlessException {
        super();
        Nombre = nombre;
        Correo = correo;
        Contraseña = contraseña;
    }

    // Métodos getter y setter para los atributos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    // Método para solicitar los datos de registro al usuario
    public void pedirDatos() {
        JDialog datos = new JDialog();
        datos.setTitle("Datos del Usuario");
        datos.setModal(true);
        datos.setLayout(new FlowLayout());
        JLabel lblnombre = new JLabel("Usuario:");
        JTextField txtNombre = new JTextField(30);
        JLabel lblcarrera = new JLabel("Correo:");
        JTextField txtCarrera = new JTextField(20);
        JLabel lblsem = new JLabel("Contraseña:");
        JTextField txtsem = new JTextField(5);
        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener los datos ingresados por el usuario
                    Nombre = txtNombre.getText();
                    Correo = txtCarrera.getText();
                    Contraseña = txtsem.getText();
                    datos.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error en datos");
                    // Limpiar los campos en caso de error
                    txtNombre.setText("");
                    txtCarrera.setText("");
                    txtsem.setText("");
                }
            }
        });
        JButton cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Establecer los datos como nulos y cerrar la ventana
                Nombre = null;
                datos.dispose();
            }
        });
        datos.add(lblnombre);
        datos.add(txtNombre);
        datos.add(lblcarrera);
        datos.add(txtCarrera);
        datos.add(lblsem);
        datos.add(txtsem);
        datos.add(aceptar);
        datos.add(cancelar);
        datos.setSize(200, 150);
        datos.setVisible(true);
    }

    // Método para modificar los datos del usuario
    public void modificarDatos() {
        JDialog datos = new JDialog();
        datos.setTitle("Modificar Datos del Usuario");
        datos.setModal(true);
        datos.setLayout(new FlowLayout());
        JLabel lblnombre = new JLabel("Usuario:");
        JTextField txtNombre = new JTextField(30);
        txtNombre.setText(Nombre);
        JLabel lblcarrera = new JLabel("Correo:");
        JTextField txtCarrera = new JTextField(20);
        txtCarrera.setText(Correo);
        JLabel lblsem = new JLabel("Contraseña:");
        JTextField txtsem = new JTextField(5);
        txtsem.setText(Contraseña);
        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener los datos modificados por el usuario
                    Nombre = txtNombre.getText();
                    Correo = txtCarrera.getText();
                    Contraseña = txtsem.getText();
                    datos.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error en datos");
                    // Restaurar los valores anteriores en caso de error
                    txtNombre.setText(Nombre);
                    txtCarrera.setText(Correo);
                    txtsem.setText(Contraseña);
                }
            }
        });
        JButton cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Establecer los datos como nulos y cerrar la ventana
                Nombre = null;
                datos.dispose();
            }
        });
        datos.add(lblnombre);
        datos.add(txtNombre);
        datos.add(lblcarrera);
        datos.add(txtCarrera);
        datos.add(lblsem);
        datos.add(txtsem);
        datos.add(aceptar);
        datos.add(cancelar);
        datos.setSize(400, 150);
        datos.setVisible(true);
    }

    // Método toString para convertir los datos del usuario en una cadena
    @Override
    public String toString() {
        return Nombre + "," + Correo + "," + Contraseña + "\n"; // Formato CSV
    }
}
