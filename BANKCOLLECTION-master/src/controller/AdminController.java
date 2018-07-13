package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import domain.UserBean;
import service.AccountService;
import service.MemberService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.MemberServiceImpl;

public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	private AdminController() {}
	public void add() {
		MemberBean member = new UserBean();
	
		member.setUid(JOptionPane.showInputDialog("ID"));
		member.setPassword(JOptionPane.showInputDialog("PASS"));
		member.setName(JOptionPane.showInputDialog("NAME"));
		member.setSsn(JOptionPane.showInputDialog("SSN"));
		member.setAddress(JOptionPane.showInputDialog("ADDRESS"));
		member.setPhone(JOptionPane.showInputDialog("PHONE"));
		member.setEmail(JOptionPane.showInputDialog("EMAIL"));
		//service.createStaff((StaffBean) member);
	}
	public void MemberList() {
		MemberBean member = new UserBean();
	
		}
	public void findMemberByName() {
		MemberBean member = new UserBean();
		
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("NAME")));
	}
	
	public void findMemberById() {
		MemberBean member = new UserBean();
		
		member.setUid(JOptionPane.showInputDialog("ID"));
		member.setPassword(JOptionPane.showInputDialog("PASSWORD"));
		//JOptionPane.showMessageDialog(null, service.findById(member));
	}
	public void accountList() {
		AccountBean account=new AccountBean();;
		
		//JOptionPane.showMessageDialog(null, service.list());
	}
	public void findAccountByName() {
		AccountBean account=new AccountBean();
		
		//account.setName(JOptionPane.showInputDialog("NAME"));
		//account.setUid(JOptionPane.showInputDialog("ID"));
		//account.setPassword(JOptionPane.showInputDialog("PASS"));
		//JOptionPane.showMessageDialog(null, service.search(account));
	}
	public void findAccountById() {
		AccountBean account=new AccountBean();;
		
		
		//account.setUid(JOptionPane.showInputDialog("ID"));
		//account.setPassword(JOptionPane.showInputDialog("PASS"));
		//JOptionPane.showMessageDialog(null,service.search(account));
	}
	
}
