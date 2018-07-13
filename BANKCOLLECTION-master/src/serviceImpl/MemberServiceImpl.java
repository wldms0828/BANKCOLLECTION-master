package serviceImpl;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import domain.*;
import service.*;
import repository.*;
import repositoryImpl.*;
public class MemberServiceImpl implements MemberService {
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	@Override
	public void createUser(UserBean user) {
		System.out.println("============ 멤버 컨트롤러 ===========");
		System.out.println("컨트롤러에서 넘어온 객체" + user);
		((UserBean) user).setCreditRating("7등급");
		MemeberDAOImpl.getInstance().insertMember(user);
	}



	@Override
	public void update(MemberBean member) {
		//list.get(list.indexOf(search(member))).setPassword(member.getPassword());
	}
	

	@Override
	public void delete(MemberBean member) {
		//list.remove(search(member));	
		//list.remove(list.indexOf(search(member))
	}
	@Override
	public String login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

}
