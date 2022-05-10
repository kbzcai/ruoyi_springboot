package com.ruoyi.dashboard.controller;


import com.ruoyi.dashboard.VO.PlcDataNumVo;
import com.ruoyi.dashboard.service.MesDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/mainDashboard")
public class MesDashboardController {

    @Autowired
    private MesDashboardService mesDashboardService;

    @CrossOrigin
    @GetMapping("/getNum/{start}/{end}")
    public List<PlcDataNumVo> getNum(@PathVariable("start") Integer start, @PathVariable("end") Integer end) {
        System.out.println(start);
        System.out.println(end);
        List<PlcDataNumVo> plcDataNumVoList = mesDashboardService.getNum(start, end);
        System.out.println(plcDataNumVoList);
        return plcDataNumVoList;
    }
}
