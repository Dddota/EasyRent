package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.HouseStatusDao;
import cn.easyrent.model.HouseStatus;
import cn.easyrent.utils.BaseDao;

public class HouseStatusDaoImpl implements HouseStatusDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String sql = null;
	
	@Override
	public HouseStatus selectHouseStatusById(Connection conn, int id) {
		HouseStatus status = null;
		sql = "select id, status from easyrent_housestatus where id=?";
		Object[] oo = {id};
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql, oo);
			while(rs.next()){
				status = new HouseStatus();
				status.setId(rs.getInt(1));
				status.setStatus(rs.getString(2));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}
	
}
