package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class InfoNotice implements Serializable {
    /**
     * 主键
     * 表字段 : info_notice.id
     */
    private Integer id;

    /**
     * 主题
     * 表字段 : info_notice.title
     */
    private String title;

    /**
     * 创建时间
     * 表字段 : info_notice.ct_dt
     */
    private Date ctDt;

    /**
     * 发布状态,0未发布，1发布
     * 表字段 : info_notice.status
     */
    private Integer status;

    /**
     * 发布时间
     * 表字段 : info_notice.p_dt
     */
    private Date pDt;

    /**
     * 排序索引
     * 表字段 : info_notice.order_index
     */
    private Integer orderIndex;

    /**
     * 内容
     * 表字段 : info_notice.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_notice
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:info_notice.id
     *
     * @return info_notice.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:info_notice.id
     *
     * @param id the value for info_notice.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 主题 字段:info_notice.title
     *
     * @return info_notice.title, 主题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 主题 字段:info_notice.title
     *
     * @param title the value for info_notice.title, 主题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 创建时间 字段:info_notice.ct_dt
     *
     * @return info_notice.ct_dt, 创建时间
     */
    public Date getCtDt() {
        return ctDt;
    }

    /**
     * 设置 创建时间 字段:info_notice.ct_dt
     *
     * @param ctDt the value for info_notice.ct_dt, 创建时间
     */
    public void setCtDt(Date ctDt) {
        this.ctDt = ctDt;
    }

    /**
     * 获取 发布状态,0未发布，1发布 字段:info_notice.status
     *
     * @return info_notice.status, 发布状态,0未发布，1发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 发布状态,0未发布，1发布 字段:info_notice.status
     *
     * @param status the value for info_notice.status, 发布状态,0未发布，1发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 发布时间 字段:info_notice.p_dt
     *
     * @return info_notice.p_dt, 发布时间
     */
    public Date getpDt() {
        return pDt;
    }

    /**
     * 设置 发布时间 字段:info_notice.p_dt
     *
     * @param pDt the value for info_notice.p_dt, 发布时间
     */
    public void setpDt(Date pDt) {
        this.pDt = pDt;
    }

    /**
     * 获取 排序索引 字段:info_notice.order_index
     *
     * @return info_notice.order_index, 排序索引
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设置 排序索引 字段:info_notice.order_index
     *
     * @param orderIndex the value for info_notice.order_index, 排序索引
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    /**
     * 获取 内容 字段:info_notice.content
     *
     * @return info_notice.content, 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 内容 字段:info_notice.content
     *
     * @param content the value for info_notice.content, 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,info_notice
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", ctDt=").append(ctDt);
        sb.append(", status=").append(status);
        sb.append(", pDt=").append(pDt);
        sb.append(", orderIndex=").append(orderIndex);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}