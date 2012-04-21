package com.wyz.cloud.estore.action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wyz.cloud.common.FacedeAction;

@ParentPackage("estore-default")
@Results({ @Result(type = "redirectAction", name = "success", location = "estore_index") })
public class IndexAction extends FacedeAction {
	private static final long serialVersionUID = -35048722565704733L;
	private final static Logger log = LoggerFactory.getLogger(IndexAction.class);

	public String execute() throws Exception {
		log.debug("IndexAction is invoking...");
		return SUCCESS;
	}

}
