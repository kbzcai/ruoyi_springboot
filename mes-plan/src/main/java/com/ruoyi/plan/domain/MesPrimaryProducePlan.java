package com.ruoyi.plan.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 计划管理对象 mes_primary_produce_plan
 *
 * @author cyj
 * @date 2022-05-07
 */
public class MesPrimaryProducePlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 计划id */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /** 产品型号 */
    @Excel(name = "产品型号")
    private String productNo;

    /** 订单编号 */
    private String orderNo;

    /** 计划号 */
    @Excel(name = "计划号")
    private String planNo;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planDate;

    /** 计划班次 */
    @Excel(name = "计划班次")
    private String planSchedule;

    /** 计划数量 */
    @Excel(name = "计划数量")
    private Long planNum;

    /** 实际数量 */
    @Excel(name = "实际数量")
    private Long actualNum;

    /** 合格数量 */
    private Long passNum;

    /** 焊接完成数量 */
    @Excel(name = "焊接完成数量")
    private Long weldingFinishNum;

    /** 不合格数量 */
    @Excel(name = "不合格数量")
    private Long failNum;

    /** 0:未生产  1：已生产   2：生产中 */
    private String planStatus;

    /**  */
    private String productBom;

    /** 是否导入bom */
    private String bomImport;

    /**  */
    private Long orderSort;

    /** 状态 */
    private String status;

    /** 创建者 */
    private String createUser;

    /** 修改者 */
    private String modifyUser;

    /** 修改时间 */
    private Date modifyTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setProductNo(String productNo)
    {
        this.productNo = productNo;
    }

    public String getProductNo()
    {
        return productNo;
    }
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo()
    {
        return orderNo;
    }
    public void setPlanNo(String planNo)
    {
        this.planNo = planNo;
    }

    public String getPlanNo()
    {
        return planNo;
    }
    public void setPlanDate(Date planDate)
    {
        this.planDate = planDate;
    }

    public Date getPlanDate()
    {
        return planDate;
    }
    public void setPlanSchedule(String planSchedule)
    {
        this.planSchedule = planSchedule;
    }

    public String getPlanSchedule()
    {
        return planSchedule;
    }
    public void setPlanNum(Long planNum)
    {
        this.planNum = planNum;
    }

    public Long getPlanNum()
    {
        return planNum;
    }
    public void setActualNum(Long actualNum)
    {
        this.actualNum = actualNum;
    }

    public Long getActualNum()
    {
        return actualNum;
    }
    public void setPassNum(Long passNum)
    {
        this.passNum = passNum;
    }

    public Long getPassNum()
    {
        return passNum;
    }
    public void setWeldingFinishNum(Long weldingFinishNum)
    {
        this.weldingFinishNum = weldingFinishNum;
    }

    public Long getWeldingFinishNum()
    {
        return weldingFinishNum;
    }
    public void setFailNum(Long failNum)
    {
        this.failNum = failNum;
    }

    public Long getFailNum()
    {
        return failNum;
    }
    public void setPlanStatus(String planStatus)
    {
        this.planStatus = planStatus;
    }

    public String getPlanStatus()
    {
        return planStatus;
    }
    public void setProductBom(String productBom)
    {
        this.productBom = productBom;
    }

    public String getProductBom()
    {
        return productBom;
    }
    public void setBomImport(String bomImport)
    {
        this.bomImport = bomImport;
    }

    public String getBomImport()
    {
        return bomImport;
    }
    public void setOrderSort(Long orderSort)
    {
        this.orderSort = orderSort;
    }

    public Long getOrderSort()
    {
        return orderSort;
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
    public void setModifyUser(String modifyUser)
    {
        this.modifyUser = modifyUser;
    }

    public String getModifyUser()
    {
        return modifyUser;
    }
    public void setModifyTime(Date modifyTime)
    {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime()
    {
        return modifyTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productNo", getProductNo())
            .append("orderNo", getOrderNo())
            .append("planNo", getPlanNo())
            .append("planDate", getPlanDate())
            .append("planSchedule", getPlanSchedule())
            .append("planNum", getPlanNum())
            .append("actualNum", getActualNum())
            .append("passNum", getPassNum())
            .append("weldingFinishNum", getWeldingFinishNum())
            .append("failNum", getFailNum())
            .append("planStatus", getPlanStatus())
            .append("productBom", getProductBom())
            .append("bomImport", getBomImport())
            .append("orderSort", getOrderSort())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("createUser", getCreateUser())
            .append("modifyUser", getModifyUser())
            .append("modifyTime", getModifyTime())
            .toString();
    }
}
