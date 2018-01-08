package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.StreetAddress;

public interface StreetAddressDao {
	public StreetAddress selectStreetAddressById(Connection conn, int id);
}
