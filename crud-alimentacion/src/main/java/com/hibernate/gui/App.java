package com.hibernate.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.hibernate.dao.AlimentoDAO;
import com.hibernate.model.Alimento;


import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {

	private JFrame frmAlimentacion;
	private JTable tableAlimentos;
	private JTextField textFieldIdAlimento;
	private JTextField textFieldNombre;
	private JTextField textFieldGrasas;
	private JTextField textFieldGrasasSat;
	private JTextField textFieldAzucar;
	private JTextField textFieldHidratos;
	private JTextField textFieldProteinas;
	private JTextField textFieldSal;
	private JTextField textFieldCalorias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmAlimentacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlimentacion = new JFrame();
		frmAlimentacion.setTitle("ALIMENTACION");
		frmAlimentacion.setBounds(100, 100, 1224, 755);
		frmAlimentacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlimentacion.getContentPane().setLayout(null);
		
		AlimentoDAO alimentoDAO = new AlimentoDAO();

		// Creación la tabla alimentos
		DefaultTableModel modelAlimentos= new DefaultTableModel();
		modelAlimentos.addColumn("Id");
		modelAlimentos.addColumn("Nombre");
		modelAlimentos.addColumn("Grasas");
		modelAlimentos.addColumn("Grasas Saturadas");
		modelAlimentos.addColumn("Hidratos");
		modelAlimentos.addColumn("Azúcares");
		modelAlimentos.addColumn("Proteína");
		modelAlimentos.addColumn("Sal");
		modelAlimentos.addColumn("Calorías");
		
		DefaultTableCellRenderer centrador = new DefaultTableCellRenderer();
		centrador.setHorizontalAlignment(SwingConstants.CENTER);

		tableAlimentos = new JTable(modelAlimentos);
		tableAlimentos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableAlimentos.setBounds(113, 270, 432, 175);
		frmAlimentacion.getContentPane().add(tableAlimentos);
		tableAlimentos.setDefaultEditor(Object.class, null);
		for (int i = 0; i < tableAlimentos.getColumnCount(); i++) {
			tableAlimentos.getColumnModel().getColumn(i).setCellRenderer(centrador);
		}
		
		JScrollPane scrollPaneAlimentos = new JScrollPane(tableAlimentos);
		scrollPaneAlimentos.setBounds(54, 33, 1106, 231);
		frmAlimentacion.getContentPane().add(scrollPaneAlimentos);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFont(new Font("Dialog", Font.BOLD, 11));
		btnCrear.setBackground(new Color(32, 178, 170));
		btnCrear.setBounds(550, 319, 106, 21);
		frmAlimentacion.getContentPane().add(btnCrear);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnActualizar.setBackground(new Color(32, 178, 170));
		btnActualizar.setBounds(550, 388, 106, 21);
		frmAlimentacion.getContentPane().add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnBorrar.setBackground(new Color(32, 178, 170));
		btnBorrar.setBounds(550, 463, 106, 21);
		frmAlimentacion.getContentPane().add(btnBorrar);
		
		JLabel lblIdAlimento = new JLabel("Id:");
		lblIdAlimento.setForeground(new Color(32, 178, 170));
		lblIdAlimento.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIdAlimento.setBounds(100, 302, 73, 13);
		frmAlimentacion.getContentPane().add(lblIdAlimento);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(32, 178, 170));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNombre.setBounds(100, 348, 60, 13);
		frmAlimentacion.getContentPane().add(lblNombre);
		
		JLabel lblGrasas = new JLabel("Grasas:");
		lblGrasas.setForeground(new Color(32, 178, 170));
		lblGrasas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblGrasas.setBounds(100, 391, 99, 13);
		frmAlimentacion.getContentPane().add(lblGrasas);
		
		JLabel lblGrasasSaturadas = new JLabel("Grasas Saturadas:");
		lblGrasasSaturadas.setForeground(new Color(32, 178, 170));
		lblGrasasSaturadas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblGrasasSaturadas.setBounds(100, 430, 141, 13);
		frmAlimentacion.getContentPane().add(lblGrasasSaturadas);
		
		JLabel lblHidratos = new JLabel("Hidratos:");
		lblHidratos.setForeground(new Color(32, 178, 170));
		lblHidratos.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHidratos.setBounds(100, 466, 73, 13);
		frmAlimentacion.getContentPane().add(lblHidratos);
		
		JLabel lblAzucares = new JLabel("Azúcares:");
		lblAzucares.setForeground(new Color(32, 178, 170));
		lblAzucares.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAzucares.setBounds(100, 502, 99, 13);
		frmAlimentacion.getContentPane().add(lblAzucares);
		
		textFieldIdAlimento = new JTextField();
		textFieldIdAlimento.setEditable(false);
		textFieldIdAlimento.setColumns(10);
		textFieldIdAlimento.setBounds(259, 299, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldIdAlimento);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(259, 345, 135, 19);
		frmAlimentacion.getContentPane().add(textFieldNombre);
		
		textFieldGrasas = new JTextField();
		textFieldGrasas.setColumns(10);
		textFieldGrasas.setBounds(259, 388, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldGrasas);
		
		textFieldGrasasSat = new JTextField();
		textFieldGrasasSat.setColumns(10);
		textFieldGrasasSat.setBounds(259, 427, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldGrasasSat);
		
		textFieldAzucar = new JTextField();
		textFieldAzucar.setColumns(10);
		textFieldAzucar.setBounds(259, 499, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldAzucar);
		
		textFieldHidratos = new JTextField();
		textFieldHidratos.setColumns(10);
		textFieldHidratos.setBounds(259, 463, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldHidratos);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnLimpiar.setBackground(new Color(32, 178, 170));
		btnLimpiar.setBounds(550, 532, 106, 21);
		frmAlimentacion.getContentPane().add(btnLimpiar);
		
		JLabel lblProtenias = new JLabel("Proteínas:");
		lblProtenias.setForeground(new Color(32, 178, 170));
		lblProtenias.setBounds(100, 538, 85, 15);
		frmAlimentacion.getContentPane().add(lblProtenias);
		
		textFieldProteinas = new JTextField();
		textFieldProteinas.setBounds(259, 536, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldProteinas);
		textFieldProteinas.setColumns(10);
		
		JLabel lblSal = new JLabel("Sal:");
		lblSal.setForeground(new Color(32, 178, 170));
		lblSal.setBounds(100, 565, 70, 15);
		frmAlimentacion.getContentPane().add(lblSal);
		
		textFieldSal = new JTextField();
		textFieldSal.setBounds(259, 567, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldSal);
		textFieldSal.setColumns(10);
		
		JLabel lblCalorias = new JLabel("Calorías:");
		lblCalorias.setForeground(new Color(32, 178, 170));
		lblCalorias.setBounds(100, 592, 70, 15);
		frmAlimentacion.getContentPane().add(lblCalorias);
		
		textFieldCalorias = new JTextField();
		textFieldCalorias.setBounds(259, 598, 60, 19);
		frmAlimentacion.getContentPane().add(textFieldCalorias);
		textFieldCalorias.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(1029, 296, 117, 25);
		frmAlimentacion.getContentPane().add(btnMostrar);
		
		
		
		
		
		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				List<Alimento> alimentos = new ArrayList<>();

				alimentos = alimentoDAO.selectAllAlimento();

				modelAlimentos.setRowCount(0);
				for (Alimento a : alimentos) {
					Object[] row = new Object[9];
					row[0] = a.getIdAlimento();
					row[1] =a.getNombre();
					row[2] = a.getGrasas();
					row[3] = a.getGrasasSaturadas();
					row[4] = a.getHidratos();
					row[5] = a.getAzucar();
					row[6] = a.getProteinas();
					row[7] = a.getSal();
					row[8] = a.getCalorias();
					modelAlimentos.addRow(row);
				}
				
			}
		});
		
		
		tableAlimentos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int index = tableAlimentos.getSelectedRow();
				TableModel modelAlimentos = tableAlimentos.getModel();
				textFieldIdAlimento.setText(modelAlimentos.getValueAt(index, 0).toString());
				textFieldNombre.setText(modelAlimentos.getValueAt(index, 1).toString());
				textFieldGrasas.setText(modelAlimentos.getValueAt(index, 2).toString());
				textFieldGrasasSat.setText(modelAlimentos.getValueAt(index, 3).toString());
				textFieldHidratos.setText(modelAlimentos.getValueAt(index, 4).toString());
				textFieldAzucar.setText(modelAlimentos.getValueAt(index, 5).toString());
				textFieldProteinas.setText(modelAlimentos.getValueAt(index, 6).toString());
				textFieldSal.setText(modelAlimentos.getValueAt(index, 7).toString());
				textFieldCalorias.setText(modelAlimentos.getValueAt(index, 8).toString());
			}
		});
		
		
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = textFieldNombre.getText();
				double grasas = Double.parseDouble(textFieldGrasas.getText());
				double grasasSat = Double.parseDouble(textFieldGrasasSat.getText());
				double hidratos = Double.parseDouble(textFieldHidratos.getText());
				double azucar = Double.parseDouble(textFieldAzucar.getText());
				double proteinas = Double.parseDouble(textFieldProteinas.getText());
				double sal = Double.parseDouble(textFieldSal.getText());
				double calorias = Double.parseDouble(textFieldCalorias.getText());
				
				Alimento a = new Alimento(nombre,grasas,grasasSat,hidratos,azucar,proteinas,sal,calorias);
				alimentoDAO.insertAlimento(a);
				
				
				
			}
		});
		
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id =Integer.parseInt(textFieldIdAlimento.getText());
				String nombre = textFieldNombre.getText();
				double grasas = Double.parseDouble(textFieldGrasas.getText());
				double grasasSat = Double.parseDouble(textFieldGrasasSat.getText());
				double hidratos = Double.parseDouble(textFieldHidratos.getText());
				double azucar = Double.parseDouble(textFieldAzucar.getText());
				double proteinas = Double.parseDouble(textFieldProteinas.getText());
				double sal = Double.parseDouble(textFieldSal.getText());
				double calorias = Double.parseDouble(textFieldCalorias.getText());
				
				Alimento a =alimentoDAO.selectAlimentoById(id);
			}
		});
	}
}
