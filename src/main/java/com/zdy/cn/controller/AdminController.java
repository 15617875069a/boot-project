package com.zdy.cn.controller;

import com.zdy.cn.common.http.AxiosResult;
import com.zdy.cn.controller.base.BaseController;
import com.zdy.cn.domin.entity.Admin;
import com.zdy.cn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public AxiosResult<List<Admin>> list(){
        List<Admin> list = adminService.list();
        return AxiosResult.success(list);
    }
    @GetMapping("{id}")
    public AxiosResult<Admin> findById(@PathVariable Long id){
        Admin byId = adminService.getById(id);
        return AxiosResult.success(byId);
    }
    @PostMapping
    public AxiosResult<Void> add(@RequestBody Admin admin){
        return toAxios(adminService.save(admin));
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Admin admin){
        return toAxios(adminService.update(admin));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id){
        return toAxios(adminService.deleteById(id));
    }

}
