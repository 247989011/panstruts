package com.struts.service.myservice;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.struts.form.ActionForm;

public interface PandService {

	public Map<String,Object> getUserAndUrl(String name);

	public String doPand(HttpServletRequest request,ActionForm form, Map<String, String> forward);
	
}
