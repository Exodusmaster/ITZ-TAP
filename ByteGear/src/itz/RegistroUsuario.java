package itz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuario extends JFrame {
	private String Nombre;
	private String Correo;
	private String Contraseña;
    public RegistroUsuario(String nombre, String correo, String contraseña) throws HeadlessException {
		super();
		Nombre = nombre;
		Correo = correo;
		Contraseña = contraseña;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public RegistroUsuario() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Crear y configurar los componentes
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(20);
        
        JLabel lblCorreo = new JLabel("Correo:");
        JTextField txtCorreo = new JTextField(20);
        JLabel lblCotra = new JLabel("Contraseña:");
        JTextField txtContra = new JTextField(20);
        JButton btnRegistrar = new JButton("Guardar");
        
        // Configurar el diseño de la ventana
        setLayout(new GridLayout(3, 2));
        add(lblNombre);
        add(txtNombre);
        add(lblCorreo);
        add(txtCorreo);
        add(lblCotra);
        add(txtContra);
        add(new JLabel()); // Espacio en blanco para mantener el diseño
        add(btnRegistrar);
        
        // Configurar la acción del botón Registrar
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int cont=0;
                
                String nombre = txtNombre.getText();
                String correo = txtCorreo.getText();
                String contra = txtContra.getText();
            	
                JOptionPane.showMessageDialog(RegistroUsuario.this, "Usuario registrado:"+(cont+1)+"\nNombre: " + nombre + "\nCorreo: " + correo);
                // Limpiar los campos después de registrar
                txtNombre.setText("");
                txtCorreo.setText("");
                txtContra.setText("");
            }
        });
        
        pack(); // Ajustar el tamaño de la ventana automáticamente
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true); // Mostrar la ventana
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistroUsuario();
        });
    }

	public String getCorreo() {
		// TODO Auto-generated method stub
		return null;
	}
}
