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
import com.ruoyi.depository.domain.DepositoryTables;
import com.ruoyi.depository.service.IDepositoryTablesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 仓库Controller
 *
 * @author ruoyi
 * @date 2022-05-05
 */
@RestController
@RequestMapping("/depository/tables")
public class DepositoryTablesController extends BaseController
{
    @Autowired
    private IDepositoryTablesService depositoryTablesService;

    /**
     * 查询仓库列表
     */
    @PreAuthorize("@ss.hasPermi('depository:tables:list')")
    @GetMapping("/list")
    public TableDataInfo list(DepositoryTables depositoryTables)
    {
        startPage();
        List<DepositoryTables> list = depositoryTablesService.selectDepositoryTablesList(depositoryTables);
        return getDataTable(list);
    }

    /**
     * 导出仓库列表
     */
    @PreAuthorize("@ss.hasPermi('depository:tables:export')")
    @Log(title = "仓库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DepositoryTables depositoryTables)
    {
        List<DepositoryTables> list = depositoryTablesService.selectDepositoryTablesList(depositoryTables);
        ExcelUtil<DepositoryTables> util = new ExcelUtil<DepositoryTables>(DepositoryTables.class);
        util.exportExcel(response, list, "仓库数据");
    }

    /**
     * 获取仓库详细信息
     */
    @PreAuthorize("@ss.hasPermi('depository:tables:query')")
    @GetMapping(value = "/{depositoryId}")
    public AjaxResult getInfo(@PathVariable("depositoryId") Long depositoryId)
    {
        return AjaxResult.success(depositoryTablesService.selectDepositoryTablesByDepositoryId(depositoryId));
    }

    /**
     * 新增仓库
     */
    @PreAuthorize("@ss.hasPermi('depository:tables:add')")
    @Log(title = "仓库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DepositoryTables depositoryTables)
    {
        return toAjax(depositoryTablesService.insertDepositoryTables(depositoryTables));
    }

    /**
     * 修改仓库
     */
    @PreAuthorize("@ss.hasPermi('depository:tables:edit')")
    @Log(title = "仓库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DepositoryTables depositoryTables)
    {
        return toAjax(depositoryTablesService.updateDepositoryTables(depositoryTables));
    }

    /**
     * 删除仓库
     */
    @PreAuthorize("@ss.hasPermi('depository:tables:remove')")
    @Log(title = "仓库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{depositoryIds}")
    public AjaxResult remove(@PathVariable Long[] depositoryIds)
    {
        return toAjax(depositoryTablesService.deleteDepositoryTablesByDepositoryIds(depositoryIds));
    }
}
