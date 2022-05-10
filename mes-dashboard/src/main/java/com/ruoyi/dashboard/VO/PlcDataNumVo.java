package com.ruoyi.dashboard.VO;

import lombok.Data;

@Data
public class PlcDataNumVo {
    private String plcName;
    private Integer prodNumA;
    private Integer prodNumB;

    public PlcDataNumVo(Integer prodNumA, Integer prodNumB) {
        this.prodNumA = prodNumA;
        this.prodNumB = prodNumB;
    }
}
