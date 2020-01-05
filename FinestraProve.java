package testoggettiGUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;

import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.Color;

@SuppressWarnings("serial")
public class FinestraProve extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraProve frame = new FinestraProve();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FinestraProve() {
		setResizable(false);
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		JButton btnNewButton = new JButton("New button");
		textField = new JTextField();
		textField.setBounds(15, 54, 86, 20);
		textField.setColumns(10);
		//mammita
		textField_1 = new JTextField();
		textField_1.setBounds(15, 96, 86, 20);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(15, 140, 86, 20);
		textField_2.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(textField);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(194, 50, 225, 121);
		contentPane.add(scrollPane);
		

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"nome", "codice", "prezzo"
			}
		));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		table.setEnabled(false);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		model.addRow(new Object[]{"joe", "00", "tanto"});
		model.addRow(new Object[]{"mama", "00", 60});
		
	
		btnNewButton.setBounds(15, 189, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				model.addRow(new Object[]{textField.getText(), textField_1.getText(), textField_2.getText()});
				table.repaint();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
	}
}
