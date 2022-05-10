package com.ruoyi.mes.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物料管理对象 mes_bom
 *
 * @author cyj
 * @date 2022-05-06
 */
public class MesBom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物料id */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNo;

    /** 物料等级 */
    private String materialLevel;

    /** 工作站编号 */
    private String stationNo;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String productNo;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 物料编码 */
    @Excel(name = "物料编码")
    private String materialNo;

    /** 物料描述 */
    @Excel(name = "物料描述")
    private String materialDesc;

    /** 产品个数 */
    @Excel(name = "产品个数")
    private Long productNum;

    /** 产品单位 */
    @Excel(name = "产品单位")
    private String productUnit;

    /** 工时 */
    private String workingHours;

    /** 生产厂家，供应商 */
    private String manufacturer;

    /** 产品重量 */
    private String productWeight;

    /** $column.columnComment */
    private String department;

    /** 状态 */
    private String status;

    /** 创建者 */
    private String createUser;

    /** 修改者 */
    private Date modifyTime;

    /** 修改时间 */
    private String modifyUser;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo()
    {
        return orderNo;
    }
    public void setMaterialLevel(String materialLevel)
    {
        this.materialLevel = materialLevel;
    }

    public String getMaterialLevel()
    {
        return materialLevel;
    }
    public void setStationNo(String stationNo)
    {
        this.stationNo = stationNo;
    }

    public String getStationNo()
    {
        return stationNo;
    }
    public void setProductNo(String productNo)
    {
        this.productNo = productNo;
    }

    public String getProductNo()
    {
        return productNo;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }
    public void setMaterialNo(String materialNo)
    {
        this.materialNo = materialNo;
    }

    public String getMaterialNo()
    {
        return materialNo;
    }
    public void setMaterialDesc(String materialDesc)
    {
        this.materialDesc = materialDesc;
    }

    public String getMaterialDesc()
    {
        return materialDesc;
    }
    public void setProductNum(Long productNum)
    {
        this.productNum = productNum;
    }

    public Long getProductNum()
    {
        return productNum;
    }
    public void setProductUnit(String productUnit)
    {
        this.productUnit = productUnit;
    }

    public String getProductUnit()
    {
        return productUnit;
    }
    public void setWorkingHours(String workingHours)
    {
        this.workingHours = workingHours;
    }

    public String getWorkingHours()
    {
        return workingHours;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setProductWeight(String productWeight)
    {
        this.productWeight = productWeight;
    }

    public String getProductWeight()
    {
        return productWeight;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setCreateUser(String createUser)
    {
        this.createUser = createUser;
    }

    public String getCreateUser()
    {
        return createUser;
    }
    public void setModifyTime(Date modifyTime)
    {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime()
    {
        return modifyTime;
    }
    public void setModifyUser(String modifyUser)
    {
        this.modifyUser = modifyUser;
    }

    public String getModifyUser()
    {
        return modifyUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("materialLevel", getMaterialLevel())
            .append("stationNo", getStationNo())
            .append("productNo", getProductNo())
            .append("productName", getProductName())
            .append("materialNo", getMaterialNo())
            .append("materialDesc", getMaterialDesc())
            .append("productNum", getProductNum())
            .append("productUnit", getProductUnit())
            .append("workingHours", getWorkingHours())
            .append("manufacturer", getManufacturer())
            .append("productWeight", getProductWeight())
            .append("department", getDepartment())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("modifyTime", getModifyTime())
            .append("modifyUser", getModifyUser())
            .toString();
    }
}
