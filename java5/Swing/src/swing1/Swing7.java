package swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/*Radio ����*/

public class Swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing7 frame = new Swing7();
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
	public Swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(20, 28, 408, 36);
		contentPane.add(panel);
		
		JRadioButton rd1 = new JRadioButton("\uC2E0\uC6A9\uCE74\uB4DC");
		
		rd1.setName("CARD");
		rd1.setSelected(true);
		rd1.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd1);
	
		
		JRadioButton rd2 = new JRadioButton("\uACC4\uC88C\uC774\uCCB4");
		rd2.setName("BANK");
		rd2.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("\uBB34\uD1B5\uC7A5\uC785\uAE08");
		rd3.setName("NOBANK"); // setName�� ������� ������ background���� �ش� �ӻ� ���� �����ϴ� ���� ���� 
		rd3.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup(); //���� ���� ��ư �׷� �̿��Ͻñ� �ٶ��ϴ�. (�����߿� �ϳ��� ������ �� �ְ� ��)
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		JButton btn = new JButton("\uACB0\uC81C \uC9C4\uD589");
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(178, 74, 93, 23);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setFont(new Font("����ü", Font.PLAIN, 12));
		mu.setVisible(false);
		//mu.setToolTipText("test");
		mu.setBounds(20, 147, 408, 108);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("������ �Ա�"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("����ü", Font.PLAIN, 12));
		textField.setBounds(10, 21, 130, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		
		
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay ="";
				
				if(rd1.isSelected()==true) {	// isSelected üũ�� �Ǿ��ִ��� �ȵǾ��ִ��� Ȯ���ϴ� ����  //�ſ�ī��
					pay = rd1.getName();
					System.out.println("�ſ�ī�� ����");
					mu.setVisible(false);
				}
			 else if (rd2.isSelected()==true) { //������ü
				 System.out.println("������ü ����");
				 mu.setVisible(false);
				 
			 }else { //������
				 mu.setVisible(true);
			 }
			 
			 
			}
		});
	}
}
