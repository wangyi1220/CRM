package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KcGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("GOODS_ID like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("GOODS_ID not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsIsNull() {
            addCriterion("GOODS_KINDS is null");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsIsNotNull() {
            addCriterion("GOODS_KINDS is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsEqualTo(String value) {
            addCriterion("GOODS_KINDS =", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsNotEqualTo(String value) {
            addCriterion("GOODS_KINDS <>", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsGreaterThan(String value) {
            addCriterion("GOODS_KINDS >", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_KINDS >=", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsLessThan(String value) {
            addCriterion("GOODS_KINDS <", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsLessThanOrEqualTo(String value) {
            addCriterion("GOODS_KINDS <=", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsLike(String value) {
            addCriterion("GOODS_KINDS like", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsNotLike(String value) {
            addCriterion("GOODS_KINDS not like", value, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsIn(List<String> values) {
            addCriterion("GOODS_KINDS in", values, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsNotIn(List<String> values) {
            addCriterion("GOODS_KINDS not in", values, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsBetween(String value1, String value2) {
            addCriterion("GOODS_KINDS between", value1, value2, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsKindsNotBetween(String value1, String value2) {
            addCriterion("GOODS_KINDS not between", value1, value2, "goodsKinds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsIsNull() {
            addCriterion("GOODS__SPECS is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsIsNotNull() {
            addCriterion("GOODS__SPECS is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsEqualTo(String value) {
            addCriterion("GOODS__SPECS =", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotEqualTo(String value) {
            addCriterion("GOODS__SPECS <>", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsGreaterThan(String value) {
            addCriterion("GOODS__SPECS >", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS__SPECS >=", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsLessThan(String value) {
            addCriterion("GOODS__SPECS <", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsLessThanOrEqualTo(String value) {
            addCriterion("GOODS__SPECS <=", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsLike(String value) {
            addCriterion("GOODS__SPECS like", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotLike(String value) {
            addCriterion("GOODS__SPECS not like", value, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsIn(List<String> values) {
            addCriterion("GOODS__SPECS in", values, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotIn(List<String> values) {
            addCriterion("GOODS__SPECS not in", values, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsBetween(String value1, String value2) {
            addCriterion("GOODS__SPECS between", value1, value2, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecsNotBetween(String value1, String value2) {
            addCriterion("GOODS__SPECS not between", value1, value2, "goodsSpecs");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCangkuIdIsNull() {
            addCriterion("CANGKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCangkuIdIsNotNull() {
            addCriterion("CANGKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCangkuIdEqualTo(String value) {
            addCriterion("CANGKU_ID =", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotEqualTo(String value) {
            addCriterion("CANGKU_ID <>", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdGreaterThan(String value) {
            addCriterion("CANGKU_ID >", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANGKU_ID >=", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdLessThan(String value) {
            addCriterion("CANGKU_ID <", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdLessThanOrEqualTo(String value) {
            addCriterion("CANGKU_ID <=", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdLike(String value) {
            addCriterion("CANGKU_ID like", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotLike(String value) {
            addCriterion("CANGKU_ID not like", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdIn(List<String> values) {
            addCriterion("CANGKU_ID in", values, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotIn(List<String> values) {
            addCriterion("CANGKU_ID not in", values, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdBetween(String value1, String value2) {
            addCriterion("CANGKU_ID between", value1, value2, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotBetween(String value1, String value2) {
            addCriterion("CANGKU_ID not between", value1, value2, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNull() {
            addCriterion("KC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNotNull() {
            addCriterion("KC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andKcNumEqualTo(String value) {
            addCriterion("KC_NUM =", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotEqualTo(String value) {
            addCriterion("KC_NUM <>", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThan(String value) {
            addCriterion("KC_NUM >", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThanOrEqualTo(String value) {
            addCriterion("KC_NUM >=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThan(String value) {
            addCriterion("KC_NUM <", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThanOrEqualTo(String value) {
            addCriterion("KC_NUM <=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLike(String value) {
            addCriterion("KC_NUM like", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotLike(String value) {
            addCriterion("KC_NUM not like", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumIn(List<String> values) {
            addCriterion("KC_NUM in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotIn(List<String> values) {
            addCriterion("KC_NUM not in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumBetween(String value1, String value2) {
            addCriterion("KC_NUM between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotBetween(String value1, String value2) {
            addCriterion("KC_NUM not between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNull() {
            addCriterion("GOODS_COST is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNotNull() {
            addCriterion("GOODS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostEqualTo(String value) {
            addCriterion("GOODS_COST =", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotEqualTo(String value) {
            addCriterion("GOODS_COST <>", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThan(String value) {
            addCriterion("GOODS_COST >", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_COST >=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThan(String value) {
            addCriterion("GOODS_COST <", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThanOrEqualTo(String value) {
            addCriterion("GOODS_COST <=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLike(String value) {
            addCriterion("GOODS_COST like", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotLike(String value) {
            addCriterion("GOODS_COST not like", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIn(List<String> values) {
            addCriterion("GOODS_COST in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotIn(List<String> values) {
            addCriterion("GOODS_COST not in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostBetween(String value1, String value2) {
            addCriterion("GOODS_COST between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotBetween(String value1, String value2) {
            addCriterion("GOODS_COST not between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("GOODS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("GOODS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(String value) {
            addCriterion("GOODS_PRICE =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(String value) {
            addCriterion("GOODS_PRICE <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(String value) {
            addCriterion("GOODS_PRICE >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_PRICE >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(String value) {
            addCriterion("GOODS_PRICE <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(String value) {
            addCriterion("GOODS_PRICE <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLike(String value) {
            addCriterion("GOODS_PRICE like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotLike(String value) {
            addCriterion("GOODS_PRICE not like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<String> values) {
            addCriterion("GOODS_PRICE in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<String> values) {
            addCriterion("GOODS_PRICE not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(String value1, String value2) {
            addCriterion("GOODS_PRICE between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(String value1, String value2) {
            addCriterion("GOODS_PRICE not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceIsNull() {
            addCriterion("GOODS_SELLING_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceIsNotNull() {
            addCriterion("GOODS_SELLING_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceEqualTo(String value) {
            addCriterion("GOODS_SELLING_PRICE =", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceNotEqualTo(String value) {
            addCriterion("GOODS_SELLING_PRICE <>", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceGreaterThan(String value) {
            addCriterion("GOODS_SELLING_PRICE >", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_SELLING_PRICE >=", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceLessThan(String value) {
            addCriterion("GOODS_SELLING_PRICE <", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceLessThanOrEqualTo(String value) {
            addCriterion("GOODS_SELLING_PRICE <=", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceLike(String value) {
            addCriterion("GOODS_SELLING_PRICE like", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceNotLike(String value) {
            addCriterion("GOODS_SELLING_PRICE not like", value, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceIn(List<String> values) {
            addCriterion("GOODS_SELLING_PRICE in", values, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceNotIn(List<String> values) {
            addCriterion("GOODS_SELLING_PRICE not in", values, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceBetween(String value1, String value2) {
            addCriterion("GOODS_SELLING_PRICE between", value1, value2, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellingPriceNotBetween(String value1, String value2) {
            addCriterion("GOODS_SELLING_PRICE not between", value1, value2, "goodsSellingPrice");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
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