package employe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
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
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setBounds(162, 11, 141, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(75, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setBounds(58, 82, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setBounds(58, 124, 63, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(162, 40, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(162, 79, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(162, 120, 79, 23);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "DS", "CSE", "IOT", "AIML"}));
		cb1.setToolTipText("");
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setBounds(75, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROGRMAS");
		lblNewLabel_5.setBounds(70, 199, 74, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(162, 158, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(280, 158, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("PYTHON");
		c1.setBounds(162, 197, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBounds(266, 195, 74, 27);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setBounds(337, 197, 97, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name = tb1.getText();
				String roll = tb2.getText();
				String branch = (String) cb1.getSelectedItem();
				String gender=" ";
				String langs="";
				
				if(r1.isSelected())
				{
					gender="male";
				}
				else
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs= langs+"python";
				}
				if(c2.isSelected())
				{
					langs= langs+"java";
				}
				if(c3.isSelected())
				{
					langs= langs+"c";
				}
				JOptionPane.showMessageDialog(btnNewButton,"NAME : "+name+"\n ROLLNO :  "+roll+"\n BRANCH : "+branch+ "\n GENDER : " +gender+"\n prog langs : "+langs );
			 
			}
		});
		btnNewButton.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
