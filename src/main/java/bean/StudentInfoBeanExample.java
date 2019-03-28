package bean;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentInfoBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSClassidIsNull() {
            addCriterion("s_classid is null");
            return (Criteria) this;
        }

        public Criteria andSClassidIsNotNull() {
            addCriterion("s_classid is not null");
            return (Criteria) this;
        }

        public Criteria andSClassidEqualTo(Integer value) {
            addCriterion("s_classid =", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidNotEqualTo(Integer value) {
            addCriterion("s_classid <>", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidGreaterThan(Integer value) {
            addCriterion("s_classid >", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_classid >=", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidLessThan(Integer value) {
            addCriterion("s_classid <", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidLessThanOrEqualTo(Integer value) {
            addCriterion("s_classid <=", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidIn(List<Integer> values) {
            addCriterion("s_classid in", values, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidNotIn(List<Integer> values) {
            addCriterion("s_classid not in", values, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidBetween(Integer value1, Integer value2) {
            addCriterion("s_classid between", value1, value2, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_classid not between", value1, value2, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSRecordidIsNull() {
            addCriterion("s_recordid is null");
            return (Criteria) this;
        }

        public Criteria andSRecordidIsNotNull() {
            addCriterion("s_recordid is not null");
            return (Criteria) this;
        }

        public Criteria andSRecordidEqualTo(Integer value) {
            addCriterion("s_recordid =", value, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidNotEqualTo(Integer value) {
            addCriterion("s_recordid <>", value, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidGreaterThan(Integer value) {
            addCriterion("s_recordid >", value, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_recordid >=", value, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidLessThan(Integer value) {
            addCriterion("s_recordid <", value, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidLessThanOrEqualTo(Integer value) {
            addCriterion("s_recordid <=", value, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidIn(List<Integer> values) {
            addCriterion("s_recordid in", values, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidNotIn(List<Integer> values) {
            addCriterion("s_recordid not in", values, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidBetween(Integer value1, Integer value2) {
            addCriterion("s_recordid between", value1, value2, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSRecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_recordid not between", value1, value2, "sRecordid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidIsNull() {
            addCriterion("s_departmentid is null");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidIsNotNull() {
            addCriterion("s_departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidEqualTo(Integer value) {
            addCriterion("s_departmentid =", value, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidNotEqualTo(Integer value) {
            addCriterion("s_departmentid <>", value, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidGreaterThan(Integer value) {
            addCriterion("s_departmentid >", value, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_departmentid >=", value, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidLessThan(Integer value) {
            addCriterion("s_departmentid <", value, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("s_departmentid <=", value, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidIn(List<Integer> values) {
            addCriterion("s_departmentid in", values, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidNotIn(List<Integer> values) {
            addCriterion("s_departmentid not in", values, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("s_departmentid between", value1, value2, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_departmentid not between", value1, value2, "sDepartmentid");
            return (Criteria) this;
        }

        public Criteria andSMajoridIsNull() {
            addCriterion("s_majorid is null");
            return (Criteria) this;
        }

        public Criteria andSMajoridIsNotNull() {
            addCriterion("s_majorid is not null");
            return (Criteria) this;
        }

        public Criteria andSMajoridEqualTo(Integer value) {
            addCriterion("s_majorid =", value, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridNotEqualTo(Integer value) {
            addCriterion("s_majorid <>", value, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridGreaterThan(Integer value) {
            addCriterion("s_majorid >", value, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_majorid >=", value, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridLessThan(Integer value) {
            addCriterion("s_majorid <", value, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridLessThanOrEqualTo(Integer value) {
            addCriterion("s_majorid <=", value, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridIn(List<Integer> values) {
            addCriterion("s_majorid in", values, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridNotIn(List<Integer> values) {
            addCriterion("s_majorid not in", values, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridBetween(Integer value1, Integer value2) {
            addCriterion("s_majorid between", value1, value2, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSMajoridNotBetween(Integer value1, Integer value2) {
            addCriterion("s_majorid not between", value1, value2, "sMajorid");
            return (Criteria) this;
        }

        public Criteria andSGradeIsNull() {
            addCriterion("s_grade is null");
            return (Criteria) this;
        }

        public Criteria andSGradeIsNotNull() {
            addCriterion("s_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSGradeEqualTo(String value) {
            addCriterion("s_grade =", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotEqualTo(String value) {
            addCriterion("s_grade <>", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeGreaterThan(String value) {
            addCriterion("s_grade >", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeGreaterThanOrEqualTo(String value) {
            addCriterion("s_grade >=", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeLessThan(String value) {
            addCriterion("s_grade <", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeLessThanOrEqualTo(String value) {
            addCriterion("s_grade <=", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeLike(String value) {
            addCriterion("s_grade like", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotLike(String value) {
            addCriterion("s_grade not like", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeIn(List<String> values) {
            addCriterion("s_grade in", values, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotIn(List<String> values) {
            addCriterion("s_grade not in", values, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeBetween(String value1, String value2) {
            addCriterion("s_grade between", value1, value2, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotBetween(String value1, String value2) {
            addCriterion("s_grade not between", value1, value2, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSAccountIsNull() {
            addCriterion("s_account is null");
            return (Criteria) this;
        }

        public Criteria andSAccountIsNotNull() {
            addCriterion("s_account is not null");
            return (Criteria) this;
        }

        public Criteria andSAccountEqualTo(String value) {
            addCriterion("s_account =", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotEqualTo(String value) {
            addCriterion("s_account <>", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountGreaterThan(String value) {
            addCriterion("s_account >", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountGreaterThanOrEqualTo(String value) {
            addCriterion("s_account >=", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLessThan(String value) {
            addCriterion("s_account <", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLessThanOrEqualTo(String value) {
            addCriterion("s_account <=", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLike(String value) {
            addCriterion("s_account like", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotLike(String value) {
            addCriterion("s_account not like", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountIn(List<String> values) {
            addCriterion("s_account in", values, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotIn(List<String> values) {
            addCriterion("s_account not in", values, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountBetween(String value1, String value2) {
            addCriterion("s_account between", value1, value2, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotBetween(String value1, String value2) {
            addCriterion("s_account not between", value1, value2, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSIdnumIsNull() {
            addCriterion("s_idnum is null");
            return (Criteria) this;
        }

        public Criteria andSIdnumIsNotNull() {
            addCriterion("s_idnum is not null");
            return (Criteria) this;
        }

        public Criteria andSIdnumEqualTo(String value) {
            addCriterion("s_idnum =", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumNotEqualTo(String value) {
            addCriterion("s_idnum <>", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumGreaterThan(String value) {
            addCriterion("s_idnum >", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("s_idnum >=", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumLessThan(String value) {
            addCriterion("s_idnum <", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumLessThanOrEqualTo(String value) {
            addCriterion("s_idnum <=", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumLike(String value) {
            addCriterion("s_idnum like", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumNotLike(String value) {
            addCriterion("s_idnum not like", value, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumIn(List<String> values) {
            addCriterion("s_idnum in", values, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumNotIn(List<String> values) {
            addCriterion("s_idnum not in", values, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumBetween(String value1, String value2) {
            addCriterion("s_idnum between", value1, value2, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSIdnumNotBetween(String value1, String value2) {
            addCriterion("s_idnum not between", value1, value2, "sIdnum");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSNationIsNull() {
            addCriterion("s_nation is null");
            return (Criteria) this;
        }

        public Criteria andSNationIsNotNull() {
            addCriterion("s_nation is not null");
            return (Criteria) this;
        }

        public Criteria andSNationEqualTo(String value) {
            addCriterion("s_nation =", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationNotEqualTo(String value) {
            addCriterion("s_nation <>", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationGreaterThan(String value) {
            addCriterion("s_nation >", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationGreaterThanOrEqualTo(String value) {
            addCriterion("s_nation >=", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationLessThan(String value) {
            addCriterion("s_nation <", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationLessThanOrEqualTo(String value) {
            addCriterion("s_nation <=", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationLike(String value) {
            addCriterion("s_nation like", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationNotLike(String value) {
            addCriterion("s_nation not like", value, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationIn(List<String> values) {
            addCriterion("s_nation in", values, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationNotIn(List<String> values) {
            addCriterion("s_nation not in", values, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationBetween(String value1, String value2) {
            addCriterion("s_nation between", value1, value2, "sNation");
            return (Criteria) this;
        }

        public Criteria andSNationNotBetween(String value1, String value2) {
            addCriterion("s_nation not between", value1, value2, "sNation");
            return (Criteria) this;
        }

        public Criteria andSAddrIsNull() {
            addCriterion("s_addr is null");
            return (Criteria) this;
        }

        public Criteria andSAddrIsNotNull() {
            addCriterion("s_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSAddrEqualTo(String value) {
            addCriterion("s_addr =", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotEqualTo(String value) {
            addCriterion("s_addr <>", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrGreaterThan(String value) {
            addCriterion("s_addr >", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrGreaterThanOrEqualTo(String value) {
            addCriterion("s_addr >=", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLessThan(String value) {
            addCriterion("s_addr <", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLessThanOrEqualTo(String value) {
            addCriterion("s_addr <=", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLike(String value) {
            addCriterion("s_addr like", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotLike(String value) {
            addCriterion("s_addr not like", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrIn(List<String> values) {
            addCriterion("s_addr in", values, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotIn(List<String> values) {
            addCriterion("s_addr not in", values, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrBetween(String value1, String value2) {
            addCriterion("s_addr between", value1, value2, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotBetween(String value1, String value2) {
            addCriterion("s_addr not between", value1, value2, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNull() {
            addCriterion("s_phone is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("s_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("s_phone =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("s_phone <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("s_phone >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_phone >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("s_phone <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_phone <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("s_phone like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("s_phone not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("s_phone in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("s_phone not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("s_phone between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("s_phone not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSOriginIsNull() {
            addCriterion("s_origin is null");
            return (Criteria) this;
        }

        public Criteria andSOriginIsNotNull() {
            addCriterion("s_origin is not null");
            return (Criteria) this;
        }

        public Criteria andSOriginEqualTo(String value) {
            addCriterion("s_origin =", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginNotEqualTo(String value) {
            addCriterion("s_origin <>", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginGreaterThan(String value) {
            addCriterion("s_origin >", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginGreaterThanOrEqualTo(String value) {
            addCriterion("s_origin >=", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginLessThan(String value) {
            addCriterion("s_origin <", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginLessThanOrEqualTo(String value) {
            addCriterion("s_origin <=", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginLike(String value) {
            addCriterion("s_origin like", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginNotLike(String value) {
            addCriterion("s_origin not like", value, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginIn(List<String> values) {
            addCriterion("s_origin in", values, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginNotIn(List<String> values) {
            addCriterion("s_origin not in", values, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginBetween(String value1, String value2) {
            addCriterion("s_origin between", value1, value2, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSOriginNotBetween(String value1, String value2) {
            addCriterion("s_origin not between", value1, value2, "sOrigin");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateIsNull() {
            addCriterion("s_graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateIsNotNull() {
            addCriterion("s_graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateEqualTo(String value) {
            addCriterion("s_graduate_date =", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateNotEqualTo(String value) {
            addCriterion("s_graduate_date <>", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateGreaterThan(String value) {
            addCriterion("s_graduate_date >", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateGreaterThanOrEqualTo(String value) {
            addCriterion("s_graduate_date >=", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateLessThan(String value) {
            addCriterion("s_graduate_date <", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateLessThanOrEqualTo(String value) {
            addCriterion("s_graduate_date <=", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateLike(String value) {
            addCriterion("s_graduate_date like", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateNotLike(String value) {
            addCriterion("s_graduate_date not like", value, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateIn(List<String> values) {
            addCriterion("s_graduate_date in", values, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateNotIn(List<String> values) {
            addCriterion("s_graduate_date not in", values, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateBetween(String value1, String value2) {
            addCriterion("s_graduate_date between", value1, value2, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSGraduateDateNotBetween(String value1, String value2) {
            addCriterion("s_graduate_date not between", value1, value2, "sGraduateDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateIsNull() {
            addCriterion("s_enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateIsNotNull() {
            addCriterion("s_enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateEqualTo(String value) {
            addCriterion("s_enroll_date =", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateNotEqualTo(String value) {
            addCriterion("s_enroll_date <>", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateGreaterThan(String value) {
            addCriterion("s_enroll_date >", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateGreaterThanOrEqualTo(String value) {
            addCriterion("s_enroll_date >=", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateLessThan(String value) {
            addCriterion("s_enroll_date <", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateLessThanOrEqualTo(String value) {
            addCriterion("s_enroll_date <=", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateLike(String value) {
            addCriterion("s_enroll_date like", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateNotLike(String value) {
            addCriterion("s_enroll_date not like", value, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateIn(List<String> values) {
            addCriterion("s_enroll_date in", values, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateNotIn(List<String> values) {
            addCriterion("s_enroll_date not in", values, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateBetween(String value1, String value2) {
            addCriterion("s_enroll_date between", value1, value2, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSEnrollDateNotBetween(String value1, String value2) {
            addCriterion("s_enroll_date not between", value1, value2, "sEnrollDate");
            return (Criteria) this;
        }

        public Criteria andSDegreeIsNull() {
            addCriterion("s_degree is null");
            return (Criteria) this;
        }

        public Criteria andSDegreeIsNotNull() {
            addCriterion("s_degree is not null");
            return (Criteria) this;
        }

        public Criteria andSDegreeEqualTo(String value) {
            addCriterion("s_degree =", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotEqualTo(String value) {
            addCriterion("s_degree <>", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeGreaterThan(String value) {
            addCriterion("s_degree >", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("s_degree >=", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeLessThan(String value) {
            addCriterion("s_degree <", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeLessThanOrEqualTo(String value) {
            addCriterion("s_degree <=", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeLike(String value) {
            addCriterion("s_degree like", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotLike(String value) {
            addCriterion("s_degree not like", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeIn(List<String> values) {
            addCriterion("s_degree in", values, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotIn(List<String> values) {
            addCriterion("s_degree not in", values, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeBetween(String value1, String value2) {
            addCriterion("s_degree between", value1, value2, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotBetween(String value1, String value2) {
            addCriterion("s_degree not between", value1, value2, "sDegree");
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