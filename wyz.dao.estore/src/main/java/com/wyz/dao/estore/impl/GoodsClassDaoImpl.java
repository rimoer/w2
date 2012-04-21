package com.wyz.dao.estore.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wyz.dao.estore.GoodsClassDao;
import com.wyz.entity.estore.GoodsClass;
import com.wyz.entity.estore.GoodsClassExample;
import com.wyz.mapper.estore.GoodsClassMapper;

/**
 * @author wangyz
 * @since 2012-3-13 下午11:43:07
 * @version 1.0
 */

@Repository
public class GoodsClassDaoImpl implements GoodsClassDao {
	@Autowired
	GoodsClassMapper goodsClassMapper = null;

	public int countByExample(GoodsClassExample example) {
		return goodsClassMapper.countByExample(example);
	}

	public int insert(GoodsClass record) {
		return goodsClassMapper.insert(record);
	}

	public int deleteByPrimaryKey(Long id) {
		return goodsClassMapper.deleteByPrimaryKey(id);
	}

	public int deleteByExample(GoodsClassExample example) {
		return goodsClassMapper.deleteByExample(example);
	}

	public int updateByPrimaryKey(GoodsClass record) {
		return goodsClassMapper.updateByPrimaryKey(record);
	}

	public int updateByExample(GoodsClass record, GoodsClassExample example) {
		return goodsClassMapper.updateByExample(record, example);
	}

	public GoodsClass selectByPrimaryKey(Long id) {
		return goodsClassMapper.selectByPrimaryKey(id);
	}

	public List<GoodsClass> selectByExample(GoodsClassExample example) {
		return goodsClassMapper.selectByExample(example);
	}

}
