package com.whc.aip.adv.service.showAdv;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.model.response.JsonAdvResult;

import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/7
 * Time：16:33
 */
public interface ShowAdvService {

    /**
     * 万户仓默认广告 选柜轮播图
     * @return
     */
    List<JsonAdvResult> showInfoWace(String wahoId, String memberId) throws CommonException;

    /**
     * 万户仓默认广告 订单结束
     * @return
     */
    List<JsonAdvResult> showInfoOrderEnd(String orderId, String memberId) throws CommonException;




}
