package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.CityAddressDao;
import cn.easyrent.model.CityAddress;
import cn.easyrent.utils.BaseDao;

public class CityAddressDaoImpl implements CityAddressDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String sql = null;
	
	@Override
	public CityAddress selectCityAddressById(Connection conn, int id) {
		CityAddress cityAddress = null;
		sql = new String("select id, address from easyrent_cityaddress where id=?");
		Object[] oo = {id};
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql, oo);
			while(rs.next()) {
				cityAddress = new CityAddress();
				cityAddress.setId(rs.getInt(1));
				cityAddress.setAddress(rs.getString(2));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return cityAddress;
	}
	
}
