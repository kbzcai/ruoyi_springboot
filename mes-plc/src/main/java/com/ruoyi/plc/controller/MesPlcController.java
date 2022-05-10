package com.ruoyi.plc.controller;

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
import com.ruoyi.plc.domain.MesPlc;
import com.ruoyi.plc.service.IMesPlcService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * plc数据Controller
 * 
 * @author cyj
 * @date 2022-05-06
 */
@RestController
@RequestMapping("/equipmentManage/plc")
public class MesPlcController extends BaseController
{
    @Autowired
    private IMesPlcService mesPlcService;

    /**
     * 查询plc数据列表
     */
    @PreAuthorize("@ss.hasPermi('equipmentManage:plc:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesPlc mesPlc)
    {
        startPage();
        List<MesPlc> list = mesPlcService.selectMesPlcList(mesPlc);
        return getDataTable(list);
    }

    /**
     * 导出plc数据列表
     */
    @PreAuthorize("@ss.hasPermi('equipmentManage:plc:export')")
    @Log(title = "plc数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesPlc mesPlc)
    {
        List<MesPlc> list = mesPlcService.selectMesPlcList(mesPlc);
        ExcelUtil<MesPlc> util = new ExcelUtil<MesPlc>(MesPlc.class);
        util.exportExcel(response, list, "plc数据数据");
    }

    /**
     * 获取plc数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('equipmentManage:plc:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(mesPlcService.selectMesPlcById(id));
    }

    /**
     * 新增plc数据
     */
    @PreAuthorize("@ss.hasPermi('equipmentManage:plc:add')")
    @Log(title = "plc数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesPlc mesPlc)
    {
        return toAjax(mesPlcService.insertMesPlc(mesPlc));
    }

    /**
     * 修改plc数据
     */
    @PreAuthorize("@ss.hasPermi('equipmentManage:plc:edit')")
    @Log(title = "plc数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesPlc mesPlc)
    {
        return toAjax(mesPlcService.updateMesPlc(mesPlc));
    }

    /**
     * 删除plc数据
     */
    @PreAuthorize("@ss.hasPermi('equipmentManage:plc:remove')")
    @Log(title = "plc数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesPlcService.deleteMesPlcByIds(ids));
    }
}
