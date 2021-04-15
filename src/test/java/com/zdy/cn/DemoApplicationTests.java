package com.zdy.cn;

import com.zdy.cn.mapper.BrandMapper;
import com.zdy.cn.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void run(){
        System.out.println(brandService.list());
        System.out.println("");
    }
}
