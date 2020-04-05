package top.leafii.testonline.common.domain;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andQuesIdIsNull() {
            addCriterion("ques_id is null");
            return (Criteria) this;
        }

        public Criteria andQuesIdIsNotNull() {
            addCriterion("ques_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuesIdEqualTo(Integer value) {
            addCriterion("ques_id =", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotEqualTo(Integer value) {
            addCriterion("ques_id <>", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThan(Integer value) {
            addCriterion("ques_id >", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ques_id >=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThan(Integer value) {
            addCriterion("ques_id <", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ques_id <=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdIn(List<Integer> values) {
            addCriterion("ques_id in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotIn(List<Integer> values) {
            addCriterion("ques_id not in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdBetween(Integer value1, Integer value2) {
            addCriterion("ques_id between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ques_id not between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andQuespicIsNull() {
            addCriterion("quespic is null");
            return (Criteria) this;
        }

        public Criteria andQuespicIsNotNull() {
            addCriterion("quespic is not null");
            return (Criteria) this;
        }

        public Criteria andQuespicEqualTo(String value) {
            addCriterion("quespic =", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicNotEqualTo(String value) {
            addCriterion("quespic <>", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicGreaterThan(String value) {
            addCriterion("quespic >", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicGreaterThanOrEqualTo(String value) {
            addCriterion("quespic >=", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicLessThan(String value) {
            addCriterion("quespic <", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicLessThanOrEqualTo(String value) {
            addCriterion("quespic <=", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicLike(String value) {
            addCriterion("quespic like", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicNotLike(String value) {
            addCriterion("quespic not like", value, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicIn(List<String> values) {
            addCriterion("quespic in", values, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicNotIn(List<String> values) {
            addCriterion("quespic not in", values, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicBetween(String value1, String value2) {
            addCriterion("quespic between", value1, value2, "quespic");
            return (Criteria) this;
        }

        public Criteria andQuespicNotBetween(String value1, String value2) {
            addCriterion("quespic not between", value1, value2, "quespic");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAnsaIsNull() {
            addCriterion("ansA is null");
            return (Criteria) this;
        }

        public Criteria andAnsaIsNotNull() {
            addCriterion("ansA is not null");
            return (Criteria) this;
        }

        public Criteria andAnsaEqualTo(String value) {
            addCriterion("ansA =", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotEqualTo(String value) {
            addCriterion("ansA <>", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaGreaterThan(String value) {
            addCriterion("ansA >", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaGreaterThanOrEqualTo(String value) {
            addCriterion("ansA >=", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaLessThan(String value) {
            addCriterion("ansA <", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaLessThanOrEqualTo(String value) {
            addCriterion("ansA <=", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaLike(String value) {
            addCriterion("ansA like", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotLike(String value) {
            addCriterion("ansA not like", value, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaIn(List<String> values) {
            addCriterion("ansA in", values, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotIn(List<String> values) {
            addCriterion("ansA not in", values, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaBetween(String value1, String value2) {
            addCriterion("ansA between", value1, value2, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsaNotBetween(String value1, String value2) {
            addCriterion("ansA not between", value1, value2, "ansa");
            return (Criteria) this;
        }

        public Criteria andAnsbIsNull() {
            addCriterion("ansB is null");
            return (Criteria) this;
        }

        public Criteria andAnsbIsNotNull() {
            addCriterion("ansB is not null");
            return (Criteria) this;
        }

        public Criteria andAnsbEqualTo(String value) {
            addCriterion("ansB =", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotEqualTo(String value) {
            addCriterion("ansB <>", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbGreaterThan(String value) {
            addCriterion("ansB >", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbGreaterThanOrEqualTo(String value) {
            addCriterion("ansB >=", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbLessThan(String value) {
            addCriterion("ansB <", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbLessThanOrEqualTo(String value) {
            addCriterion("ansB <=", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbLike(String value) {
            addCriterion("ansB like", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotLike(String value) {
            addCriterion("ansB not like", value, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbIn(List<String> values) {
            addCriterion("ansB in", values, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotIn(List<String> values) {
            addCriterion("ansB not in", values, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbBetween(String value1, String value2) {
            addCriterion("ansB between", value1, value2, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnsbNotBetween(String value1, String value2) {
            addCriterion("ansB not between", value1, value2, "ansb");
            return (Criteria) this;
        }

        public Criteria andAnscIsNull() {
            addCriterion("ansC is null");
            return (Criteria) this;
        }

        public Criteria andAnscIsNotNull() {
            addCriterion("ansC is not null");
            return (Criteria) this;
        }

        public Criteria andAnscEqualTo(String value) {
            addCriterion("ansC =", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotEqualTo(String value) {
            addCriterion("ansC <>", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscGreaterThan(String value) {
            addCriterion("ansC >", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscGreaterThanOrEqualTo(String value) {
            addCriterion("ansC >=", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscLessThan(String value) {
            addCriterion("ansC <", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscLessThanOrEqualTo(String value) {
            addCriterion("ansC <=", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscLike(String value) {
            addCriterion("ansC like", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotLike(String value) {
            addCriterion("ansC not like", value, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscIn(List<String> values) {
            addCriterion("ansC in", values, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotIn(List<String> values) {
            addCriterion("ansC not in", values, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscBetween(String value1, String value2) {
            addCriterion("ansC between", value1, value2, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnscNotBetween(String value1, String value2) {
            addCriterion("ansC not between", value1, value2, "ansc");
            return (Criteria) this;
        }

        public Criteria andAnsdIsNull() {
            addCriterion("ansD is null");
            return (Criteria) this;
        }

        public Criteria andAnsdIsNotNull() {
            addCriterion("ansD is not null");
            return (Criteria) this;
        }

        public Criteria andAnsdEqualTo(String value) {
            addCriterion("ansD =", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotEqualTo(String value) {
            addCriterion("ansD <>", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdGreaterThan(String value) {
            addCriterion("ansD >", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdGreaterThanOrEqualTo(String value) {
            addCriterion("ansD >=", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdLessThan(String value) {
            addCriterion("ansD <", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdLessThanOrEqualTo(String value) {
            addCriterion("ansD <=", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdLike(String value) {
            addCriterion("ansD like", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotLike(String value) {
            addCriterion("ansD not like", value, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdIn(List<String> values) {
            addCriterion("ansD in", values, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotIn(List<String> values) {
            addCriterion("ansD not in", values, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdBetween(String value1, String value2) {
            addCriterion("ansD between", value1, value2, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnsdNotBetween(String value1, String value2) {
            addCriterion("ansD not between", value1, value2, "ansd");
            return (Criteria) this;
        }

        public Criteria andAnseIsNull() {
            addCriterion("ansE is null");
            return (Criteria) this;
        }

        public Criteria andAnseIsNotNull() {
            addCriterion("ansE is not null");
            return (Criteria) this;
        }

        public Criteria andAnseEqualTo(String value) {
            addCriterion("ansE =", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotEqualTo(String value) {
            addCriterion("ansE <>", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseGreaterThan(String value) {
            addCriterion("ansE >", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseGreaterThanOrEqualTo(String value) {
            addCriterion("ansE >=", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseLessThan(String value) {
            addCriterion("ansE <", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseLessThanOrEqualTo(String value) {
            addCriterion("ansE <=", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseLike(String value) {
            addCriterion("ansE like", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotLike(String value) {
            addCriterion("ansE not like", value, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseIn(List<String> values) {
            addCriterion("ansE in", values, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotIn(List<String> values) {
            addCriterion("ansE not in", values, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseBetween(String value1, String value2) {
            addCriterion("ansE between", value1, value2, "anse");
            return (Criteria) this;
        }

        public Criteria andAnseNotBetween(String value1, String value2) {
            addCriterion("ansE not between", value1, value2, "anse");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andChoanswerIsNull() {
            addCriterion("choanswer is null");
            return (Criteria) this;
        }

        public Criteria andChoanswerIsNotNull() {
            addCriterion("choanswer is not null");
            return (Criteria) this;
        }

        public Criteria andChoanswerEqualTo(Integer value) {
            addCriterion("choanswer =", value, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerNotEqualTo(Integer value) {
            addCriterion("choanswer <>", value, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerGreaterThan(Integer value) {
            addCriterion("choanswer >", value, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("choanswer >=", value, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerLessThan(Integer value) {
            addCriterion("choanswer <", value, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerLessThanOrEqualTo(Integer value) {
            addCriterion("choanswer <=", value, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerIn(List<Integer> values) {
            addCriterion("choanswer in", values, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerNotIn(List<Integer> values) {
            addCriterion("choanswer not in", values, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerBetween(Integer value1, Integer value2) {
            addCriterion("choanswer between", value1, value2, "choanswer");
            return (Criteria) this;
        }

        public Criteria andChoanswerNotBetween(Integer value1, Integer value2) {
            addCriterion("choanswer not between", value1, value2, "choanswer");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}