package com.whc.aip.adv.model.activity;

import com.whc.aip.adv.model.base.BaseDO;

public class AdvActivity extends BaseDO{
    private String activityId;

    private String positionId;

    private String categoryId;

    private String activityVendor;

    private String activityName;

    private String activityValidfrom;

    private String activityValidto;

    private String activityStatus;

    private String activityDecription;

    private String activityifdefault;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getActivityVendor() {
        return activityVendor;
    }

    public void setActivityVendor(String activityVendor) {
        this.activityVendor = activityVendor;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityValidfrom() {
        return activityValidfrom;
    }

    public void setActivityValidfrom(String activityValidfrom) {
        this.activityValidfrom = activityValidfrom;
    }

    public String getActivityValidto() {
        return activityValidto;
    }

    public void setActivityValidto(String activityValidto) {
        this.activityValidto = activityValidto;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getActivityDecription() {
        return activityDecription;
    }

    public void setActivityDecription(String activityDecription) {
        this.activityDecription = activityDecription;
    }

    public String getActivityifdefault() {
        return activityifdefault;
    }

    public void setActivityifdefault(String activityifdefault) {
        this.activityifdefault = activityifdefault;
    }
}