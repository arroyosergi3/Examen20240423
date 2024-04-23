package principal.controllers;

import principal.entities.Usuario;

public class ControladorUsuarios extends SuperControlador{

private static ControladorUsuarios instance = null;
	
	public ControladorUsuarios() {
		super("usuario", Usuario.class);
		// TODO Auto-generated constructor stub
	}

	public static ControladorUsuarios getInstance() {
		if (instance == null) {
			instance = new ControladorUsuarios();
		}
		return instance;
	}
	
}
