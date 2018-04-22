package com.struts.service.vo;

import java.io.Serializable;

public class MessageVO implements Serializable {

	private String msg;
	
	private String name;
	
	private String sss;
	
	private String ddd;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSss() {
		return sss;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	@Override
	public String toString() {
		return "MessageVO [msg=" + msg + ", name=" + name + ", sss=" + sss + ", ddd=" + ddd + "]";
	}
	
	
	
}
