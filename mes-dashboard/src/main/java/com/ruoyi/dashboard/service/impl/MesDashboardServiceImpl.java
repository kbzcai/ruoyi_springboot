package com.ruoyi.dashboard.service.impl;

import com.ruoyi.dashboard.VO.PlcDataNumVo;
import com.ruoyi.plc.domain.MesPlc;
import com.ruoyi.plc.mapper.MesPlcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.dashboard.service.MesDashboardService;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MesDashboardServiceImpl implements MesDashboardService {

    @Autowired
    private MesPlcMapper mesPlcMapper;

    @Override
    public List<PlcDataNumVo> getNum(Integer from, Integer to) {
        List<PlcDataNumVo> list = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            MesPlc plc = mesPlcMapper.getNumData(i);
            list.add(new PlcDataNumVo(plc.getProdNum().intValue(), plc.getProdNumb().intValue()));
        }
        return list;
    }
}
