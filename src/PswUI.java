import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PswUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldShowPsw;
	private Listener ec;
	private JCheckBox chckbxLowerCase;
	private JCheckBox chckbxUpperCase;
	private JCheckBox chckbxNumeric;
	private JCheckBox chckbxSpecialChar;
	private JButton btnGenerate;
	private JSpinner spinnerPswLen;
	private boolean isLower;
	private boolean isUpper;
	private boolean isNumeric;
	private boolean isSpecial;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PswUI frame = new PswUI();
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
	public PswUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 66, 414, 114);
		contentPane.add(panel);
		panel.setLayout(null);
		
		chckbxLowerCase = new JCheckBox("Lower case");		
		chckbxLowerCase.setBounds(6, 7, 97, 23);
		panel.add(chckbxLowerCase);
		
		chckbxUpperCase = new JCheckBox("Upper case");
		chckbxUpperCase.setBounds(6, 33, 97, 23);
		panel.add(chckbxUpperCase);
		
		chckbxNumeric = new JCheckBox("Numeric");
		chckbxNumeric.setBounds(6, 59, 97, 23);
		panel.add(chckbxNumeric);
		
		chckbxSpecialChar = new JCheckBox("Special character");
		chckbxSpecialChar.setBounds(6, 85, 159, 23);
		panel.add(chckbxSpecialChar);
		
		spinnerPswLen = new JSpinner();
		spinnerPswLen.setModel(new SpinnerNumberModel(5, 5, 128, 1));
		spinnerPswLen.setBounds(273, 7, 71, 20);
		panel.add(spinnerPswLen);
		
		
		JLabel lblNewLabel_1 = new JLabel("Password lenght : ");
		lblNewLabel_1.setBounds(156, 10, 107, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 414, 35);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Generator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 394, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Created by Vincent Vinh | Available at https://github.com/vinhvincent");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_3.setBounds(10, 236, 414, 14);
		contentPane.add(lblNewLabel_3);
		
		textFieldShowPsw = new JTextField();
		textFieldShowPsw.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldShowPsw.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldShowPsw.setBounds(137, 190, 287, 35);
		contentPane.add(textFieldShowPsw);
		textFieldShowPsw.setColumns(10);
		
		btnGenerate = new JButton("Generate");
		btnGenerate.setBounds(10, 191, 117, 34);
		contentPane.add(btnGenerate);
		
		chckbxLowerCase.setSelected(true);
		chckbxUpperCase.setSelected(true);
		chckbxNumeric.setSelected(true);
		chckbxSpecialChar.setSelected(true);
		isLower   = true;
		isUpper   = true;
		isNumeric = true;
		isSpecial = true;
		
		ec = new Listener();/*Buttons to actions */
		chckbxLowerCase.addActionListener(ec);
		chckbxUpperCase.addActionListener(ec);
		chckbxNumeric.addActionListener(ec);
		chckbxSpecialChar.addActionListener(ec);
		btnGenerate.addActionListener(ec);
		
	}
	
	/* Listener to map buttons to actions */
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == chckbxLowerCase)
			{
				// ternary operator to be shorter | Similar to if/else statement
				isLower = chckbxLowerCase.isSelected() ? true : false;			
			}
			else if (e.getSource() == chckbxUpperCase)
			{
				isUpper = chckbxUpperCase.isSelected() ? true : false;	
			}
			else if (e.getSource() == chckbxNumeric)
			{
				isNumeric = chckbxNumeric.isSelected() ? true : false;	
			}
			else if (e.getSource() == chckbxSpecialChar)
			{
				isSpecial = chckbxSpecialChar.isSelected() ? true : false;	
			}
			else if (e.getSource() == btnGenerate)
			{
				String psw = Methods.PassGenerator(isLower, isUpper, isNumeric, isSpecial, (Integer) spinnerPswLen.getValue());
				textFieldShowPsw.setText(psw);
			}
		}
		
	}
}
