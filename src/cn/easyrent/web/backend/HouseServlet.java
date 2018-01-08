package cn.easyrent.web.backend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.easyrent.model.Address;
import cn.easyrent.model.CityAddress;
import cn.easyrent.model.House;
import cn.easyrent.model.HouseStatus;
import cn.easyrent.model.HouseType;
import cn.easyrent.model.Model;
import cn.easyrent.model.StreetAddress;
import cn.easyrent.model.User;
import cn.easyrent.service.HouseDaoService;
import cn.easyrent.service.impl.AddressDaoServiceImpl;
import cn.easyrent.service.impl.CityAddressServiceImpl;
import cn.easyrent.service.impl.HouseDaoServiceImpl;
import cn.easyrent.service.impl.HouseStatusServiceImpl;
import cn.easyrent.service.impl.HouseTypeServiceImpl;
import cn.easyrent.service.impl.ModelServiceImpl;
import cn.easyrent.service.impl.StreetAddressServiceImpl;
import cn.easyrent.service.impl.UserDaoServiceImpl;

public class HouseServlet extends HttpServlet {

	private static final long serialVersionUID = -8065938249661349335L;

	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HouseDaoService houseDaoService = new HouseDaoServiceImpl();
		String opr = request.getParameter("opr");
		String message = null;
		HttpSession session = request.getSession();
		if(opr.equals("publish")){
			String address = request.getParameter("address");
			String type = request.getParameter("type");
			String area = request.getParameter("area");
			String rent = request.getParameter("rent");
			String director = request.getParameter("director");
			String floor = request.getParameter("floor");
			String directorFloor = director+floor;
			String info = request.getParameter("info");
			String model = request.getParameter("model");
			String picPath = request.getParameter("picPath");
			String uIdStr = (String)session.getAttribute("uId");
			int uId = Integer.parseInt(uIdStr);
			House house = null;//new House(uId,address,type,area,rent,directorFloor,info,model,picPath);
			int row = houseDaoService.publishHouseMsg(house);
			if(row>0){
				message = "发布成功";
			}else{
				message = "发布失败";
			}
			session.setAttribute("message", message);
			response.sendRedirect("/EasyRent/pre/settlement/login.jsp");
 		} else if(opr.equals("houseList")) {
 			int tid = Integer.parseInt(request.getParameter("tid"));
 			House house = new House();
 			house.setTid(tid);
 			List<House> houseList = new HouseDaoServiceImpl().queryHouse(house);
 			for(House h : houseList) {
 				User user = new UserDaoServiceImpl().selectUserById(h.getUid());
 				h.setUser(user);
 				Address address = new AddressDaoServiceImpl().selectAddressById(h.getAid());
 				h.setAddress(address);
 				StreetAddress street = new StreetAddressServiceImpl().selectStreetAddressById(address.getSid());
 				address.setStreet(street);
 				CityAddress cityAddress = new CityAddressServiceImpl().selectCityAddressById(street.getCid());
 				street.setCityAddress(cityAddress);
 				HouseType type = new HouseTypeServiceImpl().selectHouseTypeById(h.getTid());
 				h.setType(type);
 				Model model = new ModelServiceImpl().selectModelById(h.getMid());
 				h.setModel(model);
 				HouseStatus status = new HouseStatusServiceImpl().selectHouseStatusById(h.getSid());
 				h.setStatus(status);
 				//System.out.println(h.toString());
 			}
 			
 			request.setAttribute("List", houseList);
 			request.getRequestDispatcher("/jsp/house/showHouseList.jsp").forward(request, response);
 		} else if(opr.equals("likeHouse")) {
 			String key = request.getParameter("key");
 			List<House> houseList = new HouseDaoServiceImpl().showLikeHouseMsg(key.trim());
 			request.setAttribute("List", houseList);
 			request.getRequestDispatcher("/jsp/house/showHouseList.jsp").forward(request, response);
 		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
	
	}

}
