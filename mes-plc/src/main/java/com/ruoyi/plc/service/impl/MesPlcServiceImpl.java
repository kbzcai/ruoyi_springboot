package com.ruoyi.plc.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.plc.mapper.MesPlcMapper;
import com.ruoyi.plc.domain.MesPlc;
import com.ruoyi.plc.service.IMesPlcService;

/**
 * plc数据Service业务层处理
 * 
 * @author cyj
 * @date 2022-05-06
 */
@Service
public class MesPlcServiceImpl implements IMesPlcService 
{
    @Autowired
    private MesPlcMapper mesPlcMapper;

    /**
     * 查询plc数据
     * 
     * @param id plc数据主键
     * @return plc数据
     */
    @Override
    public MesPlc selectMesPlcById(Long id)
    {
        return mesPlcMapper.selectMesPlcById(id);
    }

    /**
     * 查询plc数据列表
     * 
     * @param mesPlc plc数据
     * @return plc数据
     */
    @Override
    public List<MesPlc> selectMesPlcList(MesPlc mesPlc)
    {
        return mesPlcMapper.selectMesPlcList(mesPlc);
    }

    /**
     * 新增plc数据
     * 
     * @param mesPlc plc数据
     * @return 结果
     */
    @Override
    public int insertMesPlc(MesPlc mesPlc)
    {
        mesPlc.setCreateTime(DateUtils.getNowDate());
        return mesPlcMapper.insertMesPlc(mesPlc);
    }

    /**
     * 修改plc数据
     * 
     * @param mesPlc plc数据
     * @return 结果
     */
    @Override
    public int updateMesPlc(MesPlc mesPlc)
    {
        return mesPlcMapper.updateMesPlc(mesPlc);
    }

    /**
     * 批量删除plc数据
     * 
     * @param ids 需要删除的plc数据主键
     * @return 结果
     */
    @Override
    public int deleteMesPlcByIds(Long[] ids)
    {
        return mesPlcMapper.deleteMesPlcByIds(ids);
    }

    /**
     * 删除plc数据信息
     * 
     * @param id plc数据主键
     * @return 结果
     */
    @Override
    public int deleteMesPlcById(Long id)
    {
        return mesPlcMapper.deleteMesPlcById(id);
    }
}
