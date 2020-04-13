package top.leafii.testonline.common.domain;

public class Exam {
    private Integer examId;

    private Integer subId;

    public Exam() {
    }

    public Exam(Integer subId) {
        this.subId = subId;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", subId=" + subId +
                '}';
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }
}