package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;


public class BingoGenerator {

	private JFrame frame;
	private JTextField textField;
	int[] sestBrojeva = new int[6];
	int[] sedamBrojeva = new int[7];
	String brojevi = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BingoGenerator window = new BingoGenerator();
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
	public BingoGenerator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 422, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSix = new JButton("6/48");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				brojevi = " ";
				ArrayList<Integer> sviBrojevi = new ArrayList<Integer>();
				
		        for(int i = 1; i <= 48; i++) {
		            sviBrojevi.add(i);
		        }
		
		        Random random = new Random();
				for (int i = 0; i < sestBrojeva.length; i++) {
					sestBrojeva[i] = sviBrojevi.remove(random.nextInt(sviBrojevi.size()));
				}
				for(int i = 0; i < sestBrojeva.length; i++) {
					brojevi = brojevi + sestBrojeva[i] + " ";
				}
				textField.setText(brojevi);
			}
		});
		btnSix.setBounds(12, 102, 422, 45);
		frame.getContentPane().add(btnSix);
		
		JButton btnSeven = new JButton("7/48");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brojevi = " ";
				 ArrayList<Integer> sviBrojevi = new ArrayList<Integer>();
					
			        for(int i = 1; i <= 48; i++) {
			            sviBrojevi.add(i);
			        }
			
			        Random random = new Random();
				for (int i = 0; i < sedamBrojeva.length; i++) {
					sedamBrojeva[i] =  sviBrojevi.remove(random.nextInt(sviBrojevi.size()));
				}
				for(int i = 0; i < sedamBrojeva.length; i++) {
					brojevi = brojevi + sedamBrojeva[i] + " ";
				}
				
				textField.setText(brojevi);
			}
		});
		btnSeven.setBounds(12, 167, 422, 45);
		frame.getContentPane().add(btnSeven);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(172, 238, 117, 25);
		frame.getContentPane().add(btnClear);
	}
}
