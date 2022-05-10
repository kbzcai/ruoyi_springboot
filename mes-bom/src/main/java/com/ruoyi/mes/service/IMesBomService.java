package com.ruoyi.mes.service;

import java.util.List;
import com.ruoyi.mes.domain.MesBom;

/**
 * 物料管理Service接口
 * 
 * @author cyj
 * @date 2022-05-06
 */
public interface IMesBomService 
{
    /**
     * 查询物料管理
     * 
     * @param id 物料管理主键
     * @return 物料管理
     */
    public MesBom selectMesBomById(Long id);

    /**
     * 查询物料管理列表
     * 
     * @param mesBom 物料管理
     * @return 物料管理集合
     */
    public List<MesBom> selectMesBomList(MesBom mesBom);

    /**
     * 新增物料管理
     * 
     * @param mesBom 物料管理
     * @return 结果
     */
    public int insertMesBom(MesBom mesBom);

    /**
     * 修改物料管理
     * 
     * @param mesBom 物料管理
     * @return 结果
     */
    public int updateMesBom(MesBom mesBom);

    /**
     * 批量删除物料管理
     * 
     * @param ids 需要删除的物料管理主键集合
     * @return 结果
     */
    public int deleteMesBomByIds(Long[] ids);

    /**
     * 删除物料管理信息
     * 
     * @param id 物料管理主键
     * @return 结果
     */
    public int deleteMesBomById(Long id);
}
