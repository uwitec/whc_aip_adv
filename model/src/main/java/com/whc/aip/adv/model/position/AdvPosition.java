package com.whc.aip.adv.model.position;

import com.whc.aip.adv.model.base.BaseDO;

public class AdvPosition extends BaseDO{
    private String positionId;

    private String positonId;

    private String positionName;

    private String positionType;

    private String positiondescription;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositonId() {
        return positonId;
    }

    public void setPositonId(String positonId) {
        this.positonId = positonId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositiondescription() {
        return positiondescription;
    }

    public void setPositiondescription(String positiondescription) {
        this.positiondescription = positiondescription;
    }
}