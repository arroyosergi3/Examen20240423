package principal;

import java.awt.Menu;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;

import principal.views.GestionContratos;



public class Principal extends JFrame{

	static Principal instance = null;
	
	

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	

	public Principal() {
		super("Gestion de Contratos");
		this.setBounds(0,0,800,600);
		GestionContratos gc = new GestionContratos();
		this.getContentPane().add(gc);
		
		
	}
	
	


	public static void main(String[] args) {

		Principal.getInstance().setVisible(true);
		
	}

}
