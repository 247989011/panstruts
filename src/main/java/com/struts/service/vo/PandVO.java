package com.struts.service.vo;

import java.io.Serializable;

public class PandVO implements Serializable{

	private String msg;
	
	private String obj;
	
	private boolean success;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getObj() {
		return obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
	
}
