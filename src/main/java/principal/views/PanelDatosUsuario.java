package principal.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import principal.entities.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDatosUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfUsuario;
	private JPasswordField jpfContraseña;
	private JTextField jtfEmail;
	JComboBox <String>jcbColorPreferido;

	/**
	 * Create the panel.
	 */
	public PanelDatosUsuario(Usuario u) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestion Datos de Usuario");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblId = new JLabel("Id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 2;
		add(lblUsuario, gbc_lblUsuario);
		
		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridx = 1;
		gbc_jtfUsuario.gridy = 2;
		add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 3;
		add(lblContrasea, gbc_lblContrasea);
		
		jpfContraseña = new JPasswordField();
		GridBagConstraints gbc_jpfContraseña = new GridBagConstraints();
		gbc_jpfContraseña.insets = new Insets(0, 0, 5, 0);
		gbc_jpfContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_jpfContraseña.gridx = 1;
		gbc_jpfContraseña.gridy = 3;
		add(jpfContraseña, gbc_jpfContraseña);
		
		JLabel lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 4;
		add(lblEmail, gbc_lblEmail);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 4;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblColorPreferido = new JLabel("Color Preferido:");
		GridBagConstraints gbc_lblColorPreferido = new GridBagConstraints();
		gbc_lblColorPreferido.insets = new Insets(0, 0, 5, 5);
		gbc_lblColorPreferido.anchor = GridBagConstraints.EAST;
		gbc_lblColorPreferido.gridx = 0;
		gbc_lblColorPreferido.gridy = 5;
		add(lblColorPreferido, gbc_lblColorPreferido);
		
		 jcbColorPreferido = new JComboBox<String>();
		GridBagConstraints gbc_jcbColorPreferido = new GridBagConstraints();
		gbc_jcbColorPreferido.insets = new Insets(0, 0, 5, 0);
		gbc_jcbColorPreferido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbColorPreferido.gridx = 1;
		gbc_jcbColorPreferido.gridy = 5;
		add(jcbColorPreferido, gbc_jcbColorPreferido);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 7;
		add(btnGuardar, gbc_btnGuardar);
		cargarColores();
		mostrardatos(u);

	}
	
	private boolean isEmailvalido() {
		if (this.jtfEmail.getText().matches("/d{+}[@]/d{+}[.]/d{+}")) {
			return true;
		}
		return false;
	}
	
	private void guardar() {

		if (!this.jtfUsuario.getText().isEmpty()) {
			if (!this.jpfContraseña.getText().isEmpty()) {
				if (isEmailvalido()) {
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Error, el email no es valido");

				}
				
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, la contraseña está vacio");

			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error, el nombre de usuario está vacio");
		}
	}
	
	
	private void mostrardatos(Usuario us) {
		this.jtfId.setText(String.valueOf(us.getId()));
		this.jtfUsuario.setText(us.getNombreUsuario());
		this.jpfContraseña.setText(us.getPassword());
		this.jtfEmail.setText(us.getEmail());
		for (int i = 0; i < this.jcbColorPreferido.getItemCount(); i++) {
			if (this.jcbColorPreferido.getItemAt(i).toString().matches(us.getColorPreferido())) {
				this.jcbColorPreferido.setSelectedIndex(i);
			}
		}
		this.setBackground(Color.decode(this.jcbColorPreferido.getSelectedItem().toString()));
		
	}
	
	private void cargarColores() {
		this.jcbColorPreferido.addItem("#FF00FF");
		this.jcbColorPreferido.addItem("#9890A5");
		this.jcbColorPreferido.addItem("#765456");
		this.jcbColorPreferido.addItem("#879876");
	}
	
	
	
	
	
	

}
