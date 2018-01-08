package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.HouseStatus;

public interface HouseStatusDao {
	public HouseStatus selectHouseStatusById(Connection conn, int id);
}
