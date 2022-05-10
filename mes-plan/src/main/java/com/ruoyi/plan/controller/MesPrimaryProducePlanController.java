package com.ruoyi.plan.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.plan.domain.MesPrimaryProducePlan;
import com.ruoyi.plan.service.IMesPrimaryProducePlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 计划管理Controller
 *
 * @author cyj
 * @date 2022-05-07
 */
@RestController
@RequestMapping("/produceManage/plan")
public class MesPrimaryProducePlanController extends BaseController
{
    @Autowired
    private IMesPrimaryProducePlanService mesPrimaryProducePlanService;

    /**
     * 查询计划管理列表
     */
    @PreAuthorize("@ss.hasPermi('produceManage:plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        startPage();
        List<MesPrimaryProducePlan> list = mesPrimaryProducePlanService.selectMesPrimaryProducePlanList(mesPrimaryProducePlan);
        return getDataTable(list);
    }

    /**
     * 导出计划管理列表
     */
    @PreAuthorize("@ss.hasPermi('produceManage:plan:export')")
    @Log(title = "计划管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        List<MesPrimaryProducePlan> list = mesPrimaryProducePlanService.selectMesPrimaryProducePlanList(mesPrimaryProducePlan);
        ExcelUtil<MesPrimaryProducePlan> util = new ExcelUtil<MesPrimaryProducePlan>(MesPrimaryProducePlan.class);
        util.exportExcel(response, list, "计划管理数据");
    }

    /**
     * 获取计划管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('produceManage:plan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(mesPrimaryProducePlanService.selectMesPrimaryProducePlanById(id));
    }

    /**
     * 新增计划管理
     */
    @PreAuthorize("@ss.hasPermi('produceManage:plan:add')")
    @Log(title = "计划管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        return toAjax(mesPrimaryProducePlanService.insertMesPrimaryProducePlan(mesPrimaryProducePlan));
    }

    /**
     * 修改计划管理
     */
    @PreAuthorize("@ss.hasPermi('produceManage:plan:edit')")
    @Log(title = "计划管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesPrimaryProducePlan mesPrimaryProducePlan)
    {
        System.out.println(mesPrimaryProducePlan.getId());
        return toAjax(mesPrimaryProducePlanService.updateMesPrimaryProducePlan(mesPrimaryProducePlan));
    }

    /**
     * 删除计划管理
     */
    @PreAuthorize("@ss.hasPermi('produceManage:plan:remove')")
    @Log(title = "计划管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesPrimaryProducePlanService.deleteMesPrimaryProducePlanByIds(ids));
    }
}
