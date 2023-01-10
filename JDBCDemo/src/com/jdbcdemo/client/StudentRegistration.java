package com.jdbcdemo.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import com.jdbcdemo.model.Student;
import com.jdbcdemo.serviceimpl.StudentServiceImpl;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentRegistration extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JTextField txtFname;
	private JTextField txtMname;
	private JTextField txtLname;
	private JTextField txtRollNo;
	private JLabel fName;
	private JLabel mName;
	private JLabel lName;
	private JLabel rollNo;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JButton btnSave;
	private JPanel genderPanel;
	private JLabel lblAddress;
	private JLabel lblPhoneno;
	private JTextField txtAddress;
	private JTextField txtPhoneNo;
	private JLabel lblDob;
	private JComboBox<Object> cmBoxYear;
	private JComboBox<Object> cmBoxMonth;
	private JComboBox<Object> cmBoxDay;
	private JRadioButton rdbtnOthers;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnView;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRegistration frame = new StudentRegistration();
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
	public StudentRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getBtnView());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnUpdate());
		contentPane.add(getBtnExit());
		populateData();
		setVisible(true);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(null);
			panel.setBackground(new Color(224, 255, 255));
			panel.setBounds(22, 11, 874, 203);
			panel.setLayout(null);
			panel.add(getTxtFname());
			panel.add(getTxtMname());
			panel.add(getTxtLname());
			panel.add(getTxtRollNo());
			panel.add(getFName());
			panel.add(getMName());
			panel.add(getLName());
			panel.add(getRollNo());
			panel.add(getRdbtnMale());
			panel.add(getRdbtnFemale());
			panel.add(getLblAddress());
			panel.add(getLblPhoneno());
			panel.add(getTxtAddress());
			panel.add(getTxtPhoneNo());
			panel.add(getLblDob());
			panel.add(getCmBoxYear());
			panel.add(getCmBoxMonth());
			panel.add(getCmBoxDay());
			panel.add(getBtnSave());
			panel.add(getRdbtnOthers());
			panel.add(getGenderPanel());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 192, 203));
			panel_1.setBorder(null);
			panel_1.setBounds(22, 214, 874, 192);
			panel_1.setLayout(null);
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}
	private JTextField getTxtFname() {
		if (txtFname == null) {
			txtFname = new JTextField();
			txtFname.setBounds(178, 15, 240, 20);
			txtFname.setColumns(10);
		}
		return txtFname;
	}
	private JTextField getTxtMname() {
		if (txtMname == null) {
			txtMname = new JTextField();
			txtMname.setColumns(10);
			txtMname.setBounds(178, 46, 240, 20);
		}
		return txtMname;
	}
	private JTextField getTxtLname() {
		if (txtLname == null) {
			txtLname = new JTextField();
			txtLname.setColumns(10);
			txtLname.setBounds(178, 77, 240, 20);
		}
		return txtLname;
	}
	private JTextField getTxtRollNo() {
		if (txtRollNo == null) {
			txtRollNo = new JTextField();
			txtRollNo.setColumns(10);
			txtRollNo.setBounds(178, 108, 240, 20);
		}
		return txtRollNo;
	}
	private JLabel getFName() {
		if (fName == null) {
			fName = new JLabel("First Name");
			fName.setBounds(32, 14, 71, 14);
		}
		return fName;
	}
	private JLabel getMName() {
		if (mName == null) {
			mName = new JLabel("Middle Name");
			mName.setBounds(32, 49, 71, 14);
		}
		return mName;
	}
	private JLabel getLName() {
		if (lName == null) {
			lName = new JLabel("Last Name");
			lName.setBounds(32, 80, 71, 14);
		}
		return lName;
	}
	private JLabel getRollNo() {
		if (rollNo == null) {
			rollNo = new JLabel("Roll No");
			rollNo.setBounds(32, 111, 71, 14);
		}
		return rollNo;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			buttonGroup.add(rdbtnMale);
			rdbtnMale.setBackground(new Color(255, 255, 255));
			rdbtnMale.setBounds(61, 158, 65, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setBackground(Color.WHITE);
			rdbtnFemale.setBounds(187, 158, 81, 23);
		}
		return rdbtnFemale;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtFname.getText().equals("") || txtFname.getText()==null) {
						
						JOptionPane.showMessageDialog(contentPane, "First name is required");
						return;
					}
					
					if(txtLname.getText().equals("") || txtLname.getText()==null) {
						
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
					
					String year = cmBoxYear.getSelectedItem().toString();
					String month = cmBoxMonth.getSelectedItem().toString();
					String day = cmBoxDay.getSelectedItem().toString();
					
					
					if(year.equals("YYYY") || month.equals("MM") || day.equals("DD")) 
					{
						
						JOptionPane.showMessageDialog(contentPane, "Select Dob field");
						return;
					}
					
					
					Student student2 = new Student();
					

					student2.setfName(txtFname.getText());
					student2.setmName(txtMname.getText());
					student2.setlName(txtLname.getText());
					
					if(rdbtnMale.isSelected()) {
						student2.setGender("Male");	
					}
					
					else if(rdbtnFemale.isSelected()) {
						student2.setGender("Female");
					}
					
					else {
						student2.setGender("Others");
					}
					
					student2.setAddress(txtAddress.getText());
					student2.setPhoneNo(txtPhoneNo.getText());
					student2.setRollNo(Integer.parseInt(txtRollNo.getText()));
					String dob= year+"-"+month+"-"+day;
					
					student2.setDob(dob);
					
					
					StudentServiceImpl impl = new StudentServiceImpl();
					int result = impl.addStudent(student2);
					
					if(result>0) {
						JOptionPane.showMessageDialog(contentPane, "Data inserted Successfully");
						txtFname.setText("");
						txtMname.setText("");
						txtLname.setText("");
						txtPhoneNo.setText("");
						txtRollNo.setText("");
						txtAddress.setText("");
						cmBoxYear.setSelectedIndex(0);
						cmBoxMonth.setSelectedIndex(0);
						cmBoxDay.setSelectedIndex(0);
						populateData();
						
						
					}
				}
			});
			btnSave.setBounds(646, 158, 89, 23);
		}
		return btnSave;
	}
	private JPanel getGenderPanel() {
		if (genderPanel == null) {
			genderPanel = new JPanel();
			genderPanel.setBounds(32, 139, 398, 53);
			genderPanel.setBackground(new Color(230, 230, 250));
			genderPanel.setBorder(new TitledBorder(null, "Gender", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			genderPanel.setLayout(new BorderLayout(0, 0));
		}
		return genderPanel;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(476, 49, 71, 14);
		}
		return lblAddress;
	}
	private JLabel getLblPhoneno() {
		if (lblPhoneno == null) {
			lblPhoneno = new JLabel("PhoneNo");
			lblPhoneno.setBounds(476, 80, 71, 14);
		}
		return lblPhoneno;
	}
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setColumns(10);
			txtAddress.setBounds(584, 46, 240, 20);
		}
		return txtAddress;
	}
	private JTextField getTxtPhoneNo() {
		if (txtPhoneNo == null) {
			txtPhoneNo = new JTextField();
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(584, 77, 240, 20);
		}
		return txtPhoneNo;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DoB");
			lblDob.setBounds(476, 14, 71, 14);
		}
		return lblDob;
	}
	private JComboBox getCmBoxYear() {
		if (cmBoxYear == null) {
			cmBoxYear = new JComboBox<Object>();
			cmBoxYear.setModel(new DefaultComboBoxModel(new String[] {"YYYY"}));
			cmBoxYear.setBounds(584, 10, 53, 22);
			
			for(int i=1922;i<2030;i++) {
				cmBoxYear.addItem(i);
			}
		}
		return cmBoxYear;
	}
	private JComboBox getCmBoxMonth() {
		if (cmBoxMonth == null) {
			cmBoxMonth = new JComboBox<Object>();
			cmBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"MM"}));
			cmBoxMonth.setBounds(680, 10, 53, 22);
			
			for(int i=1;i<13;i++) {
				cmBoxMonth.addItem(i);
			}
		}
		return cmBoxMonth;
	}
	private JComboBox getCmBoxDay() {
		if (cmBoxDay == null) {
			cmBoxDay = new JComboBox<Object>();
			cmBoxDay.setModel(new DefaultComboBoxModel(new String[] {"DD"}));
			cmBoxDay.setBounds(777, 10, 48, 22);
			
			for(int i=1;i<33;i++) {
				cmBoxDay.addItem(i);
			
			}
		}
		return cmBoxDay;
	}
	private JRadioButton getRdbtnOthers() {
		if (rdbtnOthers == null) {
			rdbtnOthers = new JRadioButton("Others");
			buttonGroup.add(rdbtnOthers);
			rdbtnOthers.setBackground(Color.WHITE);
			rdbtnOthers.setBounds(324, 158, 81, 23);
		}
		return rdbtnOthers;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 0, 874, 192);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Sid", "First Name", "Middle Name", "Last Name", "Roll No", "Phone No", "Address", "DoB", "Gender"
				}
			));
		}
		return table;
		
	}
	private void populateData() {
		
		StudentServiceImpl impl = new StudentServiceImpl();
		List<Student> studentList =  impl.getStudents();
		
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);
		
		
		for(Student std : studentList) {
			
			tableModel.addRow(new Object[] {std.getSid(), std.getfName(),std.getmName(),std.getlName(),std.getRollNo(),std.getPhoneNo(),std.getAddress(),std.getDob(),std.getGender()});
			
		}
		
		
		
			
		
	}
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("View");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					int selectedRow = table.getSelectedRow();
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(contentPane,"Please select any row");
						return;
					}
					int sid = (int) table.getModel().getValueAt(selectedRow,0);
					
					StudentServiceImpl impl = new StudentServiceImpl();
					Student student = impl.getStudent(sid);
					
					new ViewStudent().setDataInform(student);
					dispose();
					
					
				}
			});
			btnView.setBounds(67, 437, 89, 23);
		}
		return btnView;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				int selectedRow = table.getSelectedRow();
					
					if(selectedRow<0) {
						JOptionPane.showMessageDialog(contentPane,"Please select any row");
						return;
					}
					int sid = (int) table.getModel().getValueAt(selectedRow,0);
					
					StudentServiceImpl impl = new StudentServiceImpl();
					String message = impl.deleteStudent(sid);
					
					if(message!=null) {
						JOptionPane.showMessageDialog(contentPane, "Data Deleted Successfully");
						populateData();
					}
					
					else {
						JOptionPane.showMessageDialog(contentPane, "Failed to Delete");
					}
					
				}
			});
			btnDelete.setBounds(280, 437, 89, 23);
		}
		return btnDelete;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					int selectedRow = table.getSelectedRow();
					
					if(selectedRow<0) {
						JOptionPane.showMessageDialog(contentPane,"Please select any row");
						return;
					}
					int sid = (int) table.getModel().getValueAt(selectedRow,0);
					
					
					new UpdateStudent().setDataInform(sid);
					dispose();
					
					
					
				}
			});
			btnUpdate.setBounds(479, 437, 89, 23);
		}
		return btnUpdate;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnExit.setBounds(692, 437, 89, 23);
		}
		return btnExit;
	}
}
