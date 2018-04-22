package com.struts.form;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class StrutsXml {

	public StrutsXml() {
		
	}
	
	public static Map<String, XmlBean> analyXML(String xmlpath) throws FileNotFoundException, DocumentException {
		Map<String,XmlBean> maping = new HashMap<String,XmlBean>();
		SAXReader reader = new SAXReader();
		File file = new File(xmlpath);
		Document doc = reader.read(new BufferedInputStream(new FileInputStream(file)));
		Element root = doc.getRootElement();
		Element formbean = root.element("formbeans");
		Element actionmapping = root.element("action-mapping");
		for (Iterator i = actionmapping.elementIterator(); i.hasNext();) {
			Element action = (Element) i.next();
			String actionname = action.attributeValue("name");
			String actionClass = action.attributeValue("type");
			String path = action.attributeValue("path");
			List<Element> forwards = action.elements();
			List<Element> beans = formbean.elements("bean");
			for (Element bean : beans) {
				String beanname = bean.attributeValue("name");
				String beanClass = bean.attributeValue("class");
				if(beanname.equals(actionname)) {
					XmlBean xmlbean = new XmlBean();
					xmlbean.setBeanName(beanname);
					xmlbean.setActionClass(actionClass);
					xmlbean.setBeanClass(beanClass);
					xmlbean.setActionPath(path);
					Map<String,String> forwardMap = new HashMap<String,String>();
					for (Element forward : forwards) {
						String forwardname = forward.attributeValue("name");
						String forwardvalue = forward.attributeValue("value");
						forwardMap.put(forwardname, forwardvalue);
					}
					xmlbean.setForwards(forwardMap);
					maping.put(path, xmlbean);
				}
			}
		}
		
		return maping;
	}
}
