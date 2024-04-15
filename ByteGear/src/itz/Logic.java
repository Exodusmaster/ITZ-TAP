package itz;

public class Logic {
	private static DAO usu = new DAO();

	public static boolean verificar(String usuario, String contra) {
		if(obtener(usuario)!=null) {
			Usuario consul=obtener(usuario);
			if(consul.getUsuario().equals(usuario)&&consul.getContrasna().equals(contra)) {
				return true;
			}else {
				return false;
			}
		}else {
		return false;
		}
	}

	public static boolean insertar(Usuario usuario) {

		return usu.insertar(usuario);
	}

	public static boolean modificar(Usuario usuario) {
		return usu.Modificar(usuario);
	}

	public static boolean eliminar(String usuario) {
		return usu.Eliminar(usuario);
	}

	public static Usuario obtener(String usuario) {
		return usu.Obtener(usuario);
	}
}
