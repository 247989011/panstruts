package com.struts.service.myservice.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.struts.bisness.PandForm;
import com.struts.form.ActionForm;
import com.struts.service.myservice.PandService;
import com.struts.service.vo.MessageVO;
import com.struts.service.vo.PandVO;

public class PandServiceImpl implements PandService {

	@Override
	public Map<String, Object> getUserAndUrl(String name) {
		String url ="";
		MessageVO vo = new MessageVO();
		if(isuser(name)){
			vo.setDdd("ddd");
			vo.setSss("ssss");
			vo.setMsg("success");
			vo.setName("name");
			
			url = "view/MyJsp.jsp";
		}else {
			vo.setDdd("ddd");
			vo.setSss("ssss");
			vo.setMsg("error");
			vo.setName("name");
			url = "view/error.jsp";
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("user", vo);
		map.put("url", url);
		return map;
	}
	private boolean isuser(String user) {
    	boolean b = false;
    	if("yxk".equals(user)) {
    		b = true;
    	}else {
    		
    	}
    	return b ;
    }
	@Override
	public String doPand(HttpServletRequest request,ActionForm form, Map<String, String> forward) {
		PandForm pand = (PandForm) form;
		PandVO vo = new PandVO();
		
		if("a".equals(pand.getA())) {
			vo.setMsg("成功啦");
			vo.setObj("未来是一个实体类");
			vo.setSuccess(true);
			request.setAttribute("vo", vo);
			return forward.get("success");
		}else {
			vo.setMsg("成功啦");
			vo.setObj("未来是一个实体类");
			vo.setSuccess(true);
			request.setAttribute("vo", vo);
			return forward.get("error");
		}
	}

}
