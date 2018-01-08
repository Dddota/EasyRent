package cn.easyrent.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import cn.easyrent.dao.UserDao;
import cn.easyrent.dao.impl.UserDaoImpl;
import cn.easyrent.model.User;
import cn.easyrent.service.UserDaoService;
import cn.easyrent.utils.BaseDao;

public class UserDaoServiceImpl implements UserDaoService {
	UserDao userDao = new UserDaoImpl();
	@Override
	public int addUser(User user) {
		Connection conn = BaseDao.getConnection();
		int row = 0;
		try {
			conn.setAutoCommit(false);
		    row = userDao.addUser(user, conn);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(null, conn, null);
		}
		
		
		return row;
	}
	@Override
	public User selectUserByLnPwd(User user) {
		Connection conn = BaseDao.getConnection();
		User nuser = userDao.selectUserByLnPwd(user, conn);
		BaseDao.closeAll(null, conn, null);
		return nuser;
	}
	@Override
	public User selectUserById(int id) {
		Connection conn = BaseDao.getConnection();
		User user = userDao.selectUserById(id, conn);
		BaseDao.closeAll(null, conn, null);
		return user;
	}

}
