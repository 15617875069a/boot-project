package com.zdy.cn.service.impl;

import com.zdy.cn.domin.entity.Brand;
import com.zdy.cn.service.BrandService;
import com.zdy.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand> implements BrandService{
}
