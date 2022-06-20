import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class SwingExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingExam frame = new SwingExam();
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
	public SwingExam() {
		
		String[] list = {"1시간 후","2시간 후","3시간 후","4시간 후","5시간 후","6시간 후"};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBackground(Color.WHITE);
		lb.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		lb.setBounds(26, 153, 355, 73);
		contentPane.add(lb);
		
		JButton reservation = new JButton("예약");
		reservation.setFont(new Font("돋움체", Font.PLAIN, 12));
		reservation.setBounds(284, 32, 97, 23);
		contentPane.add(reservation);
		
		JRadioButton member = new JRadioButton("회원");
		member.setFont(new Font("돋움체", Font.PLAIN, 12));
		member.setBounds(26, 32, 62, 23);
		contentPane.add(member);
		
		JRadioButton nomember = new JRadioButton("비회원");
		nomember.setFont(new Font("돋움체", Font.PLAIN, 12));
		nomember.setBounds(94, 32, 62, 23);
		contentPane.add(nomember);
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(member);
		gp.add(nomember);
		
		
		
		JComboBox comboBox = new JComboBox(list);
		comboBox.setBounds(165, 32, 115, 23);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("파스타");
		chckbxNewCheckBox.setBounds(145, 98, 115, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("스테이크");
		chckbxNewCheckBox_1.setBounds(26, 98, 115, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("랍스터");
		chckbxNewCheckBox_2.setBounds(264, 98, 115, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		
		
		reservation.addActionListener(new ActionListener() {
			String str = "";
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(member.isSelected()) {
					str += member.getText();
				}
				
				if(nomember.isSelected()) {
					str += nomember.getText();
				}
				
				str += " ";
				str += comboBox.getSelectedItem();
				str += " ";
				
				if(chckbxNewCheckBox.isSelected()) {
					str += chckbxNewCheckBox.getText();
				}
				
				str += " ";
				
				if(chckbxNewCheckBox_1.isSelected()) {
					str += chckbxNewCheckBox_1.getText();
				}
				
				str += " ";
				
				if(chckbxNewCheckBox_2.isSelected()) {
					str += chckbxNewCheckBox_2.getText();
				}
				
				str += "예약되었습니다.";
				
				lb.setText(str);
				str = " ";
			}
		});

		
		
		
	}
}
