package cn.easyrent.service.impl;

import java.sql.Connection;

import cn.easyrent.dao.impl.HouseStatusDaoImpl;
import cn.easyrent.model.HouseStatus;
import cn.easyrent.service.HouseStatusService;
import cn.easyrent.utils.BaseDao;

public class HouseStatusServiceImpl implements HouseStatusService {

	@Override
	public HouseStatus selectHouseStatusById(int id) {
		Connection conn = BaseDao.getConnection();
		HouseStatus status = new HouseStatusDaoImpl().selectHouseStatusById(conn, id);
		BaseDao.closeAll(null, conn, null);
		return status;
	}

}
