package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.easyrent.dao.HouseDao;
import cn.easyrent.model.House;
import cn.easyrent.utils.BaseDao;
import cn.easyrent.utils.DataSourceUtil;

public class HouseDaoImpl implements HouseDao {
	PreparedStatement pstm = null;
	ResultSet rs = null;
	List<House> houseList = new ArrayList<House>();
	StringBuffer sql = null;
	List<Object> params = new ArrayList<Object>();
	
	@Override
	public int publishHouseMsg(Connection conn, House house) {
		int row = 0;
		
		return row;
	}

	@Override
	public List<House> showHouseMsg(Connection conn) {
		return null;
		
	}

	@Override
	public List<House> selectHouseMsgByHid(int hId, Connection conn) {
		return null;
		
	}

	@Override
	public List<House> showLikeHouseMsg(String key, Connection conn) {
		return null;
		
	}

	public List<House> queryHouse(Connection conn, House house){//args传递实体类对象
		sql = new StringBuffer("SELECT ho.* FROM `easyrent_house` as ho " +
				/*"INNER JOIN `easyrent_user` as us ON (us.id = ho.uid) " +
				"INNER JOIN `easyrent_address` as ad ON (ad.id = ho.aid) " +
				"INNER JOIN `easyrent_housetype` as ty ON (ty.id = ho.tid) " +
				"INNER JOIN `easyrent_model` as mo ON (mo.id = ho.mid) " +
				"INNER JOIN `easyrent_housestatus` as st ON (st.id = ho.sid) " +*/
				"WHERE 1=1 ");
		addParams(house);
		
		try {
			rs = BaseDao.executeQuery(conn, pstm, sql.toString(), params.toArray());
			while(rs.next()){
				House ho = new House();
				ho.setId(rs.getInt(1));
				ho.setUid(rs.getInt(2));
				ho.setAid(rs.getInt(3));
				ho.setTid(rs.getInt(4));
				ho.setMid(rs.getInt(5));
				ho.setSid(rs.getInt(6));
				ho.setArea(rs.getString(7));
				ho.setRent(rs.getString(8));
				ho.setDirectionfloor(rs.getString(9));
				ho.setTitle(rs.getString(10));
				ho.setInfo(rs.getString(11));
				ho.setPicpath(rs.getString(12));
				houseList.add(ho);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return houseList;
	}
	
	private void addParams(House house) {
		if(house != null) {
			if (house.getId() != 0) {
				sql.append("and ho.id=? ");
				params.add(house.getId());
			} else if (house.getUid() != 0) {
				sql.append("and ho.uid=? ");
				params.add(house.getUid());
			} else if (house.getAid() != 0) {
				sql.append("and ho.aid=? ");
				params.add(house.getAid());
			} else if (house.getTid() != 0) {
				sql.append("and ho.tid=? ");
				params.add(house.getTid());
			} else if (house.getMid() != 0) {
				sql.append("and ho.mid=? ");
				params.add(house.getMid());
			} else if (house.getSid() != 0) {
				sql.append("and ho.sid=? ");
				params.add(house.getSid());
			} else if (house.getArea() != null && house.getArea().trim().equals("")) {
				sql.append("and ho.area=? ");
				params.add(house.getArea());
			} else if (house.getRent() != null && house.getRent().trim().equals("")) {
				sql.append("and ho.rent=? ");
				params.add(house.getRent());
			} else if (house.getDirectionfloor() != null && house.getDirectionfloor().trim().equals("")) {
				sql.append("and ho.directionfloor=? ");
				params.add(house.getDirectionfloor());
			} else if (house.getTitle() != null && house.getTitle().trim().equals("")) {
				sql.append("and ho.title=? ");
				params.add(house.getTitle());
			} else if (house.getInfo() != null && house.getInfo().trim().equals("")) {
				sql.append("and ho.info=? ");
				params.add(house.getInfo());
			} else if (house.getPicpath() != null && house.getPicpath().trim().equals("")) {
				sql.append("and ho.picpath=? ");
				params.add(house.getPicpath());
			}
		}
	}
}
