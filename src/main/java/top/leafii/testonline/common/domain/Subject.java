package top.leafii.testonline.common.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Subject {
    public Subject() {
    }

    public Subject(Integer subId, String subname) {
        this.subId = subId;
        this.subname = subname;
    }

    public Subject(Integer subId, String subname, Date subtime) {
        this.subId = subId;
        this.subname = subname;
        this.subtime = subtime;
    }

    public Subject(String subname, Date subtime) {
        this.subname = subname;
        this.subtime = subtime;
    }

    private Integer subId;

    private String subname;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date subtime;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname == null ? null : subname.trim();
    }

    public Date getSubtime() {
        return subtime;
    }

    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }
}