package com.whc.aip.adv.service.advUtils;

import com.wanhuchina.common.exception.CommonException;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/8
 * Time：13:07
 */
public interface someAdvUtilsService {

    String getWahoIdByOrderId(String orderId) throws CommonException;
}
