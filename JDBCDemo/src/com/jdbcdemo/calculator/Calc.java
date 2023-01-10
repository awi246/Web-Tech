package com.jdbcdemo.calculator;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnDivide;
	private JButton btn4;
	private JButton btn1;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSubtract;
	private JButton btn2;
	private JButton btn3;
	private JButton btnAdd;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnEqualsTo;
	private JButton btnMultiply;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getBtn7());
		contentPane.add(getBtn8());
		contentPane.add(getBtn9());
		contentPane.add(getBtnDivide());
		contentPane.add(getBtn4());
		contentPane.add(getBtn1());
		contentPane.add(getBtn5());
		contentPane.add(getBtn6());
		contentPane.add(getBtnSubtract());
		contentPane.add(getBtn2());
		contentPane.add(getBtn3());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtn0());
		contentPane.add(getBtnDot());
		contentPane.add(getBtnEqualsTo());
		contentPane.add(getBtnMultiply());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 23, 365, 67);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn7.setBounds(10, 118, 65, 33);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);	
					
				}
			});
			btn8.setBounds(111, 118, 65, 33);
			
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn9.setBounds(210, 118, 65, 33);
		}
		return btn9;
	}
	private JButton getBtnDivide() {
		if (btnDivide == null) {
			btnDivide = new JButton("/");
			btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnDivide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDivide.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btnDivide.setBounds(313, 118, 65, 33);
		}
		return btnDivide;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn4.setBounds(10, 191, 65, 33);
		}
		return btn4;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn1.setBounds(10, 261, 65, 33);
		}
		return btn1;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn5.setBounds(111, 191, 65, 33);
		}
		return btn5;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn6.setBounds(210, 191, 65, 33);
		}
		return btn6;
	}
	private JButton getBtnSubtract() {
		if (btnSubtract == null) {
			btnSubtract = new JButton("-");
			btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnSubtract.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnSubtract.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btnSubtract.setBounds(313, 191, 65, 33);
		}
		return btnSubtract;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn2.setBounds(111, 261, 65, 33);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
				
					
					
				}
			});
			btn3.setBounds(210, 261, 65, 33);
		}
		return btn3;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number=textField.getText()+btnAdd.getText();
					textField.setText(number);
				}
			});
			btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnAdd.setBounds(313, 261, 65, 33);
		}
		return btnAdd;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number=textField.getText()+btn0.getText();
					textField.setText(number);
				}
			});
			btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn0.setBounds(10, 323, 65, 33);
		}
		return btn0;
	}
	private JButton getBtnDot() {
		if (btnDot == null) {
			btnDot = new JButton(".");
			btnDot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number=textField.getText()+btnDot.getText();
					textField.setText(number);
				}
			});
			btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnDot.setBounds(111, 323, 65, 33);
		}
		return btnDot;
	}
	private JButton getBtnEqualsTo() {
		if (btnEqualsTo == null) {
			btnEqualsTo = new JButton("=");
			btnEqualsTo.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnEqualsTo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number=textField.getText()+btnEqualsTo.getText();
					textField.setText(number);
				}
			});
			btnEqualsTo.setBounds(210, 323, 65, 33);
		}
		return btnEqualsTo;
	}
	private JButton getBtnMultiply() {
		if (btnMultiply == null) {
			btnMultiply = new JButton("x");
			btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnMultiply.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number=textField.getText()+btnMultiply.getText();
					textField.setText(number);
				}
			});
			btnMultiply.setBounds(310, 323, 65, 33);
		}
		return btnMultiply;
	}
}
