package com.example.demo.controller;

import com.example.demo.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "projcom")
public class examController {

    @RequestMapping(value = { "hello"})
    public Result getDictLabel(){

        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功进入例子程序!!");

        return result;
    }

}
