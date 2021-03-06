package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class WorldCupScore implements Serializable {
    /**
     * 
     * 表字段 : world_cup_score.id
     */
    private Integer id;

    /**
     * 用户ID
     * 表字段 : world_cup_score.u_id
     */
    private String uId;

    /**
     * 手机号
     * 表字段 : world_cup_score.phone
     */
    private String phone;

    /**
     * 分数
     * 表字段 : world_cup_score.score
     */
    private Integer score;

    /**
     * 是否领取复投红包
     * 表字段 : world_cup_score.receive
     */
    private Integer receive;

    /**
     * 创建时间
     * 表字段 : world_cup_score.create_time
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_score
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:world_cup_score.id
     *
     * @return world_cup_score.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:world_cup_score.id
     *
     * @param id the value for world_cup_score.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 用户ID 字段:world_cup_score.u_id
     *
     * @return world_cup_score.u_id, 用户ID
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置 用户ID 字段:world_cup_score.u_id
     *
     * @param uId the value for world_cup_score.u_id, 用户ID
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 手机号 字段:world_cup_score.phone
     *
     * @return world_cup_score.phone, 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置 手机号 字段:world_cup_score.phone
     *
     * @param phone the value for world_cup_score.phone, 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取 分数 字段:world_cup_score.score
     *
     * @return world_cup_score.score, 分数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置 分数 字段:world_cup_score.score
     *
     * @param score the value for world_cup_score.score, 分数
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取 是否领取复投红包 字段:world_cup_score.receive
     *
     * @return world_cup_score.receive, 是否领取复投红包
     */
    public Integer getReceive() {
        return receive;
    }

    /**
     * 设置 是否领取复投红包 字段:world_cup_score.receive
     *
     * @param receive the value for world_cup_score.receive, 是否领取复投红包
     */
    public void setReceive(Integer receive) {
        this.receive = receive;
    }

    /**
     * 获取 创建时间 字段:world_cup_score.create_time
     *
     * @return world_cup_score.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:world_cup_score.create_time
     *
     * @param createTime the value for world_cup_score.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ,world_cup_score
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", phone=").append(phone);
        sb.append(", score=").append(score);
        sb.append(", receive=").append(receive);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}