package com.struts.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.struts.bisness.PandAction;
import com.struts.form.ActionForm;
import com.struts.form.FullForm;
import com.struts.form.XmlBean;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ActionServlet() {
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String path = getPath(request.getServletPath());
			System.out.println(path);
			ServletContext context = request.getServletContext();
			Map<String,XmlBean> maping = (Map<String, XmlBean>) context.getAttribute("maping");
			XmlBean bean = maping.get(path);
			ActionForm actionForm = FullForm.full(bean.getBeanClass(), request);//填充表单内容到实体
			Action action = (Action) Class.forName(bean.getActionClass()).newInstance();
			String url = action.execute(request,response,actionForm,bean.getForwards());
			//获得转发器对象
			RequestDispatcher dis = request.getRequestDispatcher(url);
			dis.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Servlet严重错误!!!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public String getPath(String path) {
		return path.split("\\.")[0];
	}
}
