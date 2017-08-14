package com.whc.aip.adv.dao.adv;

import com.whc.aip.adv.model.response.JsonAdvResult;
import com.whc.aip.adv.model.utils.getWahoId;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/7
 * Time：15:53
 */


@Repository
public interface AdvOwnMapper {
    /**
     * 通过orderId取到wahoId
     * @param orderId
     * @return
     */
    getWahoId getWahoIdByOrderId(@Param("orderId")String orderId);

    /**
     * 万户仓默认广告 选柜轮播图
     * @return
     */
    List<JsonAdvResult> AdvDefaultInfoWace();

    /**
     * 万户仓默认广告 订单结束后
     * @return
     */
    List<JsonAdvResult> AdvDefaultInfoOrderEnd();

    /**
     * 广告投放 位置：门店轮播图
     * @param wahoId
     * @return
     */
    List<JsonAdvResult> AdvPutInWace(@Param("wahoId") String wahoId);


    /**
     * 广告投放 位置： 订单结束后
     * @param wahoId
     * @return
     */
    List<JsonAdvResult> AdvPutInOrderEnd(@Param("wahoId")String wahoId);
}
