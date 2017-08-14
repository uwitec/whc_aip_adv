package com.whc.aip.adv.service.ClickAndShow;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.model.shows.AdvClicks;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/8
 * Time：11:21
 */
public interface ClickandShowService {

    /**
     *
     * @param advClicks
     * @return
     */
    int addClick(AdvClicks advClicks) throws CommonException;
}
