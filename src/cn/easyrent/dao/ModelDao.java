package cn.easyrent.dao;

import java.sql.Connection;

import cn.easyrent.model.Model;

public interface ModelDao {
	public Model selectModelById(Connection conn, int id);
}
