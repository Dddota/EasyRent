package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.easyrent.dao.ModelDao;
import cn.easyrent.model.Model;
import cn.easyrent.utils.BaseDao;

public class ModelDaoImpl implements ModelDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String sql = null;

	@Override
	public Model selectModelById(Connection conn, int id) {
		Model model = null;
		sql = "select id, model from easyrent_model where id=?";
		Object[] oo = { id };
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql, oo);
			while (rs.next()) {
				model = new Model();
				model.setId(rs.getInt(1));
				model.setModel(rs.getString(2));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return model;
	}
}
