package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.CityAddress;

public interface CityAddressDao {
	public CityAddress selectCityAddressById(Connection conn, int id);
}
