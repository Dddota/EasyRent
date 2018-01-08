package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.HouseTypeDao;
import cn.easyrent.model.HouseType;
import cn.easyrent.utils.BaseDao;

public class HouseTypeDaoImpl implements HouseTypeDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String sql = null;
	
	@Override
	public HouseType selectHouseTypeById(Connection conn, int id) {
		HouseType type = null;
		sql = "select id, type from easyrent_housetype where id=?";
		Object[] oo = {id};
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql, oo);
			while(rs.next()) {
				type = new HouseType();
				type.setId(rs.getInt(1));
				type.setType(rs.getString(2));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return type;
	}

}
