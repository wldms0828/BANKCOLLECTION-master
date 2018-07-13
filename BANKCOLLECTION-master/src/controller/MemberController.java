package controller;


import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

import java.util.*;

enum Membutton{
	//join은 일반 유저추가, add는 직원 추가
	EXIT,
	JOIN,ADD,//create
	LIST,FIND_BY_ID,FIND_BY_NAME,COUNT,//전체 , one , some
	UPDATE,
	WITHDRAWAL
};
public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {
		return instance;
	}
	private MemberController() {}
	public void join(UserBean user) {
		
		System.out.println("============ 멤버 컨트롤러 ===========");
		System.out.println("화면에서넘어온 객체" + user);
		MemberServiceImpl.getInstance().createUser(user);
		
	}
	
	public void updatePassword() {
		MemberBean member = new UserBean();
		member.setUid(JOptionPane.showInputDialog("ID"));
		member.setPassword(JOptionPane.showInputDialog("PASSWORD")
				+ ("/")
				+ JOptionPane.showInputDialog("NEWPASSWORD"));
		MemberServiceImpl.getInstance().update(member);
	}
	public void deleteMember() {
		
	}
}

