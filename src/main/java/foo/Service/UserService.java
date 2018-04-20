package foo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foo.DAO.IUserDAO;
import foo.DAO.UserDaoImpl;
import foo.Model.User;

@Service
public class UserService {

	@Autowired
	public UserDaoImpl userDao;
	
	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	public void register(User user) {
		userDao.register(user);
	}
}
