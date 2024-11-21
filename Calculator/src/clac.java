import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class clac {

	private JFrame frmCalculator;
	private JTextField textField;
	protected Object frame;
	
	double first;
	double second;
	double result;
	String  operations;
	String answer;
	private StringBuilder operation = new StringBuilder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clac window = new clac();
					window.frmCalculator.setVisible(true);
					window.frmCalculator.setSize(230, 310);
					window.frmCalculator.setResizable(false); ;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 16, 200, 54);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setBounds(6, 93, 51, 37);
		btnBackSpace.setFont(new Font("FontAwesome", Font.PLAIN,13));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace = null;
				if(textField.getText().length()>0) {
				 StringBuilder str =new StringBuilder(textField.getText());
				 str.deleteCharAt(textField.getText().length()-1);
				 BackSpace=str.toString();
				 textField.setText(BackSpace);
				}
				
			}
		});
		
		frmCalculator.getContentPane().add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operation.append("7"); // Append number to operation
		        textField.setText(operation.toString()); // Update textField with the full operation
			}
		});
		btn7.setBounds(6, 127, 51, 37);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new  JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.append("4"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn4.setBounds(6, 162, 51, 37);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operation.append("1"); // Append number
		        textField.setText(operation.toString()); // Update textField
				
			 
			}
		});
		btn1.setBounds(6, 199, 51, 37);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn0.setBounds(6, 235, 51, 37);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.append("5"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn5.setBounds(58, 162, 51, 37);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.setLength(0); // Clear the operation StringBuilder
		        textField.setText(""); // Clear the textField
		        first = 0; // Reset the first operand
		        second = 0; // Reset the second operand
		        result = 0; // Reset the result
		        operations = ""; // Reset the operator
			}
		});
		btnClear.setBounds(58, 93, 51, 37);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.append("8"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn8.setBounds(58, 127, 51, 37);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operation.append("2"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn2.setBounds(58, 199, 51, 37);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// Check if the current number (last portion of the operation) already contains a dot
		        String currentText = textField.getText();
		        if (!currentText.endsWith(".")) {
		            operation.append("."); // Append dot to the operation
		            textField.setText(operation.toString()); // Update textField
		        }
			}
		});
		btnDot.setBounds(58, 235, 51, 37);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.append("6"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn6.setBounds(104, 162, 51, 37);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				;
				
				operation.append("00"); // Append "00" to the operation
		        textField.setText(operation.toString()); // Update textField with the full operation
			}
		});
		btn00.setBounds(104, 93, 51, 37);
		frmCalculator.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.append("9"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn9.setBounds(104, 127, 51, 37);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				operation.append("3"); // Append number
		        textField.setText(operation.toString()); // Update textField
			}
		});
		btn3.setBounds(104, 199, 51, 37);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Parsing the second number
		        String currentOperation = operation.toString();
		        
		        // Find the position of the operator (last one used)
		        int operatorIndex = Math.max(
		            Math.max(currentOperation.lastIndexOf("+"), currentOperation.lastIndexOf("-")),
		            Math.max(currentOperation.lastIndexOf("*"), currentOperation.lastIndexOf("/"))
		        );

		        // Extract the second operand
		        String secondOperand = currentOperation.substring(operatorIndex + 1);

		        // Parse the first and second numbers
		        second = Double.parseDouble(secondOperand); // The number after the operator
		        first = Double.parseDouble(currentOperation.substring(0, operatorIndex)); // The number before the operator
		        
		        // Perform the operation
		        if (operations.equals("+")) {
		            result = first + second;
		        } else if (operations.equals("-")) {
		            result = first - second;
		        } else if (operations.equals("*")) {
		            result = first * second;
		        } else if (operations.equals("/")) {
		            if (second != 0) {  // Avoid division by zero
		                result = first / second;
		            } else {
		                textField.setText("Error");
		                return;
		            }
		        } else if (operations.equals("%")) {
		            result = first % second;
		        }
		        
		        // Update the operation to show the result
		        operation.append("=" + String.format("%.2f", result)); // Append result to the operation
		        textField.setText(operation.toString()); // Display the full operation result
		        operation.setLength(0); // Clear operation for next calculation
		    }
		});

		    
		
		btnEqual.setBounds(104, 235, 51, 37);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnDividition = new JButton("/");
		btnDividition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				first = Double.parseDouble(textField.getText()); // Parse current number
		        operation.append("/"); // Append the operator
		        textField.setText(operation.toString()); // Update textField with the full operation
		        operations = "/"; // Store the current operation
			}
		});
		btnDividition.setBounds(158, 162, 51, 37);
		frmCalculator.getContentPane().add(btnDividition);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText()); // Parse current number
		        operation.append("+"); // Append the operator
		        textField.setText(operation.toString()); // Update textField with the full operation
		        operations = "+"; // Store the current operation
				
			}
		});
		btnPlus.setBounds(158, 93, 51, 37);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btnSubstraction = new JButton("-");
		btnSubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				first = Double.parseDouble(textField.getText()); // Parse current number
		        operation.append("-"); // Append the operator
		        textField.setText(operation.toString()); // Update textField with the full operation
		        operations = "-"; // Store the current operation
			}
		});
		btnSubstraction.setBounds(158, 127, 51, 37);
		frmCalculator.getContentPane().add(btnSubstraction);
		
		JButton btnMultiplay = new JButton("*");
		btnMultiplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				first = Double.parseDouble(textField.getText()); // Parse current number
		        operation.append("*"); // Append the operator
		        textField.setText(operation.toString()); // Update textField with the full operation
		        operations = "*"; // Store the current operation
			}
		});
		btnMultiplay.setBounds(158, 199, 51, 37);
		frmCalculator.getContentPane().add(btnMultiplay);
		
		JButton btnProcent = new JButton("%");
		btnProcent.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentOperation = operation.toString(); // Get the full operation string

		        // Ensure the textField is not empty
		        if (!currentOperation.isEmpty()) {
		            // Find the last operator in the operation string
		            int operatorIndex = Math.max(
		                Math.max(currentOperation.lastIndexOf("+"), currentOperation.lastIndexOf("-")),
		                Math.max(currentOperation.lastIndexOf("*"), currentOperation.lastIndexOf("/"))
		            );
		            
		            String lastNumber = "";
		            if (operatorIndex == -1) {
		                // If no operator is found, treat the entire input as a single number
		                lastNumber = currentOperation; // Only one number in the operation
		            } else {
		                // Get the last number after the last operator
		                lastNumber = currentOperation.substring(operatorIndex + 1).trim();
		            }

		            // If there's a valid number
		            if (!lastNumber.isEmpty()) {
		                try {
		                    double number = Double.parseDouble(lastNumber); // Parse the last number
		                    double percentage = number / 100; // Calculate percentage
		                    // Replace the last number with its percentage
		                    operation.replace(operatorIndex + 1, operation.length(), String.format("%.2f", percentage));
		                    textField.setText(operation.toString()); // Update the textField with the modified operation
		                } catch (NumberFormatException ex) {
		                    // Handle invalid input (non-numeric or malformed input)
		                    textField.setText("Error");
		                }
		            }
		        }
		    }
		});
		btnProcent.setBounds(158, 235, 51, 37);
		frmCalculator.getContentPane().add(btnProcent);
	}}
