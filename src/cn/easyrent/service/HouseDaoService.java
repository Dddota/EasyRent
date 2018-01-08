package cn.easyrent.service;

import java.util.List;

import cn.easyrent.model.House;

public interface HouseDaoService {
	int publishHouseMsg(House house);
	List<House> showHouseMsg();
	List<House> selectHouseMsgByHid(int hId);
	List<House> showLikeHouseMsg(String key);

	List<House> queryHouse(House house);
}
