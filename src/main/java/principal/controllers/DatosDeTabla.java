package principal.controllers;

import java.util.List;

import principal.entities.Contrato;

public class DatosDeTabla {

	private static Object[][] datos = null;
 	
	
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "Descripcion", "Saldo", "Limite", "Fecha Firma", "idTipoContrato", "idUsuario"};
	}
	
	
	public static Object[][] getDatosDeTabla() {
		if (datos == null) {
			List<Contrato> contratos = (List<Contrato>) ControladorContratos.getInstance().findAll();
			datos = new Object[contratos.size()][11];
			for (int i = 0; i < contratos.size(); i++) {
				Contrato e = contratos.get(i);
				datos[i][0] = e.getId();
				datos[i][1] = e.getDescripcion();
				datos[i][2] = e.getSaldo();
				datos[i][3] = e.getLimite();
				datos[i][4] = e.getFechaFirma();
				datos[i][5] = e.getIdTipoContrato();
				datos[i][6] = e.getIdUsuario();
//				System.out.println("Dato añadido a tabla: " + datos[i][0]);
			}
		}
		
		return datos;
	}

	
	
}
