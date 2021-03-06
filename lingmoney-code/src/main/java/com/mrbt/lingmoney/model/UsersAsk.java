package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class UsersAsk implements Serializable {
    /**
     * 主键
     * 表字段 : users_ask.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : users_ask.u_id
     */
    private String uId;

    /**
     * 标题
     * 表字段 : users_ask.title
     */
    private String title;

    /**
     * 发布时间
     * 表字段 : users_ask.time
     */
    private Date time;

    /**
     * 回答人
     * 表字段 : users_ask.anwser_man
     */
    private String anwserMan;

    /**
     * 关键字,逗号隔开
     * 表字段 : users_ask.keyword
     */
    private String keyword;

    /**
     * 状态，默认0未回答，1已回答，
     * 表字段 : users_ask.status
     */
    private Integer status;

    /**
     * 是否是热门问题，默认0不是，1是
     * 表字段 : users_ask.hot
     */
    private Integer hot;

    /**
     * 0:问题，1：回答
     * 表字段 : users_ask.type
     */
    private Integer type;

    /**
     * 对应问题
     * 表字段 : users_ask.ask_id
     */
    private Integer askId;

    /**
     * 状态，默认0不可用，1可用，
     * 表字段 : users_ask.state
     */
    private Integer state;

    /**
     * 内容
     * 表字段 : users_ask.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_ask
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:users_ask.id
     *
     * @return users_ask.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:users_ask.id
     *
     * @param id the value for users_ask.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:users_ask.u_id
     *
     * @return users_ask.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:users_ask.u_id
     *
     * @param uId the value for users_ask.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 标题 字段:users_ask.title
     *
     * @return users_ask.title, 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 标题 字段:users_ask.title
     *
     * @param title the value for users_ask.title, 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 发布时间 字段:users_ask.time
     *
     * @return users_ask.time, 发布时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置 发布时间 字段:users_ask.time
     *
     * @param time the value for users_ask.time, 发布时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取 回答人 字段:users_ask.anwser_man
     *
     * @return users_ask.anwser_man, 回答人
     */
    public String getAnwserMan() {
        return anwserMan;
    }

    /**
     * 设置 回答人 字段:users_ask.anwser_man
     *
     * @param anwserMan the value for users_ask.anwser_man, 回答人
     */
    public void setAnwserMan(String anwserMan) {
        this.anwserMan = anwserMan == null ? null : anwserMan.trim();
    }

    /**
     * 获取 关键字,逗号隔开 字段:users_ask.keyword
     *
     * @return users_ask.keyword, 关键字,逗号隔开
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置 关键字,逗号隔开 字段:users_ask.keyword
     *
     * @param keyword the value for users_ask.keyword, 关键字,逗号隔开
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * 获取 状态，默认0未回答，1已回答， 字段:users_ask.status
     *
     * @return users_ask.status, 状态，默认0未回答，1已回答，
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态，默认0未回答，1已回答， 字段:users_ask.status
     *
     * @param status the value for users_ask.status, 状态，默认0未回答，1已回答，
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 是否是热门问题，默认0不是，1是 字段:users_ask.hot
     *
     * @return users_ask.hot, 是否是热门问题，默认0不是，1是
     */
    public Integer getHot() {
        return hot;
    }

    /**
     * 设置 是否是热门问题，默认0不是，1是 字段:users_ask.hot
     *
     * @param hot the value for users_ask.hot, 是否是热门问题，默认0不是，1是
     */
    public void setHot(Integer hot) {
        this.hot = hot;
    }

    /**
     * 获取 0:问题，1：回答 字段:users_ask.type
     *
     * @return users_ask.type, 0:问题，1：回答
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置 0:问题，1：回答 字段:users_ask.type
     *
     * @param type the value for users_ask.type, 0:问题，1：回答
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 对应问题 字段:users_ask.ask_id
     *
     * @return users_ask.ask_id, 对应问题
     */
    public Integer getAskId() {
        return askId;
    }

    /**
     * 设置 对应问题 字段:users_ask.ask_id
     *
     * @param askId the value for users_ask.ask_id, 对应问题
     */
    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    /**
     * 获取 状态，默认0不可用，1可用， 字段:users_ask.state
     *
     * @return users_ask.state, 状态，默认0不可用，1可用，
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置 状态，默认0不可用，1可用， 字段:users_ask.state
     *
     * @param state the value for users_ask.state, 状态，默认0不可用，1可用，
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取 内容 字段:users_ask.content
     *
     * @return users_ask.content, 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 内容 字段:users_ask.content
     *
     * @param content the value for users_ask.content, 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,users_ask
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", title=").append(title);
        sb.append(", time=").append(time);
        sb.append(", anwserMan=").append(anwserMan);
        sb.append(", keyword=").append(keyword);
        sb.append(", status=").append(status);
        sb.append(", hot=").append(hot);
        sb.append(", type=").append(type);
        sb.append(", askId=").append(askId);
        sb.append(", state=").append(state);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}