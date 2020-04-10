package top.leafii.testonline.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadFileExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIsNull() {
            addCriterion("originalFilename is null");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIsNotNull() {
            addCriterion("originalFilename is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameEqualTo(String value) {
            addCriterion("originalFilename =", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotEqualTo(String value) {
            addCriterion("originalFilename <>", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameGreaterThan(String value) {
            addCriterion("originalFilename >", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("originalFilename >=", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLessThan(String value) {
            addCriterion("originalFilename <", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLessThanOrEqualTo(String value) {
            addCriterion("originalFilename <=", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLike(String value) {
            addCriterion("originalFilename like", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotLike(String value) {
            addCriterion("originalFilename not like", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIn(List<String> values) {
            addCriterion("originalFilename in", values, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotIn(List<String> values) {
            addCriterion("originalFilename not in", values, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameBetween(String value1, String value2) {
            addCriterion("originalFilename between", value1, value2, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotBetween(String value1, String value2) {
            addCriterion("originalFilename not between", value1, value2, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andName4saveIsNull() {
            addCriterion("name4Save is null");
            return (Criteria) this;
        }

        public Criteria andName4saveIsNotNull() {
            addCriterion("name4Save is not null");
            return (Criteria) this;
        }

        public Criteria andName4saveEqualTo(String value) {
            addCriterion("name4Save =", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveNotEqualTo(String value) {
            addCriterion("name4Save <>", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveGreaterThan(String value) {
            addCriterion("name4Save >", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveGreaterThanOrEqualTo(String value) {
            addCriterion("name4Save >=", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveLessThan(String value) {
            addCriterion("name4Save <", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveLessThanOrEqualTo(String value) {
            addCriterion("name4Save <=", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveLike(String value) {
            addCriterion("name4Save like", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveNotLike(String value) {
            addCriterion("name4Save not like", value, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveIn(List<String> values) {
            addCriterion("name4Save in", values, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveNotIn(List<String> values) {
            addCriterion("name4Save not in", values, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveBetween(String value1, String value2) {
            addCriterion("name4Save between", value1, value2, "name4save");
            return (Criteria) this;
        }

        public Criteria andName4saveNotBetween(String value1, String value2) {
            addCriterion("name4Save not between", value1, value2, "name4save");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNull() {
            addCriterion("contentType is null");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNotNull() {
            addCriterion("contentType is not null");
            return (Criteria) this;
        }

        public Criteria andContenttypeEqualTo(String value) {
            addCriterion("contentType =", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotEqualTo(String value) {
            addCriterion("contentType <>", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThan(String value) {
            addCriterion("contentType >", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("contentType >=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThan(String value) {
            addCriterion("contentType <", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThanOrEqualTo(String value) {
            addCriterion("contentType <=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLike(String value) {
            addCriterion("contentType like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotLike(String value) {
            addCriterion("contentType not like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeIn(List<String> values) {
            addCriterion("contentType in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotIn(List<String> values) {
            addCriterion("contentType not in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeBetween(String value1, String value2) {
            addCriterion("contentType between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotBetween(String value1, String value2) {
            addCriterion("contentType not between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadtime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadtime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadtime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadtime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadtime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadtime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadtime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadtime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadtime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadtime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadtime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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