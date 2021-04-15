package com.zdy.cn.service.base.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zdy.cn.mapper.base.MyMapper;
import com.zdy.cn.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyMapper<T> myMapper;

    @Override
    public List<T> list() {
        return myMapper.selectList(null);
    }

    @Override
    public List<T> search(Wrapper<T> wrapper) {
        return myMapper.selectList(wrapper);
    }

    @Override
    public T getById(Long id) {
        return (T) myMapper.selectById(id);
    }

    @Override
    public int save(T t) {
        return myMapper.insert(t);
    }

    @Override
    public int update(T t) {
        return myMapper.updateById(t);
    }

    @Override
    public int deleteById(Long id) {
        return deleteById(id);
    }

    @Override
    @Transactional
    public int batchDeleteByIds(List<Long> ids) {
        return myMapper.deleteBatchIds(ids);
    }
}
