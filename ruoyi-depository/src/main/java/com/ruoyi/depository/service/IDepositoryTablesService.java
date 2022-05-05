package com.ruoyi.depository.service;

import java.util.List;
import com.ruoyi.depository.domain.DepositoryTables;

/**
 * 仓库Service接口
 * 
 * @author ruoyi
 * @date 2022-05-05
 */
public interface IDepositoryTablesService 
{
    /**
     * 查询仓库
     * 
     * @param depositoryId 仓库主键
     * @return 仓库
     */
    public DepositoryTables selectDepositoryTablesByDepositoryId(Long depositoryId);

    /**
     * 查询仓库列表
     * 
     * @param depositoryTables 仓库
     * @return 仓库集合
     */
    public List<DepositoryTables> selectDepositoryTablesList(DepositoryTables depositoryTables);

    /**
     * 新增仓库
     * 
     * @param depositoryTables 仓库
     * @return 结果
     */
    public int insertDepositoryTables(DepositoryTables depositoryTables);

    /**
     * 修改仓库
     * 
     * @param depositoryTables 仓库
     * @return 结果
     */
    public int updateDepositoryTables(DepositoryTables depositoryTables);

    /**
     * 批量删除仓库
     * 
     * @param depositoryIds 需要删除的仓库主键集合
     * @return 结果
     */
    public int deleteDepositoryTablesByDepositoryIds(Long[] depositoryIds);

    /**
     * 删除仓库信息
     * 
     * @param depositoryId 仓库主键
     * @return 结果
     */
    public int deleteDepositoryTablesByDepositoryId(Long depositoryId);
}
