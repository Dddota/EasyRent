package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.Address;

public interface AddressDao {
	public Address selectAddressById(Connection conn, int id);
}
