package com.wyz.dao.estore;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.wyz.entity.estore.GoodsClass;
import com.wyz.entity.estore.GoodsClassExample;

/**
 * @author wangyz
 * @since 2012-3-13 下午11:42:48
 * @version 1.0
 */
public interface GoodsClassDao {
	@Transactional
	int insert(GoodsClass record);

	@Transactional
	int deleteByPrimaryKey(Long id);

	@Transactional
	int deleteByExample(GoodsClassExample example);

	@Transactional
	int updateByPrimaryKey(GoodsClass record);

	@Transactional
	int updateByExample(GoodsClass record, GoodsClassExample example);

	@Transactional(readOnly = true)
	int countByExample(GoodsClassExample example);

	@Transactional(readOnly = true)
	GoodsClass selectByPrimaryKey(Long id);

	@Transactional(readOnly = true)
	List<GoodsClass> selectByExample(GoodsClassExample example);

}
