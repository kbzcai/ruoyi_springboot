package com.ruoyi.depository.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 货物对象 depository_goods
 * 
 * @author ruoyi
 * @date 2022-05-05
 */
public class DepositoryGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 货物id */
    private Long goodsId;

    /** 仓库id */
    @Excel(name = "仓库id")
    private Long depositoryId;

    /** 分类id */
    @Excel(name = "分类id")
    private Long cateId;

    /** 扩展分类id */
    @Excel(name = "扩展分类id")
    private Long extendCateId;

    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setDepositoryId(Long depositoryId) 
    {
        this.depositoryId = depositoryId;
    }

    public Long getDepositoryId() 
    {
        return depositoryId;
    }
    public void setCateId(Long cateId) 
    {
        this.cateId = cateId;
    }

    public Long getCateId() 
    {
        return cateId;
    }
    public void setExtendCateId(Long extendCateId) 
    {
        this.extendCateId = extendCateId;
    }

    public Long getExtendCateId() 
    {
        return extendCateId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("depositoryId", getDepositoryId())
            .append("cateId", getCateId())
            .append("extendCateId", getExtendCateId())
            .toString();
    }
}
