package principal.views;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import principal.controllers.DatosDeTabla;


public class PanelEjemplo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel dtm = null;
	private Object datosEnTabla[][] = DatosDeTabla.getDatosDeTabla();
	private String titulosEnTabla[] = DatosDeTabla.getTitulosColumnas();
	private static PanelEjemplo instance = null;
	
	public static PanelEjemplo getInstance() {
		if (instance == null) {
			instance = new PanelEjemplo();
		}
		
		return instance;
	}
	

	/**
	 * Create the panel.
	 */
	public PanelEjemplo() {
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		this.dtm = getDefaultTableModelNoEditable();
		table = new JTable(dtm);
		
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int indiceFilaSel = table.getSelectedRow();
				//ELEGIR ID
				Object value = datosEnTabla[indiceFilaSel][0];
				
				//OBTENER EL OBJETO SELECCIONADO
				Estudiante estSeleccionado = ControladorEstudiantes.getInstance().obtenerEstudiantePorId((Integer)value);
				
				//MOSTRAR EL OBEJTO
				ControladorEstudiantes.getInstance().mostrarEstudiante(estSeleccionado);
				
				//CREAR EL PANEL CORRESPONDIENTE Y AÑADIRLO
				PanelEStudiante panelEstudiante = new PanelEStudiante(estSeleccionado);
				JScrollPane scrollPane2 = new JScrollPane(panelEstudiante);
				splitPane.setRightComponent(scrollPane2);
				splitPane.setResizeWeight(0.2);
				
			}
		});

	}
	
	private DefaultTableModel getDefaultTableModelNoEditable () {
		DefaultTableModel dtm = new DefaultTableModel(datosEnTabla, titulosEnTabla) {
			
			/**
			 * La sobreescritura de este método nos permite controlar qué celdas queremos que sean editables
			 */
			@Override
			public boolean isCellEditable(int row, int column) {
				if (column != 1) {
					return false;
				}
				return true;
			}
		};
		return dtm;
	}

}
