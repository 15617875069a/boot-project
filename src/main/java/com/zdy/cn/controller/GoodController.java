package com.zdy.cn.controller;

import com.zdy.cn.common.http.AxiosResult;
import com.zdy.cn.controller.base.BaseController;
import com.zdy.cn.domin.entity.Good;
import com.zdy.cn.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("good")
public class GoodController extends BaseController {

    @Autowired
    private GoodService goodService;

    @GetMapping
    public AxiosResult<List<Good>> list(){
        List<Good> list = goodService.list();
        return AxiosResult.success(list);
    }
    @GetMapping("{id}")
    public AxiosResult<Good> findById(@PathVariable Long id){
        Good byId = goodService.getById(id);
        return AxiosResult.success(byId);
    }
    @PostMapping
    public AxiosResult<Void> add(@RequestBody Good Good){
        return toAxios(goodService.save(Good));
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Good Good){
        return toAxios(goodService.update(Good));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id){
        return toAxios(goodService.deleteById(id));
    }

}
