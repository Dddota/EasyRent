package cn.easyrent.service.impl;

import java.sql.Connection;

import cn.easyrent.dao.impl.StreetAddressDaoImpl;
import cn.easyrent.model.StreetAddress;
import cn.easyrent.service.StreetAddressService;
import cn.easyrent.utils.BaseDao;

public class StreetAddressServiceImpl implements StreetAddressService {

	@Override
	public StreetAddress selectStreetAddressById(int id) {
		Connection conn = BaseDao.getConnection();
		StreetAddress street = new StreetAddressDaoImpl().selectStreetAddressById(conn, id);
		BaseDao.closeAll(null, conn, null);
		return street;
	}

}
