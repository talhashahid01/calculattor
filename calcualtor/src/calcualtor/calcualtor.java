package calcualtor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcualtor {

	private JFrame frame;
	private JTextField textField;

	
	double first;
	double second;
	double result;
	String answer;
	String operation;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcualtor window = new calcualtor();
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
	public calcualtor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(0, -49, 264, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 11, 230, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 327, 50, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
				
			}
		});
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(70, 327, 50, 50);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
				
			}
		});
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnDot);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				first= Double.parseDouble(textField.getText());
				textField.setText("");
		operation = "%";
			
			}
		});
		btnPercentage.setBounds(190, 327, 50, 50);
		btnPercentage.setForeground(Color.BLACK);
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnPercentage);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String answer;
				second= Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first % second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setBounds(130, 327, 50, 50);
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnEqual);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
		operation = "+";
			}
		});
		btnAdd.setBounds(190, 271, 50, 50);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnAdd);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setBounds(130, 271, 50, 50);
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setBounds(70, 271, 50, 50);
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setBounds(10, 271, 50, 50);
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
				
			}
		});
		btn4.setBounds(10, 213, 50, 50);
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setBounds(70, 213, 50, 50);
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setBounds(130, 213, 50, 50);
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn6);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
		operation = "-";
			
			}
		});
		btnSubtract.setBounds(190, 213, 50, 50);
		btnSubtract.setForeground(Color.BLACK);
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnSubtract);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setBounds(130, 156, 50, 50);
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setBounds(70, 156, 50, 50);
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
				
			}
		});
		btn7.setBounds(10, 156, 50, 50);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn7);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
		operation = "*";
			}
		});
		btnMultiply.setBounds(190, 156, 50, 50);
		btnMultiply.setForeground(Color.BLACK);
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnMultiply);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setBounds(130, 95, 50, 50);
		btn00.setForeground(Color.BLACK);
		btn00.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btn00);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(70, 95, 50, 50);
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnClear);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder strbuild  = new StringBuilder(textField.getText());
					strbuild.deleteCharAt(textField.getText().length()-1);
					backspace = strbuild.toString();
					textField.setText(backspace);
				}
						
			}
		});
		btnBackSpace.setBounds(10, 95, 50, 50);
		btnBackSpace.setForeground(Color.BLACK);
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
		operation = "/";
			}
		});
		btnDivide.setBounds(190, 95, 50, 50);
		btnDivide.setForeground(Color.BLACK);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnDivide);
	}

}
