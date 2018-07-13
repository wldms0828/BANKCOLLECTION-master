package serviceImpl;

import domain.*;
import repositoryImpl.*;
import service.*;
import java.util.*;

public class AccountServiceImpl implements AccountService {
	private static AccountService instance = new AccountServiceImpl();
	public static AccountService getInstance() {return instance;}
	AccountServiceImpl(){}

	@Override
	public void createAccount(AccountBean account) {
		
		account.setCreateDate(AdminServiceImpl.getInstance().createDate());
		account.setAccountNum(AdminServiceImpl.getInstance().createAccountNum());
		System.out.println("============Account Service===========");
		System.out.println("컨트롤러에서 넘어온 객체" + account);
		
	}

	@Override
	public void createMinusAccount(MinusAccountBean minusAccount) {
		//minusAccount.setAccountNum(createAccountNum(createRandom(0,999)));
		minusAccount.setAccountType("");
		//minusAccount.setCreateDate(createDate());
		//System.out.println("실행결과" + ((list.add(minusAccount))?"계좌등록":"계좌등록실패"));
	}
	
	@Override
	public AccountBean findById(AccountBean account) {
		/*AccountBean acc = new AccountBean();
		for(AccountBean e : list) {
			if(account.getUid().equals(e.getUid())) {
				acc=e;}
		}*/
		return null;
	}

	@Override
	public void update(AccountBean account) {
		
		//list.get(list.indexOf(search(account))).setPassword(account.getPassword());
		
	}

	@Override
	public void delete(AccountBean account) {
		//list.remove(search(account));
		
	}
	public String accountType() {
		
		return null;
	}
}