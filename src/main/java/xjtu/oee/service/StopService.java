package xjtu.oee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xjtu.oee.model.Stop;
import xjtu.oee.reposity.StopRepository;

import java.util.Date;

/**
 * @基本功能:
 * @program:OEE
 * @author:peicc
 * @create:2019-12-25 19:05:54
 **/
@Service
public class StopService {
    @Autowired
    private StopRepository stopRepository;
    Stop stop=new Stop();
    public Stop setBegin(){
        Date date=new Date();
        stop.setStartTime(date);
        stop.setType("故障停机");
        return stop;
    }
    public Stop setEnd(){
        Date date=new Date();
        stop.setEndTime(date);
        stopRepository.save(new Stop(stop.getStartTime(),stop.getEndTime(),stop.getType()));
        return stop;
    }
}
