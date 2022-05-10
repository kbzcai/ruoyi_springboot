package com.ruoyi.plc.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.ruoyi.plc.domain.MesPlc;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * plc数据Mapper接口
 *
 * @author cyj
 * @date 2022-05-06
 */
@Repository
public interface MesPlcMapper
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
     * 删除plc数据
     *
     * @param id plc数据主键
     * @return 结果
     */
    public int deleteMesPlcById(Long id);

    /**
     * 批量删除plc数据
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesPlcByIds(Long[] ids);


    public MesPlc getNumData(Integer plcNumber);
//    @Select("SELECT * FROM mes_plc where plc_number = ${plcNumber} order by create_time desc LIMIT 1")
//    MesPlc getNumData(@Param("plcNumber") Integer plc_number);
}
