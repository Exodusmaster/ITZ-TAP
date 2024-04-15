package itz;

import java.util.ArrayList;
import java.util.List;

public class DAO {
private List<Usuario> usuarios;
	public DAO() {
	usuarios = new ArrayList<>();
	}
	public int buscar(String usuario) {
		int n=-1;
		for (int i=0; i<usuarios.size();i++) {
			if(usuarios.get(i).getUsuario().equals(usuario)){
				n=i;
				break;
			}
		}
		return n;
	}
	public  boolean insertar(Usuario usuario) {
		if(buscar(usuario.getUsuario())==-1) {
			usuarios.add(usuario);
			return true;
		}else {
			return false;
		}
	}
	public  boolean Modificar(Usuario usuario) {
		if(buscar(usuario.getUsuario())!=-1) {
			Usuario aux=Obtener(usuario.getUsuario());
			
			aux.setContrasna(usuario.getContrasna());
			aux.setApellidos(usuario.getApellidos());
			aux.setCorreo(usuario.getCorreo());
			aux.setNombre(usuario.getNombre());
			
			return true;
		}else {
			return false;
		}
	}
	public  boolean Eliminar(String usuario) {
		if(buscar(usuario)!=-1) {
			usuarios.remove(buscar(usuario));
			return true;
		}else {
			return false;
		}
	}
	public  Usuario Obtener(String usuario) {
		if(buscar(usuario)!=1) {
			return usuarios.get(buscar(usuario));
		}else {
			return null;
		}
	}
	
}
