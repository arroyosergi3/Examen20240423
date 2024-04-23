package principal.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

import principal.controllers.ControladorUsuarios;
import principal.entities.Contrato;

import principal.entities.Usuario;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class PanelContratos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField jtfDescripcion;
	private JTextField jtfSaldo;
	private JTextField jtfLimite;
	private JTextField jtfFechaFirma;
	JComboBox <Usuario>jcbUsuario ;
	JRadioButton jrdCuentaBancaria, jrbTarjetaCredito, jrbTarjetaDebito, jrbPrestamo;

	/**
	 * Create the panel.
	 */
	public PanelContratos(Contrato c) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblGestionDeContratos = new JLabel("Gestion de Contratos");
		GridBagConstraints gbc_lblGestionDeContratos = new GridBagConstraints();
		gbc_lblGestionDeContratos.gridwidth = 3;
		gbc_lblGestionDeContratos.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionDeContratos.gridx = 0;
		gbc_lblGestionDeContratos.gridy = 0;
		add(lblGestionDeContratos, gbc_lblGestionDeContratos);
		
		JLabel lblId = new JLabel("Id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.anchor = GridBagConstraints.NORTH;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de Contrato:");
		GridBagConstraints gbc_lblTipoDeContrato = new GridBagConstraints();
		gbc_lblTipoDeContrato.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeContrato.gridx = 0;
		gbc_lblTipoDeContrato.gridy = 2;
		add(lblTipoDeContrato, gbc_lblTipoDeContrato);
		
		 jrdCuentaBancaria = new JRadioButton("Cuenta Bancaria");
		buttonGroup.add(jrdCuentaBancaria);
		GridBagConstraints gbc_jrdCuentaBancaria = new GridBagConstraints();
		gbc_jrdCuentaBancaria.insets = new Insets(0, 0, 5, 5);
		gbc_jrdCuentaBancaria.gridx = 1;
		gbc_jrdCuentaBancaria.gridy = 2;
		add(jrdCuentaBancaria, gbc_jrdCuentaBancaria);
		
		 jrbTarjetaCredito = new JRadioButton("Tarjeta de Crédito");
		buttonGroup.add(jrbTarjetaCredito);
		GridBagConstraints gbc_jrbTarjetaCredito = new GridBagConstraints();
		gbc_jrbTarjetaCredito.insets = new Insets(0, 0, 5, 0);
		gbc_jrbTarjetaCredito.gridx = 2;
		gbc_jrbTarjetaCredito.gridy = 2;
		add(jrbTarjetaCredito, gbc_jrbTarjetaCredito);
		
		 jrbTarjetaDebito = new JRadioButton("Tarjeta de Débito");
		buttonGroup.add(jrbTarjetaDebito);
		GridBagConstraints gbc_jrbTarjetaDebito = new GridBagConstraints();
		gbc_jrbTarjetaDebito.insets = new Insets(0, 0, 5, 5);
		gbc_jrbTarjetaDebito.gridx = 1;
		gbc_jrbTarjetaDebito.gridy = 3;
		add(jrbTarjetaDebito, gbc_jrbTarjetaDebito);
		
		 jrbPrestamo = new JRadioButton("Préstamo");
		buttonGroup.add(jrbPrestamo);
		GridBagConstraints gbc_jrbPrestamo = new GridBagConstraints();
		gbc_jrbPrestamo.insets = new Insets(0, 0, 5, 0);
		gbc_jrbPrestamo.gridx = 2;
		gbc_jrbPrestamo.gridy = 3;
		add(jrbPrestamo, gbc_jrbPrestamo);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 0;
		gbc_lblDescripcion.gridy = 4;
		add(lblDescripcion, gbc_lblDescripcion);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.gridwidth = 2;
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 1;
		gbc_jtfDescripcion.gridy = 4;
		add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 5;
		add(lblUsuario, gbc_lblUsuario);
		
		 jcbUsuario = new JComboBox<Usuario>();
		GridBagConstraints gbc_jcbUsuario = new GridBagConstraints();
		gbc_jcbUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_jcbUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbUsuario.gridx = 1;
		gbc_jcbUsuario.gridy = 5;
		add(jcbUsuario, gbc_jcbUsuario);
		
		JButton btnGestionarUsuario = new JButton("Gestionar Usuario");
		GridBagConstraints gbc_btnGestionarUsuario = new GridBagConstraints();
		gbc_btnGestionarUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnGestionarUsuario.gridx = 2;
		gbc_btnGestionarUsuario.gridy = 5;
		add(btnGestionarUsuario, gbc_btnGestionarUsuario);
		
		JLabel lblSaldo = new JLabel("Saldo(€):");
		GridBagConstraints gbc_lblSaldo = new GridBagConstraints();
		gbc_lblSaldo.anchor = GridBagConstraints.EAST;
		gbc_lblSaldo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaldo.gridx = 0;
		gbc_lblSaldo.gridy = 6;
		add(lblSaldo, gbc_lblSaldo);
		
		jtfSaldo = new JTextField();
		GridBagConstraints gbc_jtfSaldo = new GridBagConstraints();
		gbc_jtfSaldo.gridwidth = 2;
		gbc_jtfSaldo.insets = new Insets(0, 0, 5, 5);
		gbc_jtfSaldo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSaldo.gridx = 1;
		gbc_jtfSaldo.gridy = 6;
		add(jtfSaldo, gbc_jtfSaldo);
		jtfSaldo.setColumns(10);
		
		JLabel lblLimite = new JLabel("Limite(€):");
		GridBagConstraints gbc_lblLimite = new GridBagConstraints();
		gbc_lblLimite.anchor = GridBagConstraints.EAST;
		gbc_lblLimite.insets = new Insets(0, 0, 5, 5);
		gbc_lblLimite.gridx = 0;
		gbc_lblLimite.gridy = 7;
		add(lblLimite, gbc_lblLimite);
		
		jtfLimite = new JTextField();
		GridBagConstraints gbc_jtfLimite = new GridBagConstraints();
		gbc_jtfLimite.gridwidth = 2;
		gbc_jtfLimite.insets = new Insets(0, 0, 5, 5);
		gbc_jtfLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLimite.gridx = 1;
		gbc_jtfLimite.gridy = 7;
		add(jtfLimite, gbc_jtfLimite);
		jtfLimite.setColumns(10);
		
		JLabel lblFechaDeFirma = new JLabel("Fecha de Firma:");
		GridBagConstraints gbc_lblFechaDeFirma = new GridBagConstraints();
		gbc_lblFechaDeFirma.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeFirma.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeFirma.gridx = 0;
		gbc_lblFechaDeFirma.gridy = 8;
		add(lblFechaDeFirma, gbc_lblFechaDeFirma);
		
		jtfFechaFirma = new JTextField();
		GridBagConstraints gbc_jtfFechaFirma = new GridBagConstraints();
		gbc_jtfFechaFirma.gridwidth = 2;
		gbc_jtfFechaFirma.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFechaFirma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaFirma.gridx = 1;
		gbc_jtfFechaFirma.gridy = 8;
		add(jtfFechaFirma, gbc_jtfFechaFirma);
		jtfFechaFirma.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 9;
		add(btnGuardar, gbc_btnGuardar);
		cargarTodosUsuarios();

	}
	
	
	private void mostrarContrato(Contrato c) {
		this.jtfId.setText(String.valueOf(c.getId()));
		if (c.getIdTipoContrato() == 1) {
			jrdCuentaBancaria.setSelected(true);
		}
		if (c.getIdTipoContrato() == 2) {
			jrbTarjetaDebito.setSelected(true);
		}
		if (c.getIdTipoContrato() == 3) {
			jrbTarjetaCredito.setSelected(true);
		}
		if (c.getIdTipoContrato() == 4) {
			jrbPrestamo.setSelected(true);
		}
		this.jtfDescripcion.setText(c.getDescripcion());
		selUsuario(c);
		this.jtfSaldo.setText(String.valueOf(c.getSaldo()));
		this.jtfLimite.setText(String.valueOf(c.getLimite()));
		this.jtfFechaFirma.setText(String.valueOf(c.getFechaFirma()));
		
		
		
	}
	
	private void selUsuario(Contrato c) {
		for (int i = 0; i < this.jcbUsuario.getItemCount(); i++) {
			if (this.jcbUsuario.getItemAt(i).getId() == c.getIdUsuario()) {
				this.jcbUsuario.setSelectedIndex(i);
			}
		}
	}
	
	private void cargarTodosUsuarios() {
		List<Usuario> l = (List<Usuario>) ControladorUsuarios.getInstance().findAll();
		for (Usuario proveedor : l) {
			this.jcbUsuario.addItem(proveedor);
			;
		}
	}

}
