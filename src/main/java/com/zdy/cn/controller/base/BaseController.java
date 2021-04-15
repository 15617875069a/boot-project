package com.zdy.cn.controller.base;

import com.zdy.cn.common.http.AxiosResult;

public class BaseController {
    protected AxiosResult<Void> toAxios(int row){
        return row>0?AxiosResult.success():AxiosResult.error();
    }
}
