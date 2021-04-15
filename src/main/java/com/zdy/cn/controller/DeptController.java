package com.zdy.cn.controller;

import com.zdy.cn.common.http.AxiosResult;
import com.zdy.cn.controller.base.BaseController;
import com.zdy.cn.domin.entity.Dept;
import com.zdy.cn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController extends BaseController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public AxiosResult<List<Dept>> list(){
        List<Dept> list = deptService.list();
        return AxiosResult.success(list);
    }
    @GetMapping("{id}")
    public AxiosResult<Dept> findById(@PathVariable Long id){
        Dept byId = deptService.getById(id);
        return AxiosResult.success(byId);
    }
    @PostMapping
    public AxiosResult<Void> add(@RequestBody Dept Dept){
        return toAxios(deptService.save(Dept));
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Dept Dept){
        return toAxios(deptService.update(Dept));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id){
        return toAxios(deptService.deleteById(id));
    }

}
