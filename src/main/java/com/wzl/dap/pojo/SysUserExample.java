package com.wzl.dap.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDepeIdIsNull() {
            addCriterion("DEPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepeIdIsNotNull() {
            addCriterion("DEPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepeIdEqualTo(String value) {
            addCriterion("DEPE_ID =", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdNotEqualTo(String value) {
            addCriterion("DEPE_ID <>", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdGreaterThan(String value) {
            addCriterion("DEPE_ID >", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPE_ID >=", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdLessThan(String value) {
            addCriterion("DEPE_ID <", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdLessThanOrEqualTo(String value) {
            addCriterion("DEPE_ID <=", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdLike(String value) {
            addCriterion("DEPE_ID like", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdNotLike(String value) {
            addCriterion("DEPE_ID not like", value, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdIn(List<String> values) {
            addCriterion("DEPE_ID in", values, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdNotIn(List<String> values) {
            addCriterion("DEPE_ID not in", values, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdBetween(String value1, String value2) {
            addCriterion("DEPE_ID between", value1, value2, "depeId");
            return (Criteria) this;
        }

        public Criteria andDepeIdNotBetween(String value1, String value2) {
            addCriterion("DEPE_ID not between", value1, value2, "depeId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameIsNull() {
            addCriterion("EN_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnUserNameIsNotNull() {
            addCriterion("EN_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnUserNameEqualTo(String value) {
            addCriterion("EN_USER_NAME =", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameNotEqualTo(String value) {
            addCriterion("EN_USER_NAME <>", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameGreaterThan(String value) {
            addCriterion("EN_USER_NAME >", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("EN_USER_NAME >=", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameLessThan(String value) {
            addCriterion("EN_USER_NAME <", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameLessThanOrEqualTo(String value) {
            addCriterion("EN_USER_NAME <=", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameLike(String value) {
            addCriterion("EN_USER_NAME like", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameNotLike(String value) {
            addCriterion("EN_USER_NAME not like", value, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameIn(List<String> values) {
            addCriterion("EN_USER_NAME in", values, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameNotIn(List<String> values) {
            addCriterion("EN_USER_NAME not in", values, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameBetween(String value1, String value2) {
            addCriterion("EN_USER_NAME between", value1, value2, "enUserName");
            return (Criteria) this;
        }

        public Criteria andEnUserNameNotBetween(String value1, String value2) {
            addCriterion("EN_USER_NAME not between", value1, value2, "enUserName");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("PASS_WORD is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("PASS_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("PASS_WORD =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("PASS_WORD <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("PASS_WORD >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_WORD >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("PASS_WORD <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("PASS_WORD <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("PASS_WORD like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("PASS_WORD not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("PASS_WORD in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("PASS_WORD not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("PASS_WORD between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("PASS_WORD not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNull() {
            addCriterion("IS_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNotNull() {
            addCriterion("IS_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderEqualTo(String value) {
            addCriterion("IS_LEADER =", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotEqualTo(String value) {
            addCriterion("IS_LEADER <>", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThan(String value) {
            addCriterion("IS_LEADER >", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LEADER >=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThan(String value) {
            addCriterion("IS_LEADER <", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThanOrEqualTo(String value) {
            addCriterion("IS_LEADER <=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLike(String value) {
            addCriterion("IS_LEADER like", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotLike(String value) {
            addCriterion("IS_LEADER not like", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIn(List<String> values) {
            addCriterion("IS_LEADER in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotIn(List<String> values) {
            addCriterion("IS_LEADER not in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderBetween(String value1, String value2) {
            addCriterion("IS_LEADER between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotBetween(String value1, String value2) {
            addCriterion("IS_LEADER not between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(String value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(String value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(String value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(String value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLike(String value) {
            addCriterion("IS_ONLINE like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotLike(String value) {
            addCriterion("IS_ONLINE not like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<String> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<String> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(String value1, String value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(String value1, String value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("IP_ADDRESS like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginIsNull() {
            addCriterion("IS_KEY_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginIsNotNull() {
            addCriterion("IS_KEY_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginEqualTo(String value) {
            addCriterion("IS_KEY_LOGIN =", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginNotEqualTo(String value) {
            addCriterion("IS_KEY_LOGIN <>", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginGreaterThan(String value) {
            addCriterion("IS_KEY_LOGIN >", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginGreaterThanOrEqualTo(String value) {
            addCriterion("IS_KEY_LOGIN >=", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginLessThan(String value) {
            addCriterion("IS_KEY_LOGIN <", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginLessThanOrEqualTo(String value) {
            addCriterion("IS_KEY_LOGIN <=", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginLike(String value) {
            addCriterion("IS_KEY_LOGIN like", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginNotLike(String value) {
            addCriterion("IS_KEY_LOGIN not like", value, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginIn(List<String> values) {
            addCriterion("IS_KEY_LOGIN in", values, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginNotIn(List<String> values) {
            addCriterion("IS_KEY_LOGIN not in", values, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginBetween(String value1, String value2) {
            addCriterion("IS_KEY_LOGIN between", value1, value2, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andIsKeyLoginNotBetween(String value1, String value2) {
            addCriterion("IS_KEY_LOGIN not between", value1, value2, "isKeyLogin");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNull() {
            addCriterion("ENTRANCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNotNull() {
            addCriterion("ENTRANCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeEqualTo(String value) {
            addCriterion("ENTRANCE_TIME =", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotEqualTo(String value) {
            addCriterion("ENTRANCE_TIME <>", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThan(String value) {
            addCriterion("ENTRANCE_TIME >", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_TIME >=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThan(String value) {
            addCriterion("ENTRANCE_TIME <", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_TIME <=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLike(String value) {
            addCriterion("ENTRANCE_TIME like", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotLike(String value) {
            addCriterion("ENTRANCE_TIME not like", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIn(List<String> values) {
            addCriterion("ENTRANCE_TIME in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotIn(List<String> values) {
            addCriterion("ENTRANCE_TIME not in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeBetween(String value1, String value2) {
            addCriterion("ENTRANCE_TIME between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_TIME not between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("MSN is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("MSN is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("MSN =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("MSN <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("MSN >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("MSN >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("MSN <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("MSN <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("MSN like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("MSN not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("MSN in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("MSN not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("MSN between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("MSN not between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddressHomeIsNull() {
            addCriterion("ADDRESS_HOME is null");
            return (Criteria) this;
        }

        public Criteria andAddressHomeIsNotNull() {
            addCriterion("ADDRESS_HOME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressHomeEqualTo(String value) {
            addCriterion("ADDRESS_HOME =", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeNotEqualTo(String value) {
            addCriterion("ADDRESS_HOME <>", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeGreaterThan(String value) {
            addCriterion("ADDRESS_HOME >", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_HOME >=", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeLessThan(String value) {
            addCriterion("ADDRESS_HOME <", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_HOME <=", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeLike(String value) {
            addCriterion("ADDRESS_HOME like", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeNotLike(String value) {
            addCriterion("ADDRESS_HOME not like", value, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeIn(List<String> values) {
            addCriterion("ADDRESS_HOME in", values, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeNotIn(List<String> values) {
            addCriterion("ADDRESS_HOME not in", values, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeBetween(String value1, String value2) {
            addCriterion("ADDRESS_HOME between", value1, value2, "addressHome");
            return (Criteria) this;
        }

        public Criteria andAddressHomeNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_HOME not between", value1, value2, "addressHome");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("REGISTER_TIME like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("REGISTER_TIME not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeIsNull() {
            addCriterion("DIMISSION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeIsNotNull() {
            addCriterion("DIMISSION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeEqualTo(String value) {
            addCriterion("DIMISSION_TIME =", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeNotEqualTo(String value) {
            addCriterion("DIMISSION_TIME <>", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeGreaterThan(String value) {
            addCriterion("DIMISSION_TIME >", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DIMISSION_TIME >=", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeLessThan(String value) {
            addCriterion("DIMISSION_TIME <", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeLessThanOrEqualTo(String value) {
            addCriterion("DIMISSION_TIME <=", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeLike(String value) {
            addCriterion("DIMISSION_TIME like", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeNotLike(String value) {
            addCriterion("DIMISSION_TIME not like", value, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeIn(List<String> values) {
            addCriterion("DIMISSION_TIME in", values, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeNotIn(List<String> values) {
            addCriterion("DIMISSION_TIME not in", values, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeBetween(String value1, String value2) {
            addCriterion("DIMISSION_TIME between", value1, value2, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andDimissionTimeNotBetween(String value1, String value2) {
            addCriterion("DIMISSION_TIME not between", value1, value2, "dimissionTime");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("MPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("MPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(String value) {
            addCriterion("MPHONE =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(String value) {
            addCriterion("MPHONE <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(String value) {
            addCriterion("MPHONE >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(String value) {
            addCriterion("MPHONE >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(String value) {
            addCriterion("MPHONE <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(String value) {
            addCriterion("MPHONE <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLike(String value) {
            addCriterion("MPHONE like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotLike(String value) {
            addCriterion("MPHONE not like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<String> values) {
            addCriterion("MPHONE in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<String> values) {
            addCriterion("MPHONE not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(String value1, String value2) {
            addCriterion("MPHONE between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(String value1, String value2) {
            addCriterion("MPHONE not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andAddressBirthIsNull() {
            addCriterion("ADDRESS_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andAddressBirthIsNotNull() {
            addCriterion("ADDRESS_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andAddressBirthEqualTo(String value) {
            addCriterion("ADDRESS_BIRTH =", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthNotEqualTo(String value) {
            addCriterion("ADDRESS_BIRTH <>", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthGreaterThan(String value) {
            addCriterion("ADDRESS_BIRTH >", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_BIRTH >=", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthLessThan(String value) {
            addCriterion("ADDRESS_BIRTH <", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_BIRTH <=", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthLike(String value) {
            addCriterion("ADDRESS_BIRTH like", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthNotLike(String value) {
            addCriterion("ADDRESS_BIRTH not like", value, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthIn(List<String> values) {
            addCriterion("ADDRESS_BIRTH in", values, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthNotIn(List<String> values) {
            addCriterion("ADDRESS_BIRTH not in", values, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthBetween(String value1, String value2) {
            addCriterion("ADDRESS_BIRTH between", value1, value2, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andAddressBirthNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_BIRTH not between", value1, value2, "addressBirth");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("WORK_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("WORK_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("WORK_PLACE =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("WORK_PLACE <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("WORK_PLACE >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PLACE >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("WORK_PLACE <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("WORK_PLACE <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("WORK_PLACE like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("WORK_PLACE not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("WORK_PLACE in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("WORK_PLACE not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("WORK_PLACE between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("WORK_PLACE not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andMailboxIsNull() {
            addCriterion("MAILBOX is null");
            return (Criteria) this;
        }

        public Criteria andMailboxIsNotNull() {
            addCriterion("MAILBOX is not null");
            return (Criteria) this;
        }

        public Criteria andMailboxEqualTo(String value) {
            addCriterion("MAILBOX =", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotEqualTo(String value) {
            addCriterion("MAILBOX <>", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxGreaterThan(String value) {
            addCriterion("MAILBOX >", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("MAILBOX >=", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLessThan(String value) {
            addCriterion("MAILBOX <", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLessThanOrEqualTo(String value) {
            addCriterion("MAILBOX <=", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLike(String value) {
            addCriterion("MAILBOX like", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotLike(String value) {
            addCriterion("MAILBOX not like", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxIn(List<String> values) {
            addCriterion("MAILBOX in", values, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotIn(List<String> values) {
            addCriterion("MAILBOX not in", values, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxBetween(String value1, String value2) {
            addCriterion("MAILBOX between", value1, value2, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotBetween(String value1, String value2) {
            addCriterion("MAILBOX not between", value1, value2, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordIsNull() {
            addCriterion("MAIL_BOX_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordIsNotNull() {
            addCriterion("MAIL_BOX_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordEqualTo(String value) {
            addCriterion("MAIL_BOX_PASSWORD =", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordNotEqualTo(String value) {
            addCriterion("MAIL_BOX_PASSWORD <>", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordGreaterThan(String value) {
            addCriterion("MAIL_BOX_PASSWORD >", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_BOX_PASSWORD >=", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordLessThan(String value) {
            addCriterion("MAIL_BOX_PASSWORD <", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordLessThanOrEqualTo(String value) {
            addCriterion("MAIL_BOX_PASSWORD <=", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordLike(String value) {
            addCriterion("MAIL_BOX_PASSWORD like", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordNotLike(String value) {
            addCriterion("MAIL_BOX_PASSWORD not like", value, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordIn(List<String> values) {
            addCriterion("MAIL_BOX_PASSWORD in", values, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordNotIn(List<String> values) {
            addCriterion("MAIL_BOX_PASSWORD not in", values, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordBetween(String value1, String value2) {
            addCriterion("MAIL_BOX_PASSWORD between", value1, value2, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andMailBoxPasswordNotBetween(String value1, String value2) {
            addCriterion("MAIL_BOX_PASSWORD not between", value1, value2, "mailBoxPassword");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("IS_DELETE like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("IS_DELETE not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskIsNull() {
            addCriterion("MYSELF_DESK is null");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskIsNotNull() {
            addCriterion("MYSELF_DESK is not null");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskEqualTo(String value) {
            addCriterion("MYSELF_DESK =", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskNotEqualTo(String value) {
            addCriterion("MYSELF_DESK <>", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskGreaterThan(String value) {
            addCriterion("MYSELF_DESK >", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskGreaterThanOrEqualTo(String value) {
            addCriterion("MYSELF_DESK >=", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskLessThan(String value) {
            addCriterion("MYSELF_DESK <", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskLessThanOrEqualTo(String value) {
            addCriterion("MYSELF_DESK <=", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskLike(String value) {
            addCriterion("MYSELF_DESK like", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskNotLike(String value) {
            addCriterion("MYSELF_DESK not like", value, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskIn(List<String> values) {
            addCriterion("MYSELF_DESK in", values, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskNotIn(List<String> values) {
            addCriterion("MYSELF_DESK not in", values, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskBetween(String value1, String value2) {
            addCriterion("MYSELF_DESK between", value1, value2, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andMyselfDeskNotBetween(String value1, String value2) {
            addCriterion("MYSELF_DESK not between", value1, value2, "myselfDesk");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeIsNull() {
            addCriterion("USER_ROLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeIsNotNull() {
            addCriterion("USER_ROLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE =", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE <>", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeGreaterThan(String value) {
            addCriterion("USER_ROLE_TYPE >", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE >=", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeLessThan(String value) {
            addCriterion("USER_ROLE_TYPE <", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE <=", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeLike(String value) {
            addCriterion("USER_ROLE_TYPE like", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotLike(String value) {
            addCriterion("USER_ROLE_TYPE not like", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeIn(List<String> values) {
            addCriterion("USER_ROLE_TYPE in", values, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotIn(List<String> values) {
            addCriterion("USER_ROLE_TYPE not in", values, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeBetween(String value1, String value2) {
            addCriterion("USER_ROLE_TYPE between", value1, value2, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE_TYPE not between", value1, value2, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("CPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("CPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("CPHONE =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("CPHONE <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("CPHONE >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CPHONE >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("CPHONE <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("CPHONE <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("CPHONE like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("CPHONE not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("CPHONE in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("CPHONE not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("CPHONE between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("CPHONE not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNull() {
            addCriterion("OPHONE is null");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNotNull() {
            addCriterion("OPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOphoneEqualTo(String value) {
            addCriterion("OPHONE =", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotEqualTo(String value) {
            addCriterion("OPHONE <>", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThan(String value) {
            addCriterion("OPHONE >", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OPHONE >=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThan(String value) {
            addCriterion("OPHONE <", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThanOrEqualTo(String value) {
            addCriterion("OPHONE <=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLike(String value) {
            addCriterion("OPHONE like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotLike(String value) {
            addCriterion("OPHONE not like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneIn(List<String> values) {
            addCriterion("OPHONE in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotIn(List<String> values) {
            addCriterion("OPHONE not in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneBetween(String value1, String value2) {
            addCriterion("OPHONE between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotBetween(String value1, String value2) {
            addCriterion("OPHONE not between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andHphoneIsNull() {
            addCriterion("HPHONE is null");
            return (Criteria) this;
        }

        public Criteria andHphoneIsNotNull() {
            addCriterion("HPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHphoneEqualTo(String value) {
            addCriterion("HPHONE =", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotEqualTo(String value) {
            addCriterion("HPHONE <>", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneGreaterThan(String value) {
            addCriterion("HPHONE >", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneGreaterThanOrEqualTo(String value) {
            addCriterion("HPHONE >=", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLessThan(String value) {
            addCriterion("HPHONE <", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLessThanOrEqualTo(String value) {
            addCriterion("HPHONE <=", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLike(String value) {
            addCriterion("HPHONE like", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotLike(String value) {
            addCriterion("HPHONE not like", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneIn(List<String> values) {
            addCriterion("HPHONE in", values, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotIn(List<String> values) {
            addCriterion("HPHONE not in", values, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneBetween(String value1, String value2) {
            addCriterion("HPHONE between", value1, value2, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotBetween(String value1, String value2) {
            addCriterion("HPHONE not between", value1, value2, "hphone");
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