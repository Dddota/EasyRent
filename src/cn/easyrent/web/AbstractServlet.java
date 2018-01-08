package cn.easyrent.web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractServlet extends HttpServlet {
	/*public abstract Class getServletClass();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String actionIndicator = request.getParameter("action");
		Method method = null;
		Object result = null;
		try {
			if (EmptyUtils.isEmpty(actionIndicator)) {
				result = execute(request,response);
			} else {
				method = getServletClass().getDeclaredMethod(actionIndicator, HttpServletRequest.class, HttpServletResponse.class);
				result = method.invoke(this, request, response);
			}
			toView(request, response, result);
		} catch (NoSuchMethodException e) {
			String viewName = "404.jsp";
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			if (!EmptyUtils.isEmpty(result)) {
				if (result instanceof String) {
					String viewName = "500.jsp";
					request.getRequestDispatcher(viewName).forward(request, response);
				} else {
					ReturnResult returnResult = new ReturnResult();
					returnResult.returnFail("系统错误");
					PrintUtil.writel(returnResult,response);
				}
			} else {
				String viewName = "500.jsp";
				request.getRequestDispatcher(viewName).forward(request, response);
			}
		}
	}
	
	protected void toView(HttpServletRequest request, HttpServletResponse response, Object result)
			throws ServletException, IOException {
		if(!EmptyUtils.isEmpty(result)) {
			if (result instanceof String) {
				String viewName = result.toString() + ".jsp";
				request.getRequestDispatcher(viewName).forward(request, response);
			} else {
				PrintUtil.write(result,response);
			}
		}
	}
	
	public Object execute(HttpServletRequest request, HttpServletResponse response){
		return "pre/index";
	}*/
}
