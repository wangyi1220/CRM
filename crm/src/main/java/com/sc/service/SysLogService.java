package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysLog;

public interface SysLogService {
	public void insert(SysLog log);
	public PageInfo<SysLog> selectPage(Integer pageNum,Integer pageSize,SysLog log);
	public void deleteLog(Long lId);
	public void deleteAll();
}
