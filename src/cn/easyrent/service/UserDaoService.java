package cn.easyrent.service;



import cn.easyrent.model.User;

public interface UserDaoService {
	int addUser(User user);
    User selectUserByLnPwd(User user);
    User selectUserById(int id);
}
