package xjtu.oee.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @基本功能:
 * @program:OEE
 * @author:peicc
 * @create:2019-12-25 19:00:03
 **/
@Entity
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date startTime;
    private Date endTime;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Stop() {
    }

    public Stop(Date startTime, Date endTime, String type) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }
}
