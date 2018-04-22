package com.struts.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.struts.form.ActionForm;

public interface Action {

	public String execute(HttpServletRequest request,HttpServletResponse respone,ActionForm form ,Map<String,String> forward);


}
