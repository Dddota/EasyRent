package cn.easyrent.service.impl;

import java.sql.Connection;

import cn.easyrent.dao.impl.HouseTypeDaoImpl;
import cn.easyrent.model.HouseType;
import cn.easyrent.service.HouseTypeService;
import cn.easyrent.utils.BaseDao;

public class HouseTypeServiceImpl implements HouseTypeService {

	@Override
	public HouseType selectHouseTypeById(int id) {
		Connection conn = BaseDao.getConnection();
		HouseType type = new HouseTypeDaoImpl().selectHouseTypeById(conn, id);
		BaseDao.closeAll(null, conn, null);
		return type;
	}

}
