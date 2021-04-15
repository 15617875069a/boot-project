package com.zdy.cn.service.impl;

import com.zdy.cn.domin.entity.Category;
import com.zdy.cn.service.CategoryService;
import com.zdy.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {
}
