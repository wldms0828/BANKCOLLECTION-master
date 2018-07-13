package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Index extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//UID class에 ID를 주는것 ,1L 엄청나게 긴 값
	Index(){//생성자 만들기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//우측 상단에 X표시
		setTitle("관리자화면");//좌측상단
		this.setLayout(new GridLayout(3, 3,10,10));//4가지 레이아웃 중 선택
		JButton btn1 = new JButton("회원가입");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Register();//new ActionListener() 누르면 new Register 를 실행해라
			}
		});//버튼
		this.add(btn1);
		JButton btn2 = new JButton("통장생성");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new openAccount();
			}
		});
		this.add(btn2);
		JButton btn3 = new JButton("목록보기");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn3);
		JButton btn4 = new JButton("ID 검색");
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn4);
		JButton btn5 = new JButton("이름 검색");
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn5);
		JButton btn6 = new JButton("비번 변경");
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn6);
		JButton btn7 = new JButton("입금");
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn7);
		JButton btn8 = new JButton("출금");
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn8);
		JButton btn9 = new JButton("회원 탈퇴");
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(btn9);
		setSize(600, 600);
		setLocation(100, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Index();
	}
}