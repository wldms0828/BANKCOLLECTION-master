package service;

import java.util.List;
import java.util.ArrayList;
import domain.*;

public interface MemberService {
	public void createUser(UserBean user);
	public String login(MemberBean member);
	public void update(MemberBean member);
	public void delete(MemberBean member);
}
