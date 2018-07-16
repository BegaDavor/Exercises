package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNumber;
	double secondNumber;
	double result;
	String answer;
	String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 12, 222, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton buttonAC = new JButton("AC");
		buttonAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonAC.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
		buttonAC.setBackground(new Color(152, 251, 152));
		buttonAC.setForeground(new Color(0, 0, 0));
		buttonAC.setBounds(12, 56, 51, 40);
		frame.getContentPane().add(buttonAC);
		
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusMinus = Double.parseDouble(String.valueOf(textField.getText()));
				plusMinus = plusMinus * (-1);
				textField.setText(String.valueOf(plusMinus));
			}
		});
		buttonPlusMinus.setBackground(new Color(152, 251, 152));
		buttonPlusMinus.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 10));
		buttonPlusMinus.setForeground(new Color(0, 0, 0));
		buttonPlusMinus.setBounds(64, 56, 51, 40);
		frame.getContentPane().add(buttonPlusMinus);
		
		JButton buttonModulo = new JButton("%");
		buttonModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		buttonModulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		buttonModulo.setBackground(new Color(152, 251, 152));
		buttonModulo.setForeground(new Color(0, 0, 0));
		buttonModulo.setBounds(116, 56, 51, 40);
		frame.getContentPane().add(buttonModulo);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		buttonDivide.setBackground(new Color(255, 69, 0));
		buttonDivide.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonDivide.setForeground(new Color(255, 255, 255));
		buttonDivide.setBounds(168, 56, 66, 40);
		frame.getContentPane().add(buttonDivide);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button7.getText();
				textField.setText(enterNumber);
			}
		});
		button7.setBackground(new Color(173, 216, 230));
		button7.setBounds(12, 108, 51, 40);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button8.getText();
				textField.setText(enterNumber);
			}
		});
		button8.setBackground(new Color(176, 224, 230));
		button8.setBounds(64, 108, 51, 40);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button9.getText();
				textField.setText(enterNumber);
			}
		});
		button9.setBackground(new Color(176, 224, 230));
		button9.setBounds(116, 108, 51, 40);
		frame.getContentPane().add(button9);
		
		JButton buttonMultiplication = new JButton("*");
		buttonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		buttonMultiplication.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonMultiplication.setForeground(new Color(255, 255, 255));
		buttonMultiplication.setBackground(new Color(255, 69, 0));
		buttonMultiplication.setBounds(168, 108, 66, 40);
		frame.getContentPane().add(buttonMultiplication);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button4.getText();
				textField.setText(enterNumber);
			}
		});
		button4.setBackground(new Color(176, 224, 230));
		button4.setBounds(12, 160, 51, 40);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button5.getText();
				textField.setText(enterNumber);
			}
		});
		button5.setBackground(new Color(176, 224, 230));
		button5.setBounds(64, 160, 51, 40);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button6.getText();
				textField.setText(enterNumber);
			}
		});
		button6.setBackground(new Color(176, 224, 230));
		button6.setBounds(116, 160, 51, 40);
		frame.getContentPane().add(button6);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		buttonMinus.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonMinus.setBackground(new Color(255, 69, 0));
		buttonMinus.setForeground(new Color(255, 255, 255));
		buttonMinus.setBounds(168, 160, 66, 40);
		frame.getContentPane().add(buttonMinus);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button1.getText();
				textField.setText(enterNumber);
			}
		});
		button1.setBackground(new Color(176, 224, 230));
		button1.setBounds(12, 212, 51, 40);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button2.getText();
				textField.setText(enterNumber);
			}
		});
		button2.setBackground(new Color(176, 224, 230));
		button2.setBounds(64, 212, 51, 40);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button3.getText();
				textField.setText(enterNumber);
			}
		});
		button3.setBackground(new Color(176, 224, 230));
		button3.setBounds(116, 212, 51, 40);
		frame.getContentPane().add(button3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		buttonPlus.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonPlus.setBackground(new Color(255, 69, 0));
		buttonPlus.setForeground(new Color(255, 255, 255));
		buttonPlus.setBounds(168, 212, 66, 40);
		frame.getContentPane().add(buttonPlus);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + button0.getText();
				textField.setText(enterNumber);
			}
		});
		button0.setBackground(new Color(173, 216, 230));
		button0.setFont(new Font("Dialog", Font.BOLD, 20));
		button0.setForeground(Color.BLACK);
		button0.setBounds(12, 260, 103, 40);
		frame.getContentPane().add(button0);
		
		JButton buttonComma = new JButton(".");
		buttonComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains("."))
		          {
		          textField.setText(textField.getText() + buttonComma.getText());
		          }
			}
		});
		buttonComma.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonComma.setForeground(new Color(0, 0, 0));
		buttonComma.setBackground(new Color(173, 216, 230));
		buttonComma.setBounds(116, 260, 51, 40);
		frame.getContentPane().add(buttonComma);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		buttonEqual.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonEqual.setBackground(new Color(255, 69, 0));
		buttonEqual.setForeground(new Color(255, 255, 255));
		buttonEqual.setBounds(168, 260, 66, 40);
		frame.getContentPane().add(buttonEqual);
	}
}
