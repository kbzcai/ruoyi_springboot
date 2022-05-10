package com.ruoyi.mes.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mes.mapper.MesBomMapper;
import com.ruoyi.mes.domain.MesBom;
import com.ruoyi.mes.service.IMesBomService;

/**
 * 物料管理Service业务层处理
 * 
 * @author cyj
 * @date 2022-05-06
 */
@Service
public class MesBomServiceImpl implements IMesBomService 
{
    @Autowired
    private MesBomMapper mesBomMapper;

    /**
     * 查询物料管理
     * 
     * @param id 物料管理主键
     * @return 物料管理
     */
    @Override
    public MesBom selectMesBomById(Long id)
    {
        return mesBomMapper.selectMesBomById(id);
    }

    /**
     * 查询物料管理列表
     * 
     * @param mesBom 物料管理
     * @return 物料管理
     */
    @Override
    public List<MesBom> selectMesBomList(MesBom mesBom)
    {
        return mesBomMapper.selectMesBomList(mesBom);
    }

    /**
     * 新增物料管理
     * 
     * @param mesBom 物料管理
     * @return 结果
     */
    @Override
    public int insertMesBom(MesBom mesBom)
    {
        mesBom.setCreateTime(DateUtils.getNowDate());
        return mesBomMapper.insertMesBom(mesBom);
    }

    /**
     * 修改物料管理
     * 
     * @param mesBom 物料管理
     * @return 结果
     */
    @Override
    public int updateMesBom(MesBom mesBom)
    {
        return mesBomMapper.updateMesBom(mesBom);
    }

    /**
     * 批量删除物料管理
     * 
     * @param ids 需要删除的物料管理主键
     * @return 结果
     */
    @Override
    public int deleteMesBomByIds(Long[] ids)
    {
        return mesBomMapper.deleteMesBomByIds(ids);
    }

    /**
     * 删除物料管理信息
     * 
     * @param id 物料管理主键
     * @return 结果
     */
    @Override
    public int deleteMesBomById(Long id)
    {
        return mesBomMapper.deleteMesBomById(id);
    }
}
