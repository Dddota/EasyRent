package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.StreetAddressDao;
import cn.easyrent.model.StreetAddress;
import cn.easyrent.utils.BaseDao;

public class StreetAddressDaoImpl implements StreetAddressDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String sql = null;
	
	@Override
	public StreetAddress selectStreetAddressById(Connection conn, int id) {
		StreetAddress street = null;
		sql = new String("select id, cid, housestreet from easyrent_streetaddress where id=?");
		Object[] oo = {id};
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql, oo);
			while(rs.next()) {
				street = new StreetAddress();
				street.setId(rs.getInt(1));
				street.setCid(rs.getInt(2));
				street.setHousestreet(rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return street;
	}

}
