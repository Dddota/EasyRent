package cn.easyrent.web.backend;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.easyrent.model.User;
import cn.easyrent.service.UserDaoService;
import cn.easyrent.service.impl.UserDaoServiceImpl;


public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 8642855296633165426L;

	public void destroy() {
		super.destroy(); 
	
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接受opr参数
		request.setCharacterEncoding("utf-8");
		String opr = request.getParameter("opr");
		System.out.println(opr);
		HttpSession session = request.getSession();
		String url = request.getContextPath();
		String message = null;
		UserDaoService userDaoService = new UserDaoServiceImpl();
		if(opr.equals("register")){//处理注册业务
			String userName = request.getParameter("userName");
			String loginName = request.getParameter("loginName");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String teletphone = request.getParameter("telephone");
			String idcard = request.getParameter("idcard");
			String qidStr = request.getParameter("qid");
			int qid = Integer.parseInt(qidStr);
			String picPath = request.getParameter("picPath");
			String answer = request.getParameter("answer");
			String sexStr = request.getParameter("gender");
			int sex = Integer.parseInt(sexStr);
			User user = new User(userName,loginName,password,email,teletphone,idcard,qid,picPath,answer,sex);
			int row = userDaoService.addUser(user);
			if(row>0){
				message = "注册成功";
			}else{
				message = "注册失败";
			}
			session.setAttribute("message", message);
			response.sendRedirect(url+"/jsp/user/login.html");
		}else if(opr.equals("login")){//处理登录业务
			String loginName = request.getParameter("loginName");
			String password = request.getParameter("password");
			User user = new User(loginName,password);
			User nuser = userDaoService.selectUserByLnPwd(user);
			if(nuser!=null){
				session.setAttribute("User", nuser);
				response.sendRedirect(url+"/index.jsp");
				
			}else{
				session.setAttribute("message", "登录失败，账户名和密码不匹配");
				response.sendRedirect(url+"/jsp/user/login.html");
				
			}

		}else if(opr.equals("login_out")){//处理注销业务
			response.sendRedirect(url+"/index.jsp");
			session.invalidate();//结束会话
		}
	}
	public void init() throws ServletException {
		
	}

}
