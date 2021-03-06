package com.mossle.asset.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SkuInfo sku信息.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "SKU_INFO")
public class SkuInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 外键，分类. */
    private SkuCategory skuCategory;

    /** 编码. */
    private String code;

    /** 名称. */
    private String name;

    /** 样式. */
    private String style;

    /** 型号. */
    private String model;

    /** 颜色. */
    private String color;

    /** 号码. */
    private String size;

    /** null. */
    private String productCategory;

    /** null. */
    private String purpose;

    /** null. */
    private String productName;

    /** null. */
    private String productModel;

    /** null. */
    private Integer productPrice;

    /** null. */
    private Integer productNum;

    /** 备注. */
    private String description;

    /** 租户. */
    private String tenantId;

    /** . */
    private Set<StockInfo> stockInfos = new HashSet<StockInfo>(0);

    public SkuInfo() {
    }

    public SkuInfo(Long id) {
        this.id = id;
    }

    public SkuInfo(Long id, SkuCategory skuCategory, String code, String name,
            String style, String model, String color, String size,
            String productCategory, String purpose, String productName,
            String productModel, Integer productPrice, Integer productNum,
            String description, String tenantId, Set<StockInfo> stockInfos) {
        this.id = id;
        this.skuCategory = skuCategory;
        this.code = code;
        this.name = name;
        this.style = style;
        this.model = model;
        this.color = color;
        this.size = size;
        this.productCategory = productCategory;
        this.purpose = purpose;
        this.productName = productName;
        this.productModel = productModel;
        this.productPrice = productPrice;
        this.productNum = productNum;
        this.description = description;
        this.tenantId = tenantId;
        this.stockInfos = stockInfos;
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

    /** @return 外键，分类. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    public SkuCategory getSkuCategory() {
        return this.skuCategory;
    }

    /**
     * @param skuCategory
     *            外键，分类.
     */
    public void setSkuCategory(SkuCategory skuCategory) {
        this.skuCategory = skuCategory;
    }

    /** @return 编码. */
    @Column(name = "CODE", length = 100)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            编码.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 100)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            名称.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return 样式. */
    @Column(name = "STYLE", length = 50)
    public String getStyle() {
        return this.style;
    }

    /**
     * @param style
     *            样式.
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /** @return 型号. */
    @Column(name = "MODEL", length = 50)
    public String getModel() {
        return this.model;
    }

    /**
     * @param model
     *            型号.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** @return 颜色. */
    @Column(name = "COLOR", length = 50)
    public String getColor() {
        return this.color;
    }

    /**
     * @param color
     *            颜色.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** @return 号码. */
    @Column(name = "SIZE", length = 50)
    public String getSize() {
        return this.size;
    }

    /**
     * @param size
     *            号码.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /** @return null. */
    @Column(name = "PRODUCT_CATEGORY", length = 100)
    public String getProductCategory() {
        return this.productCategory;
    }

    /**
     * @param productCategory
     *            null.
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /** @return null. */
    @Column(name = "PURPOSE", length = 100)
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @param purpose
     *            null.
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** @return null. */
    @Column(name = "PRODUCT_NAME", length = 200)
    public String getProductName() {
        return this.productName;
    }

    /**
     * @param productName
     *            null.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /** @return null. */
    @Column(name = "PRODUCT_MODEL", length = 50)
    public String getProductModel() {
        return this.productModel;
    }

    /**
     * @param productModel
     *            null.
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    /** @return null. */
    @Column(name = "PRODUCT_PRICE")
    public Integer getProductPrice() {
        return this.productPrice;
    }

    /**
     * @param productPrice
     *            null.
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /** @return null. */
    @Column(name = "PRODUCT_NUM")
    public Integer getProductNum() {
        return this.productNum;
    }

    /**
     * @param productNum
     *            null.
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /** @return 备注. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            备注.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "skuInfo")
    public Set<StockInfo> getStockInfos() {
        return this.stockInfos;
    }

    /**
     * @param stockInfos
     *            .
     */
    public void setStockInfos(Set<StockInfo> stockInfos) {
        this.stockInfos = stockInfos;
    }
}
