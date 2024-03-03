package itz;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;



import java.awt.*;
import java.util.List;

public class ModelTable extends AbstractTableModel {
	private List<RegistroUsuario> re;
	private String[] columnas= {"Usuario ","Correo","Contraseña"};
		 
		public ModelTable(List<RegistroUsuario> re) {
		 this.re= re;
		}
		public int getRowCount() {
			// TODO Auto-generated method stub
			return re.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnas.length;
		}
	public String getColumnName(int columna) {
		return columnas[columna];
	}
		@Override
		
		public Object getValueAt(int fila, int columna) {
			// TODO Auto-generated method stub
			RegistroUsuario registro  = re.get(fila);
			switch(columna) {
			case 0:
				return registro.getNombre();
			case 1:
				return registro.getCorreo();
			case 2:
				return registro.getContraseña();
				default:
					throw new IllegalArgumentException("Coliumna Invalida");
			}
		}

}

