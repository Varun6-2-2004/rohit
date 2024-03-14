package employe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
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
		
		
		JLabel gbdvcv = new JLabel("PASSWORD");
		gbdvcv.setToolTipText("");
		gbdvcv.setBounds(77, 118, 70, 14);
		frame.getContentPane().add(gbdvcv);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setBounds(207, 24, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(196, 67, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel hhhgr = new JLabel("NAME");
		hhhgr.setBounds(90, 70, 75, 14);
		frame.getContentPane().add(hhhgr);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name = tb1.getText();
				String password=p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"name "+name+"\n password "+password);
             if(name.equals("raju") && password.equals("1234")) 
             {
            	 JOptionPane.showMessageDialog(btnNewButton,"valid user");
             }
             else
             {
            	 JOptionPane.showMessageDialog(btnNewButton, "invalid");
             }
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(193, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		p1 = new JPasswordField();
		p1.setBackground(new Color(255, 255, 255));
		p1.setBounds(196, 114, 89, 23);
		frame.getContentPane().add(p1);
	}
}
