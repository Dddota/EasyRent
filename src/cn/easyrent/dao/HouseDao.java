package cn.easyrent.dao;

import java.sql.Connection;
import java.util.List;

import cn.easyrent.model.House;

public interface HouseDao {
	int publishHouseMsg(Connection conn, House house);//发布房屋信息
	List<House> showHouseMsg(Connection conn);//显示所有房屋信息
	List<House> selectHouseMsgByHid(int hId, Connection conn);//查询订单信息
	public List<House> showLikeHouseMsg(String key, Connection conn);
	public List<House> queryHouse(Connection conn, House house);
}
