package com.struts.bisness;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.struts.action.Action;
import com.struts.form.ActionForm;
import com.struts.service.myservice.PandService;
import com.struts.service.myservice.impl.PandServiceImpl;

public class PandAction implements Action {

	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response,ActionForm form , Map<String,String> forward) {
		
		//request中放置页面向上显示的数据
		PandService pandService = new PandServiceImpl();
		
		return pandService.doPand(request,form,forward);
	}
	
}
