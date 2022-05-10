package com.ruoyi.plc.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * plc数据对象 mes_plc
 *
 * @author cyj
 * @date 2022-05-06
 */
public class MesPlc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** plc数据id */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /** 产品型号 */
    private String productType;

    /** r1设备状态 */
    private String r1EquipmentStatus;

    /** r2设备状态 */
    private String r2EquipmentStatus;

    /** 故障代码 */
    @Excel(name = "故障代码")
    private String failCode;

    /** A工位记数 */
    @Excel(name = "A工位记数")
    private Long prodNum;

    /** r1程序号 */
    private String r1RobNo;

    /** 枪1当前焊缝号 */
    private String r1WeldLineNo;

    /** 枪1电流 */
    private String r1Electric;

    /** 枪1电压 */
    private String r1Voltage;

    /** 枪1焊缝速度 */
    private String r1Speed;

    /** 枪1JOB号 */
    private String r1Job;

    /** r2程序号 */
    private String r2RobNo;

    /** 枪2当前焊缝号 */
    private String r2WeldLineNo;

    /** 枪2电流 */
    private String r2Electric;

    /** 枪2电压 */
    private String r2Voltage;

    /** 枪2焊缝速度 */
    private String r2Speed;

    /** 枪2JOB号 */
    private String r2Job;

    /** 更换状态 */
    private String replaceStatus;

    /** 枪1保护用气量 */
    private String r1ProtectiveGas;

    /** 枪2保护用气量 */
    private String r2ProtectiveGas;

    /** 枪一焊丝用量 */
    private String r1WeldingWire;

    /** 枪2焊丝用量 */
    private String r2WeldingWire;

    /** $column.columnComment */
    private String loginId;

    /** $column.columnComment */
    private String loginPassword;

    /** 零件状态 */
    private String partStatus;

    /** 预留 */
    private String recerve;

    /** 产品型号2 */
    private String productType2;

    /** B工位计数 */
    @Excel(name = "B工位计数")
    private Long prodNumb;

    /** $column.columnComment */
    private String qualifed;

    /** $column.columnComment */
    private String unaccepted;

    /** $column.columnComment */
    private String switchBut;

    /** $column.columnComment */
    private String player;

    /** plc编号(以现场实际数量为准) */
    @Excel(name = "plc编号(以现场实际数量为准)")
    private Long plcNumber;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setProductType(String productType)
    {
        this.productType = productType;
    }

    public String getProductType()
    {
        return productType;
    }
    public void setR1EquipmentStatus(String r1EquipmentStatus)
    {
        this.r1EquipmentStatus = r1EquipmentStatus;
    }

    public String getR1EquipmentStatus()
    {
        return r1EquipmentStatus;
    }
    public void setR2EquipmentStatus(String r2EquipmentStatus)
    {
        this.r2EquipmentStatus = r2EquipmentStatus;
    }

    public String getR2EquipmentStatus()
    {
        return r2EquipmentStatus;
    }
    public void setFailCode(String failCode)
    {
        this.failCode = failCode;
    }

    public String getFailCode()
    {
        return failCode;
    }
    public void setProdNum(Long prodNum)
    {
        this.prodNum = prodNum;
    }

    public Long getProdNum()
    {
        return prodNum;
    }
    public void setR1RobNo(String r1RobNo)
    {
        this.r1RobNo = r1RobNo;
    }

    public String getR1RobNo()
    {
        return r1RobNo;
    }
    public void setR1WeldLineNo(String r1WeldLineNo)
    {
        this.r1WeldLineNo = r1WeldLineNo;
    }

    public String getR1WeldLineNo()
    {
        return r1WeldLineNo;
    }
    public void setR1Electric(String r1Electric)
    {
        this.r1Electric = r1Electric;
    }

    public String getR1Electric()
    {
        return r1Electric;
    }
    public void setR1Voltage(String r1Voltage)
    {
        this.r1Voltage = r1Voltage;
    }

    public String getR1Voltage()
    {
        return r1Voltage;
    }
    public void setR1Speed(String r1Speed)
    {
        this.r1Speed = r1Speed;
    }

    public String getR1Speed()
    {
        return r1Speed;
    }
    public void setR1Job(String r1Job)
    {
        this.r1Job = r1Job;
    }

    public String getR1Job()
    {
        return r1Job;
    }
    public void setR2RobNo(String r2RobNo)
    {
        this.r2RobNo = r2RobNo;
    }

    public String getR2RobNo()
    {
        return r2RobNo;
    }
    public void setR2WeldLineNo(String r2WeldLineNo)
    {
        this.r2WeldLineNo = r2WeldLineNo;
    }

    public String getR2WeldLineNo()
    {
        return r2WeldLineNo;
    }
    public void setR2Electric(String r2Electric)
    {
        this.r2Electric = r2Electric;
    }

    public String getR2Electric()
    {
        return r2Electric;
    }
    public void setR2Voltage(String r2Voltage)
    {
        this.r2Voltage = r2Voltage;
    }

    public String getR2Voltage()
    {
        return r2Voltage;
    }
    public void setR2Speed(String r2Speed)
    {
        this.r2Speed = r2Speed;
    }

    public String getR2Speed()
    {
        return r2Speed;
    }
    public void setR2Job(String r2Job)
    {
        this.r2Job = r2Job;
    }

    public String getR2Job()
    {
        return r2Job;
    }
    public void setReplaceStatus(String replaceStatus)
    {
        this.replaceStatus = replaceStatus;
    }

    public String getReplaceStatus()
    {
        return replaceStatus;
    }
    public void setR1ProtectiveGas(String r1ProtectiveGas)
    {
        this.r1ProtectiveGas = r1ProtectiveGas;
    }

    public String getR1ProtectiveGas()
    {
        return r1ProtectiveGas;
    }
    public void setR2ProtectiveGas(String r2ProtectiveGas)
    {
        this.r2ProtectiveGas = r2ProtectiveGas;
    }

    public String getR2ProtectiveGas()
    {
        return r2ProtectiveGas;
    }
    public void setR1WeldingWire(String r1WeldingWire)
    {
        this.r1WeldingWire = r1WeldingWire;
    }

    public String getR1WeldingWire()
    {
        return r1WeldingWire;
    }
    public void setR2WeldingWire(String r2WeldingWire)
    {
        this.r2WeldingWire = r2WeldingWire;
    }

    public String getR2WeldingWire()
    {
        return r2WeldingWire;
    }
    public void setLoginId(String loginId)
    {
        this.loginId = loginId;
    }

    public String getLoginId()
    {
        return loginId;
    }
    public void setLoginPassword(String loginPassword)
    {
        this.loginPassword = loginPassword;
    }

    public String getLoginPassword()
    {
        return loginPassword;
    }
    public void setPartStatus(String partStatus)
    {
        this.partStatus = partStatus;
    }

    public String getPartStatus()
    {
        return partStatus;
    }
    public void setRecerve(String recerve)
    {
        this.recerve = recerve;
    }

    public String getRecerve()
    {
        return recerve;
    }
    public void setProductType2(String productType2)
    {
        this.productType2 = productType2;
    }

    public String getProductType2()
    {
        return productType2;
    }
    public void setProdNumb(Long prodNumb)
    {
        this.prodNumb = prodNumb;
    }

    public Long getProdNumb()
    {
        return prodNumb;
    }
    public void setQualifed(String qualifed)
    {
        this.qualifed = qualifed;
    }

    public String getQualifed()
    {
        return qualifed;
    }
    public void setUnaccepted(String unaccepted)
    {
        this.unaccepted = unaccepted;
    }

    public String getUnaccepted()
    {
        return unaccepted;
    }
    public void setSwitchBut(String switchBut)
    {
        this.switchBut = switchBut;
    }

    public String getSwitchBut()
    {
        return switchBut;
    }
    public void setPlayer(String player)
    {
        this.player = player;
    }

    public String getPlayer()
    {
        return player;
    }
    public void setPlcNumber(Long plcNumber)
    {
        this.plcNumber = plcNumber;
    }

    public Long getPlcNumber()
    {
        return plcNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productType", getProductType())
            .append("r1EquipmentStatus", getR1EquipmentStatus())
            .append("r2EquipmentStatus", getR2EquipmentStatus())
            .append("failCode", getFailCode())
            .append("prodNum", getProdNum())
            .append("r1RobNo", getR1RobNo())
            .append("r1WeldLineNo", getR1WeldLineNo())
            .append("r1Electric", getR1Electric())
            .append("r1Voltage", getR1Voltage())
            .append("r1Speed", getR1Speed())
            .append("r1Job", getR1Job())
            .append("r2RobNo", getR2RobNo())
            .append("r2WeldLineNo", getR2WeldLineNo())
            .append("r2Electric", getR2Electric())
            .append("r2Voltage", getR2Voltage())
            .append("r2Speed", getR2Speed())
            .append("r2Job", getR2Job())
            .append("replaceStatus", getReplaceStatus())
            .append("r1ProtectiveGas", getR1ProtectiveGas())
            .append("r2ProtectiveGas", getR2ProtectiveGas())
            .append("r1WeldingWire", getR1WeldingWire())
            .append("r2WeldingWire", getR2WeldingWire())
            .append("loginId", getLoginId())
            .append("loginPassword", getLoginPassword())
            .append("partStatus", getPartStatus())
            .append("recerve", getRecerve())
            .append("createTime", getCreateTime())
            .append("productType2", getProductType2())
            .append("prodNumb", getProdNumb())
            .append("qualifed", getQualifed())
            .append("unaccepted", getUnaccepted())
            .append("switchBut", getSwitchBut())
            .append("player", getPlayer())
            .append("plcNumber", getPlcNumber())
            .toString();
    }
}
