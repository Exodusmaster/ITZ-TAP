package itz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tabla extends JFrame implements ActionListener {

	// Declaración de variables
	private List<RegistroUsuario> re; // Lista para almacenar los registros de usuarios
	private JTable tablaRegistro; // Tabla para mostrar los registros
	private JButton btnagregar, btneliminar, btnmodificar; // Botones para agregar, eliminar y modificar registros
	private ModelTable modelo; // Modelo para la tabla
	private JScrollPane scroll; // Panel de desplazamiento para la tabla
	private JMenuBar menubar; // Barra de menú
	private JMenu menu; // Menú
	private JMenuItem guardar, cargar; // Elementos del menú para guardar y cargar

	// Constructor de la clase
	public tabla() {
		super("Registro Usuario"); // Título de la ventana
		// Configuración de la barra de menú
		menubar = new JMenuBar();
		menu = new JMenu("Archivo");
		guardar = new JMenuItem("Guardar");
		guardar.addActionListener(this);
		cargar = new JMenuItem("Cargar");
		cargar.addActionListener(this);
		menu.add(guardar);
		menu.add(cargar);
		menubar.add(menu);
		this.setJMenuBar(menubar);

		// Inicialización de la lista de registros
		re = new ArrayList<RegistroUsuario>();
		// Creación del modelo de tabla
		modelo = new ModelTable(re);
		// Creación de la tabla y el panel de desplazamiento
		tablaRegistro = new JTable(modelo);
		scroll = new JScrollPane();
		scroll.setPreferredSize(new Dimension(200, 200));
		scroll.setViewportView(tablaRegistro);

		// Creación y configuración de botones
		btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(this);
		btneliminar = new JButton("Eliminar");
		btneliminar.addActionListener(this);
		btnmodificar = new JButton("Modificar");
		btnmodificar.addActionListener(this);

		// Configuración del diseño y tamaño de la ventana
		this.setLayout(new FlowLayout());
		this.setSize(300, 300);
		// Agregar componentes a la ventana
		this.add(scroll);
		this.add(btnagregar);
		this.add(btneliminar);
		this.add(btnmodificar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Operación de cierre de la ventana
		this.setVisible(true); // Hacer visible la ventana
	}

	// Método para manejar eventos de acción
	@Override
	public void actionPerformed(ActionEvent e) {
		// Si se hace clic en el botón de agregar
		if (e.getSource() == btnagregar) {
			RegistroUsuario rex = new RegistroUsuario(); // Crear un nuevo registro de usuario
			rex.pedirDatos(); // Pedir datos para el registro de usuario
			if (rex.getNombre() != null) { // Si se ingresó un nombre (es decir, no se canceló la operación)
				re.add(rex); // Agregar el registro a la lista
				modelo.fireTableDataChanged(); // Notificar al modelo que los datos han cambiado
			}
		}
		// Si se hace clic en el botón de eliminar
		if (e.getSource() == btneliminar) {
			int pos = tablaRegistro.getSelectedRow(); // Obtener la fila seleccionada en la tabla
			if (pos >= 0) { // Si se ha seleccionado una fila
				re.remove(pos); // Eliminar el registro de la lista
				modelo.fireTableDataChanged(); // Notificar al modelo que los datos han cambiado
			}
		}
		// Si se hace clic en el botón de modificar
		if (e.getSource() == btnmodificar) {
			int pos = tablaRegistro.getSelectedRow(); // Obtener la fila seleccionada en la tabla
			if (pos >= 0) { // Si se ha seleccionado una fila
				RegistroUsuario rex = re.get(pos); // Obtener el registro de la lista
				rex.modificarDatos(); // Modificar los datos del registro
				if (rex.getNombre() != null) { // Si se realizaron modificaciones (es decir, no se canceló la operación)
					re.set(pos, rex); // Actualizar el registro en la lista
					modelo.fireTableDataChanged(); // Notificar al modelo que los datos han cambiado
				}
			}
		}
		// Si se hace clic en el elemento de menú guardar
		if (e.getSource() == guardar) {
			try {
				FileWriter archivo = new FileWriter("Registro.csv"); // Crear un FileWriter para el archivo
																		// "Registro.csv"
				BufferedWriter bw = new BufferedWriter(archivo); // Crear un BufferedWriter para escribir en el archivo
				for (RegistroUsuario a : re) { // Iterar sobre la lista de registros de usuarios
					bw.append(a.toString()); // Escribir la representación de cadena del registro en el archivo
				}
				bw.close(); // Cerrar el BufferedWriter
				JOptionPane.showMessageDialog(null, "Archivo creado con éxito"); // Mostrar un mensaje de éxito
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Error al crear archivo"); // Mostrar un mensaje de error si ocurre
																				// una excepción
			}
		}
		// Si se hace clic en el elemento de menú cargar
		if (e.getSource() == cargar) {
			try {
				re.clear(); // Limpiar la lista de registros de usuarios
				FileReader archivo = new FileReader("Registro.csv"); // Crear un FileReader para el archivo
																		// "Registro.csv"
				BufferedReader br = new BufferedReader(archivo); // Crear un BufferedReader para leer el archivo
				RegistroUsuario rex; // Declarar una variable para almacenar cada registro leído
				String linea = ""; // Variable para almacenar cada línea leída del archivo
				String campos[]; // Arreglo para almacenar los campos de cada registro
				do {
					linea = br.readLine(); // Leer una línea del archivo
					if (linea != null) { // Si la línea es diferente de nulo (es decir, aún hay datos por leer)
						campos = linea.split(","); // Dividir la línea en campos utilizando la coma como separador
						// Crear un nuevo registro de usuario con los campos obtenidos y agregarlo a la
						// lista
						rex = new RegistroUsuario(campos[0], campos[1], campos[2]);
						re.add(rex);
					}
				} while (linea != null); // Repetir hasta que no haya más líneas que leer
				br.close(); // Cerrar el BufferedReader
				modelo.fireTableDataChanged(); // Notificar al modelo que los datos han cambiado
			} catch (Exception ex) { // Capturar cualquier excepción que pueda ocurrir durante la lectura del archivo
				JOptionPane.showMessageDialog(null, "Error al abrir archivo"); // Mostrar un mensaje de error
			}
		}
	}
}
