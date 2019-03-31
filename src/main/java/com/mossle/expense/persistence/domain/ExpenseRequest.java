package com.mossle.expense.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ExpenseRequest 印章申请.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "EXPENSE_REQUEST")
public class ExpenseRequest implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 单号. */
    private String code;

    /** 申请人. */
    private String userId;

    /** 申请人部门编码. */
    private String deptCode;

    /** 申请人部门名称. */
    private String deptName;

    /** 创建时间. */
    private Date createTime;

    /** 状态. */
    private String status;

    /** 申请原因. */
    private String description;

    /** 多租户. */
    private String tenantId;

    /** 类型. */
    private String type;

    /** 金额. */
    private Double price;

    /** 开始时间. */
    private Date startTime;

    /** 结束时间. */
    private Date endTime;

    /** 人数. */
    private Integer headCount;

    /** 人员. */
    private String person;

    /** 交通工具. */
    private String traffic;

    /** 城市. */
    private String country;

    /** 地点. */
    private String address;

    /** 事项. */
    private String thing;

    public ExpenseRequest() {
    }

    public ExpenseRequest(Long id) {
        this.id = id;
    }

    public ExpenseRequest(Long id, String code, String userId, String deptCode,
            String deptName, Date createTime, String status,
            String description, String tenantId, String type, Double price,
            Date startTime, Date endTime, Integer headCount, String person,
            String traffic, String country, String address, String thing) {
        this.id = id;
        this.code = code;
        this.userId = userId;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.createTime = createTime;
        this.status = status;
        this.description = description;
        this.tenantId = tenantId;
        this.type = type;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.headCount = headCount;
        this.person = person;
        this.traffic = traffic;
        this.country = country;
        this.address = address;
        this.thing = thing;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 单号. */
    @Column(name = "CODE", length = 100)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            单号.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 申请人. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            申请人.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return 申请人部门编码. */
    @Column(name = "DEPT_CODE", length = 50)
    public String getDeptCode() {
        return this.deptCode;
    }

    /**
     * @param deptCode
     *            申请人部门编码.
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /** @return 申请人部门名称. */
    @Column(name = "DEPT_NAME", length = 200)
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * @param deptName
     *            申请人部门名称.
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /** @return 创建时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            创建时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 状态. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return 申请原因. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            申请原因.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 多租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            多租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return 类型. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            类型.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 金额. */
    @Column(name = "PRICE", precision = 64, scale = 0)
    public Double getPrice() {
        return this.price;
    }

    /**
     * @param price
     *            金额.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /** @return 开始时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            开始时间.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return 结束时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", length = 26)
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            结束时间.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** @return 人数. */
    @Column(name = "HEAD_COUNT")
    public Integer getHeadCount() {
        return this.headCount;
    }

    /**
     * @param headCount
     *            人数.
     */
    public void setHeadCount(Integer headCount) {
        this.headCount = headCount;
    }

    /** @return 人员. */
    @Column(name = "PERSON", length = 200)
    public String getPerson() {
        return this.person;
    }

    /**
     * @param person
     *            人员.
     */
    public void setPerson(String person) {
        this.person = person;
    }

    /** @return 交通工具. */
    @Column(name = "TRAFFIC", length = 100)
    public String getTraffic() {
        return this.traffic;
    }

    /**
     * @param traffic
     *            交通工具.
     */
    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    /** @return 城市. */
    @Column(name = "COUNTRY", length = 100)
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     *            城市.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** @return 地点. */
    @Column(name = "ADDRESS", length = 100)
    public String getAddress() {
        return this.address;
    }

    /**
     * @param address
     *            地点.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** @return 事项. */
    @Column(name = "THING", length = 100)
    public String getThing() {
        return this.thing;
    }

    /**
     * @param thing
     *            事项.
     */
    public void setThing(String thing) {
        this.thing = thing;
    }
}