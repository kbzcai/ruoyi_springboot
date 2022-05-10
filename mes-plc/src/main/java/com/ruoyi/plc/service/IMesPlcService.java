package com.ruoyi.plc.service;

import java.util.List;
import com.ruoyi.plc.domain.MesPlc;

/**
 * plc数据Service接口
 * 
 * @author cyj
 * @date 2022-05-06
 */
public interface IMesPlcService 
{
    /**
     * 查询plc数据
     * 
     * @param id plc数据主键
     * @return plc数据
     */
    public MesPlc selectMesPlcById(Long id);

    /**
     * 查询plc数据列表
     * 
     * @param mesPlc plc数据
     * @return plc数据集合
     */
    public List<MesPlc> selectMesPlcList(MesPlc mesPlc);

    /**
     * 新增plc数据
     * 
     * @param mesPlc plc数据
     * @return 结果
     */
    public int insertMesPlc(MesPlc mesPlc);

    /**
     * 修改plc数据
     * 
     * @param mesPlc plc数据
     * @return 结果
     */
    public int updateMesPlc(MesPlc mesPlc);

    /**
     * 批量删除plc数据
     * 
     * @param ids 需要删除的plc数据主键集合
     * @return 结果
     */
    public int deleteMesPlcByIds(Long[] ids);

    /**
     * 删除plc数据信息
     * 
     * @param id plc数据主键
     * @return 结果
     */
    public int deleteMesPlcById(Long id);
}
