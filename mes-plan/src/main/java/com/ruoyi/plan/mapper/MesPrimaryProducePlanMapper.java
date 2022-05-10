package com.ruoyi.plan.mapper;

import java.util.List;
import com.ruoyi.plan.domain.MesPrimaryProducePlan;

/**
 * 计划管理Mapper接口
 * 
 * @author cyj
 * @date 2022-05-07
 */
public interface MesPrimaryProducePlanMapper 
{
    /**
     * 查询计划管理
     * 
     * @param id 计划管理主键
     * @return 计划管理
     */
    public MesPrimaryProducePlan selectMesPrimaryProducePlanById(Long id);

    /**
     * 查询计划管理列表
     * 
     * @param mesPrimaryProducePlan 计划管理
     * @return 计划管理集合
     */
    public List<MesPrimaryProducePlan> selectMesPrimaryProducePlanList(MesPrimaryProducePlan mesPrimaryProducePlan);

    /**
     * 新增计划管理
     * 
     * @param mesPrimaryProducePlan 计划管理
     * @return 结果
     */
    public int insertMesPrimaryProducePlan(MesPrimaryProducePlan mesPrimaryProducePlan);

    /**
     * 修改计划管理
     * 
     * @param mesPrimaryProducePlan 计划管理
     * @return 结果
     */
    public int updateMesPrimaryProducePlan(MesPrimaryProducePlan mesPrimaryProducePlan);

    /**
     * 删除计划管理
     * 
     * @param id 计划管理主键
     * @return 结果
     */
    public int deleteMesPrimaryProducePlanById(Long id);

    /**
     * 批量删除计划管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesPrimaryProducePlanByIds(Long[] ids);
}
