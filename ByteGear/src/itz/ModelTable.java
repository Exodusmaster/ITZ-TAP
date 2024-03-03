package itz;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;



import java.awt.*;
import java.util.List;

public class ModelTable extends AbstractTableModel {
	import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModelTable extends AbstractTableModel {
    // Lista de objetos RegistroUsuario
    private List<RegistroUsuario> re;
    // Nombres de las columnas
    private String[] columnas = {"Usuario", "Correo", "Contraseña"};

    // Constructor que recibe la lista de objetos RegistroUsuario
    public ModelTable(List<RegistroUsuario> re) {
        this.re = re;
    }

    // Devuelve el número de filas en la tabla
    @Override
    public int getRowCount() {
        return re.size();
    }

    // Devuelve el número de columnas en la tabla
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    // Devuelve el nombre de la columna especificada
    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

    // Devuelve el valor para la celda en la fila y la columna especificadas
    @Override
    public Object getValueAt(int fila, int columna) {
        RegistroUsuario registro = re.get(fila);
        switch (columna) {
            case 0:
                return registro.getNombre();
            case 1:
                return registro.getCorreo();
            case 2:
                return registro.getContraseña();
            default:
                throw new IllegalArgumentException("Columna Inválida");
        }
    }
}

