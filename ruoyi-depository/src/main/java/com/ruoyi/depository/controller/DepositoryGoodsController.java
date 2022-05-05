package com.ruoyi.depository.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.depository.domain.DepositoryGoods;
import com.ruoyi.depository.service.IDepositoryGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 货物Controller
 *
 * @author ruoyi
 * @date 2022-05-05
 */
@RestController
@RequestMapping("/depository/goods")
public class DepositoryGoodsController extends BaseController
{
    @Autowired
    private IDepositoryGoodsService depositoryGoodsService;

    /**
     * 查询货物列表
     */
    @PreAuthorize("@ss.hasPermi('depository:goods:list')")
    @GetMapping("/list")
    public TableDataInfo list(DepositoryGoods depositoryGoods)
    {
        startPage();
        List<DepositoryGoods> list = depositoryGoodsService.selectDepositoryGoodsList(depositoryGoods);
        return getDataTable(list);
    }

    /**
     * 导出货物列表
     */
    @PreAuthorize("@ss.hasPermi('depository:goods:export')")
    @Log(title = "货物", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DepositoryGoods depositoryGoods)
    {
        List<DepositoryGoods> list = depositoryGoodsService.selectDepositoryGoodsList(depositoryGoods);
        ExcelUtil<DepositoryGoods> util = new ExcelUtil<DepositoryGoods>(DepositoryGoods.class);
        util.exportExcel(response, list, "货物数据");
    }

    /**
     * 获取货物详细信息
     */
    @PreAuthorize("@ss.hasPermi('depository:goods:query')")
    @GetMapping(value = "/{goodsId}")
    public AjaxResult getInfo(@PathVariable("goodsId") Long goodsId)
    {
        return AjaxResult.success(depositoryGoodsService.selectDepositoryGoodsByGoodsId(goodsId));
    }

    /**
     * 新增货物
     */
    @PreAuthorize("@ss.hasPermi('depository:goods:add')")
    @Log(title = "货物", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DepositoryGoods depositoryGoods)
    {
        return toAjax(depositoryGoodsService.insertDepositoryGoods(depositoryGoods));
    }

    /**
     * 修改货物
     */
    @PreAuthorize("@ss.hasPermi('depository:goods:edit')")
    @Log(title = "货物", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DepositoryGoods depositoryGoods)
    {
        return toAjax(depositoryGoodsService.updateDepositoryGoods(depositoryGoods));
    }

    /**
     * 删除货物
     */
    @PreAuthorize("@ss.hasPermi('depository:goods:remove')")
    @Log(title = "货物", businessType = BusinessType.DELETE)
	@DeleteMapping("/{goodsIds}")
    public AjaxResult remove(@PathVariable Long[] goodsIds)
    {
        return toAjax(depositoryGoodsService.deleteDepositoryGoodsByGoodsIds(goodsIds));
    }
}
