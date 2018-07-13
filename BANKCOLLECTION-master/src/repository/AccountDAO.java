package repository;
import java.util.List;
import domain.*;

public interface AccountDAO {
	public void insertAccount(AccountBean account);
	public List<AccountBean> selectAccountList();
	public List<AccountBean> selectByName(String name);
	public AccountBean selectById(String id);
	public int countAccount();
	public void updateAccount(AccountBean account);
	public void deleteAccount(AccountBean account);
}
