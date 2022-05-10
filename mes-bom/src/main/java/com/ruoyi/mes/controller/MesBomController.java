package com.ruoyi.mes.controller;

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
import com.ruoyi.mes.domain.MesBom;
import com.ruoyi.mes.service.IMesBomService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料管理Controller
 * 
 * @author cyj
 * @date 2022-05-06
 */
@RestController
@RequestMapping("/bomManage/bom")
public class MesBomController extends BaseController
{
    @Autowired
    private IMesBomService mesBomService;

    /**
     * 查询物料管理列表
     */
    @PreAuthorize("@ss.hasPermi('bomManage:bom:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesBom mesBom)
    {
        startPage();
        List<MesBom> list = mesBomService.selectMesBomList(mesBom);
        return getDataTable(list);
    }

    /**
     * 导出物料管理列表
     */
    @PreAuthorize("@ss.hasPermi('bomManage:bom:export')")
    @Log(title = "物料管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesBom mesBom)
    {
        List<MesBom> list = mesBomService.selectMesBomList(mesBom);
        ExcelUtil<MesBom> util = new ExcelUtil<MesBom>(MesBom.class);
        util.exportExcel(response, list, "物料管理数据");
    }

    /**
     * 获取物料管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('bomManage:bom:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(mesBomService.selectMesBomById(id));
    }

    /**
     * 新增物料管理
     */
    @PreAuthorize("@ss.hasPermi('bomManage:bom:add')")
    @Log(title = "物料管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesBom mesBom)
    {
        return toAjax(mesBomService.insertMesBom(mesBom));
    }

    /**
     * 修改物料管理
     */
    @PreAuthorize("@ss.hasPermi('bomManage:bom:edit')")
    @Log(title = "物料管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesBom mesBom)
    {
        return toAjax(mesBomService.updateMesBom(mesBom));
    }

    /**
     * 删除物料管理
     */
    @PreAuthorize("@ss.hasPermi('bomManage:bom:remove')")
    @Log(title = "物料管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesBomService.deleteMesBomByIds(ids));
    }
}
