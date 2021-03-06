package com.topaiebiz.transaction.order.merchant.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.nebulapaas.data.mybatis.common.BaseBizEntity;

import java.util.Date;

/**
 * 
 * Description 订单明细实体类  
 * 
 * 
 * Author zhushuyong 
 *    
 * Date 2017年8月31日 上午8:57:41 
 * 
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * 
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
@TableName("t_tsa_store_order_detail")
public class OrderDetailsEntity extends BaseBizEntity<Long> {
	
	/** 序列化版本号*/
	@TableField(exist = false)
	private static final long serialVersionUID = -6142594948012770402L;
	
	/** 订单id*/
	private Long orderId;
	
	/** 商品id*/
	private Long goodsId;
	
	/** 商品名称*/
	private String name;
	
	/** 商品属性集*/
	private String fieldValue;
	
	/** 商品图片*/
	private String goodsImage;
	
	/** 商品原单价*/
	private Double unitPrice;
	
	/** 商品数量*/
	private Long goodsNum;
	
	/** 商品原总价*/
	private Double totalPrice;
	
	/** 所使用的营销活动*/
	private Long usedPromotion;
	
	/** 优惠金额*/
	private Double deduction;
	
	/** 优惠后价钱*/
	private Double salePrice;
	
	/** 总运费*/
	private Double totalFreight;
	
	/** 记录状态*/
	private Integer state;
	
	/** 物流类型*/
	private String logisticsType;
	
	/** 单种商品的物流编号，如果分批次发可记录多个*/ 
	private String logisticsNo;
	
	/**商品sku的基本属性*/
	@TableField(exist=false) 
	private String baseFieldValue;
	
	/**备注*/
	private String memo;
	
	/**该商品是否已评价0为未评价，1已评价*/
	@TableField(exist=false) 
	private Integer evaluateState=0;
	
	@TableField(exist=false) 
	private String replyText;
	
	@TableField(exist=false) 
	private Long itemId;

	// 发货时间
	private Date shipmentsTime;

	// 收货时间
	private Date takeTime;

	/**
	 * 售后状态
	 */
	private Integer refundState;

	/**
	 * 是否已评价
	 */
	private Integer isComment;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getReplyText() {
		return replyText;
	}

	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}

	public Integer getEvaluateState() {
		return evaluateState;
	}

	public void setEvaluateState(Integer evaluateState) {
		this.evaluateState = evaluateState;
	}

	public String getBaseFieldValue() {
		return baseFieldValue;
	}

	public void setBaseFieldValue(String baseFieldValue) {
		this.baseFieldValue = baseFieldValue;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public OrderDetailsEntity() {
		super();
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDeduction() {
		return deduction;
	}

	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	
	public String getLogisticsNo() {
		return logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getUsedPromotion() {
		return usedPromotion;
	}

	public void setUsedPromotion(Long usedPromotion) {
		this.usedPromotion = usedPromotion;
	}

	public Double getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(Double totalFreight) {
		this.totalFreight = totalFreight;
	}

	public String getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public Long getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Long goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Date getShipmentsTime() {
		return shipmentsTime;
	}

	public void setShipmentsTime(Date shipmentsTime) {
		this.shipmentsTime = shipmentsTime;
	}

	public Date getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}

	public Integer getRefundState() {
		return refundState;
	}

	public void setRefundState(Integer refundState) {
		this.refundState = refundState;
	}

	public Integer getIsComment() {
		return isComment;
	}

	public void setIsComment(Integer isComment) {
		this.isComment = isComment;
	}
}
