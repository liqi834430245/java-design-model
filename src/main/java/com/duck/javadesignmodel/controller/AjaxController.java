package com.duck.javadesignmodel.controller;

import com.duck.javadesignmodel.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack-liqi
 *
 * 定义一个控制层的类
 */
@RestController
public class AjaxController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Object HelloCon() {
        System.out.println("** start spring boot web ***");
        System.out.println("hello word");
        return ResultUtils.success();
    }
}
