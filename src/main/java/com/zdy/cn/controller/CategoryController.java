package com.zdy.cn.controller;

import com.zdy.cn.common.http.AxiosResult;
import com.zdy.cn.controller.base.BaseController;
import com.zdy.cn.domin.entity.Category;
import com.zdy.cn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public AxiosResult<List<Category>> list(){
        List<Category> list = categoryService.list();
        return AxiosResult.success(list);
    }
    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable Long id){
        Category byId = categoryService.getById(id);
        return AxiosResult.success(byId);
    }
    @PostMapping
    public AxiosResult<Void> add(@RequestBody Category category){
        return toAxios(categoryService.save(category));
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Category category){
        return toAxios(categoryService.update(category));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id){
        return toAxios(categoryService.deleteById(id));
    }

}
