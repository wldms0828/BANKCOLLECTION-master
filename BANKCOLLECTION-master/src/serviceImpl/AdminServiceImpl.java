package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;
import service.*;
import serviceImpl.*;
import domain.*;

public class AdminServiceImpl implements AdminService {
	private static AdminService instance = new AdminServiceImpl();
	public static AdminService getInstance() {return instance;}
	private AdminServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		/* boolean flag2 = list.add(staff); */
		//System.out.println("실행결과" + ((list.add(staff)) ? "등록성공" : "등록실패"));

	}

	@Override
	public List<MemberBean> memberList() {
		return null;
	}

	@Override
	public List<MemberBean> findMemberByName(String param) {
		/*List<MemberBean> temp = new ArrayList<>();
		Set<MemberBean> set = new HashSet<>();
		for (MemberBean e : list) {
			if (param.equals(e.getName())) {
				temp.add(e);
			}
		}*/
		return null;
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findAccountByName(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = sdf.format(d);
		return date;
	}

	@Override
	public String createRandom(int start, int end) {
		String random = String.format("%03d",((int) (Math.random() * 999)));
		return random;
	}

	@Override
	public String createAccountNum() {
		String accountNum = "";
		for(int i = 0 ;i<3;i++) {
			if(i<2) {
				accountNum+=createRandom(0,999) + "-";
			}else {
				accountNum+=createRandom(0,999);
			}}
		return accountNum;
	}

	@Override
	public MemberBean findMemberById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

}
