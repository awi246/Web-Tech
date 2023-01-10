package com.jdbcdemo.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextPane txtpnNumber;
	private JTextPane txtpnNumber_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnAdd;
	private JTextField Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(192, 192, 192));
			panel.setBounds(21, 63, 384, 206);
			panel.setLayout(null);
			panel.add(getTxtNum1());
			panel.add(getTxtNum2());
			panel.add(getTxtpnNumber());
			panel.add(getTxtpnNumber_2());
			panel.add(getBtnAdd());
			panel.add(getResult());
		}
		return panel;
	}
	private JTextField getTxtNum1() {
		if (txtNum1 == null) {
			txtNum1 = new JTextField();
			txtNum1.setBounds(130, 24, 140, 26);
			txtNum1.setColumns(10);
		}
		return txtNum1;
	}
	private JTextField getTxtNum2() {
		if (txtNum2 == null) {
			txtNum2 = new JTextField();
			txtNum2.setColumns(10);
			txtNum2.setBounds(130, 78, 140, 26);
		}
		return txtNum2;
	}
	private JTextPane getTxtpnNumber() {
		if (txtpnNumber == null) {
			txtpnNumber = new JTextPane();
			txtpnNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
			txtpnNumber.setText("Number 1");
			txtpnNumber.setBackground(new Color(192, 192, 192));
			txtpnNumber.setBounds(10, 24, 86, 20);
		}
		return txtpnNumber;
	}
	private JTextPane getTxtpnNumber_2() {
		if (txtpnNumber_2 == null) {
			txtpnNumber_2 = new JTextPane();
			txtpnNumber_2.setText("Number 2");
			txtpnNumber_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			txtpnNumber_2.setBackground(Color.LIGHT_GRAY);
			txtpnNumber_2.setBounds(10, 78, 86, 20);
		}
		return txtpnNumber_2;
	}
	private JButton getBtnCalculate() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(25, 152, 89, 23);
		}
		return btnNewButton;
	}
	
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num1 = Integer.parseInt(txtNum1.getText());
					int num2 = Integer.parseInt(txtNum2.getText());
					
					int sum = num1 + num2;
					
					Result.setText(String.valueOf(sum));
					
				}
			});
			btnAdd.setBounds(20, 152, 89, 23);
		}
		return btnAdd;
	}
	private JTextField getResult() {
		if (Result == null) {
			Result = new JTextField();
			Result.setColumns(10);
			Result.setBounds(222, 169, 140, 26);
		}
		return Result;
	}
}
