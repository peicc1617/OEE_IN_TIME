package xjtu.oee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xjtu.oee.model.Stop;
import xjtu.oee.service.StopService;

/**
 * @基本功能:
 * @program:OEE
 * @author:peicc
 * @create:2019-12-25 19:06:41
 **/
@RestController
public class StopController {
    @Autowired
    private StopService stopService;
    @RequestMapping("/testBegin")
    public Stop testBegin(){

        return stopService.setBegin();
    }
    @RequestMapping("/testEnd")
    public Stop testEnd(){
        return stopService.setEnd();
    }
}
