package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDept;
import com.sc.entity.SysDeptExample;
import com.sc.mapper.SysDeptMapper;
import com.sc.service.SysDeptService;
@Service
public class SysDeptServiceImpl implements SysDeptService {
	@Autowired
	SysDeptMapper sysDeptMapper;
	@Override
	public PageInfo<SysDept> select(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
        SysDeptExample e=new SysDeptExample();
        e.setOrderByClause("DEPT_ID DESC");
		List<SysDept> list = sysDeptMapper.selectByExample(e);
		
		PageInfo<SysDept> pageInfo = new PageInfo<SysDept>(list);
		
		return pageInfo;
	}

	@Override
	public void add(SysDept s) {
		if (s != null){
			this.sysDeptMapper.insert(s);
		}

	}

	@Override
	public void del(SysDept s) {
		if(s!=null){
			this.sysDeptMapper.deleteByPrimaryKey(s.getDeptId());
		}

	}

	@Override
	public void update(SysDept s) {
		if (s != null&& s.getDeptId()!=null){
			this.sysDeptMapper.updateByPrimaryKey(s);
		}

	}

	@Override
	public SysDept get(Long deptId) {
		if(deptId!=null){
			return this.sysDeptMapper.selectByPrimaryKey(deptId);
		}
		return null;
	}

}
