package com.jdbcdemo.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jdbcdemo.model.Student;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtMName;
	private JTextField txtLName;
	private JTextField txtRollNo;
	private JTextField txtAddress;
	private JTextField txtPhoneNo;
	private JTextField txtDob;
	private JTextField txtGender;
	private JLabel fName;
	private JLabel lblMiddleName;
	private JLabel lblLastName;
	private JLabel lblRollNo;
	private JLabel lblAddress;
	private JLabel lblPhoneNo;
	private JLabel lblDob;
	private JLabel lblGender;
	private JLabel lblViewStudent;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudent frame = new ViewStudent();
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
	public ViewStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtFName());
		contentPane.add(getTxtMName());
		contentPane.add(getTxtLName());
		contentPane.add(getTxtRollNo());
		contentPane.add(getTxtAddress());
		contentPane.add(getTxtPhoneNo());
		contentPane.add(getTxtDob());
		contentPane.add(getTxtGender());
		contentPane.add(getFName());
		contentPane.add(getLblMiddleName());
		contentPane.add(getLblLastName());
		contentPane.add(getLblRollNo());
		contentPane.add(getLblAddress());
		contentPane.add(getLblPhoneNo());
		contentPane.add(getLblDob());
		contentPane.add(getLblGender());
		contentPane.add(getLblViewStudent());
		contentPane.add(getBtnBack());
		
		setVisible(true);
	}
	private JTextField getTxtFName() {
		if (txtFName == null) {
			txtFName = new JTextField();
			txtFName.setEditable(false);
			txtFName.setColumns(10);
			txtFName.setBounds(311, 43, 240, 20);
		}
		return txtFName;
	}
	private JTextField getTxtMName() {
		if (txtMName == null) {
			txtMName = new JTextField();
			txtMName.setEditable(false);
			txtMName.setColumns(10);
			txtMName.setBounds(311, 80, 240, 20);
		}
		return txtMName;
	}
	private JTextField getTxtLName() {
		if (txtLName == null) {
			txtLName = new JTextField();
			txtLName.setEditable(false);
			txtLName.setColumns(10);
			txtLName.setBounds(311, 123, 240, 20);
		}
		return txtLName;
	}
	private JTextField getTxtRollNo() {
		if (txtRollNo == null) {
			txtRollNo = new JTextField();
			txtRollNo.setEditable(false);
			txtRollNo.setColumns(10);
			txtRollNo.setBounds(311, 159, 240, 20);
		}
		return txtRollNo;
	}
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setEditable(false);
			txtAddress.setColumns(10);
			txtAddress.setBounds(311, 200, 240, 20);
		}
		return txtAddress;
	}
	private JTextField getTxtPhoneNo() {
		if (txtPhoneNo == null) {
			txtPhoneNo = new JTextField();
			txtPhoneNo.setEditable(false);
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(311, 241, 240, 20);
		}
		return txtPhoneNo;
	}
	private JTextField getTxtDob() {
		if (txtDob == null) {
			txtDob = new JTextField();
			txtDob.setEditable(false);
			txtDob.setColumns(10);
			txtDob.setBounds(311, 281, 240, 20);
		}
		return txtDob;
	}
	private JTextField getTxtGender() {
		if (txtGender == null) {
			txtGender = new JTextField();
			txtGender.setEditable(false);
			txtGender.setColumns(10);
			txtGender.setBounds(311, 323, 240, 20);
		}
		return txtGender;
	}
	private JLabel getFName() {
		if (fName == null) {
			fName = new JLabel("First Name");
			fName.setBounds(79, 43, 71, 14);
		}
		return fName;
	}
	private JLabel getLblMiddleName() {
		if (lblMiddleName == null) {
			lblMiddleName = new JLabel("Middle Name");
			lblMiddleName.setBounds(79, 80, 71, 14);
		}
		return lblMiddleName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(79, 126, 71, 14);
		}
		return lblLastName;
	}
	private JLabel getLblRollNo() {
		if (lblRollNo == null) {
			lblRollNo = new JLabel("Roll No");
			lblRollNo.setBounds(79, 159, 71, 14);
		}
		return lblRollNo;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(79, 200, 71, 14);
		}
		return lblAddress;
	}
	private JLabel getLblPhoneNo() {
		if (lblPhoneNo == null) {
			lblPhoneNo = new JLabel("Phone No");
			lblPhoneNo.setBounds(79, 241, 71, 14);
		}
		return lblPhoneNo;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DoB");
			lblDob.setBounds(79, 281, 71, 14);
		}
		return lblDob;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(79, 323, 71, 14);
		}
		return lblGender;
	}
	private JLabel getLblViewStudent() {
		if (lblViewStudent == null) {
			lblViewStudent = new JLabel("View Student");
			lblViewStudent.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblViewStudent.setBounds(387, 11, 139, 14);
		}
		return lblViewStudent;
	}
	public void setDataInform(Student student) {
		
		txtFName.setText(student.getfName());
		txtMName.setText(student.getmName());
		txtLName.setText(student.getlName());
		txtAddress.setText(student.getAddress());
		txtRollNo.setText(String.valueOf(student.getRollNo()));
		txtPhoneNo.setText(student.getPhoneNo());
		txtGender.setText(student.getGender());
		txtDob.setText(student.getDob());
		
			
		
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new StudentRegistration();
					dispose();
				}
			});
			btnBack.setBounds(39, 409, 89, 23);
		}
		return btnBack;
	}
}
