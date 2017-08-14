package com.whc.aip.adv.model.putIn;

import com.whc.aip.adv.model.base.BaseDO;

public class AdvShowTime extends BaseDO {
    private String showtimeId;

    private String activityId;

    private String showtimeDateFrom;

    private String showtimeDateTo;

    private String showtimeTimeFrom;

    private String showtimeTimeTo;

    private String showtimeDescrIption;

    public String getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(String showtimeId) {
        this.showtimeId = showtimeId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getShowtimeDateFrom() {
        return showtimeDateFrom;
    }

    public void setShowtimeDateFrom(String showtimeDateFrom) {
        this.showtimeDateFrom = showtimeDateFrom;
    }

    public String getShowtimeDateTo() {
        return showtimeDateTo;
    }

    public void setShowtimeDateTo(String showtimeDateTo) {
        this.showtimeDateTo = showtimeDateTo;
    }

    public String getShowtimeTimeFrom() {
        return showtimeTimeFrom;
    }

    public void setShowtimeTimeFrom(String showtimeTimeFrom) {
        this.showtimeTimeFrom = showtimeTimeFrom;
    }

    public String getShowtimeTimeTo() {
        return showtimeTimeTo;
    }

    public void setShowtimeTimeTo(String showtimeTimeTo) {
        this.showtimeTimeTo = showtimeTimeTo;
    }

    public String getShowtimeDescrIption() {
        return showtimeDescrIption;
    }

    public void setShowtimeDescrIption(String showtimeDescrIption) {
        this.showtimeDescrIption = showtimeDescrIption;
    }
}