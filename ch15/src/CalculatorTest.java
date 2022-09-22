import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
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
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("굴림", Font.BOLD, 16));
		txtResult.setText("0");
		txtResult.setBounds(12, 10, 276, 47);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		List<String> arr = new ArrayList<>();
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 67, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(84, 67, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(156, 67, 60, 60);
		contentPane.add(btn9);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(228, 67, 60, 60);
		contentPane.add(btnDivide);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 137, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(84, 137, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(156, 137, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMultiple = new JButton("*");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btnMultiple.getText());
			}
		});
		btnMultiple.setBounds(228, 137, 60, 60);
		contentPane.add(btnMultiple);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 207, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(84, 207, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(156, 207, 60, 60);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(228, 207, 60, 60);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 277, 60, 60);
		contentPane.add(btn0);
		
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.clear();
				txtResult.setText("0");
			}
		});
		btnReset.setBounds(84, 277, 60, 60);
		contentPane.add(btnReset);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btnPlus.getText());
			}
		});
		btnPlus.setBounds(228, 277, 60, 60);
		contentPane.add(btnPlus);
		
		JButton btnSum = new JButton("=");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btnSum.getText());
				txtResult.setText(Cal(arr));
				arr.clear();
			}
		});
		btnSum.setBounds(156, 277, 60, 60);
		contentPane.add(btnSum);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn1.getText());
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn2.getText());
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn3.getText());
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn4.getText());
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn5.getText());
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn6.getText());
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn7.getText());
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn8.getText());
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn9.getText());
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(btn0.getText());
			}
		});
		

		
	}
	
	public String Cal(List<String> arr) {
		
		String a = "";
		String b = "";
		int loc = 0;
		String sign ="";
		
		for(int i=0; i<arr.size(); i++) {
			
			if(arr.get(i)=="+" || arr.get(i)=="-" || arr.get(i)=="*" || arr.get(i)=="/") {
				
				for(int j=0; j<i; j++) {
					a += arr.get(j);
				}
				loc = i;
				sign = arr.get(i);
				
			}else if(arr.get(i) == "=") {
				for(int k=loc+1; k<i; k++) {
					b += arr.get(k);
				}
			}
			
		}
		
		int result;
		switch (sign) {
		case "+":
			result = Integer.parseInt(a) + Integer.parseInt(b);
			break;

		case "*":
			result = Integer.parseInt(a) * Integer.parseInt(b);
			break;
			
		default:
			result = 0;
			break;
		}
		
		return String.valueOf(result);
		
	}

}
