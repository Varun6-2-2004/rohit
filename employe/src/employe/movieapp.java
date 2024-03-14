package employe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class movieapp {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp window = new movieapp();
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
	public movieapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("movie app");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(165, 21, 110, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(129, 68, 61, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Movie");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(132, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "kgf", "saaho ", "kalki"}));
		cb1.setBounds(201, 106, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("Number of tickects");
		lblNewLabel_4.setForeground(new Color(0, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(48, 160, 130, 18);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(201, 159, 89, 20);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int bill=0;
				String Name = tb1.getText();
				String Movie = (String)cb1.getSelectedItem();
				String Tickets = (String)cb2.getSelectedItem();
				int nt=Integer.parseInt(Tickets);
				if(Movie.equals("kgf"))
				{
					bill = bill+150*nt;
				}
				if(Movie.equals("saaho"))
				{
					bill = bill+150*nt;
				}
				if(Movie.equals("kalki"))
				{
					bill = bill+150*nt;
				}
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton,"name : "+Name+"\n movie : "+Movie+"\n Tickets : " +Tickets+"\n Amount : "+bill);
				if(res == YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton,"Booking confirmed ");
				}
				else 
				{
					JOptionPane.showMessageDialog(btnNewButton,"Booking Canceled ");
				}
				
			}
		});
		btnNewButton.setBounds(201, 218, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(200, 65, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Camera Roll\\unnamed.jpg"));
		lblNewLabel.setBounds(0, 0, 512, 288);
		frame.getContentPane().add(lblNewLabel);
	}
}
