package com.ruoyi.depository.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.depository.mapper.DepositoryGoodsMapper;
import com.ruoyi.depository.domain.DepositoryGoods;
import com.ruoyi.depository.service.IDepositoryGoodsService;

/**
 * 货物Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-05
 */
@Service
public class DepositoryGoodsServiceImpl implements IDepositoryGoodsService 
{
    @Autowired
    private DepositoryGoodsMapper depositoryGoodsMapper;

    /**
     * 查询货物
     * 
     * @param goodsId 货物主键
     * @return 货物
     */
    @Override
    public DepositoryGoods selectDepositoryGoodsByGoodsId(Long goodsId)
    {
        return depositoryGoodsMapper.selectDepositoryGoodsByGoodsId(goodsId);
    }

    /**
     * 查询货物列表
     * 
     * @param depositoryGoods 货物
     * @return 货物
     */
    @Override
    public List<DepositoryGoods> selectDepositoryGoodsList(DepositoryGoods depositoryGoods)
    {
        return depositoryGoodsMapper.selectDepositoryGoodsList(depositoryGoods);
    }

    /**
     * 新增货物
     * 
     * @param depositoryGoods 货物
     * @return 结果
     */
    @Override
    public int insertDepositoryGoods(DepositoryGoods depositoryGoods)
    {
        return depositoryGoodsMapper.insertDepositoryGoods(depositoryGoods);
    }

    /**
     * 修改货物
     * 
     * @param depositoryGoods 货物
     * @return 结果
     */
    @Override
    public int updateDepositoryGoods(DepositoryGoods depositoryGoods)
    {
        return depositoryGoodsMapper.updateDepositoryGoods(depositoryGoods);
    }

    /**
     * 批量删除货物
     * 
     * @param goodsIds 需要删除的货物主键
     * @return 结果
     */
    @Override
    public int deleteDepositoryGoodsByGoodsIds(Long[] goodsIds)
    {
        return depositoryGoodsMapper.deleteDepositoryGoodsByGoodsIds(goodsIds);
    }

    /**
     * 删除货物信息
     * 
     * @param goodsId 货物主键
     * @return 结果
     */
    @Override
    public int deleteDepositoryGoodsByGoodsId(Long goodsId)
    {
        return depositoryGoodsMapper.deleteDepositoryGoodsByGoodsId(goodsId);
    }
}
