package service;

import java.util.List;

import domain.*;

public interface AdminService {
	public void createStaff(StaffBean staff);
	public List<MemberBean> memberList();
	public List<MemberBean> findMemberByName(String param);
	public MemberBean findMemberById(MemberBean member);
	public List<AccountBean> accountList();
	public List<AccountBean> findAccountByName(String param);
	public AccountBean findAccountById(AccountBean account);
	public String createDate();
	public String createRandom(int start, int end);
	public String createAccountNum();
}
