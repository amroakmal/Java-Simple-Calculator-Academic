import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class Calculator2 {

	private Calculator calc;

	private JFrame frmCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 window = new Calculator2();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public int j = 1;

	private void history() {
		if (j == 1) {
			textField_2.setText(calc.getCurrent());
			j++;
		} else if (j == 2) {
			textField_3.setText(calc.getCurrent());
			j++;
		} else if (j == 3) {
			textField_4.setText(calc.getCurrent());
			j++;
		} else if (j == 4) {
			textField_5.setText(calc.getCurrent());
			j++;
		} else if (j == 5) {
			textField_6.setText(calc.getCurrent());
			j++;
		}
	}

	/**
	 * Create the application.
	 */
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtHistory;
	private JTextField txtAnswer;
	private JTextField txtTrigFunc;
	private JTextField txtCurrent;
	private JTextField textField_7;

	public Calculator2() {
		initialize();
		calc = new Calculator();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(new Color(51, 255, 255));
		frmCalculator.setResizable(false);
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setBounds(100, 100, 500, 513);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(214, 68, 86, 20);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(108, 284, 89, 23);
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});

		JButton button = new JButton("8");
		button.setBounds(212, 284, 89, 23);
		button.setBackground(new Color(255, 255, 0));
		button.setForeground(new Color(0, 0, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});

		JButton button_1 = new JButton("9");
		button_1.setBounds(320, 284, 89, 23);
		button_1.setBackground(new Color(255, 255, 0));
		button_1.setForeground(new Color(0, 0, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});

		JButton button_2 = new JButton("4");
		button_2.setBounds(108, 328, 89, 23);
		button_2.setForeground(new Color(0, 0, 255));
		button_2.setBackground(new Color(255, 255, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});

		JButton button_3 = new JButton("5");
		button_3.setBounds(209, 328, 89, 23);
		button_3.setBackground(new Color(255, 255, 0));
		button_3.setForeground(new Color(0, 0, 255));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});

		JButton button_4 = new JButton("6");
		button_4.setBounds(320, 328, 89, 23);
		button_4.setBackground(new Color(255, 255, 0));
		button_4.setForeground(new Color(0, 0, 255));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});

		JButton button_5 = new JButton("1");
		button_5.setBounds(108, 371, 89, 23);
		button_5.setBackground(new Color(255, 255, 0));
		button_5.setForeground(new Color(0, 0, 255));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});

		JButton button_6 = new JButton("2");
		button_6.setBounds(209, 371, 89, 23);
		button_6.setBackground(new Color(255, 255, 0));
		button_6.setForeground(new Color(0, 0, 255));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});

		JButton button_7 = new JButton("3");
		button_7.setBounds(320, 371, 89, 23);
		button_7.setBackground(new Color(255, 255, 0));
		button_7.setForeground(new Color(0, 0, 255));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(429, 284, 43, 23);
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(1);
					textField.setText("");
					textField_1.setText(calc.getNumber1() + "+");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
				}

			}
		});

		JButton button_8 = new JButton("-");
		button_8.setBounds(429, 328, 43, 23);
		button_8.setForeground(new Color(255, 0, 0));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(2);
					textField.setText("");
					textField_1.setText(calc.getNumber1() + "-");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
				}

			}
		});

		JButton button_9 = new JButton("*");
		button_9.setBounds(429, 371, 43, 23);
		button_9.setForeground(new Color(255, 0, 0));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(3);
					textField.setText("");
					textField_1.setText(calc.getNumber1() + "*");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
				}

			}
		});

		JButton button_10 = new JButton("/");
		button_10.setBounds(429, 405, 43, 23);
		button_10.setForeground(new Color(255, 0, 0));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(4);
					textField.setText("");
					textField_1.setText(calc.getNumber1() + "/");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
				}

			}
		});

		JButton btnNewButton_2 = new JButton(".");
		btnNewButton_2.setBounds(320, 405, 37, 23);
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Invalid Input");
					textField.setText("");
				}
			}
		});

		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.setBounds(429, 250, 43, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});

		JButton btnNewButton_4 = new JButton("<--");
		btnNewButton_4.setBounds(391, 213, 49, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					// Creates/Builds an *EMPTY* String
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length() - 1);
					textField.setText(sb.toString());
				}
			}
		});
		JButton btnNewButton_5 = new JButton("0");
		btnNewButton_5.setBounds(108, 405, 86, 23);
		btnNewButton_5.setForeground(new Color(0, 0, 255));
		btnNewButton_5.setBackground(new Color(255, 255, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});

		JButton btnNewButton_6 = new JButton("%");
		btnNewButton_6.setBounds(366, 405, 43, 23);
		btnNewButton_6.setForeground(new Color(255, 0, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(5);
					textField.setText("");
					textField_1.setText(calc.getNumber1() + "%");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});

		JButton equal = new JButton("=");
		equal.setBounds(212, 407, 84, 23);
		equal.setBackground(new Color(0, 51, 255));
		equal.setForeground(new Color(255, 69, 0));
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber2(Double.parseDouble(textField.getText()));
					double answer = calc.operation();
					textField.setText(Double.toString(answer));
					textField_1.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid operation");
					textField.setText("");
				}
			}
		});

		textField_1 = new JTextField();
		textField_1.setBounds(305, 34, 98, 20);
		textField_1.setBackground(new Color(255, 255, 153));
		textField_1.setColumns(10);

		JButton btnX = new JButton("x^2");
		btnX.setBounds(292, 250, 60, 23);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(6);
					double answer = calc.operation();
					textField.setText(Double.toString(answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});

		JButton btnNewButton_7 = new JButton("sin(x)");
		btnNewButton_7.setBackground(new Color(0, 204, 255));
		btnNewButton_7.setBounds(109, 145, 86, 23);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(7);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});

		JButton btnNewButton_8 = new JButton("cos(x)");
		btnNewButton_8.setBackground(new Color(0, 204, 255));
		btnNewButton_8.setBounds(194, 145, 86, 23);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(8);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});

		JButton btnTanx = new JButton("tan(x)");
		btnTanx.setBackground(new Color(51, 204, 255));
		btnTanx.setBounds(279, 145, 75, 23);
		btnTanx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(9);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});

		textField_2 = new JTextField();
		textField_2.setBounds(10, 55, 86, 20);
		textField_2.setBackground(new Color(0, 255, 0));
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 86, 86, 20);
		textField_3.setBackground(new Color(0, 255, 0));
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 116, 86, 20);
		textField_4.setBackground(new Color(51, 255, 0));
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(10, 146, 86, 20);
		textField_5.setBackground(new Color(51, 255, 0));
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(10, 177, 86, 20);
		textField_6.setBackground(new Color(51, 255, 0));
		textField_6.setColumns(10);

		txtHistory = new JTextField();
		txtHistory.setBounds(10, 24, 43, 20);
		txtHistory.setBackground(new Color(255, 51, 204));
		txtHistory.setHorizontalAlignment(SwingConstants.CENTER);
		txtHistory.setText("History");
		txtHistory.setColumns(10);

		txtAnswer = new JTextField();
		txtAnswer.setBounds(151, 68, 60, 20);
		txtAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnswer.setText("Answer:");
		txtAnswer.setColumns(10);

		txtTrigFunc = new JTextField();
		txtTrigFunc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtTrigFunc.setBackground(new Color(255, 255, 255));
		txtTrigFunc.setBounds(169, 115, 86, 20);
		txtTrigFunc.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrigFunc.setText("Trig. Func.");
		txtTrigFunc.setColumns(10);
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.getContentPane().add(textField);
		frmCalculator.getContentPane().add(btnNewButton);
		frmCalculator.getContentPane().add(button);
		frmCalculator.getContentPane().add(button_1);
		frmCalculator.getContentPane().add(button_2);
		frmCalculator.getContentPane().add(button_3);
		frmCalculator.getContentPane().add(button_4);
		frmCalculator.getContentPane().add(button_5);
		frmCalculator.getContentPane().add(button_6);
		frmCalculator.getContentPane().add(button_7);
		frmCalculator.getContentPane().add(btnNewButton_1);
		frmCalculator.getContentPane().add(button_8);
		frmCalculator.getContentPane().add(button_9);
		frmCalculator.getContentPane().add(button_10);
		frmCalculator.getContentPane().add(btnNewButton_2);
		frmCalculator.getContentPane().add(btnNewButton_3);
		frmCalculator.getContentPane().add(btnNewButton_4);
		frmCalculator.getContentPane().add(btnNewButton_5);
		frmCalculator.getContentPane().add(btnNewButton_6);
		frmCalculator.getContentPane().add(equal);
		frmCalculator.getContentPane().add(textField_1);
		frmCalculator.getContentPane().add(btnX);
		frmCalculator.getContentPane().add(btnNewButton_7);
		frmCalculator.getContentPane().add(btnNewButton_8);
		frmCalculator.getContentPane().add(btnTanx);
		frmCalculator.getContentPane().add(textField_2);
		frmCalculator.getContentPane().add(textField_3);
		frmCalculator.getContentPane().add(textField_4);
		frmCalculator.getContentPane().add(textField_5);
		frmCalculator.getContentPane().add(textField_6);
		frmCalculator.getContentPane().add(txtHistory);
		frmCalculator.getContentPane().add(txtAnswer);
		frmCalculator.getContentPane().add(txtTrigFunc);

		JButton btnSinhx = new JButton("sinh(x)");
		btnSinhx.setBackground(new Color(0, 204, 255));
		btnSinhx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(10);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnSinhx.setBounds(109, 177, 86, 23);
		frmCalculator.getContentPane().add(btnSinhx);

		JButton btnCoshx = new JButton("cosh(x)");
		btnCoshx.setBackground(new Color(0, 204, 255));
		btnCoshx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(11);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnCoshx.setBounds(194, 177, 86, 23);
		frmCalculator.getContentPane().add(btnCoshx);

		JButton btnTanhx = new JButton("tanh(x)");
		btnTanhx.setBackground(new Color(0, 204, 255));
		btnTanhx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(12);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnTanhx.setBounds(279, 177, 75, 23);
		frmCalculator.getContentPane().add(btnTanhx);

		JButton btnAsinx = new JButton("asin(x)");
		btnAsinx.setBackground(new Color(0, 204, 255));
		btnAsinx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(13);
					double answer = calc.operation();
					textField.setText(String.format("%.1f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnAsinx.setBounds(109, 209, 86, 23);
		frmCalculator.getContentPane().add(btnAsinx);

		JButton btnAcosx = new JButton("acos(x)");
		btnAcosx.setBackground(new Color(51, 204, 255));
		btnAcosx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(14);
					double answer = calc.operation();
					textField.setText(String.format("%.1f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnAcosx.setBounds(194, 209, 86, 23);
		frmCalculator.getContentPane().add(btnAcosx);

		JButton btnAtanx = new JButton("atan(x)");
		btnAtanx.setBackground(new Color(51, 204, 255));
		btnAtanx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(15);
					double answer = calc.operation();
					textField.setText(String.format("%.3f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnAtanx.setBounds(279, 209, 75, 23);
		frmCalculator.getContentPane().add(btnAtanx);

		JButton btnLnx = new JButton("Ln(x)");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(18);
					double answer = calc.operation();
					textField.setText(String.format("%.4f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnLnx.setBounds(108, 250, 108, 23);
		frmCalculator.getContentPane().add(btnLnx);

		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(17);
					double answer = calc.operation();
					textField.setText(String.format("%.4f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnEx.setBounds(209, 250, 89, 23);
		frmCalculator.getContentPane().add(btnEx);

		JButton btnRootx = new JButton("sqrt(x)");
		btnRootx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(16);
					double answer = calc.operation();
					textField.setText(String.format("%.2f", answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField_1.setText("");
				}
			}
		});
		btnRootx.setBounds(350, 250, 84, 23);
		frmCalculator.getContentPane().add(btnRootx);

		JButton btnFactorial = new JButton("Factorial!");
		btnFactorial.setBackground(Color.RED);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(19);
					double answer = calc.operation();
					textField.setText(Double.toString(answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField_1.setText("");
				}

			}
		});
		btnFactorial.setBounds(366, 145, 89, 23);
		frmCalculator.getContentPane().add(btnFactorial);

		txtCurrent = new JTextField();
		txtCurrent.setHorizontalAlignment(SwingConstants.CENTER);
		txtCurrent.setText("Current:");
		txtCurrent.setBounds(343, 11, 60, 20);
		frmCalculator.getContentPane().add(txtCurrent);
		txtCurrent.setColumns(10);
		JButton btnNewButton_9 = new JButton("CH");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				j = 1;
			}
		});
		btnNewButton_9.setBounds(53, 24, 54, 22);
		frmCalculator.getContentPane().add(btnNewButton_9);

		JButton btnH_1 = new JButton("H1");
		btnH_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnH_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempo = textField_2.getText();
				btnH_1.setText(tempo);
			}
		});
		btnH_1.setBounds(0, 208, 107, 23);
		frmCalculator.getContentPane().add(btnH_1);

		JButton btnH = new JButton("H2");
		btnH.setHorizontalAlignment(SwingConstants.LEFT);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempo = textField_3.getText();
				btnH.setText(tempo);
			}
		});
		btnH.setBounds(0, 247, 107, 23);
		frmCalculator.getContentPane().add(btnH);

		JButton btnH_2 = new JButton("H3");
		btnH_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnH_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempo = textField_4.getText();
				btnH_2.setText(tempo);
			}
		});
		btnH_2.setBounds(0, 284, 107, 23);
		frmCalculator.getContentPane().add(btnH_2);

		JButton btnH_3 = new JButton("H4");
		btnH_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnH_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempo = textField_5.getText();
				btnH_3.setText(tempo);

			}
		});
		btnH_3.setBounds(0, 328, 107, 23);
		frmCalculator.getContentPane().add(btnH_3);

		JButton btnH_4 = new JButton("H5");
		btnH_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnH_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempo = textField_6.getText();
				btnH_4.setText(tempo);
			}
		});
		btnH_4.setBounds(0, 371, 107, 23);
		frmCalculator.getContentPane().add(btnH_4);

		JButton button_12 = new JButton("+-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(21);
					double answer = calc.operation();
					textField.setText(Double.toString(answer));
					textField_1.setText("");
					textField.setText("");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField_1.setText("");
				}

			}
		});
		button_12.setForeground(Color.RED);
		button_12.setBounds(391, 439, 81, 23);
		frmCalculator.getContentPane().add(button_12);

		JButton btnNewButton_10 = new JButton("DtoB");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calc.setNumber1(Double.parseDouble(textField.getText()));
					calc.setOperand(20);
					double answer = calc.operation();
					textField.setText(Double.toString(answer));
					textField_1.setText("");
					textField.setText("");
					history();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inavlid input");
					textField.setText("");
				}

			}
		});
		btnNewButton_10.setBounds(366, 176, 89, 23);
		frmCalculator.getContentPane().add(btnNewButton_10);
	}
}
