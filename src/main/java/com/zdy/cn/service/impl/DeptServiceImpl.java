package com.zdy.cn.service.impl;

import com.zdy.cn.domin.entity.Dept;
import com.zdy.cn.service.DeptService;
import com.zdy.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptServiceImpl extends BaseServiceImpl<Dept> implements DeptService {
}
