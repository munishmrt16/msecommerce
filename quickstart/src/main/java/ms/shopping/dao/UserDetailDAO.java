package ms.shopping.dao;
import java.util.List;
import ms.shopping.model.*;

public interface UserDetailDAO {

	public List<UserDetailModel> getUDAll();
	void insertUD(UserDetailModel  p);
	UserDetailDAO getUD(int uid);
	void updateUD(UserDetailModel p);
	public void deleteUD(int pid);
}



