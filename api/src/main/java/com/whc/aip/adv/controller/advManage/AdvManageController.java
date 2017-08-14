package com.whc.aip.adv.controller.advManage;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.model.response.JsonAdvResult;
import com.whc.aip.adv.model.shows.AdvClicks;
import com.whc.aip.adv.service.ClickAndShow.ClickandShowService;
import com.whc.aip.adv.service.advUtils.someAdvUtilsService;
import com.whc.aip.adv.service.showAdv.ShowAdvService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/8
 * Time：11:14
 */
@RestController
@RequestMapping("/advManage")
public class AdvManageController {


    @Resource
    private ShowAdvService showAdvService;
    @Resource
    private ClickandShowService clickandShowService;
    @Resource
    private someAdvUtilsService someAdvService;

    /**
     * 获取订单结束后的广告
     * @param memberId
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/showAdvByOrderEnd" , method = RequestMethod.POST)
    public TxResultResponse ShowAdvByOrderEnd(@RequestParam String memberId,@RequestParam String orderId){
        TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取广告成功");
        try {
            List<JsonAdvResult> jsonAdvResults = showAdvService.showInfoOrderEnd(memberId, orderId);
            if(jsonAdvResults!=null){
                response.setData(jsonAdvResults);
                return response;
            }else{
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND.getCode(),"广告内容为空");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }

    /**
     * 获取门店列表的广告
     * @param memberId
     * @param wahoId
     * @return
     */
    @RequestMapping(value = "/ShowAdvByWace" , method = RequestMethod.POST)
    public TxResultResponse ShowAdvByWace(@RequestParam String memberId,@RequestParam String wahoId){
        TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取广告成功");
        try {
            List<JsonAdvResult> jsonAdvResults = showAdvService.showInfoWace(memberId, wahoId);
            if(jsonAdvResults!=null){
                response.setData(jsonAdvResults);
                return response;
            }else{
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND.getCode(),"广告内容为空");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }

    /**
     * 添加点击事件
     * @param advClicks
     * @return
     */
    @RequestMapping(value = "/addClickAdv" , method = RequestMethod.POST)
    @ResponseBody
    public TxResultResponse addClickAdv(@RequestBody AdvClicks advClicks){
        TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取广告成功");
        try {
            int index = clickandShowService.addClick(advClicks);
            if(index > 0){
                return response;
            }else{
                return new TxResultResponse(CommonCode.ERROR.getCode(),"添加失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }


    @RequestMapping(value = "/getWahoIdByOrderId" , method = RequestMethod.POST)
    public TxResultResponse gerWahoId(@RequestParam String orderId){
        TxResultResponse response = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取广告成功");
        Map<String , String > data = new HashMap<String,String>();
        try {
            String wahoId = someAdvService.getWahoIdByOrderId(orderId);
            if(wahoId!=null){
                data.put("wahoId",wahoId);
                response.setData(data);
                return response;
            }else{
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND.getCode(),"返回参数为空");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }
}
