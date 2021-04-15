package com.zdy.cn.service.impl;

import com.zdy.cn.domin.entity.Good;
import com.zdy.cn.service.GoodService;
import com.zdy.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodServiceImpl extends BaseServiceImpl<Good> implements GoodService {
}
