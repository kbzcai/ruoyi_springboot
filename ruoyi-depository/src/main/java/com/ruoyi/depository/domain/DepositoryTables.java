package com.ruoyi.depository.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 仓库对象 depository_tables
 * 
 * @author ruoyi
 * @date 2022-05-05
 */
public class DepositoryTables extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 仓库ID */
    private Long depositoryId;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String depositoryName;

    /** 仓库地址 */
    @Excel(name = "仓库地址")
    private String depositoryAddress;

    /** 仓库拥有者id */
    @Excel(name = "仓库拥有者id")
    private Long depositoryOwnerId;

    public void setDepositoryId(Long depositoryId) 
    {
        this.depositoryId = depositoryId;
    }

    public Long getDepositoryId() 
    {
        return depositoryId;
    }
    public void setDepositoryName(String depositoryName) 
    {
        this.depositoryName = depositoryName;
    }

    public String getDepositoryName() 
    {
        return depositoryName;
    }
    public void setDepositoryAddress(String depositoryAddress) 
    {
        this.depositoryAddress = depositoryAddress;
    }

    public String getDepositoryAddress() 
    {
        return depositoryAddress;
    }
    public void setDepositoryOwnerId(Long depositoryOwnerId) 
    {
        this.depositoryOwnerId = depositoryOwnerId;
    }

    public Long getDepositoryOwnerId() 
    {
        return depositoryOwnerId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("depositoryId", getDepositoryId())
            .append("depositoryName", getDepositoryName())
            .append("depositoryAddress", getDepositoryAddress())
            .append("depositoryOwnerId", getDepositoryOwnerId())
            .toString();
    }
}
