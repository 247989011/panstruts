package com.struts.action;

import java.io.FileNotFoundException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.dom4j.DocumentException;

import com.struts.form.StrutsXml;

public class InitLisenter implements ServletContextListener {


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("系统已销毁");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext context = arg0.getServletContext();
		String xmlPath = context.getInitParameter("struts-config");
		String tomcatPath = context.getRealPath("\\");
		try {
			Map maping = StrutsXml.analyXML(tomcatPath + xmlPath);
			System.out.println(tomcatPath +"|||||||||||||||||||||||||||"+ xmlPath);
			context.setAttribute("maping", maping);
			
		}  catch (Exception e) {
			e.printStackTrace();
			System.out.println("解析xml报错!!!");
		}
		System.out.println("系统启动完毕");
		
	}

}
