package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.User;

public interface UserDao {
	int addUser(User user, Connection conn);
	User selectUserByLnPwd(User user, Connection conn);
	User selectUserById(int id, Connection conn);
}
