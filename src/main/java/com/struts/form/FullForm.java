package com.struts.form;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

public class FullForm extends ActionForm {

	public FullForm() {
		
	}
	public static ActionForm full(String formpath,HttpServletRequest request) {
		ActionForm actionForm = null;
		try {
			Class clazz = Class.forName(formpath);
			actionForm = (ActionForm) clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				field.set(actionForm, request.getParameter(field.getName()));
				field.setAccessible(false);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("严重：Form装载失败！！！");
		}
		
		return actionForm;
	}
}
