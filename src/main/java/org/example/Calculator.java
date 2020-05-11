package org.example;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operations;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 336, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 265, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// above row 1
		JButton btnBK = new JButton("<-");
		btnBK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String Back;

				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					Back = strB.toString();
					textField.setText(Back);
				}
			}
		});
		btnBK.setBounds(10, 42, 51, 23);
		frame.getContentPane().add(btnBK);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(71, 42, 51, 23);
		frame.getContentPane().add(btnClear);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercent.setBounds(132, 42, 51, 23);
		frame.getContentPane().add(btnPercent);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(224, 42, 51, 23);
		frame.getContentPane().add(btnPlus);

		// row1
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(10, 84, 51, 23);
		frame.getContentPane().add(btn7);

		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(71, 84, 51, 23);
		frame.getContentPane().add(btn8);

		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(132, 84, 51, 23);
		frame.getContentPane().add(btn9);

//		JButton btnPlus = new JButton("+");
//		btnPlus.setBounds(224, 84, 51, 23);
//		frame.getContentPane().add(btnPlus);

		// row2
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(10, 126, 51, 23);
		frame.getContentPane().add(btn4);

		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(71, 126, 51, 23);
		frame.getContentPane().add(btn5);

		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(132, 126, 51, 23);
		frame.getContentPane().add(btn6);

		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMin.setBounds(224, 84, 51, 23);
		frame.getContentPane().add(btnMin);

		// row3
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(10, 168, 51, 23);
		frame.getContentPane().add(btn1);

		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(71, 168, 51, 23);
		frame.getContentPane().add(btn2);

		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(132, 168, 51, 23);
		frame.getContentPane().add(btn3);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setBounds(224, 134, 51, 23);
		frame.getContentPane().add(btnDiv);

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMulti.setBounds(224, 168, 51, 23);
		frame.getContentPane().add(btnMulti);

		// row4
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(10, 202, 51, 23);
		frame.getContentPane().add(btn0);

		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setBounds(71, 202, 51, 23);
		frame.getContentPane().add(btnDot);

		JButton btnPlusMin = new JButton("+||-");
		btnPlusMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPlusMin.setBounds(132, 202, 61, 35);
		frame.getContentPane().add(btnPlusMin);

		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				switch (operations) {
					case "+":
						result = firstnum + secondnum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
						break;
					case "-":
						result = firstnum - secondnum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
						break;
					case "*":
						result = firstnum * secondnum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
						break;
					case "/":
						result = firstnum / secondnum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
						break;
					case "%":
						result = firstnum % secondnum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
						break;
				}
			}
		});
		buttonEquals.setBounds(224, 202, 51, 23);
		frame.getContentPane().add(buttonEquals);

		if (!textField.getText().contains(".")) {
			textField.setText(textField.getText() + btnDot.getText());
		}
	}
}
