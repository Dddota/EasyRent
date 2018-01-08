package cn.easyrent.service.impl;

import java.sql.Connection;

import cn.easyrent.dao.impl.ModelDaoImpl;
import cn.easyrent.model.Model;
import cn.easyrent.service.ModelService;
import cn.easyrent.utils.BaseDao;

public class ModelServiceImpl implements ModelService {
	public Model selectModelById(int id) {
		Connection conn = BaseDao.getConnection();
		Model model = new ModelDaoImpl().selectModelById(conn, id);
		BaseDao.closeAll(null, conn, null);
		return model;
	}
}
