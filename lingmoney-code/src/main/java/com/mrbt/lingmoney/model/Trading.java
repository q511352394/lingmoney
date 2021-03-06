package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Trading implements Serializable {

	/**
	 * ====================自定义的子类=========================
	 */
	/**
	 * 详细信息表中的id
	 */
	protected Integer infoId;
	/**
	 * 固定类交易信息表
	 */
	protected TradingFixInfo fixInfo;

	private Product product;
	/**
	 * 是否存在交易id
	 */
	protected Trading exist;
	/**
	 * 是否位扫钱的标志
	 */
	protected int walletBatch;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
    /**
     * 主键
     * 表字段 : trading.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : trading.u_id
     */
    private String uId;

    /**
     * 产品id
     * 表字段 : trading.p_id
     */
    private Integer pId;

    /**
     * 产品码
     * 表字段 : trading.p_code
     */
    private String pCode;

    /**
     * 产品类型
     * 表字段 : trading.pc_type
     */
    private Integer pcType;

    /**
     * 产品类型id
     * 表字段 : trading.pc_id
     */
    private Integer pcId;

    /**
     * 购买的金额
     * 表字段 : trading.buy_money
     */
    private BigDecimal buyMoney;

    /**
     * 理财金额,扣除前段认购费
     * 表字段 : trading.financial_money
     */
    private BigDecimal financialMoney;

    /**
     * 购买日期
     * 表字段 : trading.buy_dt
     */
    private Date buyDt;

    /**
     * 计息日
     * 表字段 : trading.value_dt
     */
    private Date valueDt;

    /**
     * 筹备期计息日
     * 表字段 : trading.w_value_dt
     */
    private Date wValueDt;

    /**
     * 可赎回的日期
     * 表字段 : trading.min_sell_dt
     */
    private Date minSellDt;

    /**
     * 状态，0:买入，1支付成功，2卖出，3卖出成功, 4 资金冻结，5支付失败，7退回
     * 表字段 : trading.status
     */
    private Integer status;

    /**
     * 交易码:日期时间+5位左补0（产品id）+买入0+7位左补0用户id
     * 表字段 : trading.biz_code
     */
    private String bizCode;

    /**
     * 卖出的日期
     * 表字段 : trading.sell_dt
     */
    private Date sellDt;

    /**
     * 卖出金额
     * 表字段 : trading.sell_money
     */
    private BigDecimal sellMoney;

    /**
     * 卖出交易码:交易码:日期时间+5位左补0（产品id）+买入1+7位左补0用户id
     * 表字段 : trading.out_biz_code
     */
    private String outBizCode;

    /**
     * 定期投资的标志，0：非定投，1周周投，2半月投，3月月投
     * 表字段 : trading.fix_invest
     */
    private Integer fixInvest;

    /**
     * 自动付款，0非自动付款，1自动付款
     * 表字段 : trading.auto_pay
     */
    private Integer autoPay;

    /**
     * 收益
     * 表字段 : trading.interest
     */
    private BigDecimal interest;

    /**
     * 总收益
     * 表字段 : trading.all_interest
     */
    private BigDecimal allInterest;

    /**
     * 平台用户类型   0：互联网用户；1：移动用户
     * 表字段 : trading.platform_type
     */
    private Integer platformType;

    /**
     * 最后计息日
     * 表字段 : trading.last_value_dt
     */
    private Date lastValueDt;

    /**
     * 
     * 表字段 : trading.card_pan
     */
    private String cardPan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trading
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:trading.id
     *
     * @return trading.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:trading.id
     *
     * @param id the value for trading.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:trading.u_id
     *
     * @return trading.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:trading.u_id
     *
     * @param uId the value for trading.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 产品id 字段:trading.p_id
     *
     * @return trading.p_id, 产品id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置 产品id 字段:trading.p_id
     *
     * @param pId the value for trading.p_id, 产品id
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取 产品码 字段:trading.p_code
     *
     * @return trading.p_code, 产品码
     */
    public String getpCode() {
        return pCode;
    }

    /**
     * 设置 产品码 字段:trading.p_code
     *
     * @param pCode the value for trading.p_code, 产品码
     */
    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    /**
     * 获取 产品类型 字段:trading.pc_type
     *
     * @return trading.pc_type, 产品类型
     */
    public Integer getPcType() {
        return pcType;
    }

    /**
     * 设置 产品类型 字段:trading.pc_type
     *
     * @param pcType the value for trading.pc_type, 产品类型
     */
    public void setPcType(Integer pcType) {
        this.pcType = pcType;
    }

    /**
     * 获取 产品类型id 字段:trading.pc_id
     *
     * @return trading.pc_id, 产品类型id
     */
    public Integer getPcId() {
        return pcId;
    }

    /**
     * 设置 产品类型id 字段:trading.pc_id
     *
     * @param pcId the value for trading.pc_id, 产品类型id
     */
    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    /**
     * 获取 购买的金额 字段:trading.buy_money
     *
     * @return trading.buy_money, 购买的金额
     */
    public BigDecimal getBuyMoney() {
        return buyMoney;
    }

    /**
     * 设置 购买的金额 字段:trading.buy_money
     *
     * @param buyMoney the value for trading.buy_money, 购买的金额
     */
    public void setBuyMoney(BigDecimal buyMoney) {
        this.buyMoney = buyMoney;
    }

    /**
     * 获取 理财金额,扣除前段认购费 字段:trading.financial_money
     *
     * @return trading.financial_money, 理财金额,扣除前段认购费
     */
    public BigDecimal getFinancialMoney() {
        return financialMoney;
    }

    /**
     * 设置 理财金额,扣除前段认购费 字段:trading.financial_money
     *
     * @param financialMoney the value for trading.financial_money, 理财金额,扣除前段认购费
     */
    public void setFinancialMoney(BigDecimal financialMoney) {
        this.financialMoney = financialMoney;
    }

    /**
     * 获取 购买日期 字段:trading.buy_dt
     *
     * @return trading.buy_dt, 购买日期
     */
    public Date getBuyDt() {
        return buyDt;
    }

    /**
     * 设置 购买日期 字段:trading.buy_dt
     *
     * @param buyDt the value for trading.buy_dt, 购买日期
     */
    public void setBuyDt(Date buyDt) {
        this.buyDt = buyDt;
    }

    /**
     * 获取 计息日 字段:trading.value_dt
     *
     * @return trading.value_dt, 计息日
     */
    public Date getValueDt() {
        return valueDt;
    }

    /**
     * 设置 计息日 字段:trading.value_dt
     *
     * @param valueDt the value for trading.value_dt, 计息日
     */
    public void setValueDt(Date valueDt) {
        this.valueDt = valueDt;
    }

    /**
     * 获取 筹备期计息日 字段:trading.w_value_dt
     *
     * @return trading.w_value_dt, 筹备期计息日
     */
    public Date getwValueDt() {
        return wValueDt;
    }

    /**
     * 设置 筹备期计息日 字段:trading.w_value_dt
     *
     * @param wValueDt the value for trading.w_value_dt, 筹备期计息日
     */
    public void setwValueDt(Date wValueDt) {
        this.wValueDt = wValueDt;
    }

    /**
     * 获取 可赎回的日期 字段:trading.min_sell_dt
     *
     * @return trading.min_sell_dt, 可赎回的日期
     */
    public Date getMinSellDt() {
        return minSellDt;
    }

    /**
     * 设置 可赎回的日期 字段:trading.min_sell_dt
     *
     * @param minSellDt the value for trading.min_sell_dt, 可赎回的日期
     */
    public void setMinSellDt(Date minSellDt) {
        this.minSellDt = minSellDt;
    }

    /**
     * 获取 状态，0:买入，1支付成功，2卖出，3卖出成功, 4 资金冻结，5支付失败，7退回 字段:trading.status
     *
     * @return trading.status, 状态，0:买入，1支付成功，2卖出，3卖出成功, 4 资金冻结，5支付失败，7退回
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态，0:买入，1支付成功，2卖出，3卖出成功, 4 资金冻结，5支付失败，7退回 字段:trading.status
     *
     * @param status the value for trading.status, 状态，0:买入，1支付成功，2卖出，3卖出成功, 4 资金冻结，5支付失败，7退回
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 交易码:日期时间+5位左补0（产品id）+买入0+7位左补0用户id 字段:trading.biz_code
     *
     * @return trading.biz_code, 交易码:日期时间+5位左补0（产品id）+买入0+7位左补0用户id
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * 设置 交易码:日期时间+5位左补0（产品id）+买入0+7位左补0用户id 字段:trading.biz_code
     *
     * @param bizCode the value for trading.biz_code, 交易码:日期时间+5位左补0（产品id）+买入0+7位左补0用户id
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * 获取 卖出的日期 字段:trading.sell_dt
     *
     * @return trading.sell_dt, 卖出的日期
     */
    public Date getSellDt() {
        return sellDt;
    }

    /**
     * 设置 卖出的日期 字段:trading.sell_dt
     *
     * @param sellDt the value for trading.sell_dt, 卖出的日期
     */
    public void setSellDt(Date sellDt) {
        this.sellDt = sellDt;
    }

    /**
     * 获取 卖出金额 字段:trading.sell_money
     *
     * @return trading.sell_money, 卖出金额
     */
    public BigDecimal getSellMoney() {
        return sellMoney;
    }

    /**
     * 设置 卖出金额 字段:trading.sell_money
     *
     * @param sellMoney the value for trading.sell_money, 卖出金额
     */
    public void setSellMoney(BigDecimal sellMoney) {
        this.sellMoney = sellMoney;
    }

    /**
     * 获取 卖出交易码:交易码:日期时间+5位左补0（产品id）+买入1+7位左补0用户id 字段:trading.out_biz_code
     *
     * @return trading.out_biz_code, 卖出交易码:交易码:日期时间+5位左补0（产品id）+买入1+7位左补0用户id
     */
    public String getOutBizCode() {
        return outBizCode;
    }

    /**
     * 设置 卖出交易码:交易码:日期时间+5位左补0（产品id）+买入1+7位左补0用户id 字段:trading.out_biz_code
     *
     * @param outBizCode the value for trading.out_biz_code, 卖出交易码:交易码:日期时间+5位左补0（产品id）+买入1+7位左补0用户id
     */
    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode == null ? null : outBizCode.trim();
    }

    /**
     * 获取 定期投资的标志，0：非定投，1周周投，2半月投，3月月投 字段:trading.fix_invest
     *
     * @return trading.fix_invest, 定期投资的标志，0：非定投，1周周投，2半月投，3月月投
     */
    public Integer getFixInvest() {
        return fixInvest;
    }

    /**
     * 设置 定期投资的标志，0：非定投，1周周投，2半月投，3月月投 字段:trading.fix_invest
     *
     * @param fixInvest the value for trading.fix_invest, 定期投资的标志，0：非定投，1周周投，2半月投，3月月投
     */
    public void setFixInvest(Integer fixInvest) {
        this.fixInvest = fixInvest;
    }

    /**
     * 获取 自动付款，0非自动付款，1自动付款 字段:trading.auto_pay
     *
     * @return trading.auto_pay, 自动付款，0非自动付款，1自动付款
     */
    public Integer getAutoPay() {
        return autoPay;
    }

    /**
     * 设置 自动付款，0非自动付款，1自动付款 字段:trading.auto_pay
     *
     * @param autoPay the value for trading.auto_pay, 自动付款，0非自动付款，1自动付款
     */
    public void setAutoPay(Integer autoPay) {
        this.autoPay = autoPay;
    }

    /**
     * 获取 收益 字段:trading.interest
     *
     * @return trading.interest, 收益
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置 收益 字段:trading.interest
     *
     * @param interest the value for trading.interest, 收益
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取 总收益 字段:trading.all_interest
     *
     * @return trading.all_interest, 总收益
     */
    public BigDecimal getAllInterest() {
        return allInterest;
    }

    /**
     * 设置 总收益 字段:trading.all_interest
     *
     * @param allInterest the value for trading.all_interest, 总收益
     */
    public void setAllInterest(BigDecimal allInterest) {
        this.allInterest = allInterest;
    }

    /**
     * 获取 平台用户类型   0：互联网用户；1：移动用户 字段:trading.platform_type
     *
     * @return trading.platform_type, 平台用户类型   0：互联网用户；1：移动用户
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置 平台用户类型   0：互联网用户；1：移动用户 字段:trading.platform_type
     *
     * @param platformType the value for trading.platform_type, 平台用户类型   0：互联网用户；1：移动用户
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取 最后计息日 字段:trading.last_value_dt
     *
     * @return trading.last_value_dt, 最后计息日
     */
    public Date getLastValueDt() {
        return lastValueDt;
    }

    /**
     * 设置 最后计息日 字段:trading.last_value_dt
     *
     * @param lastValueDt the value for trading.last_value_dt, 最后计息日
     */
    public void setLastValueDt(Date lastValueDt) {
        this.lastValueDt = lastValueDt;
    }

    /**
     * 获取  字段:trading.card_pan
     *
     * @return trading.card_pan, 
     */
    public String getCardPan() {
        return cardPan;
    }

    /**
     * 设置  字段:trading.card_pan
     *
     * @param cardPan the value for trading.card_pan, 
     */
    public void setCardPan(String cardPan) {
        this.cardPan = cardPan == null ? null : cardPan.trim();
    }

	public TradingFixInfo getFixInfo() {
		return fixInfo;
	}

	public void setFixInfo(TradingFixInfo fixInfo) {
		this.fixInfo = fixInfo;
	}

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public Trading getExist() {
		return exist;
	}

	public void setExist(Trading exist) {
		this.exist = exist;
	}

	public int getWalletBatch() {
		return walletBatch;
	}

	public void setWalletBatch(int walletBatch) {
		this.walletBatch = walletBatch;
	}

    /**
     * ,trading
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", pId=").append(pId);
        sb.append(", pCode=").append(pCode);
        sb.append(", pcType=").append(pcType);
        sb.append(", pcId=").append(pcId);
        sb.append(", buyMoney=").append(buyMoney);
        sb.append(", financialMoney=").append(financialMoney);
        sb.append(", buyDt=").append(buyDt);
        sb.append(", valueDt=").append(valueDt);
        sb.append(", wValueDt=").append(wValueDt);
        sb.append(", minSellDt=").append(minSellDt);
        sb.append(", status=").append(status);
        sb.append(", bizCode=").append(bizCode);
        sb.append(", sellDt=").append(sellDt);
        sb.append(", sellMoney=").append(sellMoney);
        sb.append(", outBizCode=").append(outBizCode);
        sb.append(", fixInvest=").append(fixInvest);
        sb.append(", autoPay=").append(autoPay);
        sb.append(", interest=").append(interest);
        sb.append(", allInterest=").append(allInterest);
        sb.append(", platformType=").append(platformType);
        sb.append(", lastValueDt=").append(lastValueDt);
        sb.append(", cardPan=").append(cardPan);
        sb.append("]");
        return sb.toString();
    }

}