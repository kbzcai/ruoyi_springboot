package com.ruoyi.plan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.plan.mapper.MesPrimaryProducePlanMapper;
import com.ruoyi.plan.domain.MesPrimaryProducePlan;
import com.ruoyi.plan.service.IMesPrimaryProducePlanService;

/**
 * 计划管理Service业务层处理
 * 
 * @author cyj
 * @date 2022-05-07
 */
@Service
public class MesPrimaryProducePlanServiceImpl implements IMesPrimaryProducePlanService 
{
    @Autowired
    private MesPrimaryProducePlanMapper mesPrimaryProducePlanMapper;

    /**
     * 查询计划管理
     * 
     * @param id 计划管理主键
     * @return 计划管理
     */
    @Override
    public MesPrimaryProducePlan selectMesPrimaryProducePlanById(Long id)
    {
        return mesPrimaryProducePlanMapper.selectMesPrimaryProducePlanById(id);
    }

    /**
     * 查询计划管理列表
     * 
     * @param mesPrimaryProducePlan 计划管理
     * @return 计划管理
     */
    @Override
    public List<MesPrimaryProducePlan> selectMesPrimaryProducePlanList(MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        return mesPrimaryProducePlanMapper.selectMesPrimaryProducePlanList(mesPrimaryProducePlan);
    }

    /**
     * 新增计划管理
     * 
     * @param mesPrimaryProducePlan 计划管理
     * @return 结果
     */
    @Override
    public int insertMesPrimaryProducePlan(MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        mesPrimaryProducePlan.setCreateTime(DateUtils.getNowDate());
        return mesPrimaryProducePlanMapper.insertMesPrimaryProducePlan(mesPrimaryProducePlan);
    }

    /**
     * 修改计划管理
     * 
     * @param mesPrimaryProducePlan 计划管理
     * @return 结果
     */
    @Override
    public int updateMesPrimaryProducePlan(MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        return mesPrimaryProducePlanMapper.updateMesPrimaryProducePlan(mesPrimaryProducePlan);
    }

    /**
     * 批量删除计划管理
     * 
     * @param ids 需要删除的计划管理主键
     * @return 结果
     */
    @Override
    public int deleteMesPrimaryProducePlanByIds(Long[] ids)
    {
        return mesPrimaryProducePlanMapper.deleteMesPrimaryProducePlanByIds(ids);
    }

    /**
     * 删除计划管理信息
     * 
     * @param id 计划管理主键
     * @return 结果
     */
    @Override
    public int deleteMesPrimaryProducePlanById(Long id)
    {
        return mesPrimaryProducePlanMapper.deleteMesPrimaryProducePlanById(id);
    }
}
