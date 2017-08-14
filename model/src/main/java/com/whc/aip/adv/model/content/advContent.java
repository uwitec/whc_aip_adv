package com.whc.aip.adv.model.content;

import com.whc.aip.adv.model.base.BaseDO;

public class advContent extends BaseDO{
    private String contentId;

    private String activityId;

    private String contentTitle;

    private String contentImageurl;

    private String contentType;

    private String contentUrl;

    private String contentIndex;

    private String contentDescription;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentImageurl() {
        return contentImageurl;
    }

    public void setContentImageurl(String contentImageurl) {
        this.contentImageurl = contentImageurl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(String contentIndex) {
        this.contentIndex = contentIndex;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }
}