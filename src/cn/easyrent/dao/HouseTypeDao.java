package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.HouseType;

public interface HouseTypeDao {
	public HouseType selectHouseTypeById(Connection conn, int id);
}
