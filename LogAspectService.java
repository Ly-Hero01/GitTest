/*
 * Copyright (C) 2015 HANGZHOU TRUSTWAY TECHNOLOGY CO.,LTD. 
 * All rights reserved.
 */
package cn.trustway.itsm.sys.core.service;

/**
 * @author TMAC
 * @version 1.0
 * @create 2016年10月17日
 */
public interface LogAspectService {
	/**
	 * 获取当前业务对象主键id
	 * 
	 * @return 业务对象主键id
	 */
	public String[] getBusinessKey();

	/**
	 * 获取当前业务对象主键id
	 * 
	 * @return 业务对象主键id
	 */
	public String[] getDisplayName();

	/**
	 * 获取当前业务对象
	 * 
	 * @return 业务对象
	 */
	public Object getObjectByBusinessKey(String[] key);
}
