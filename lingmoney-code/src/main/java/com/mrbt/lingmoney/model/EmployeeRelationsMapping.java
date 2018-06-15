package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class EmployeeRelationsMapping implements Serializable {
    /**
     * 
     * 表字段 : employee_relations_mapping.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : employee_relations_mapping.type
     */
    private Integer type;

    /**
     * 企业名称
     * 表字段 : employee_relations_mapping.comp_name
     */
    private String compName;

    /**
     * 部门
     * 表字段 : employee_relations_mapping.department
     */
    private String department;

    /**
     * 
     * 表字段 : employee_relations_mapping.employee_name
     */
    private String employeeName;

    /**
     * 
     * 表字段 : employee_relations_mapping.employeeID
     */
    private String employeeid;

    /**
     * 
     * 表字段 : employee_relations_mapping.newID
     */
    private String newid;

    /**
     * 1：正常，-1：删除
     * 表字段 : employee_relations_mapping.status
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee_relations_mapping
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:employee_relations_mapping.id
     *
     * @return employee_relations_mapping.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:employee_relations_mapping.id
     *
     * @param id the value for employee_relations_mapping.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:employee_relations_mapping.type
     *
     * @return employee_relations_mapping.type, 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置  字段:employee_relations_mapping.type
     *
     * @param type the value for employee_relations_mapping.type, 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 企业名称 字段:employee_relations_mapping.comp_name
     *
     * @return employee_relations_mapping.comp_name, 企业名称
     */
    public String getCompName() {
        return compName;
    }

    /**
     * 设置 企业名称 字段:employee_relations_mapping.comp_name
     *
     * @param compName the value for employee_relations_mapping.comp_name, 企业名称
     */
    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    /**
     * 获取 部门 字段:employee_relations_mapping.department
     *
     * @return employee_relations_mapping.department, 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置 部门 字段:employee_relations_mapping.department
     *
     * @param department the value for employee_relations_mapping.department, 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取  字段:employee_relations_mapping.employee_name
     *
     * @return employee_relations_mapping.employee_name, 
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置  字段:employee_relations_mapping.employee_name
     *
     * @param employeeName the value for employee_relations_mapping.employee_name, 
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * 获取  字段:employee_relations_mapping.employeeID
     *
     * @return employee_relations_mapping.employeeID, 
     */
    public String getEmployeeid() {
        return employeeid;
    }

    /**
     * 设置  字段:employee_relations_mapping.employeeID
     *
     * @param employeeid the value for employee_relations_mapping.employeeID, 
     */
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    /**
     * 获取  字段:employee_relations_mapping.newID
     *
     * @return employee_relations_mapping.newID, 
     */
    public String getNewid() {
        return newid;
    }

    /**
     * 设置  字段:employee_relations_mapping.newID
     *
     * @param newid the value for employee_relations_mapping.newID, 
     */
    public void setNewid(String newid) {
        this.newid = newid == null ? null : newid.trim();
    }

    /**
     * 获取 1：正常，-1：删除 字段:employee_relations_mapping.status
     *
     * @return employee_relations_mapping.status, 1：正常，-1：删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 1：正常，-1：删除 字段:employee_relations_mapping.status
     *
     * @param status the value for employee_relations_mapping.status, 1：正常，-1：删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ,employee_relations_mapping
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", compName=").append(compName);
        sb.append(", department=").append(department);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", newid=").append(newid);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}