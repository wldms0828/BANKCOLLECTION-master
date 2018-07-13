package controller;

import javax.swing.JOptionPane;
import domain.*;
import repository.AccountDAO;
import repositoryImpl.AccountDAOImpl;
import service.*;
import serviceImpl.*;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController() {}
	public void createAccount(AccountBean account) {
	AccountServiceImpl.getInstance().createAccount(account);
}
	
	public void createMinusAccount() {
		AccountBean account=new MinusAccountBean();
		
		//account.setName(JOptionPane.showInputDialog("NAME"));
		//account.setPassword(JOptionPane.showInputDialog("PASS"));
		//account.setUid(JOptionPane.showInputDialog("ID"));
		
		((MinusAccountBean) account).setLimit(Integer.parseInt(JOptionPane.showInputDialog("LIMIT MONEY")));
		AccountServiceImpl.getInstance().createAccount(account);
	}
	public void deposite() {
		
	}
	public void withdraw() {
		
	}

	public void updatePassword() {
	//	AccountBean account=new AccountBean();

		//account.setUid(JOptionPane.showInputDialog("ID"));
		//account.setPassword(JOptionPane.showInputDialog("PASS")
		//		+("/")+
		//		JOptionPane.showInputDialog("NEWPASS"));
		//AccountServiceImpl.getInstance().());
	}
	public void deleteAccount() {
		//AccountBean account=null;
	
		//account = new AccountBean();
		//account.setUid(JOptionPane.showInputDialog("ID"));
		//account.setPassword(JOptionPane.showInputDialog("PASS")
		//		+("/")+
		//		JOptionPane.showInputDialog("ONE MORE TIME PASS"));
		//AccountServiceImpl.getInstance().list());
	}
}
