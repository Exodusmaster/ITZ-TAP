package itz;

public class Usuario {
	private String Usuario;
	private String Contrasna;
	private String Nombre;
	private String Apellidos;
	private String Correo;

	public Usuario(String usuario, String contrasna, String nombre, String apellidos, String correo) {
		super();
		Usuario = usuario;
		Contrasna = contrasna;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContrasna() {
		return Contrasna;
	}

	public void setContrasna(String contrasna) {
		Contrasna = contrasna;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

}
