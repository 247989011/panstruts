package com.struts.form;

import java.util.HashMap;
import java.util.Map;

public class XmlBean {

	private String beanName;
	
	private String beanClass;
	
	private String actionClass ;
	
	private String actionPath;
	
	private Map<String,String> forwards = new HashMap<String,String>();

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}

	public String getActionClass() {
		return actionClass;
	}

	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}

	public String getActionPath() {
		return actionPath;
	}

	public void setActionPath(String actionPath) {
		this.actionPath = actionPath;
	}

	public Map<String, String> getForwards() {
		return forwards;
	}

	public void setForwards(Map<String, String> forwards) {
		this.forwards = forwards;
	}

	@Override
	public String toString() {
		return "XmlBean [beanName=" + beanName + ", beanClass=" + beanClass + ", actionClass=" + actionClass
				+ ", actionPath=" + actionPath + ", forwards=" + forwards + "]";
	}
	
	
	
	
}
