package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class Swing9 extends JFrame {
	//Jediotrpane �� �Խ��� ���� ��� �� �Է� �� ����� �Ǹ� 
	//���̺긮�� ���ۿ����� HTML�� �ε��Ͽ�  
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing9 frame = new Swing9();
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
	public Swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("���̺긮�� �� ��");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(0, 0, 811, 776);
		contentPane.add(webpage);
		webpage.setContentType("text/html"); //ContentType: ���ڵ� ��� �׸��� HTML �ڵ嵵 ��� 
		webpage.setText("<h1>Hello cat 2022!</h1>"
				+ "<img src='https://t1.daumcdn.net/cfile/blog/2455914A56ADB1E315'>"
				+ "<br><font color ='blue'>hi hello bonjour</font>"
				+ "<br><Input type ='text' id='name'></input>");
	}
}
