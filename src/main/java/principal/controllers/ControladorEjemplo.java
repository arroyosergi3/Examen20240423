package principal.controllers;


public class ControladorEjemplo extends SuperControlador {

	
	
	private static ControladorEjemplo instance = null;
	
	public ControladorEjemplo() {
		super("ejemplo", Ejemplo.class);
		// TODO Auto-generated constructor stub
	}

	public static ControladorEjemplo getInstance() {
		if (instance == null) {
			instance = new ControladorEjemplo();
		}
		return instance;
	}
	

}
