package cn.easyrent.service.impl;

import java.sql.Connection;

import cn.easyrent.dao.impl.CityAddressDaoImpl;
import cn.easyrent.model.CityAddress;
import cn.easyrent.service.CityAddressService;
import cn.easyrent.utils.BaseDao;

public class CityAddressServiceImpl implements CityAddressService {

	@Override
	public CityAddress selectCityAddressById(int id) {
		Connection conn = BaseDao.getConnection();
		CityAddress cityAddress = new CityAddressDaoImpl().selectCityAddressById(conn, id);
		BaseDao.closeAll(null, conn, null);
		return cityAddress;
	}
	
}
