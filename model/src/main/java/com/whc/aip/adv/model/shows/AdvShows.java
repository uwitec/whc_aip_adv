package com.whc.aip.adv.model.shows;

import com.whc.aip.adv.model.base.BaseDO;

public class AdvShows extends BaseDO{
    private String showsId;

    private String activityId;

    private String showsWahoId;

    private String showsUserId;

    private String showsTime;

    public String getShowsId() {
        return showsId;
    }

    public void setShowsId(String showsId) {
        this.showsId = showsId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getShowsWahoId() {
        return showsWahoId;
    }

    public void setShowsWahoId(String showsWahoId) {
        this.showsWahoId = showsWahoId;
    }

    public String getShowsUserId() {
        return showsUserId;
    }

    public void setShowsUserId(String showsUserId) {
        this.showsUserId = showsUserId;
    }

    public String getShowsTime() {
        return showsTime;
    }

    public void setShowsTime(String showsTime) {
        this.showsTime = showsTime;
    }
}