package com.wyz.cloud.common;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware, ModelDriven<Object> {
	private static final long serialVersionUID = -655593761741434827L;

	protected ServletRequest request = null;
	protected ServletResponse response = null;
	protected ServletContext context = null;

	public Object getModel() {
		return null;
	}

	public void setServletContext(ServletContext context) {
		this.context = context;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
