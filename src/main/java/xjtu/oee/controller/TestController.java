package xjtu.oee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @基本功能:
 * @program:OEE
 * @author:peicc
 * @create:2019-12-24 16:34:47
 **/
@RestController
public class TestController {
    @RequestMapping("/test")
    public String testAPI(){
        return "测试";
    }
}
