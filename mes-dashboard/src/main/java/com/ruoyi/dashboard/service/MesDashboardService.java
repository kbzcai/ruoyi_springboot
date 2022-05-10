package com.ruoyi.dashboard.service;

import com.ruoyi.dashboard.VO.PlcDataNumVo;

import java.util.List;

public interface MesDashboardService {
    List<PlcDataNumVo> getNum(Integer from, Integer to);
}
