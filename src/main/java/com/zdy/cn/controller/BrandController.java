package com.zdy.cn.controller;

import com.zdy.cn.common.http.AxiosResult;
import com.zdy.cn.controller.base.BaseController;
import com.zdy.cn.domin.entity.Brand;
import com.zdy.cn.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController extends BaseController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public AxiosResult<List<Brand>> list(){
        List<Brand> list = brandService.list();
        return AxiosResult.success(list);
    }
    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable Long id){
        Brand byId = brandService.getById(id);
        return AxiosResult.success(byId);
    }
    @PostMapping
    public AxiosResult<Void> add(@RequestBody Brand brand){
        return toAxios(brandService.save(brand));
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Brand brand){
        return toAxios(brandService.update(brand));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id){
        return toAxios(brandService.deleteById(id));
    }

}
