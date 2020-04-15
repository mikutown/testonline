package top.leafii.testonline.common.domain;

public class Question {
    private Integer quesId;

    private Integer typeId;

    private String title;

    private String quespic;

    private Double score;

    private String ansa;

    private String ansb;

    private String ansc;

    private String ansd;

    private String anse;

    private String answer;

    private Integer choanswer;

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getQuespic() {
        return quespic;
    }

    public void setQuespic(String quespic) {
        this.quespic = quespic == null ? null : quespic.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAnsa() {
        return ansa;
    }

    public void setAnsa(String ansa) {
        this.ansa = ansa == null ? null : ansa.trim();
    }

    public String getAnsb() {
        return ansb;
    }

    public void setAnsb(String ansb) {
        this.ansb = ansb == null ? null : ansb.trim();
    }

    public String getAnsc() {
        return ansc;
    }

    public void setAnsc(String ansc) {
        this.ansc = ansc == null ? null : ansc.trim();
    }

    public String getAnsd() {
        return ansd;
    }

    public void setAnsd(String ansd) {
        this.ansd = ansd == null ? null : ansd.trim();
    }

    public String getAnse() {
        return anse;
    }

    public void setAnse(String anse) {
        this.anse = anse == null ? null : anse.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getChoanswer() {
        return choanswer;
    }

    public void setChoanswer(Integer choanswer) {
        this.choanswer = choanswer;
    }

    public Question(Integer quesId, Integer choanswer) {
        this.quesId = quesId;
        this.choanswer = choanswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "quesId=" + quesId +
                ", typeId=" + typeId +
                ", title='" + title + '\'' +
                ", quespic='" + quespic + '\'' +
                ", score=" + score +
                ", ansa='" + ansa + '\'' +
                ", ansb='" + ansb + '\'' +
                ", ansc='" + ansc + '\'' +
                ", ansd='" + ansd + '\'' +
                ", anse='" + anse + '\'' +
                ", answer='" + answer + '\'' +
                ", choanswer=" + choanswer +
                '}';
    }
}