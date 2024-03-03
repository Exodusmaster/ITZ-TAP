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

		private List<RegistroUsuario> re;
		private JTable  tablaAlu;
	    private JTable tablaRegistro;
		private JButton btnagregar,btneliminar,btnmodificar;
		private ModelTable modelo;
		private JScrollPane scroll;
		private JMenuBar menubar;
		private JMenu menu;
		private JMenuItem guardar,cargar;
		public tabla() {
			// TODO Auto-generated constructor stub
			super("Registro Usuario");
	    	menubar=new JMenuBar();
	    	menu=new JMenu("Archivo");
	    	guardar=new JMenuItem("Guardar");
	    	guardar.addActionListener(this);
	    	cargar=new JMenuItem("Cargar");
	    	cargar.addActionListener(this);
	    	menu.add(guardar);menu.add(cargar);
	    	menubar.add(menu);
	    	this.setJMenuBar(menubar);
	    	re=new ArrayList<RegistroUsuario>();
	    	modelo=new ModelTable(re);
	    	tablaRegistro=new JTable(modelo);
	    	scroll=new JScrollPane();
	    	scroll.setPreferredSize(new Dimension(200,200));
	    	scroll.setViewportView(tablaRegistro);
	    	btnagregar=new JButton("Agregar");
	    	btnagregar.addActionListener(this);
	    	btneliminar=new JButton("Eliminar");
	    	btneliminar.addActionListener(this);
	    	btnmodificar=new JButton("Modificar");
	    	btnmodificar.addActionListener(this);
	    	this.setLayout(new FlowLayout());
	    	this.setSize(300,300);
	    	this.add(scroll);
	    	this.add(btnagregar);
	    	this.add(btneliminar);
	    	this.add(btnmodificar);
	    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	this.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnagregar) {
					RegistroUsuario rex=new RegistroUsuario();
					rex.pedirDatos();
					if (rex.getNombre()!=null) {
						re.add(rex);
						modelo.fireTableDataChanged();
					}
				}
				if (e.getSource()==btneliminar) {
					int pos=tablaRegistro.getSelectedRow();
					if (pos>=0) {
						re.remove(pos);
						modelo.fireTableDataChanged();
					}
				}
				if (e.getSource()==btnmodificar) {
					int pos=tablaRegistro.getSelectedRow();
					if (pos>=0) {
					     RegistroUsuario rex=re.get(pos);
					     rex.modificarDatos();
					     if (rex.getNombre()!=null) {
								re.set(pos, rex);
								modelo.fireTableDataChanged();
						 }
					}
				}
				if (e.getSource()==guardar) {
					try {
						FileWriter archivo=new FileWriter("Registro.csv");
						BufferedWriter bw=new BufferedWriter(archivo);
						for (RegistroUsuario a:re) {
							bw.append(a.toString());
						}
						bw.close();
		   JOptionPane.showMessageDialog(null,"Archivo creado con exito");			
					} catch (IOException e1) {
			JOptionPane.showMessageDialog(null,"Error al crear archivo");
					}
				}
			if (e.getSource()==cargar) {
				try {
					re.clear();
					FileReader archivo=new FileReader("Registro.csv");
					BufferedReader br=new BufferedReader(archivo);
					RegistroUsuario rex;String linea="";
					String campos[];
					do {
						linea=br.readLine();
						if (linea!=null) {
						campos=linea.split(",");
						rex=new RegistroUsuario(campos[0],campos[1],campos[2]);
						re.add(rex);}
					} while (linea!=null);
					br.close();
					modelo.fireTableDataChanged();
				} catch (Exception ex) {

		JOptionPane.showMessageDialog(null,"Error al abrir archivo");		
				}
			}	
			}
}
