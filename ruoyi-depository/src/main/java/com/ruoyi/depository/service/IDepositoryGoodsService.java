package com.ruoyi.depository.service;

import java.util.List;
import com.ruoyi.depository.domain.DepositoryGoods;

/**
 * 货物Service接口
 * 
 * @author ruoyi
 * @date 2022-05-05
 */
public interface IDepositoryGoodsService 
{
    /**
     * 查询货物
     * 
     * @param goodsId 货物主键
     * @return 货物
     */
    public DepositoryGoods selectDepositoryGoodsByGoodsId(Long goodsId);

    /**
     * 查询货物列表
     * 
     * @param depositoryGoods 货物
     * @return 货物集合
     */
    public List<DepositoryGoods> selectDepositoryGoodsList(DepositoryGoods depositoryGoods);

    /**
     * 新增货物
     * 
     * @param depositoryGoods 货物
     * @return 结果
     */
    public int insertDepositoryGoods(DepositoryGoods depositoryGoods);

    /**
     * 修改货物
     * 
     * @param depositoryGoods 货物
     * @return 结果
     */
    public int updateDepositoryGoods(DepositoryGoods depositoryGoods);

    /**
     * 批量删除货物
     * 
     * @param goodsIds 需要删除的货物主键集合
     * @return 结果
     */
    public int deleteDepositoryGoodsByGoodsIds(Long[] goodsIds);

    /**
     * 删除货物信息
     * 
     * @param goodsId 货物主键
     * @return 结果
     */
    public int deleteDepositoryGoodsByGoodsId(Long goodsId);
}
