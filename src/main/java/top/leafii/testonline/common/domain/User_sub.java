package top.leafii.testonline.common.domain;

public class User_sub {
    private Integer uId;

    private Integer subId;

    private Integer status;

    public User_sub() {
    }

    public User_sub(Integer uId, Integer subId, Integer status) {
        this.uId = uId;
        this.subId = subId;
        this.status = status;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}