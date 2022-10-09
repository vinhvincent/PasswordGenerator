import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class PswUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		JCheckBox chckbxLowerCase = new JCheckBox("Lower case");
		chckbxLowerCase.setBounds(6, 7, 97, 23);
		panel.add(chckbxLowerCase);
		
		JCheckBox chckbxUpperCase = new JCheckBox("Upper case");
		chckbxUpperCase.setBounds(6, 33, 97, 23);
		panel.add(chckbxUpperCase);
		
		JCheckBox chckbxNumeric = new JCheckBox("Numeric");
		chckbxNumeric.setBounds(6, 59, 97, 23);
		panel.add(chckbxNumeric);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(5, 5, 128, 1));
		spinner.setBounds(273, 7, 71, 20);
		panel.add(spinner);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Special character");
		chckbxNewCheckBox.setBounds(6, 85, 107, 23);
		panel.add(chckbxNewCheckBox);
		
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
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 190, 414, 35);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
