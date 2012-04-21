package com.wyz.dao.estore;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.wyz.entity.estore.Goods;
import com.wyz.entity.estore.GoodsExample;

public interface GoodsDao {
	@Transactional
	int insert(Goods record);

	@Transactional
	int deleteByPrimaryKey(Long id);

	@Transactional
	int deleteByExample(GoodsExample example);

	@Transactional
	int updateByPrimaryKey(Goods record);

	@Transactional
	int updateByExample(Goods record, GoodsExample example);

	@Transactional(readOnly = true)
	int countByExample(GoodsExample example);

	@Transactional(readOnly = true)
	Goods selectByPrimaryKey(Long id);

	@Transactional(readOnly = true)
	List<Goods> selectByExample(GoodsExample example);
}
