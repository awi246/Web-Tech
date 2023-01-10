package com.jdbcdemo.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jdbcdemo.model.Student;
import com.jdbcdemo.service.StudentService;
import com.jdbcdemo.serviceimpl.StudentServiceImpl;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateStudent extends JFrame {

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
	private JButton btnUpdate;
	private int Sid;

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
	public UpdateStudent() {
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
		contentPane.add(getBtnUpdate());
		
		setVisible(true);
	}
	private JTextField getTxtFName() {
		if (txtFName == null) {
			txtFName = new JTextField();
			txtFName.setColumns(10);
			txtFName.setBounds(311, 43, 240, 20);
		}
		return txtFName;
	}
	private JTextField getTxtMName() {
		if (txtMName == null) {
			txtMName = new JTextField();
			txtMName.setColumns(10);
			txtMName.setBounds(311, 80, 240, 20);
		}
		return txtMName;
	}
	private JTextField getTxtLName() {
		if (txtLName == null) {
			txtLName = new JTextField();
			txtLName.setColumns(10);
			txtLName.setBounds(311, 123, 240, 20);
		}
		return txtLName;
	}
	private JTextField getTxtRollNo() {
		if (txtRollNo == null) {
			txtRollNo = new JTextField();
			txtRollNo.setColumns(10);
			txtRollNo.setBounds(311, 159, 240, 20);
		}
		return txtRollNo;
	}
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setColumns(10);
			txtAddress.setBounds(311, 200, 240, 20);
		}
		return txtAddress;
	}
	private JTextField getTxtPhoneNo() {
		if (txtPhoneNo == null) {
			txtPhoneNo = new JTextField();
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(311, 241, 240, 20);
		}
		return txtPhoneNo;
	}
	private JTextField getTxtDob() {
		if (txtDob == null) {
			txtDob = new JTextField();
			txtDob.setColumns(10);
			txtDob.setBounds(311, 281, 240, 20);
		}
		return txtDob;
	}
	private JTextField getTxtGender() {
		if (txtGender == null) {
			txtGender = new JTextField();
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
			lblViewStudent = new JLabel("Update Student");
			lblViewStudent.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblViewStudent.setBounds(387, 11, 139, 14);
		}
		return lblViewStudent;
	}
	public void setDataInform(int sid) {
		
		
		StudentService impl = new StudentServiceImpl();
		Student student= impl.getStudent(sid);
	
		Sid = sid;
		
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
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtFName.getText().equals("") || txtFName.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "First name is required");
						return;
					}
					
					if(txtLName.getText().equals("") || txtLName.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "Last name is required");
						return;
					}
					
					if(txtRollNo.getText().equals("") || txtRollNo.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "Roll no is required");
						return;
					}
					
					if(txtPhoneNo.getText().equals("") || txtPhoneNo.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "Phone no is required");
						return;
					}
					
					if(txtAddress.getText().equals("") || txtAddress.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "Address is required");
						return;
					}
					
					if(txtDob.getText().equals("") || txtDob.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "DoB is required");
						return;
					}
					
					if(txtGender.getText().equals("") || txtGender.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "Gender is required");
						return;
					}
					
					
					
					Student student2 = new Student();
					student2.setSid(Sid);

					student2.setfName(txtFName.getText());
					student2.setmName(txtMName.getText());
					student2.setlName(txtLName.getText());
					student2.setAddress(txtAddress.getText());
					student2.setPhoneNo(txtPhoneNo.getText());
					student2.setRollNo(Integer.parseInt(txtRollNo.getText()));
					student2.setGender(txtGender.getText());
					student2.setDob(txtDob.getText());
					
					
					StudentServiceImpl impl = new StudentServiceImpl();
					int result = impl.updateStudent(student2);
					
					if(result>0) {
						JOptionPane.showMessageDialog(contentPane, "Data updated Successfully");
						txtFName.setText("");
						txtMName.setText("");
						txtLName.setText("");
						txtPhoneNo.setText("");
						txtRollNo.setText("");
						txtAddress.setText("");
						
						new StudentRegistration();
						dispose();
						
						
					}
				
					
				}
			});
			btnUpdate.setBounds(732, 409, 89, 23);
		}
		return btnUpdate;
	}
}
