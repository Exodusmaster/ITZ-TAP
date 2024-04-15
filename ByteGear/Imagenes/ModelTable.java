package itz;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import java.awt.*;
import java.util.List;

//Clase que representa el modelo de la tabla
public class ModelTable extends AbstractTableModel {

	// Lista de registros de usuarios
	private List<Usuario> re;
	// Nombres de las columnas
	private String[] columnas = { "Usuario", "Correo", "Contraseña" };

	// Constructor que recibe la lista de registros de usuarios
	public ModelTable(List<Usuario> re) {
		this.re = re;
	}

	// Método para obtener el número de filas
	@Override
	public int getRowCount() {
		return re.size();
	}

	// Método para obtener el número de columnas
	@Override
	public int getColumnCount() {
		return columnas.length;
	}

	// Método para obtener el nombre de una columna
	@Override
	public String getColumnName(int columna) {
		return columnas[columna];
	}

	// Método para obtener el valor de una celda en una posición específica
	@Override
	public Object getValueAt(int fila, int columna) {
		// Obtener el registro de usuario en la fila especificada
		Usuario registro = re.get(fila);
		// Según la columna especificada, devolver el valor correspondiente del registro
		switch (columna) {
		case 0:
			return registro.getNombre(); // Devolver el nombre del usuario
		case 1:
			return registro.getCorreo(); // Devolver el correo electrónico del usuario
		case 2:
			return registro.getContrasna(); // Devolver la contraseña del usuario
		default:
			throw new IllegalArgumentException("Columna inválida"); // Lanzar una excepción si la columna no es válida
		}
	}
}
