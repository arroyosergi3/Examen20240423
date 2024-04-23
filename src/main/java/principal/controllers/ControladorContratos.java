package principal.controllers;

import principal.entities.Contrato;

public class ControladorContratos extends SuperControlador{

private static ControladorContratos instance = null;
	
	public ControladorContratos() {
		super("contrato", Contrato.class);
		// TODO Auto-generated constructor stub
	}

	public static ControladorContratos getInstance() {
		if (instance == null) {
			instance = new ControladorContratos();
		}
		return instance;
	}
	
}
