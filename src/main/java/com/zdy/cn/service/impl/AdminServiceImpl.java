package com.zdy.cn.service.impl;

import com.zdy.cn.domin.entity.Admin;
import com.zdy.cn.service.AdminService;
import com.zdy.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService {
}
