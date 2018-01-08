package cn.easyrent.service.impl;

import java.sql.Connection;

import cn.easyrent.dao.impl.AddressDaoImpl;
import cn.easyrent.model.Address;
import cn.easyrent.service.AddressDaoService;
import cn.easyrent.utils.BaseDao;

public class AddressDaoServiceImpl implements AddressDaoService {

	@Override
	public Address selectAddressById(int id) {
		Connection conn = BaseDao.getConnection();
		Address address = new AddressDaoImpl().selectAddressById(conn, id);
		BaseDao.closeAll(null, conn, null);
		return address;
	}

}
