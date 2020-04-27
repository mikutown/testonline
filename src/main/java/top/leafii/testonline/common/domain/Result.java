package top.leafii.testonline.common.domain;

import java.util.Date;

public class Result {
    private Integer resId;

    private Integer examId;

    private Double score;

    private Date restime;

    private Integer uId;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getRestime() {
        return restime;
    }

    public void setRestime(Date restime) {
        this.restime = restime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resId=" + resId +
                ", examId=" + examId +
                ", score=" + score +
                ", restime=" + restime +
                ", uId=" + uId +
                '}';
    }
}