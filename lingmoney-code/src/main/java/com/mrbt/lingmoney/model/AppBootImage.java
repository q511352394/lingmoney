package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class AppBootImage implements Serializable {
    /**
     * 数据ID
     * 表字段 : app_boot_image.id
     */
    private Integer id;

    /**
     * 标题
     * 表字段 : app_boot_image.title
     */
    private String title;

    /**
     * url
     * 表字段 : app_boot_image.img_url
     */
    private String imgUrl;

    /**
     * 创建时间
     * 表字段 : app_boot_image.create_time
     */
    private Date createTime;

    /**
     * 状态 0 禁用 1启用
     * 表字段 : app_boot_image.status
     */
    private Integer status;

    /**
     * 尺寸，IOS使用
     * 表字段 : app_boot_image.size_code
     */
    private Integer sizeCode;

    /**
     * 显示结束时间
     * 表字段 : app_boot_image.show_end_time
     */
    private Date showEndTime;

    /**
     * 城市编码，同area_domain  bd_city_code
     * 表字段 : app_boot_image.city_code
     */
    private String cityCode;

    /**
     * 类型： 0 无 1产品  2活动
     * 表字段 : app_boot_image.type
     */
    private Integer type;

    /**
     * 对应类型数据： 如果是产品为产品id 如果是活动为活动URL
     * 表字段 : app_boot_image.data
     */
    private String data;

    /**
     * 色值信息，多个用英文逗号分隔
     * 表字段 : app_boot_image.color_info
     */
    private String colorInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_boot_image
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 数据ID 字段:app_boot_image.id
     *
     * @return app_boot_image.id, 数据ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 数据ID 字段:app_boot_image.id
     *
     * @param id the value for app_boot_image.id, 数据ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标题 字段:app_boot_image.title
     *
     * @return app_boot_image.title, 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 标题 字段:app_boot_image.title
     *
     * @param title the value for app_boot_image.title, 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 url 字段:app_boot_image.img_url
     *
     * @return app_boot_image.img_url, url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置 url 字段:app_boot_image.img_url
     *
     * @param imgUrl the value for app_boot_image.img_url, url
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 获取 创建时间 字段:app_boot_image.create_time
     *
     * @return app_boot_image.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:app_boot_image.create_time
     *
     * @param createTime the value for app_boot_image.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 状态 0 禁用 1启用 字段:app_boot_image.status
     *
     * @return app_boot_image.status, 状态 0 禁用 1启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态 0 禁用 1启用 字段:app_boot_image.status
     *
     * @param status the value for app_boot_image.status, 状态 0 禁用 1启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 尺寸，IOS使用 字段:app_boot_image.size_code
     *
     * @return app_boot_image.size_code, 尺寸，IOS使用
     */
    public Integer getSizeCode() {
        return sizeCode;
    }

    /**
     * 设置 尺寸，IOS使用 字段:app_boot_image.size_code
     *
     * @param sizeCode the value for app_boot_image.size_code, 尺寸，IOS使用
     */
    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    /**
     * 获取 显示结束时间 字段:app_boot_image.show_end_time
     *
     * @return app_boot_image.show_end_time, 显示结束时间
     */
    public Date getShowEndTime() {
        return showEndTime;
    }

    /**
     * 设置 显示结束时间 字段:app_boot_image.show_end_time
     *
     * @param showEndTime the value for app_boot_image.show_end_time, 显示结束时间
     */
    public void setShowEndTime(Date showEndTime) {
        this.showEndTime = showEndTime;
    }

    /**
     * 获取 城市编码，同area_domain  bd_city_code 字段:app_boot_image.city_code
     *
     * @return app_boot_image.city_code, 城市编码，同area_domain  bd_city_code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置 城市编码，同area_domain  bd_city_code 字段:app_boot_image.city_code
     *
     * @param cityCode the value for app_boot_image.city_code, 城市编码，同area_domain  bd_city_code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 获取 类型： 0 无 1产品  2活动 字段:app_boot_image.type
     *
     * @return app_boot_image.type, 类型： 0 无 1产品  2活动
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置 类型： 0 无 1产品  2活动 字段:app_boot_image.type
     *
     * @param type the value for app_boot_image.type, 类型： 0 无 1产品  2活动
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 对应类型数据： 如果是产品为产品id 如果是活动为活动URL 字段:app_boot_image.data
     *
     * @return app_boot_image.data, 对应类型数据： 如果是产品为产品id 如果是活动为活动URL
     */
    public String getData() {
        return data;
    }

    /**
     * 设置 对应类型数据： 如果是产品为产品id 如果是活动为活动URL 字段:app_boot_image.data
     *
     * @param data the value for app_boot_image.data, 对应类型数据： 如果是产品为产品id 如果是活动为活动URL
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * 获取 色值信息，多个用英文逗号分隔 字段:app_boot_image.color_info
     *
     * @return app_boot_image.color_info, 色值信息，多个用英文逗号分隔
     */
    public String getColorInfo() {
        return colorInfo;
    }

    /**
     * 设置 色值信息，多个用英文逗号分隔 字段:app_boot_image.color_info
     *
     * @param colorInfo the value for app_boot_image.color_info, 色值信息，多个用英文逗号分隔
     */
    public void setColorInfo(String colorInfo) {
        this.colorInfo = colorInfo == null ? null : colorInfo.trim();
    }

    /**
     * ,app_boot_image
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", showEndTime=").append(showEndTime);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", type=").append(type);
        sb.append(", data=").append(data);
        sb.append(", colorInfo=").append(colorInfo);
        sb.append("]");
        return sb.toString();
    }
}