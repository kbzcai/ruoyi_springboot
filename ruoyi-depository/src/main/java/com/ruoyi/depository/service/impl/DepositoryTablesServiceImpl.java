package com.ruoyi.depository.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.depository.mapper.DepositoryTablesMapper;
import com.ruoyi.depository.domain.DepositoryTables;
import com.ruoyi.depository.service.IDepositoryTablesService;

/**
 * 仓库Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-05
 */
@Service
public class DepositoryTablesServiceImpl implements IDepositoryTablesService 
{
    @Autowired
    private DepositoryTablesMapper depositoryTablesMapper;

    /**
     * 查询仓库
     * 
     * @param depositoryId 仓库主键
     * @return 仓库
     */
    @Override
    public DepositoryTables selectDepositoryTablesByDepositoryId(Long depositoryId)
    {
        return depositoryTablesMapper.selectDepositoryTablesByDepositoryId(depositoryId);
    }

    /**
     * 查询仓库列表
     * 
     * @param depositoryTables 仓库
     * @return 仓库
     */
    @Override
    public List<DepositoryTables> selectDepositoryTablesList(DepositoryTables depositoryTables)
    {
        return depositoryTablesMapper.selectDepositoryTablesList(depositoryTables);
    }

    /**
     * 新增仓库
     * 
     * @param depositoryTables 仓库
     * @return 结果
     */
    @Override
    public int insertDepositoryTables(DepositoryTables depositoryTables)
    {
        return depositoryTablesMapper.insertDepositoryTables(depositoryTables);
    }

    /**
     * 修改仓库
     * 
     * @param depositoryTables 仓库
     * @return 结果
     */
    @Override
    public int updateDepositoryTables(DepositoryTables depositoryTables)
    {
        return depositoryTablesMapper.updateDepositoryTables(depositoryTables);
    }

    /**
     * 批量删除仓库
     * 
     * @param depositoryIds 需要删除的仓库主键
     * @return 结果
     */
    @Override
    public int deleteDepositoryTablesByDepositoryIds(Long[] depositoryIds)
    {
        return depositoryTablesMapper.deleteDepositoryTablesByDepositoryIds(depositoryIds);
    }

    /**
     * 删除仓库信息
     * 
     * @param depositoryId 仓库主键
     * @return 结果
     */
    @Override
    public int deleteDepositoryTablesByDepositoryId(Long depositoryId)
    {
        return depositoryTablesMapper.deleteDepositoryTablesByDepositoryId(depositoryId);
    }
}
