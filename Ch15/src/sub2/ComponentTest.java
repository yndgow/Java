package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 434, 23);
		contentPane.add(lblNewLabel);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(20, 68, 70, 23);
		contentPane.add(btn1);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 43, 111, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(102, 68, 70, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제목", JOptionPane.WARNING_MESSAGE);
			}
		});
		btn3.setBounds(184, 68, 70, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn4.setBounds(266, 68, 70, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(20, 119, 116, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lbltxtf1result = new JLabel("결과 :");
		lbltxtf1result.setBounds(254, 148, 90, 15);
		contentPane.add(lbltxtf1result);

		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lbltxtf1result.setText("결과 : " + txt);
			}
		});
		btntxtf1.setBounds(148, 144, 86, 23);
		contentPane.add(btntxtf1);
		
		txtf1 = new JTextField();
		txtf1.setBounds(20, 145, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(20, 174, 116, 21);
		contentPane.add(txtf2);

		JLabel lbltxtf2result = new JLabel("결과 :");
		lbltxtf2result.setBounds(254, 177, 90, 15);
		contentPane.add(lbltxtf2result);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lbltxtf2result.setText("결과 : " + txt);
			}
		});
		btntxtf2.setBounds(148, 173, 86, 23);
		contentPane.add(btntxtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(20, 205, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf3result = new JLabel("결과 :");
		lbltxtf3result.setBounds(254, 209, 90, 15);
		contentPane.add(lbltxtf3result);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lbltxtf3result.setText("결과 : " + txt);
			}
		});
		btntxtf3.setBounds(148, 204, 86, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(20, 249, 111, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("이름을 고르세요");
		lblNewLabel_4.setBounds(20, 268, 111, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(21, 289, 62, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(79, 289, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(140, 289, 53, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(197, 289, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(254, 289, 63, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(20, 318, 402, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + chks.toString());
			}
		});
		btnChk.setBounds(325, 289, 97, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(20, 353, 127, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(15, 374, 68, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(79, 374, 62, 23);
		contentPane.add(rdFemale);
		

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdFemale);
		bg.add(rdMale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(21, 403, 172, 15);
		contentPane.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdMale.isSelected()) {
					lblGenderResult.setText("결과 : " + rdMale.getText());
				}else {
					lblGenderResult.setText("결과 : " + rdFemale.getText());
				}
			}
		});
		btnGender.setBounds(148, 374, 97, 23);
		contentPane.add(btnGender);
		
	
		
		
		

	}
}
