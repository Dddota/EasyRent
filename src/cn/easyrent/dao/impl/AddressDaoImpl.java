package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.AddressDao;
import cn.easyrent.model.Address;
import cn.easyrent.utils.BaseDao;

public class AddressDaoImpl implements AddressDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String sql = null;
	
	@Override
	public Address selectAddressById(Connection conn, int id) {
		Address address = null;
		sql = "select id, cid, sid, details from easyrent_address where id=?";
		Object[] oo = {id};
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql, oo);
			while(rs.next()){
				address = new Address();
				address.setId(rs.getInt(1));
				address.setCid(rs.getInt(2));
				address.setSid(rs.getInt(3));
				address.setDetails(rs.getString(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return address;
	}

}
