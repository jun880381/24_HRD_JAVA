package day05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingTest extends JFrame {
	JButton okBtn;
	
	public SwingTest() {
		super("첫 번째 스윙 연습");
		// setTitle("타이틀");
		okBtn = new JButton("OK");
		MyListener my = new MyListener();
		
		okBtn.addActionListener(my);
		
		add(okBtn);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	
	// 내부 클래스(Inner Class로 이벤트 처리자 구현하기)
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String result = e.getActionCommand();
			
			if(result.equals("OK")) {
				System.out.println("OK버튼이 클릭 됨");
			}
		}
		
	}
	public static void main(String[] args) {
		new SwingTest();
	}

}
