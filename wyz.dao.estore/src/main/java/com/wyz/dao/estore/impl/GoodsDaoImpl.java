package com.wyz.dao.estore.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wyz.dao.estore.GoodsDao;
import com.wyz.entity.estore.Goods;
import com.wyz.entity.estore.GoodsExample;
import com.wyz.mapper.estore.GoodsMapper;

/**
 * @author wangyz
 * @since 2012-4-14上午10:37:24
 * @version 1.0
 */
@Repository
public class GoodsDaoImpl implements GoodsDao {
	@Autowired
	GoodsMapper goodsMapper = null;

	public int countByExample(GoodsExample example) {
		return goodsMapper.countByExample(example);
	}

	public int insert(Goods record) {
		return goodsMapper.insert(record);
	}

	public int deleteByPrimaryKey(Long id) {
		return goodsMapper.deleteByPrimaryKey(id);
	}

	public int deleteByExample(GoodsExample example) {
		return goodsMapper.deleteByExample(example);
	}

	public int updateByPrimaryKey(Goods record) {
		return goodsMapper.updateByPrimaryKey(record);
	}

	public int updateByExample(Goods record, GoodsExample example) {
		return goodsMapper.updateByExample(record, example);
	}

	public Goods selectByPrimaryKey(Long id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	public List<Goods> selectByExample(GoodsExample example) {
		return goodsMapper.selectByExample(example);
	}

}
