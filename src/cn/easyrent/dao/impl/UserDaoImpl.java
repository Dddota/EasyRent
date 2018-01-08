package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.UserDao;
import cn.easyrent.model.User;
import cn.easyrent.utils.BaseDao;

public class UserDaoImpl implements UserDao {

	@Override
	public int addUser(User user,Connection conn) {
		int row = 0;
		PreparedStatement ps = null;
		String sql = "insert into easyrent_user(userName,loginName,password,email,telephone,idcard,qid,picpath,answer,sex)" +
				"value(?,?,?,?,?,?,?,?,?,?)";
		try{
			Object [] oo = {user.getUserName(),user.getLoginName(),user.getPassword(),user.getEmail(),user.getTelephone(),user.getIdcard(),user.getQid(),user.getPicpath(),user.getAnswer(),user.getSex()};
			row = BaseDao.executeUpdate(conn, ps, sql, oo);	
		}finally{
			BaseDao.closeAll(ps, null, null);
		}	
		return row;
	}

	@Override
	public User selectUserByLnPwd(User user, Connection conn) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		User nuser = null;
		String sql = "select * from easyrent_user where loginName =? and password=?";
		try{
			Object [] oo = {user.getLoginName(),user.getPassword()};
			rs = BaseDao.executeQuery(conn, ps, sql, oo);
			while(rs.next()){
				nuser = new User();
				nuser.setId(rs.getInt(1));
				nuser.setUserName(rs.getString(2));
				nuser.setLoginName(rs.getString(3));
				nuser.setPassword(rs.getString(4));
				nuser.setEmail(rs.getString(5));
				nuser.setTelephone(rs.getString(6));
				nuser.setIdcard(rs.getString(7));
				nuser.setQid(rs.getInt(8));
				nuser.setPicpath(rs.getString(9));
				nuser.setSex(rs.getInt(10));
			}
		}catch(SQLException e){
			BaseDao.closeAll(ps, null, rs);
		}
		return nuser;
	}

	@Override
	public User selectUserById(int id, Connection conn) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		User nuser = null;
		String sql = "select * from easyrent_user where id=?";
		try{
			Object [] oo = {id};
			rs = BaseDao.executeQuery(conn, ps, sql, oo);
			while(rs.next()){
				nuser = new User();
				nuser.setId(rs.getInt(1));
				nuser.setUserName(rs.getString(2));
				nuser.setLoginName(rs.getString(3));
				nuser.setPassword(rs.getString(4));
				nuser.setEmail(rs.getString(5));
				nuser.setTelephone(rs.getString(6));
				nuser.setIdcard(rs.getString(7));
				nuser.setQid(rs.getInt(8));
				nuser.setPicpath(rs.getString(9));
				nuser.setSex(rs.getInt(10));
			}
		}catch(SQLException e){
			BaseDao.closeAll(ps, null, rs);
		}
		return nuser;
	}


}
