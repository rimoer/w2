package com.wyz.service.estore.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyz.dao.estore.GoodsClassDao;
import com.wyz.dao.estore.GoodsDao;
import com.wyz.service.estore.EStoreService;

@Service
public class EStoreServiceImpl implements EStoreService {
	@Autowired
	GoodsDao goodsDao = null;

	@Autowired
	GoodsClassDao goodsClassDao = null;

}
