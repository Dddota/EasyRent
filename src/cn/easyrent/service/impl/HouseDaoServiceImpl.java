package cn.easyrent.service.impl;

import java.sql.Connection;
import java.util.List;

import cn.easyrent.dao.HouseDao;
import cn.easyrent.dao.impl.HouseDaoImpl;
import cn.easyrent.model.House;
import cn.easyrent.service.HouseDaoService;
import cn.easyrent.utils.BaseDao;

public class HouseDaoServiceImpl implements HouseDaoService {
	HouseDao houseDao = new HouseDaoImpl();
	@Override
	public int publishHouseMsg(House house) {
		Connection conn = BaseDao.getConnection();
		int row = houseDao.publishHouseMsg(conn, house);
		BaseDao.closeAll(null, conn, null);
		return row;
	}
	@Override
	public List<House> showHouseMsg() {
		Connection conn = BaseDao.getConnection();
		List<House> houseList = houseDao.showHouseMsg(conn);
		BaseDao.closeAll(null, conn, null);
		return houseList;
	}
	@Override
	public List<House> selectHouseMsgByHid(int hId) {
		Connection conn = BaseDao.getConnection();
		List<House> houseList = houseDao.selectHouseMsgByHid(hId, conn);
		BaseDao.closeAll(null, conn, null);
		return houseList;
	}
	@Override
	public List<House> showLikeHouseMsg(String key) {
		Connection conn = BaseDao.getConnection();
		List<House> houseList = houseDao.showLikeHouseMsg(key, conn);
		BaseDao.closeAll(null, conn, null);
		return houseList;
	}
	@Override
	public List<House> queryHouse(House house) {
		Connection conn = BaseDao.getConnection();
		List<House> houseList = houseDao.queryHouse(conn, house);
		BaseDao.closeAll(null, conn, null);
		return houseList;
	}

}
